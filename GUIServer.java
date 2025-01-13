import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import java.text.*;
import java.io.*;
import java.net.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//import StringAlignUtils.java;

class GUIServer {

    //CHAT
    static JFrame cf1 = new JFrame("Server");
    static JButton cb1 = new JButton("Send");
    static JButton cb2 = new JButton("Share");
    static JButton cb3 = new JButton("Exit");
    static JTextArea msgShow = new JTextArea();
    static JTextField msgInput = new JTextField();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static JLabel cl = new JLabel();

    static ServerSocket serverSocket;
    static Socket clientSocket; // socket used by client to send and recieve data from server
    static BufferedReader in;   // object to read data from socket
    static PrintWriter out;     // object to write data into socket 

    public static void main(String args[]) {

        GridLayout cg = new GridLayout(2, 1);
        JPanel cp = new JPanel();
        cp.setLayout(cg);
        GridLayout cg1 = new GridLayout(2, 1);
        JPanel cp1 = new JPanel();
        cp1.setLayout(cg1);
        GridLayout cg2 = new GridLayout(1, 3);
        JPanel cp2 = new JPanel();
        cp2.setLayout(cg2);
        cp2.add(cb1);
        cp2.add(cb2);
        cp2.add(cb3);
        cp1.add(msgInput);
        cp1.add(cp2);
        cp.add(msgShow);
        cp.add(cp1);
        Font cf = new Font("Book Antiqua", Font.BOLD, 17);
        cb1.setFont(cf);
        cb2.setFont(cf);
        cb3.setFont(cf);
        cb1.setBackground(Color.magenta);
        cb2.setBackground(Color.magenta);
        cb3.setBackground(Color.magenta);
        cb1.setForeground(Color.white);
        cb2.setForeground(Color.white);
        cb3.setForeground(Color.white);

        //sp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        JScrollPane sp = new JScrollPane(msgShow);
        msgShow.setEditable(false);
        java.util.Date date = new java.util.Date();
        cl.setText(sdf.format(date));
        cl.setForeground(Color.red);
        cl.setHorizontalAlignment(JLabel.CENTER);
        cf1.add(cl, BorderLayout.NORTH);
        msgShow.setBackground(Color.cyan);
        cf1.getContentPane().add(sp);
//cf1.add(msgInput,BorderLayout.SOUTH);
        cf1.add(cp1, BorderLayout.SOUTH);
        //cf1.add(cp2,BorderLayout.SOUTH); 
        cf1.setBackground(Color.blue);
        cf1.setSize(350, 490);
        cf1.setLocationRelativeTo(null);
        cf1.setResizable(false);
        cf1.setVisible(true);
        //ACTIONLISTENER

//SERVER
        try {
            serverSocket = new ServerSocket(5000);
            System.out.println("Server is ready to accept communication");
            System.out.println("Waiting....");
            clientSocket = serverSocket.accept();
            System.out.println("Client accepted");
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            Thread receive = new Thread(new Runnable() {
                String msg;

                @Override
                public void run() {
                    try {

                        msg = in.readLine();
                        //	if(msg.equals("bye")){System.out.println("Client terminated the chat"); break;}
                        while (!msg.equals("Over")) {
                            // System.out.println("Client : "+msg);
                            msgShow.append("Client : " + msg + "\n");

                            msg = in.readLine();
                        }

                        //	System.out.println("Client left the chat");
                        msgShow.append("Client left the chat" + "\n");
                        //  out.close();
                        //  clientSocket.close();
                        //  serverSocket.close();
                    } catch (IOException e) {
                        // e.printStackTrace();
                        System.out.println("Connection is closed" + "\n");
                    }
                }
            });
            receive.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        cb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {

                String msgSend = "";
                //static final String green="\u001B[32m";
                //msgSend.setColor(color.blue);
                msgSend = msgInput.getText();
                //msgShow.append("Server : "+msgSend+"\n");
                //msgShow.setText(msgShow.getText()+msgSend+"\n");
                // msgShow.setHorizontalAlignment(JTextArea.RIGHT);
                // out.writeUTF(msgSend);
                out.println(msgSend);
                msgShow.append("Server : " + msgSend + "\n");
                out.flush();
                msgInput.setText("");
                msgInput.requestFocus();
                try {
                    if (msgSend.equals("Over")) {
                        msgShow.append("Server terminated the chat" + "\n");
                        //msgShow.append("Closed connection"+"\n");
                        msgShow.append("Closing connection........." + "\n");
                        msgShow.append("Connection is closed" + "\n");
                        out.close();
                        clientSocket.close();
                        serverSocket.close();
                        msgInput.setEnabled(false);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        cb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser j = new JFileChooser("f:");
                int r = j.showSaveDialog(null);

                if (r == JFileChooser.APPROVE_OPTION) {
                    File fi = new File(j.getSelectedFile().getAbsolutePath());

                    try {

                        FileWriter wr = new FileWriter(fi, false);
                        BufferedWriter w = new BufferedWriter(wr);
                        w.write(msgShow.getText());

                        w.flush();
                        w.close();
                    } catch (Exception evt) {
                        JOptionPane.showMessageDialog(null, evt.getMessage());
                    }
                } else
                    JOptionPane.showMessageDialog(null, "the user cancelled the operation");
            }
        });
        cb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Thankyou for using this app!");
                cf1.setVisible(false);
            }
        });
    }
}
