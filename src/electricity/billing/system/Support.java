package electricity.billing.system;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JTextArea ca= new JTextArea();
    private JTextField cf=new JTextField();
    private JButton b=new JButton();
    private JLabel l=new JLabel();

    Chatbot(){                                                // Layout and Properties defined in Constructer

        JFrame f=new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(800,800);
        f.getContentPane().setBackground(Color.cyan);
        f.setTitle("ChatBot");
        f.add(ca);
        f.add(cf);
        ca.setSize(750,710);
        ca.setLocation(17, 1);
        ca.setBackground(Color.BLACK);
        cf.setSize(700,20);
        cf.setLocation(5,720);
        f.add(b);
        l.setText("SEND");
        b.add(l);
        b.setSize(800,20);
        b.setLocation(700,720);

        b.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==b) {                           // Message sents on Click button

                    String text=cf.getText().toLowerCase();
                    ca.setForeground(Color.white);
                    ca.append("You-->"+text+"\n");
                    cf.setText("");

                    if(text.contains("hi")) {                         // input Checking
                        replyMeth("Hi there !!! -" +"\n"+ "Select the number of the given Querry from bellow given option:" + "\n" + "1)how can I pay my electricity bill online?" +"\n"+ "2)what payment methods are accepted on this website?"+"\n"+ "3)what should I do if I forget my password?"
                        +"\n"+ "4)how can I check my billing history?" +"\n"+ "5)can I get a copy of my electricity bill receipt?" +"\n"+ "6)what should I do if I believe there is an error in my bill?" +"\n"+ "7)other");


                    }
                    else if(text.contains("1")) {
                        replyMeth("You can easily pay your electricity bill online by logging into your account on our website." +"\n"+ " Navigate to the Bill Payment section and follow the instructions to make "+"\n"+" a secure payment using various payment options such as credit/debit cards or online banking.");
                    }
                    else if(text.contains("2")) {
                        replyMeth("We accept payments through various methods, including credit cards, debit cards, net banking, and other online payment options." +"\n"+ " You can choose the method that is most convenient for you during the payment process.");
                    }
                    else if(text.contains("3")) {
                        replyMeth("f you forget your password, click on the \"Forgot Password\" link on the login page. Follow the prompts to reset your password."+"\n"+" You'll receive instructions on your registered email or phone number to complete the process.");
                    }
                    else if(text.contains("4")) {
                        replyMeth("To view your billing history, log in to your account and go to the \"Billing History\" section. "+"\n"+"There, you'll find a detailed list of your past electricity bills, including payment status and due dates.");
                    }
                    else if(text.contains("5")) {
                        replyMeth("Certainly! You can download and print your electricity bill receipt from the \"Billing History\" section after logging into your account.");
                    }
                    else if(text.contains("6")) {
                        replyMeth("If you think there is an error in your bill, please contact our customer support through the \"Contact Us\" page or hotline."+"\n"+"Provide details about the issue, and our team will assist you in resolving it.");
                    }
                    else
                        replyMeth("Please contact our Administration department (Help-> Contact) in our Website" +"\n"+"or mail Your Problem on : helpline@electricityboard.co.in");


                }
                setVisible(false);



            }

        });

    }
    public void replyMeth(String s) {                          // Reply Method
        ca.append("ChatBot-->"+s+"\n");
    }


}



public class Support {                                     //Driver Class

    public static void main(String[] args) {
        //main class


        new Chatbot();                                  // instantiation
    }

}



