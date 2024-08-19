package BankManagementSystem;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.util.Random;




public class SignupThree extends JFrame implements ActionListener {
    long random;
    JLabel  accounttype,cardno,pinno,servicereq;
    JRadioButton savingacc,FDacc,currentac,RDacc;
    JButton cancel,back,submit;
    JCheckBox atmcard,internetbank,mobilebank,emailaletrs,chequebook,estatements,declaration;
  

    SignupThree(long formno){
        setTitle("Auto Matic Teller Maachine / SignupOne/SignupTwo/SignupThree");
        setLayout(null);

        random=formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);//to resize the icon it's imageis formed to use scale fn 
        ImageIcon i3=new ImageIcon(i2);//Image is converted into Image icon again
        JLabel label =new JLabel(i3);//Label object to be created to add Image icons only image can be used in JLabel
        label.setBounds(110,20,100,100);
        add(label);//add fuction to add label

        JLabel Title =new JLabel("Page 3: Account Details"); 
        Title.setBounds(230,60,600,40);
        Title.setFont(new Font("Raleway",Font.BOLD,30));
        add(Title);

        JLabel fnum=new JLabel("Form no."+formno);
        fnum.setBounds(680,20,200,20);
        fnum.setFont(new Font("Raleway",Font.BOLD,11));
        add(fnum);

        accounttype =new JLabel("Account Type :-");
        accounttype.setBounds(80,140,200,30);
        accounttype.setFont(new Font("Raleway",Font.BOLD,22));
        add(accounttype);
        savingacc =new JRadioButton("Saving Account");
        savingacc.setBounds(80,190,250,22);
        savingacc.setFont(new Font("Raleway",Font.BOLD,18));
        savingacc.setBackground(Color.WHITE);
        savingacc.setForeground(Color.BLACK);
        add(savingacc);
        FDacc =new JRadioButton("Fixed  Deposit Account");
        FDacc.setBounds(380,190,250,22);
        FDacc.setFont(new Font("Raleway",Font.BOLD,18));
        FDacc.setBackground(Color.WHITE);
        FDacc.setForeground(Color.BLACK);
        add(FDacc);
        currentac =new JRadioButton("Current Account");
        currentac.setBounds(80,220,250,22);
        currentac.setFont(new Font("Raleway",Font.BOLD,18));
        currentac.setBackground(Color.WHITE);
        currentac.setForeground(Color.BLACK);
        add(currentac);
        RDacc =new JRadioButton("Recurring Deposit Account");
        RDacc.setBounds(380,220,300,22);
        RDacc.setFont(new Font("Raleway",Font.BOLD,18));
        RDacc.setBackground(Color.WHITE);
        RDacc.setForeground(Color.BLACK);
        add(RDacc);
        ButtonGroup acctype=new ButtonGroup();
        acctype.add(savingacc);
        acctype.add(FDacc);
        acctype.add(currentac);
        acctype.add(RDacc);


        cardno =new JLabel("Card Number :-");
        cardno.setBounds(80,280,200,30);
        cardno.setFont(new Font("Raleway",Font.BOLD,22));
        add(cardno);
        JLabel Ins1=new JLabel("(Your 16-digit Card Number)");
        Ins1.setBounds(80,310,200,15);
        Ins1.setFont(new Font("Raleway",Font.BOLD,11));
        add(Ins1);
        JLabel cardx =new JLabel("XXXX-XXXX-XXXX-4560");
        cardx.setBounds(350,280,600,30);
        cardx.setFont(new Font("Raleway",Font.BOLD,22));
        add(cardx);
        JLabel Ins3=new JLabel("(It would appear on ATM Card,Cheque Book and Statements)");
        Ins3.setBounds(350,320,600,15);
        Ins3.setFont(new Font("Raleway",Font.BOLD,11));
        add(Ins3);




        pinno =new JLabel("PIN :-");
        pinno.setBounds(80,360,200,30);
        pinno.setFont(new Font("Raleway",Font.BOLD,22));
        add(pinno);
        JLabel Ins2=new JLabel("(Your 4-digit password)");
        Ins2.setBounds(80,390,200,15);
        Ins2.setFont(new Font("Raleway",Font.BOLD,11));
        add(Ins2);
        JLabel pinx =new JLabel("XXXX");
        pinx.setBounds(350,360,100,30);
        pinx.setFont(new Font("Raleway",Font.BOLD,22));
        add(pinx);


        servicereq =new JLabel("Service Required :-");
        servicereq.setBounds(80,450,300,30);
        servicereq.setFont(new Font("Raleway",Font.BOLD,22));
        add(servicereq);

        atmcard=new JCheckBox("ATM CARD");
        atmcard.setBounds(80,490,200,30);
        atmcard.setFont(new Font("Raleway",Font.BOLD,22));
        atmcard.setBackground(Color.WHITE);
        atmcard.setForeground(Color.BLACK);
        add(atmcard);
        
        internetbank =new JCheckBox("Internet Banking");
        internetbank.setBounds(380,490,300,30);
        internetbank.setFont(new Font("Raleway",Font.BOLD,22));
        internetbank.setBackground(Color.WHITE);
        internetbank.setForeground(Color.BLACK);
        add(internetbank);

        mobilebank=new JCheckBox("Mobile Banking");
        mobilebank.setBounds(80,530,200,30);
        mobilebank.setFont(new Font("Raleway",Font.BOLD,22));
        mobilebank.setBackground(Color.WHITE);
        mobilebank.setForeground(Color.BLACK);
        add(mobilebank);

        emailaletrs=new JCheckBox("Email and SMS Alerts");
        emailaletrs.setBounds(380,530,300,30);
        emailaletrs.setFont(new Font("Raleway",Font.BOLD,22));
        emailaletrs.setBackground(Color.WHITE);
        emailaletrs.setForeground(Color.BLACK);
        add(emailaletrs);



        chequebook=new JCheckBox("Cheque Book");
        chequebook.setBounds(80,570,200,30);
        chequebook.setFont(new Font("Raleway",Font.BOLD,22));
        chequebook.setBackground(Color.WHITE);
        chequebook.setForeground(Color.BLACK);
        add(chequebook);

        estatements=new JCheckBox("E-Statements");
        estatements.setBounds(380,570,200,30);
        estatements.setFont(new Font("Raleway",Font.BOLD,22));
        estatements.setBackground(Color.WHITE);
        estatements.setForeground(Color.BLACK);
        add(estatements);


        declaration=new JCheckBox("I hereby declares that the above entered details are correct to best of my knowlege");
        declaration.setBounds(80,630,600,20);
        declaration.setFont(new Font("Raleway",Font.BOLD,11));
        declaration.setBackground(Color.WHITE);
        declaration.setForeground(Color.BLACK);
        add(declaration);





        // back = new JButton("Back");
        // back.setBackground(Color.BLACK);
        // back.setForeground(Color.WHITE);
        // back.setFont(new Font("Raleway",Font.BOLD,14));
        // back.setBounds(100,700,100,30);
        // back.addActionListener(this);
        // add(back);

        submit=new  JButton("Submit");
        submit.setBounds(300,700,100,30);
        submit.setFont(new Font("Raleway",Font.BOLD,18));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        cancel=new  JButton("Cancel");
        cancel.setBounds(500,700,100,30);
        cancel.setFont(new Font("Raleway",Font.BOLD,18));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);



      getContentPane().setBackground(Color.WHITE);//to add color to whole frame 
      //To setup frame 
      setSize(850,800);//to make frame
      setVisible(true);
      setLocation(400,50);//X distance from left ,y distance from top



    }
  

    public void   actionPerformed(ActionEvent ae){

       String formno=""+random;

        if(ae.getSource()==submit){

            String accountType="null";
            if(savingacc.isSelected()){
                accountType="Saving Account";
            }else if(FDacc.isSelected()){
                accountType="Fixed Diposit Account";
            }else if(currentac.isSelected()){
                accountType="Current Account";
            }else if(RDacc.isSelected()){
                accountType="Recurring Deposit Account";
            }


            Random random=new Random();

            String cardnumber=""+5040L+Math.abs((random.nextLong()%90000000L)+10000000)+4560L;

            String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);

            String facility="";
            if(atmcard.isSelected()){
                facility=facility+"ATM Card ";
            } if(internetbank.isSelected()){
                facility=facility+","+"InterNet Banking ";
            } if (mobilebank.isSelected()){
                facility=facility+","+"Mobile Banking ";
            } if (emailaletrs.isSelected()){
                facility=facility+","+"Emails and SMS Alerts ";
            } if (chequebook.isSelected()){
                facility=facility+","+"Cheque Book ";
            } if (estatements.isSelected()){
                facility=facility+","+"E_Statements ";
            }

            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required" );
                }else {
                    connection con=new connection();
                    String query1="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";

                    String query2="insert into Login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    con.s.executeUpdate(query1);

                    con.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card NUmber: "+cardnumber+"\n"+"PIN Number: "+pinnumber);
                }
                

            }catch(Exception e){
                System.out.println(e);
            }





        }else if(ae.getSource()==cancel){
            System.exit(0);

        }



    }


    public static void main(String [] args){
        new SignupThree(12345);


    }
    
}
