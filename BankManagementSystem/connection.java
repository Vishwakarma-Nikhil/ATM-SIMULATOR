
package BankManagementSystem;

import java.sql.*;
//This class is used for establishing connectivity with database 

/*JDBC Connectivity (very important)
  Five steps 
  1.Register the Driver 
  2.Create Connection
  3.Create Statement
  4.Execute Query
  5.close connection
*/
public class connection {

    Connection C;
    Statement s;
 
    connection(){

        //Exceptional Handling as MYSQL is external entity
        try{
           
            
            C=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","");
            s=C.createStatement();



        }catch(Exception e){
            System.out.println(e);
        }



    }



    
}
