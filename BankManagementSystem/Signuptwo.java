package BankManagementSystem;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class Signuptwo extends JFrame implements ActionListener {
    long random;
    JLabel religion,Category,income,Edu1,pannum,aadharnum,seniorcitizen,exisitingacc,occupation;
    JComboBox religionCombo,CategoryCombo,incomeCombo,EduCombo,occCombo;
    JRadioButton r1,r2,r3,r4;
    JButton next,back;
    JTextField pannumTextField,addharnumTextField;

    Signuptwo(long formno){
        random=formno;
        
        setTitle("Auto Matic Teller Maachine / SignupOne/SignupTwo");
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);//to resize the icon it's imageis formed to use scale fn 
        ImageIcon i3=new ImageIcon(i2);//Image is converted into Image icon again
        JLabel label =new JLabel(i3);//Label object to be created to add Image icons only image can be used in JLabel
        label.setBounds(110,20,100,100);
        add(label);//add fuction to add label

        JLabel Title =new JLabel("Page 2: Additional Details"); 
        Title.setBounds(230,60,600,40);
        Title.setFont(new Font("Raleway",Font.BOLD,30));
        add(Title);

        JLabel fnum=new JLabel("Form no."+formno);
        fnum.setBounds(680,20,200,20);
        fnum.setFont(new Font("Raleway",Font.BOLD,11));
        add(fnum);

        religion =new JLabel("Religion :-");
        religion.setBounds(100,160,200,30);
        religion.setFont(new Font("Raleway",Font.BOLD,22));
        add(religion);

        String valereligion[]={"Hindu","Muslim","Sikh","Christian","other"};
        religionCombo=new JComboBox(valereligion) ;
        religionCombo.setBounds(400,160,300,30);
        religionCombo.setFont(new Font("Raleway",Font.BOLD,22));
        religionCombo.setBackground(Color.WHITE);
        religionCombo.setForeground(Color.BLACK);
        add(religionCombo);
            
        
        Category =new JLabel("Category :-");
        Category.setBounds(100,210,200,30);
        Category.setFont(new Font("Raleway",Font.BOLD,22));
        add(Category);
        String valeCategory[]={"General","OBC","SC","ST","Other"};
        CategoryCombo=new JComboBox(valeCategory) ;
        CategoryCombo.setBounds(400,210,300,30);
        CategoryCombo.setFont(new Font("Raleway",Font.BOLD,22));
        CategoryCombo.setBackground(Color.WHITE);
        CategoryCombo.setForeground(Color.BLACK);
        add(CategoryCombo);

        income =new JLabel("Income :-");
        income.setBounds(100,260,200,30);
        income.setFont(new Font("Raleway",Font.BOLD,22));
        add(income);

        String valeincome[]={"null","<150000","250000","500000","upto 1000000"};
        incomeCombo=new JComboBox(valeincome) ;
        incomeCombo.setBounds(400,260,300,30);
        incomeCombo.setFont(new Font("Raleway",Font.BOLD,22));
        incomeCombo.setBackground(Color.WHITE);
        incomeCombo.setForeground(Color.BLACK);
        add(incomeCombo);


        JLabel Edu1 =new JLabel("Educational");
        Edu1.setBounds(100,310,200,30);
        Edu1.setFont(new Font("Raleway",Font.BOLD,22));
        add(Edu1);
        JLabel Edu2 =new JLabel("Qualification :-");
        Edu2.setBounds(100,340,200,30);
        Edu2.setFont(new Font("Raleway",Font.BOLD,22));
        add(Edu2);
        String valeEdu[]={"10th pass","12th pass","Under Graduate(UG)","Post Graduate","Doctorate","others"};
        EduCombo=new JComboBox(valeEdu) ;
        EduCombo.setBounds(400,340,300,30);
        EduCombo.setFont(new Font("Raleway",Font.BOLD,22));
        EduCombo.setBackground(Color.WHITE);
        EduCombo.setForeground(Color.BLACK);
        add(EduCombo);

        occupation =new JLabel("Occupation :-");
        occupation.setBounds(100,390,200,30);
        occupation.setFont(new Font("Raleway",Font.BOLD,22));
        add(occupation);
        String valeocc[]={"Salried","Self Employed","Bussiness","Student","Retired","others"};
        occCombo=new JComboBox(valeocc) ;
        occCombo.setBounds(400,390,300,30);
        occCombo.setFont(new Font("Raleway",Font.BOLD,22));
        occCombo.setBackground(Color.WHITE);
        occCombo.setForeground(Color.BLACK);
        add(occCombo);


        pannum =new JLabel("PAN Number :-");
        pannum.setBounds(100,440,200,30);
        pannum.setFont(new Font("Raleway",Font.BOLD,22));
        add(pannum);

        pannumTextField=new JTextField();
        pannumTextField.setBounds(400,440,300,30);
        pannumTextField.setFont(new Font("Raleway",Font.BOLD,18));
        add(pannumTextField);

        aadharnum =new JLabel("Aadhar Number :-");
        aadharnum.setBounds(100,490,200,30);
        aadharnum.setFont(new Font("Raleway",Font.BOLD,22));
        add(aadharnum);

        
        addharnumTextField=new JTextField();
        addharnumTextField.setBounds(400,490,300,30);
        addharnumTextField.setFont(new Font("Raleway",Font.BOLD,18));
        add(addharnumTextField);
        

       
        seniorcitizen =new JLabel("Senior Citizen :-");
        seniorcitizen.setBounds(100,540,200,30);
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,22));
        add(seniorcitizen);

        r1 =new JRadioButton("Yes");
        r1.setBounds(400,540,80,22);
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        r1.setBackground(Color.WHITE);
        r1.setForeground(Color.BLACK);
        add(r1);
        r2 =new JRadioButton("No");
        r2.setBounds(540,540,80,22);
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        r2.setBackground(Color.WHITE);
        r2.setForeground(Color.BLACK);
        add(r2);
        ButtonGroup senior=new ButtonGroup();
        senior.add(r1);
        senior.add(r2);


        exisitingacc =new JLabel("Exisiting Account :-");
        exisitingacc.setBounds(100,590,300,30);
        exisitingacc.setFont(new Font("Raleway",Font.BOLD,22));
        add(exisitingacc);

        r3 =new JRadioButton("Yes");
        r3.setBounds(400,590,80,22);
        r3.setFont(new Font("Raleway",Font.BOLD,18));
        r3.setBackground(Color.WHITE);
        r3.setForeground(Color.BLACK);
        add(r3);
        r4 =new JRadioButton("No");
        r4.setBounds(540,590,80,22);
        r4.setFont(new Font("Raleway",Font.BOLD,18));
        r4.setBackground(Color.WHITE);
        r4.setForeground(Color.BLACK);
        add(r4);
        ButtonGroup acc=new ButtonGroup();
        acc.add(r1);
        acc.add(r2);


        next=new  JButton("Next");
        next.setBounds(600,650,100,30);
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
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

    public void   actionPerformed(ActionEvent ae){
        String formno=""+random;//long to string
        String religion=(String)religionCombo.getSelectedItem();//get text from combo boxes
        String Category=(String)CategoryCombo.getSelectedItem();
        String income=(String)incomeCombo.getSelectedItem();
        String Education=(String)EduCombo.getSelectedItem();
        String Occupation = (String)occCombo.getSelectedItem();
        String pannum=pannumTextField.getText();
        String aadharnum=addharnumTextField.getText();

        String Senior_Citizen="null";
        if(r1.isSelected()){
            Senior_Citizen="Yes";
        }else {
            Senior_Citizen="Female";
        }
        
        String Exisiting_Accounnt="null";
        if(r3.isSelected()){
            Exisiting_Accounnt="Yes";
        }else {
            Exisiting_Accounnt="No";
        }


        // if(ae.getSource()==back){
        //     setVisible(false);
        //    new  SignupOne().setVisible(true);
            
        // }


       

        try{
            //for requirement * validation ke liye
           
                connection c= new connection();//class object
                String query="insert into signuptwo values('"+formno+"','"+religion+"','"+Category+"','"+income+"','"+Education+"','"+Occupation+"','"+pannum+"','"+aadharnum+"','"+Senior_Citizen+"','"+Exisiting_Accounnt+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupThree(random).setVisible(true);


                

        }catch(Exception e){
            System.out.println(e);
        }

        



    }



    





    // public static void main(String [] args){
    //     new Signuptwo(12354);
    // }
    
}
