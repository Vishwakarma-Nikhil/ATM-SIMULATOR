package BankManagementSystem;

import java.awt.event.*;//action listener
import com.toedter.calendar.JDateChooser;//for calender

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class SignupOne extends JFrame implements ActionListener {


     //declare globally to pass to sql
    long random;
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,
    cityTextField,stateTextField,pincodeTextField;
    JButton next,back;
    JRadioButton male,fmale,other,married,unmarried,others; 
    JDateChooser dateChooser;

     SignupOne(){

        setLayout(null);//to place TextFileds and Labels at our willing place

        setTitle("Auto Matic Teller Maachine / SignupOne");


        //for random number generation
        //ALL LABELS
        Random ran =new Random();
        random =Math.abs(ran.nextLong()%9000L+1000L);

        JLabel formno =new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(120,20,600,40);
        add(formno);

        JLabel personDetails  =new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(280,80,400,30);
        add(personDetails);

        JLabel name  =new JLabel("Name :-");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);

        JLabel fname  =new JLabel("Father's Name :-");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);

        JLabel dob  =new JLabel("Date of Birth :-");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);

        //CALENDER
        //TO add calender we need to create object of class JDate chooser which is in jar file
        dateChooser =new JDateChooser();
        dateChooser.setBounds(330,240,300,30);
        dateChooser.setFont(new Font("Raleway",Font.BOLD,18));
        add(dateChooser);


        JLabel gender  =new JLabel("Gender :-");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);

        //Radio buttons for male ,female ,other
        male=new JRadioButton("Male");
        male.setBounds(330,290,60,30);
        male.setBackground(Color.WHITE);
        male.setForeground(Color.BLACK);
        add(male);

        fmale=new JRadioButton("Female");
        fmale.setBounds(430,290,80,30);
        fmale.setBackground(Color.WHITE);
        fmale.setForeground(Color.BLACK);
        add(fmale);

        other=new JRadioButton("Other");
        other.setBounds(540,290,80,30);
        other.setBackground(Color.WHITE);
        other.setForeground(Color.BLACK);
        add(other);

             //to select one of them Button group class is used
        ButtonGroup gendergroup =new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(fmale);
        gendergroup.add(other);

        //radio button end

        JLabel email  =new JLabel("Email :-");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,340,200,30);
        add(email);

        JLabel maritalS  =new JLabel("Marital Status :-");
        maritalS.setFont(new Font("Raleway",Font.BOLD,22));
        maritalS.setBounds(100,390,200,30);
        add(maritalS);

          //Radio buttons for Married ,unmarried
          married=new JRadioButton("Married");
          married.setBounds(330,390,80,30);
          married.setBackground(Color.WHITE);
          married.setForeground(Color.BLACK);
          add(married);
  
          unmarried=new JRadioButton("Unmarried");
          unmarried.setBounds(430,390,100,30);
          unmarried.setBackground(Color.WHITE);
          unmarried.setForeground(Color.BLACK);
          add(unmarried);

          others=new JRadioButton("Other");
          others.setBounds(540,390,80,30);
          others.setBackground(Color.WHITE);
          others.setForeground(Color.BLACK);
          add(others);
  


  
               //to select one of them Button group class is used
          ButtonGroup martialgroup =new ButtonGroup();
          martialgroup.add(married);
          martialgroup.add(unmarried);
          martialgroup.add(others);
  
          //radio button end

        JLabel address  =new JLabel("Address :-");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);

        JLabel city  =new JLabel("City :-");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);

        JLabel state  =new JLabel("State :-");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);

        JLabel pincode  =new JLabel("PIN Code :-");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);


        //ALL TEXTFIELDS

        nameTextField =new JTextField();
        nameTextField.setBounds(330,140,300,30);
        nameTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(nameTextField);

        fnameTextField =new JTextField();
        fnameTextField.setBounds(330,190,300,30);
        fnameTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(fnameTextField);

        emailTextField =new JTextField();
        emailTextField.setBounds(330,340,300,30);
        emailTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(emailTextField);

        addressTextField =new JTextField();
        addressTextField.setBounds(330,440,300,30);
        addressTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(addressTextField);

        cityTextField =new JTextField();
        cityTextField.setBounds(330,490,300,30);
        cityTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(cityTextField);

        stateTextField =new JTextField();
        stateTextField.setBounds(330,540,300,30);
        stateTextField.setFont(new Font("Arial",Font.BOLD,18));
        add( stateTextField);

        pincodeTextField =new JTextField();
        pincodeTextField.setBounds(330,590,300,30);
        pincodeTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(pincodeTextField);

        //Jbutton
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(530,650,100,30);
        next.addActionListener(this);
        add(next);

        // back = new JButton("Back");
        // back.setBackground(Color.BLACK);
        // back.setForeground(Color.WHITE);
        // back.setFont(new Font("Raleway",Font.BOLD,14));
        // back.setBounds(100,650,100,30);
        // back.addActionListener(this);
        // add(back);





       


        getContentPane().setBackground(Color.WHITE);//to add color to whole frame 
        //To setup frame 
        setSize(850,800);//to make frame
        setVisible(true);
        setLocation(400,50);//X distance from left ,y distance from top






    }

    public void actionPerformed(ActionEvent ae){
        String formno=""+random;//long to string
        String name=nameTextField.getText();//get text
        String fname=fnameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender="Male";
        }else if(fmale.isSelected()){
            gender="Female";
        }else if(other.isSelected()){
            gender="other";
        }
        String email=emailTextField.getText();
        String Marital="null";
        if(married.isSelected()){
            Marital="Married";
        }else if(unmarried.isSelected()){
            Marital="Unmarried";
        }else if(others.isSelected()){
            Marital="Other";
        }
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String State=stateTextField.getText();
        String pincode=pincodeTextField.getText();

        try{

            //  if(ae.getSource()==back){
            //     setVisible(false);
            //     new Login().setVisible(true);
            //    } //for requirement * validation ke liye
               if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else{
                connection c= new connection();//class object line 279 to 281 is for entering data into Sql
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+Marital+"','"+address+"','"+city+"','"+State+"','"+pincode+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new Signuptwo(random).setVisible(true);         
            }     
        }catch(Exception e){
            System.out.println(e);
        }

        




    }
    







    public static void main(String [] args){
      new SignupOne();
      


    }
}
