package electricity.billing.system;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.*;

import javax.swing.*;

import java.io.*;

public class Client extends JFrame {

    Socket socket;
    BufferedReader br;
    PrintWriter out;

    private JLabel heading = new JLabel("Client Area ");
    private JTextArea msgArea = new JTextArea();
    private JTextField msgInput = new JTextField();
    private Font font = new Font("Roboto",Font.PLAIN,20);





    public Client(){
        try{
            System.out.println("Sending request to server...");
            socket = new Socket("127.0.0.1",7777);
            System.out.println("Connection built.");
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            startReading();
            //startWritting();

            createGUI();
            handleEvents();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void handleEvents() {
        msgInput.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                //  System.out.println("Key released " +e.getKeyCode());
                if(e.getKeyCode()==10){
                    // System.out.println("you have pressed ENTER button");
                    String ContentToSend  = msgInput.getText();
                    msgArea.append("Me : " +ContentToSend+ "\n");
                    out.println(ContentToSend);
                    out.flush();
                    msgInput.setText(" ");
                    msgInput.requestFocus();
                }

            }
        });
    }


    private void createGUI() {

        //this.setTitle("client Messager[END]");
        this.setTitle("Client Messager[END]");
        this.setSize(600,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        heading.setFont(font);
        msgArea.setFont(font);
        msgInput.setFont(font);
        heading.setIcon(new ImageIcon("icon/icon8.png"));
        heading.setHorizontalTextPosition(SwingConstants.CENTER);
        heading.setVerticalTextPosition(SwingConstants.BOTTOM);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        msgArea.setEditable(false);
        msgInput.setHorizontalAlignment(SwingConstants.CENTER);

        this.setLayout(new BorderLayout());
        this.add(heading,BorderLayout.NORTH);
        JScrollPane jScrollPane = new JScrollPane(msgArea);
        this.add(jScrollPane,BorderLayout.CENTER);
        this.add(msgInput,BorderLayout.SOUTH);


        this.setVisible(true);
    }


    public  void startReading() {
        Runnable r1 = () ->{
            System.out.println("Reader Started...");


            try{
                while (true && !socket.isClosed()) {

                    String msg = br.readLine();
                    if(msg.equals("exit")){
                        System.out.println("Server terminated the chat...");
                        JOptionPane.showMessageDialog(this, "ServerTerminated the chat");
                        msgInput.setEnabled(false);
                        socket.close();
                        break;
                    }
                    //System.out.println("Server :" +msg);
                    msgArea.append("Server : " +msg+ "\n");

                }

            }catch(IOException E){
                // E.printStackTrace();
                System.out.println("Connection closed");

            }


        };
        new Thread(r1).start();
    }
    public  void startWritting() {
        Runnable r2 = () ->{
            System.out.println("Writer started...");
            while(true && !socket.isClosed()){
                try{


                    BufferedReader  br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();
                    out.println(content);
                    out.flush();
                    if(content.equals("exit")){
                        socket.close();
                        break;
                    }

                }catch(Exception e){
                    // e.printStackTrace();
                    System.out.println("Connection closed");

                }
                //  System.out.println("Connection closed");

            }

        };
        new Thread(r2).start();

    }



    public static void main(String args[]){
        System.out.println("This is client...");
        new Client();
    }


}
