
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author almas
 */
public class databaseConnection {
    //C:\Program Files\Java\jre1.8.0_341\lib\ext
    final static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/student";
    
    final static String USER="root";
    final static String PASS="";
    
    public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
            
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
