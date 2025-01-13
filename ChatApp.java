import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.regex.*;  
import java.util.*;  
import java.net.*;
import java.text.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;



//HOME
  public class ChatApp{
	 
  static JFrame homefr=new JFrame("HOME");
   static JLabel homel;
 // static JLabel homel1=new JLabel(" vMeet");
	   static JLabel homel1=new JLabel("   EMAIL-ID");
	   static JTextField homet1=new JTextField("");
	  static JLabel homel8=new JLabel("   PASSWORD");
	  static JPasswordField homepw=new JPasswordField();
	  static JButton homeb1=new JButton("Login");
	 static JButton homeb2=new JButton("Forgot Pwd");
	                                     
	 static JButton homeb3=new JButton("Exit");
	   static JLabel homel2=new JLabel("    New User??Please register yourself.");
	 static JButton homeb4=new JButton("Create Account");
	
	static JLabel homel3=new JLabel("");static JLabel homel4=new JLabel(""); static JLabel homel5=new JLabel(""); static JLabel homel6=new JLabel("");
	static JLabel homel7=new JLabel("");
	
	     //Register
    static JFrame rf1=new JFrame("REGISTER"); 
    static JLabel rl1=new JLabel("     NAME  ");
	static JLabel rl2=new JLabel("     EMAIL  ");
	static JLabel rl3=new JLabel("  CREATE PASSWORD");
    static JLabel rl4=new JLabel("  CONFIRM PASSWORD");
    static JLabel rl5=new JLabel("     GENDER  ");
    static JLabel rl6=new JLabel("     D.O.B.  ");
    static JLabel rl7=new JLabel("   Phone Number ");
	 static ButtonGroup gengp= new ButtonGroup();
	static JRadioButton rm=new JRadioButton(" Male");
	static JRadioButton rf = new JRadioButton(" Female");
	static JRadioButton ro = new JRadioButton(" Other");
    static JComboBox day,month,year; 
    static JLabel rl8=new JLabel("");
    static JLabel rl9=new JLabel("");
    static JLabel rl10=new JLabel("");
    static JLabel rl11=new JLabel("");
    static JLabel rl12=new JLabel("");
    static JLabel rl13=new JLabel("");
    static JLabel rl14=new JLabel("");
    static JLabel rl15=new JLabel(""); 
    static JLabel rl16=new JLabel("");
    static JLabel rl17=new JLabel("");
    static JLabel rl18=new JLabel("");
	static JLabel rl19=new JLabel("");
	static JLabel rl20=new JLabel("");
    static JTextField rt1=new JTextField("");
    static JTextField rt2=new JTextField("");
    static JTextField rt3=new JTextField("");
    static JTextField rt4=new JTextField("");
    static JTextField rt5=new JTextField("");
    static JTextField rt6=new JTextField("");
	static JTextField rt7=new JTextField("");
    static JButton rb1=new JButton("SignUp");
    static JButton rb2=new JButton("Home");
	 static JButton rb3=new JButton("Reset");
	 
	 //CHAT
        static JFrame cf1=new JFrame("Client");
	static JButton cb1=new JButton("Send");
    static JButton cb2=new JButton("Share");
	static JButton cb3=new JButton("Exit");
	static JTextArea msgShow=new JTextArea();
	static JTextField msgInput=new JTextField();
	static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	static JLabel cl=new JLabel();
	
	static Socket clientSocket; // socket used by client to send and recieve data from server
       static  BufferedReader in;   // object to read data from socket
       static PrintWriter out;     // object to write data into socket 
	

	
  
	
	
	 public static void main(String[] args)
	 {
		 //HOME
		 
        Font homef =new Font("Times New Roman",Font.BOLD,17); 
		                        homeb1.setFont(homef);
                                  homeb3.setFont(homef);
								    homeb4.setFont(homef);
								 homel2.setFont(homef);
								  homel2.setForeground(Color.BLUE);							  
	Font homef1 =new Font("Times New Roman",Font.BOLD,15); 
         homeb2.setFont(homef1);							
                                homeb1.setBackground(Color.magenta);
                                 homeb1.setForeground(Color.white);
                                 homeb2.setBackground(Color.magenta);
                                 homeb2.setForeground(Color.white);  
								  homeb3.setForeground(Color.white);
                               homeb3.setBackground(Color.magenta);
								 homeb4.setForeground(Color.white);
                                 homeb4.setBackground(Color.magenta);
								 
								   GridLayout homegp=new GridLayout(2,1);
		JPanel homepa=new JPanel();
	     homepa.setLayout(homegp);
		 ImageIcon i = new ImageIcon("prjct.PNG");
		  homel = new JLabel(i, SwingConstants.HORIZONTAL);
		 homepa.add(homel);
       
	  GridLayout homeg=new GridLayout(11,1);
		JPanel homep=new JPanel();
	     homep.setLayout(homeg);
	 homep.add(homel1);homep.add(homet1);
	   homep.add(homel3);homep.add(homel8);
	   homep.add(homepw);homep.add(homel4);
	     GridLayout homeg1=new GridLayout(1,3);
		JPanel homep1=new JPanel();
	   homep1.setLayout(homeg1);
	 homep1.add(homeb1);
		 homep1.add(homeb2);
		 homep1.add(homeb3);
		 homep.add(homep1);
	homep.add(homel6);
		homep.add(homel2);homep.add(homel7);
		homep.add(homeb4,BorderLayout.SOUTH);
		homepa.add(homep);
	   homep.setBackground(Color.pink);
	    homefr.add(homepa);
		
		homefr.setBackground(Color.pink);
		  homefr.setSize(350,490);
       homefr.setLocationRelativeTo(null);
        homefr.setResizable(false);
       homefr.setVisible(true);
	   
	   //Register
      GridLayout rg1=new GridLayout(14,2);
      JPanel rp1=new JPanel();
      rp1.setLayout(rg1);
      rp1.setBackground(Color.pink);
      rp1.add(rl1);
	  rp1.add(rt1);
	//  rp1.add(rl8);
	// rp1.add(rl9);	
     rp1.add(rl2);  
      rp1.add(rt2);  
      rp1.add(rl10);	  
      rp1.add(rl11);
      rp1.add(rl3);	  
      rp1.add(rt3);
	  rp1.add(rl12);
     rp1.add(rl13);
	  rp1.add(rl4);	  
      rp1.add(rt4);
	   rp1.add(rl14);
     rp1.add(rl15);
      rp1.add(rl5);
       rm.setSelected(true);
		rp1.add(rm);
		 rp1.add(rl16);
        rf.setSelected(false);
		rp1.add(rf);
		rp1.add(rl20);
		  ro.setSelected(false);
		rp1.add(ro);
	    gengp.add(rm);
        gengp.add(rf);
		gengp.add(ro);
	  
	   String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
      String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
     String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020","2021","2022" };
			
			day=new JComboBox(dates);
	      month=new JComboBox(months);
	      year=new JComboBox(years);
		  day.setSize(50, 20);
			month.setSize(50, 20);
			year.setSize(50, 20);
		 rp1.add(rl17); rp1.add(rl18);
	   rp1.add(rl6);
	    
      GridLayout rg3=new GridLayout(1,3);
      JPanel rp3=new JPanel();
      rp3.setLayout(rg3);
	 rp3.add(day);
	rp3.add(month);
	rp3.add(year);
	rp1.add(rp3);
   rp1.add(rl8);
   rp1.add(rl19);
 rp1.add(rl7);
rp1.add(rt7);

 Font ref =new Font("Calibri",Font.BOLD,14);
     rl1.setFont(ref);
 rl2.setFont(ref);
 rl3.setFont(ref); rl4.setFont(ref); rl5.setFont(ref); rl6.setFont(ref); rl7.setFont(ref); 
 
	  
  GridLayout rg2=new GridLayout(1,3);
      JPanel rp2=new JPanel();
      rp2.setLayout(rg2);
      Font rf =new Font("Times New Roman",Font.BOLD,15);
      rb1.setFont(rf);
	  rb2.setFont(rf);
	   rb3.setFont(rf);
       rb1.setBackground(Color.magenta);
       rb2.setBackground(Color.magenta);
	   rb3.setBackground(Color.magenta);
        rb1.setForeground(Color.white);
        rb2.setForeground(Color.white);
		rb3.setForeground(Color.white);
		rp2.add(rb1);
		rp2.add(rb2);
		rp2.add(rb3);
      rf1.add(rp1);
	   rf1.add(rp2,BorderLayout.SOUTH);
     
      rf1.setSize(350,490);
      rf1.setLocationRelativeTo(null);
      rf1.setResizable(false);
      rf1.setVisible(false);
	  
	  //CHAT
	        
		GridLayout cg=new GridLayout(2,1);
      JPanel cp=new JPanel();
      cp.setLayout(cg);

  
      GridLayout cg1=new GridLayout(2,1);
      JPanel cp1=new JPanel();
      cp1.setLayout(cg1);
      

       GridLayout cg2=new GridLayout(1,3);
      JPanel cp2=new JPanel();
      cp2.setLayout(cg2);
	  cp2.add(cb1);
	    cp2.add(cb2);
		 cp2.add(cb3);
		 cp1.add(msgInput);
		 cp1.add(cp2);
		
		cp.add(msgShow);
		cp.add(cp1);
    Font cf =new Font("Book Antiqua",Font.BOLD,17);
      cb1.setFont(cf);
	   cb2.setFont(cf);
	    cb3.setFont(cf);
		    cb1.setBackground(Color.magenta);
       cb2.setBackground(Color.magenta);
	   cb3.setBackground(Color.magenta);
        cb1.setForeground(Color.white);
        cb2.setForeground(Color.white);
		cb3.setForeground(Color.white);
		msgShow.setBackground(Color.cyan);
		cl.setForeground(Color.red);
		
   JScrollPane sp=new JScrollPane(msgShow);
   msgShow.setEditable(false);
   java.util.Date date=new java.util.Date();
cl.setText(sdf.format(date));
cl.setHorizontalAlignment(JLabel.CENTER);
cf1.add(cl,BorderLayout.NORTH);

cf1.getContentPane().add(sp);
	cf1.add(cp1,BorderLayout.SOUTH); 
      cf1.setSize(350,490);
      cf1.setLocationRelativeTo(null);
      cf1.setResizable(false);
      cf1.setVisible(false);
	  
	  //client
	   try {
            clientSocket = new Socket("127.0.0.1",5000);
			 System.out.println("Connected");
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
           
            Thread receiver = new Thread(new Runnable() {
                String msg;
                @Override
                public void run() {

                    try {
					 
                        msg = in.readLine();
                        while(!msg.equals("Over")){
                   
						  msgShow.append("Server : "+msg+"\n");
                            msg = in.readLine();
                       }
		
						//msgShow.append("Client terminated the chat"+"\n");
                       
					
					//msgShow.append("Closing connection"+"\n");
                       // out.close();
                       // clientSocket.close();
                    } catch (IOException e) {
                        //e.printStackTrace();
					 
                    }
					
               }
           });
           receiver .start();
    }catch (IOException e){
        e.printStackTrace();
	
        }
          
	  
	 

      
	
//ACTIONLISTENER

//HOME
homeb1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e1){ 
      String email=homet1.getText();
	  String pass=homepw.getText();
	  if(email.equals("") && pass.equals("")){
		  JOptionPane.showMessageDialog(null,"Please enter username and Password","Alert",JOptionPane.WARNING_MESSAGE);
	  }
	  else if(!(email.equals("")) && pass.equals("")){
	  JOptionPane.showMessageDialog(null,"Please enter Password...");}
	  else if(email.equals("") && !(pass.equals(""))){
	  JOptionPane.showMessageDialog(null,"Please enter username");}
	  else{
		  // if(email==null || email.isEmpty()){
		  //System.out.print("Invalid");
 //JOptionPane.showMessageDialog(null,"Invalid Email,Please enter correct Email","Alert",JOptionPane.WARNING_MESSAGE);     		  }
		  String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";  
        Pattern pattern = Pattern.compile(regex);  
        if(pattern.matcher(email).matches() && !(pass.equals(""))){ 
		//System.out.print("Valid");
		 cf1.setVisible(true);
	  homefr.setVisible(false);	
		}
		else{
			//System.out.print("Invalid");
			JOptionPane.showMessageDialog(null,"Invalid Email,Please enter correct Email","Alert",JOptionPane.WARNING_MESSAGE);     		  }
			}	
        }  
    }); 
	homeb2.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e1){  
            //System.exit(0); 
JOptionPane.showMessageDialog(null,"Will be added soon");		
        }  
    }); 
homeb3.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e1){  
        int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
if(a==JOptionPane.YES_OPTION){  
    //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
System.exit(0);}  
 
} 
    });  
	homeb4.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e1){  
            rf1.setVisible(true);  
			homefr.setVisible(false);
        }  
    }); 
	//REGISTER
	rb1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e1){  
String name=rt1.getText(); String email=rt2.getText(); String pwd=rt3.getText(); String cpwd=rt4.getText(); String mob=rt7.getText();
     if(name.equals("") || email.equals("") || pwd.equals("") || cpwd.equals("") || mob.equals(""))
		 JOptionPane.showMessageDialog(null,"Please enter all details","Alert",JOptionPane.WARNING_MESSAGE);     
	 
else{	
 //String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";  
      //  Pattern pattern = Pattern.compile(regex);  
      //  if(pattern.matcher(email).matches())	
JOptionPane.showMessageDialog(null,"Thankyou for registering!");     }
        }  
    }); 
	rb2.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e1){  
            homefr.setVisible(true);
            rf1.setVisible(false);			
        }  
    }); 
	rb3.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e1){  
            rt1.setText(""); 
              rt2.setText(""); 
  rt3.setText(""); 
  rt4.setText(""); day.setSelectedIndex(0); month.setSelectedIndex(0); year.setSelectedIndex(0);  rt7.setText("");   
        }  
    });
	//CHAT
	cb1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e1){ 
 //CLIENT
	   String msgSend="";
 msgSend=msgInput.getText();
 
  // msgShow.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
 
 out.println(msgSend);
   msgShow.append("Me : "+msgSend+"\n");
  out.flush();
   msgInput.setText("");
   msgInput.requestFocus(); 
  try{
   if(msgSend.equals("Over")) {
	   msgShow.append("You left the chat"+"\n");
	    msgInput.setEnabled(false);
	   out.close();
       clientSocket.close();
   }
 
	   } catch (IOException e){
        e.printStackTrace();
	
        }
        }  
    });
     cb2.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e1){  
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
                  }
                catch (Exception evt) {
                    JOptionPane.showMessageDialog(null, evt.getMessage());
                }
            }
           
            else
                JOptionPane.showMessageDialog(null, "the user cancelled the operation");
        
          

        }  
    });
	cb3.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e1){  
            JOptionPane.showMessageDialog(null,"Thankyou for using this app!"); 
             cf1.setVisible(false);			
        }  
    });
	
	

	  
	
	
	
}
  }
  
	 