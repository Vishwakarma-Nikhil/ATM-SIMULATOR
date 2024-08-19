package BankManagementSystem;


import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class ministatement extends JFrame {
    String cardnumber, pinnumber;
   
    ministatement(String cardnumber,String pinnumber){
        this.cardnumber=cardnumber;
        this.pinnumber=pinnumber;

        setLayout(null);
        this.pinnumber=pinnumber;
        this.cardnumber=cardnumber;

        JLabel text=new JLabel();
        add(text);

        JLabel bankname=new JLabel("SWISS BANK");
        bankname.setBounds(150,20,100,20);
        add(bankname);
    
      
       JLabel card=new JLabel("Card Number: "+cardnumber.substring(0, 4)+"xxxxxxxx"+cardnumber.substring(11));
       card.setBounds(20,80,300,20);
       add(card);

       
       JLabel mini=new JLabel();
       mini.setBounds(20,140,400,300);
       add(mini);

       JLabel balance=new JLabel();
       balance.setBounds(20,520,300,20);
       add(balance);

       try{
        //do again
        connection con=new connection();

        ResultSet rs=con.s.executeQuery("select * from transaction where PIN_Number='"+pinnumber+"' and Card_Number='"+cardnumber+"' ");

        while(rs.next()){
            mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
        }
        
       }catch(Exception e){
        System.out.println(e);
       }

        try{
               
                connection con=new connection();
                ResultSet rs=con.s.executeQuery("select * from transaction where Card_Number='"+cardnumber+"' and PIN_Number='"+pinnumber+"'");//to select an get all information of withdrawl and deposit
                int bal=0;
             
   
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        bal += Integer.parseInt(rs.getString("amount"));
                    }else{
                        bal-=Integer.parseInt(rs.getString("amount"));
                    }
            
                }
              balance.setText("Your account balance is Rs"+bal);
          
       
            
            }catch(Exception e){
                System.out.println(e);
            }


      






   

    setSize(400,600);
    setLocation(20,20);
    getContentPane().setBackground(Color.WHITE);
    setVisible(true);


    }

    public static void main(String[] args) {
      new  ministatement("5040804477454560","1234");
    }
    
}
