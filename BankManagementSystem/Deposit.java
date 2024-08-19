package BankManagementSystem;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Deposit extends JFrame implements ActionListener{

    JTextField amountTextField;
    JButton deposit,back;
    String cardnumber,pinnumber;

    Deposit(String cardnumber,String pinnumber){
    setLayout(null);
    this.pinnumber=pinnumber;
    this.cardnumber=cardnumber;
    //To add icons or image to the frame 
    //To add the object in the frame we need to create imageicon object the only we can place in JLabel  
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));//to load image image and address to be provided in""
    Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);//to resize the icon it's imageis formed to use scale fn 
    ImageIcon i3=new ImageIcon(i2);//Image is converted into Image icon again
    JLabel label =new JLabel(i3);//Label object to be created to add Image icons only image can be used in JLabel
    label.setBounds(0,0,900,900);
    add(label);//add fuction to add label

   
    JLabel text =new JLabel("Enter the amount you want to deposit");
    text.setBounds(170,300,400,20);
    text.setFont( new Font("System",Font.BOLD,16));
    text.setForeground(Color.WHITE);
    label.add(text);

    amountTextField=new JTextField();
    amountTextField.setBounds(170,350,320,30);
    amountTextField.setFont( new Font("System",Font.BOLD,22));
    amountTextField.setForeground(Color.BLACK);
    label.add(amountTextField);

    deposit=new JButton("Deposit");
    deposit.setBounds(355,485,150,30);
    deposit.setFont( new Font("System",Font.BOLD,16));
    deposit.setForeground(Color.BLACK);
    deposit.addActionListener(this);
    label.add(deposit);

    back=new JButton("Back");
    back.setBounds(355,520,150,30);
    back.setFont( new Font("System",Font.BOLD,16));
    back.setForeground(Color.BLACK);
    back.addActionListener(this);
    label.add(back);




     
    setSize(900,900);
    setLocation(300,0);
    setUndecorated(true);
    setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){

        
            if(ae.getSource()==deposit){
                String amount=""+amountTextField.getText();
                Date date=new Date();
                if(amount.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter amount the you want to deposit" );
                }else{
                    try{connection con=new connection();
                    String query="insert into transaction values('"+cardnumber+"','"+pinnumber+"','"+date+"','Deposit','"+amount+"')";
                    con.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs."+amount+" Deposited Succesfully");
                    setVisible(false);
                    new Transaction( cardnumber, pinnumber).setVisible(true);

                }catch(Exception e){
                    System.out.println(e);
                }
                
                }
                }else if(ae.getSource()==back){
                setVisible(false);
                new Transaction( cardnumber, pinnumber).setVisible(true);

            }

       
        }
            

        

    

    // public static void main(String[] args) {
    //     new Deposit("","");
    // }
    
}
