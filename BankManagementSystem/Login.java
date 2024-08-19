package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener {

    JButton login,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    char[] passwordenter;
    Login(){

        setTitle("Auto Matic Teller Maachine");

        setLayout(null);
        //To add icons or image to the frame 
        //To add the object in the frame we need to create imageicon object the only we can place in JLabel  
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//to load image image and address to be provided in""
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);//to resize the icon it's imageis formed to use scale fn 
        ImageIcon i3=new ImageIcon(i2);//Image is converted into Image icon again
        JLabel label =new JLabel(i3);//Label object to be created to add Image icons only image can be used in JLabel
        label.setBounds(70,10,100,100);
        add(label);//add fuction to add label


        JLabel text =new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno =new JLabel("Card No:-");
        cardno.setFont(new Font("Raleway",Font.BOLD,30));
        cardno.setBounds(120,150,200,30);
        add(cardno);

        cardTextField =new JTextField();// Text field for input  use JTEXTFIELD
        cardTextField.setBounds(350,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        JLabel pin =new JLabel("PIN:-");
        pin.setFont(new Font("Raleway",Font.BOLD,30));
        pin.setBounds(120,220,200,30);
        add(pin);

        pinTextField=new JPasswordField();// Text field for input  use JTEXTFIELD
        pinTextField.setBounds(350,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        login =new JButton("SIGN IN");
        login.setBounds(350,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear =new JButton("CLEAR");
        clear.setBounds(480,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup =new JButton("SIGN UP");
        signup.setBounds(350,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);


       









        getContentPane().setBackground(Color.WHITE);//to add color to whole frame 
        //To setup frame 
        setSize(800,440);
        setVisible(true);
        setLocation(350,200);//X distance from left ,y distance from top

      

       
    
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");

        }else if(ae.getSource()==login){
            connection con=new connection();
            String cardnumber=cardTextField.getText();
            String pinnumber =pinTextField.getText();
            String query="select * from Login where Card_Number ='"+cardnumber+"' and PIN_Number ='"+pinnumber+"'";

            try{
                //to check password 
                ResultSet rs=con.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(cardnumber,pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN ");
                }

            }catch(Exception e){
                System.out.println(e);
            }


        }else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);


        }


    }



    public static void main(String [] args){
        new Login();



    }
    
}
