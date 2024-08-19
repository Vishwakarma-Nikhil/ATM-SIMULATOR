package BankManagementSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transaction extends JFrame implements ActionListener {
    JButton deposit,withdrawl,balanceequ,exit,ministatement,fastcash,pinchange;
    String cardnumber,pinnumber;


    Transaction(String cardnumber,String pinnumber){
        this.pinnumber=pinnumber;
        this.cardnumber=cardnumber;

          setLayout(null);
        //To add icons or image to the frame 
        //To add the object in the frame we need to create imageicon object the only we can place in JLabel  
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));//to load image image and address to be provided in""
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);//to resize the icon it's imageis formed to use scale fn 
        ImageIcon i3=new ImageIcon(i2);//Image is converted into Image icon again
        JLabel label =new JLabel(i3);//Label object to be created to add Image icons only image can be used in JLabel
        label.setBounds(0,0,900,900);
        add(label);//add fuction to add label

        JLabel text=new JLabel("Please select your Transactions");
        text.setBounds(210,300,400,25);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.WHITE);
        label.add(text);

        deposit=new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.setFont(new Font("System",Font.BOLD,14));
        deposit.setForeground(Color.BLACK);
        deposit.addActionListener(this);
        label.add(deposit);

        withdrawl=new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.setFont(new Font("System",Font.BOLD,14));
        withdrawl.setForeground(Color.BLACK);
        withdrawl.addActionListener(this);
        label.add(withdrawl);

        
        fastcash=new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.setFont(new Font("System",Font.BOLD,14));
        fastcash.setForeground(Color.BLACK);
        fastcash.addActionListener(this);
        label.add(fastcash);

       
        ministatement=new JButton("Mini Statement");
        ministatement.setBounds(355,450,150,30);
        ministatement.setFont(new Font("System",Font.BOLD,14));
        ministatement.setForeground(Color.BLACK);
        ministatement.addActionListener(this);
        label.add(ministatement);

        pinchange=new JButton("PIN Change");
        pinchange.setBounds(170,485,150,30);
        pinchange.setFont(new Font("System",Font.BOLD,14));
        pinchange.setForeground(Color.BLACK);
        pinchange.addActionListener(this);
        label.add(pinchange);

        balanceequ=new JButton("Balance Equiry");
        balanceequ.setBounds(355,485,150,30);
        balanceequ.setFont(new Font("System",Font.BOLD,14));
        balanceequ.setForeground(Color.BLACK);
        balanceequ.addActionListener(this);
        label.add(balanceequ);

        exit=new JButton("Exit");
        exit.setBounds(355,520,150,30);
        exit.setFont(new Font("System",Font.BOLD,14));
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        label.add(exit);


        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==exit){
            System.exit(0);
        }else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(cardnumber,pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash){
            setVisible(false);
            new Fastcash(cardnumber,pinnumber).setVisible(true);
        }else if(ae.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(cardnumber,pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){
            setVisible(false);
            new pinchange(cardnumber,pinnumber).setVisible(true);
        }else if(ae.getSource()==balanceequ){
            setVisible(false);
            new balanceenquiry(cardnumber,pinnumber).setVisible(true);
        }else if(ae.getSource()==ministatement){
            
            new ministatement(cardnumber,pinnumber).setVisible(true);

        }

    }


    public static void main(String[] args) {
        new Transaction("","");
    }
    
}
