package ElectricityBillingSystem;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn()
    {
        try {
            
            c= DriverManager.getConnection("jdbc:mysql:///ebs","root","");
            s = c.createStatement();
    } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    

}
