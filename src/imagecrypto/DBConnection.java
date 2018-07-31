/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagecrypto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

 
public class DBConnection 
{
    public Statement stt;
    public Connection con;
    public DBConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/imagecrypto","root","");
            stt=con.createStatement();            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}