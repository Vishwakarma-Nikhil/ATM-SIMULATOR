package BankManagementSystem;

import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class balanceenquiry extends JFrame implements ActionListener {
    String pinnumber;
    String cardnumber;
    JButton back;
    balanceenquiry(String cardnumber,String pinnumber){

     setLayout(null);
    this.pinnumber=pinnumber;
    this.cardnumber=cardnumber;

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel label =new JLabel(i3);
    label.setBounds(0,0,900,900);
    add(label);

    



    back=new JButton("Back");
    back.setBounds(355,520,150,30);
    back.setFont( new Font("System",Font.BOLD,16));
    back.setForeground(Color.BLACK);
    back.addActionListener(this);
    label.add(back);

  

            int balance=0;
            try{
               
                connection con=new connection();
                ResultSet rs=con.s.executeQuery("select * from transaction where Card_Number='"+cardnumber+"' and PIN_Number='"+pinnumber+"'");//to select an get all information of withdrawl and deposit
                
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance-=Integer.parseInt(rs.getString("amount"));
                    }
            
                }
                            
            }catch(Exception e){
                System.out.println(e);
            }

            JLabel text=new JLabel("Your Account Balance is Rs "+balance);
            text.setForeground(Color.WHITE);
            text.setBounds(170,300,400,30);
            text.setFont(new Font("Raleway",Font.BOLD,18));
            label.add(text);


    setSize(900,900);
    setLocation(300,0);
    setUndecorated(true);
    setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transaction(cardnumber, pinnumber);


    }


    public static void main(String[] args) {
        new balanceenquiry("","");
    }
    
}
