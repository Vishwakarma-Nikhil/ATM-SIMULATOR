package BankManagementSystem;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class pinchange extends JFrame implements ActionListener {
    String cardnumber;
    String pinnumber;
    JPasswordField pinnumberTextField,repinnumberTextField;
    JButton change,back;

    pinchange(String cardnumber,String pinnumber){
    setLayout(null);
    this.pinnumber=pinnumber;
    this.cardnumber=cardnumber;

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel label =new JLabel(i3);
    label.setBounds(0,0,900,900);
    add(label);

    JLabel text =new JLabel("CHANGE YOUR PIN ");
    text.setBounds(250,290,400,20);
    text.setFont( new Font("System",Font.BOLD,16));
    text.setForeground(Color.WHITE);
    label.add(text);

    JLabel text1 =new JLabel("Enter New PIN : ");
    text1.setBounds(165,320,300,20);
    text1.setFont( new Font("Raleway",Font.BOLD,16));
    text1.setForeground(Color.WHITE);
    label.add(text1);

    pinnumberTextField= new JPasswordField();
    pinnumberTextField.setBounds(330,320,180,20);
    pinnumberTextField.setFont( new Font("Raleway",Font.BOLD,16));
    pinnumberTextField.setForeground(Color.BLACK);
    label.add(pinnumberTextField);


    JLabel text2 =new JLabel("Re-enter New PIN :");
    text2.setBounds(165,360,400,20);
    text2.setFont( new Font("Raleway",Font.BOLD,16));
    text2.setForeground(Color.WHITE);
    label.add(text2);

    repinnumberTextField= new JPasswordField();
    repinnumberTextField.setBounds(330,360,180,20);
    repinnumberTextField.setFont( new Font("Raleway",Font.BOLD,16));
    repinnumberTextField.setForeground(Color.BLACK);
    label.add(repinnumberTextField);

    change=new JButton("CHANGE");
    change.setBounds(355,485,150,30);
    change.setFont( new Font("System",Font.BOLD,16));
    change.setForeground(Color.BLACK);
    change.addActionListener(this);
    label.add(change);

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

    String newpinnumber=""+pinnumberTextField.getText();
    String repinnumber=""+repinnumberTextField.getText();

    if(ae.getSource()==back){
        setVisible(false);
        new Transaction(cardnumber, pinnumber).setVisible(true);
    }else if(ae.getSource()==change){
        if(newpinnumber.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter new PIN number");
        }
        else if(repinnumber.equals("")){
            JOptionPane.showMessageDialog(null, " Please re-enter new PIN number");
        }

        if(newpinnumber.equals(repinnumber)){
            try{
                //to update query
                connection con=new connection();
                String query1="update transaction set PIN_Number='"+newpinnumber+"' where PIN_Number='"+pinnumber+"' and Card_Number='"+cardnumber+"' ";
                String query2="update signupthree set PIN_Number='"+newpinnumber+"' where PIN_Number='"+pinnumber+"' and Card_Number='"+cardnumber+"' ";
                String query3="update Login set PIN_Number='"+newpinnumber+"' where PIN_Number='"+pinnumber+"' and Card_Number='"+cardnumber+"' ";
                con.s.executeUpdate(query1);
                con.s.executeUpdate(query2);
                con.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null, " PIN change successfully");
                setVisible(false);
                new Transaction(cardnumber, newpinnumber);


            }catch(Exception e){
                System.out.println(e);

            }
        }else if(!repinnumber.equals("")){
            JOptionPane.showMessageDialog(null, "Re-enterd PIN doesnot match");
        }

    }

}

    



public static void main(String[] args) {
    new pinchange("", "");
}
    
    
}
