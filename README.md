**Purpose**

This project was developed as a personal initiative to provide a simple, reliable, and customizable communication solution for both personal and professional use, while also serving as a learning experience to explore how chat systems and workflows function.

**ChatApp**
A real-time chat application built using Java. ChatApp enables users to communicate seamlessly with friends and colleagues through an intuitive and efficient interface.

**Description**

ChatApp is a lightweight and robust chat platform that supports:

Instant messaging between users.

Secure communication using encryption.

User-friendly graphical interface.

**Features**

Real-Time Communication: Messages are delivered instantly.

Group Chats: Users can create and join chat rooms to collaborate.

Secure Messaging: Ensures privacy with end-to-end encryption.

Cross-Platform Support: Works on different operating systems where Java is supported.

**Image Representation**

This collection of images demonstrates the workflow of my application.

Picture1 -> Home screen of my application. <br/>
Picture2 -> The server must be running first. <br/>
Picture3 -> Registration Screen. <br/>
Picture4 -> Registration completed; account has been created. <br/>
Picture5 -> Login screen. <br/>
Picture6 -> Logged in with registered credentials; chat between server and client (me) begins. <br/>
Picture7 -> After Clicking 'Exit', a confirmation dialog box appears. <br/>
Picture8 -> 'Share' dialog box for attaching documents. <br/>
Picture9 -> After clicking 'Cancel' on the 'Share' dialog box, this confirmation message is shown. <br/>


**Installation**

Prerequisites

Java Development Kit (JDK) 8 or above.

Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans.

**Steps**

Clone the repository:

git clone https://github.com/Cayra19/ChatApp.git

Navigate to the project directory:

cd chatapp

Open the project in your preferred IDE.

First, compile and run the Server.java file to start the server:

javac GUIServer.java java GUIServer

Then compile and run the Client.java file to launch the client:

javac ChatApp.java java ChatApp

**Usage**

Start the server by running the GUIServer.java file.

Launch the ChatApp.java file on each user’s machine.

Enter the server IP address and port number to connect.

Begin chatting with other connected users.

**Contributing**

I welcome contributions to improve ChatApp! To contribute:

Fork the repository.

Create a feature branch:

git checkout -b feature/your-feature-name

Commit your changes and push them to your branch.

Submit a pull request for review.

**Acknowledgements**

Java Networking APIs for enabling seamless communication.

Java Swing for building the graphical user interface.

Open-source community for valuable resources and tools.

**Future plans**

Include multi-user chat rooms, sharing features, and integration of camera and microphone functionalities.
