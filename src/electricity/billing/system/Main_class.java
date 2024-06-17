/*package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame implements ActionListener {
    String acctype;
    String meter_pass;
    Main_class( String acctype, String meter_pass){
        this.meter_pass = meter_pass;
        this.acctype = acctype;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource(("icon/bg.jpg")));
        Image image = imageIcon.getImage().getScaledInstance(1530,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image);
        JLabel imageLable = new JLabel(imageIcon2);
        add(imageLable);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("serif",Font.PLAIN,15));
        //menuBar.add(menu);

        JMenuItem newCustomer = new JMenuItem("New Customer");
        newCustomer.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon customerImg = new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image customerImage = customerImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newCustomer.setIcon(new ImageIcon(customerImage));
        newCustomer.addActionListener(this);
        menu.add(newCustomer);


        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon customerdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image customerdetailsImage = customerdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(customerdetailsImage));
        customerdetails.addActionListener(this);
        menu.add(customerdetails);


        JMenuItem depositdetails = new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon depositdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/depositdetails.png"));
        Image depositdetailsImage = depositdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(depositdetailsImage));
        depositdetails.addActionListener(this);
        menu.add(depositdetails);


        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon calculatebillImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image calculatebillImage = calculatebillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(calculatebillImage));
        calculatebill.addActionListener(this);
        menu.add(calculatebill);


        JMenu info = new JMenu("Information");
        info.setFont(new Font("serif",Font.PLAIN,15));
        //menuBar.add(info);

        JMenuItem upinfo = new JMenuItem("Update Information");
        upinfo.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon upinfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
        Image upinfoImage = upinfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        upinfo.setIcon(new ImageIcon(upinfoImage));
        upinfo.addActionListener(this);
        info.add(upinfo);

        JMenuItem viewinfo = new JMenuItem("View Information");
        viewinfo.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon viewinfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
        Image viewinfoImage = viewinfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(viewinfoImage));
        viewinfo.addActionListener(this);
        info.add(viewinfo);


        JMenu user = new JMenu("User");
        user.setFont(new Font("serif",Font.PLAIN,15));
        //menuBar.add(user);

        JMenuItem paybill = new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon paybillImg = new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image paybillImage = paybillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(paybillImage));
        paybill.addActionListener(this);
        user.add(paybill);


        JMenuItem billdetails = new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon billdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image billdetailsImage = billdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(billdetailsImage));
        billdetails.addActionListener(this);
        user.add(billdetails);

        JMenu bill = new JMenu("Bill");
        bill.setFont(new Font("serif",Font.PLAIN,15));
        //menuBar.add(bill);

        JMenuItem genbill = new JMenuItem(" Generate Bill");
        genbill.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon genbillImg = new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image genbillImage = genbillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        genbill.setIcon(new ImageIcon(genbillImage));
        genbill.addActionListener(this);
        // notepad.setBackground(Color.orange);
         bill.add(genbill);




        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif",Font.PLAIN,15));
       // menuBar.add(utility);

        JMenuItem notepad = new JMenuItem(" Notepad");
        notepad.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon notepadImg = new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image notepadImage = notepadImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadImage));
        notepad.addActionListener(this);
       // notepad.setBackground(Color.orange);
        utility.add(notepad);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon calculatorImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calculatorImage = calculatorImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorImage));
        calculator.addActionListener(this);
        //calculator.setBackground(Color.orange);
        utility.add(calculator);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif",Font.PLAIN,15));
        //menuBar.add(exit);

        JMenuItem eexit = new JMenuItem("EXIT");
        eexit.setFont(new Font("monospaced", Font.PLAIN,14));
        ImageIcon eexitImg = new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image eexitImage = eexitImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        eexit.setIcon(new ImageIcon(eexitImage));
        eexit.addActionListener(this);
        //calculator.setBackground(Color.orange);
        exit.add(eexit);

        if(acctype.equals("Admin")){
            menuBar.add(menu);
        }else{
            menuBar.add(bill);
            menuBar.add(user);
            menuBar.add(info);

        }
        menuBar.add(utility);
        menuBar.add(exit);


        setLayout(new FlowLayout());
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();

        if (msg.equals("New Customer")){
            new newCustomer();

        } else if (msg.equals("Customer Details")) {
            new customer_details();


        } else if (msg.equals("Deposit Details")) {
            new deposit_details();

        } else if (msg.equals("Calculate Bill")) {
            new CalculateBill();

        } else if (msg.equals("View Information")) {
            new view_info(meter_pass);

        }

    }

    public static void main(String[] args) {
        new Main_class(" ", " ");

    }
}*/

package electricity.billing.system;

import com.mysql.cj.log.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame implements ActionListener {
    String acctype;
    String meter_pass;
    Main_class(String acctype, String meter_pass){
        this.meter_pass = meter_pass;
        this.acctype = acctype;
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/bg.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(1530,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image);
        JLabel imageLable = new JLabel(imageIcon2);
        add(imageLable);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerImg = new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image customerImage = customerImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(customerImage));
        newcustomer.addActionListener(this);
        menu.add(newcustomer);

        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image customerdetailsImage = customerdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(customerdetailsImage));
        customerdetails.addActionListener(this);
        menu.add(customerdetails);

        JMenuItem depositdetails = new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon depositdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/depositdetails.png"));
        Image depositdetailsImage = depositdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(depositdetailsImage));
        depositdetails.addActionListener(this);
        menu.add(depositdetails);

        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatebillImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image calculatebillImage = calculatebillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(calculatebillImage));
        calculatebill.addActionListener(this);
        menu.add(calculatebill);


        JMenu info = new JMenu("Information");
        info.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem upinfo =new JMenuItem("Update Information");
        upinfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon upinfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
        Image upinfoImage = upinfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        upinfo.setIcon(new ImageIcon(upinfoImage));
        upinfo.addActionListener(this);
        info.add(upinfo);

        JMenuItem viewInfo =new JMenuItem("View Information");
        viewInfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon viewInfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
        Image viewInfoImage = viewInfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewInfo.setIcon(new ImageIcon(viewInfoImage));
        viewInfo.addActionListener(this);
        info.add(viewInfo);

        JMenu user = new JMenu("User");
        user.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem paybill =new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon paybillImg = new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image paybillImage = paybillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(paybillImage));
        paybill.addActionListener(this);
        user.add(paybill);

        JMenuItem billdetails =new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon billdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image billdetailsImage = billdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(billdetailsImage));
        billdetails.addActionListener(this);
        user.add(billdetails);

        JMenu bill = new JMenu("Bill");
        bill.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem genBill =new JMenuItem("Generate Bill");
        genBill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon genBillImg = new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image genBillImage = genBillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        genBill.setIcon(new ImageIcon(genBillImage));
        genBill.addActionListener(this);
        bill.add(genBill);

        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem notepad =new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon notepadImg = new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image notepadImage = notepadImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadImage));
        notepad.addActionListener(this);
        utility.add(notepad);


        JMenuItem calculator =new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatorImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calculatorImage = calculatorImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorImage));
        calculator.addActionListener(this);
        utility.add(calculator);


        JMenu Help = new JMenu("Help");
        Help.setFont(new Font("serif",Font.PLAIN,15));

        JMenuItem help =new JMenuItem("Support");
        help.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon helpImg = new ImageIcon(ClassLoader.getSystemResource("icon/ques.jpeg"));
        Image helpImage = helpImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        help.setIcon(new ImageIcon(helpImage));
        help.addActionListener(this);
        Help.add(help);



        JMenuItem chat1 =new JMenuItem("Contact");
        chat1.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon chat1Img = new ImageIcon(ClassLoader.getSystemResource("icon/chat2.jpeg"));
        Image chat1Image = chat1Img.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        chat1.setIcon(new ImageIcon(chat1Image));
        chat1.addActionListener(this);
        Help.add(chat1);

        JMenu Client = new JMenu("Client Support");
        Help.setFont(new Font("serif",Font.PLAIN,15));

        JMenuItem Clients =new JMenuItem("Client ");
        Clients.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon ClientsImg = new ImageIcon(ClassLoader.getSystemResource("icon/chat2.jpeg"));
        Image ClientsImage = ClientsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        Clients.setIcon(new ImageIcon(ClientsImage));
        Clients.addActionListener(this);
        Client.add(Clients);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem eexit =new JMenuItem("Exit");
        eexit.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon eexitImg = new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image eexitImage = eexitImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        eexit.setIcon(new ImageIcon(eexitImage));
        eexit.addActionListener(this);
        exit.add(eexit);

        if (acctype.equals("Admin")){
            menuBar.add(menu);
            menuBar.add(Client);
        }else {
            menuBar.add(bill);
            menuBar.add(user);
            menuBar.add(info);
            menuBar.add(Help);
        }
        menuBar.add(utility);
        menuBar.add(exit);


        setLayout(new FlowLayout());
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if (msg.equals("New Customer")) {
            new newCustomer();
        } else if (msg.equals("Customer Details")) {
            new customer_details();
        } else if (msg.equals("Deposit Details")) {
            new deposit_details();
        } else if (msg.equals("Calculate Bill")) {
            new CalculateBill();
        } else if (msg.equals("View Information")) {
            new view_info(meter_pass);
        } else if (msg.equals("Update Information")) {
            new update_information(meter_pass);
        } else if (msg.equals("Bill Details")) {
            new bill_details(meter_pass);
        } else if (msg.equals("Calculator")) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (msg.equals("Notepad")) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (msg.equals("Exit")) {
            setVisible(false);
            new Login();
        } else if (msg.equals("Pay Bill")) {
            new pay_bill(meter_pass);
        } else if (msg.equals("Generate Bill")) {
            new generate_bill(meter_pass);
        } else if (msg.equals("Support")) {
            new Chatbot();

        } else if (msg.equals("Contact")) {
            new Server();
            //new Client();
        }else if (msg.equals("Client Support")) {
            new Client();

        }
 }

    public static void main(String[] args) {
        new Main_class("","");
    }
}
