package controller;

import java.sql.Connection;
import java.sql.DriverManager;


public class GetConnection {
    public static Connection connectTo()
    {
        Connection connection= null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicList","root","root");

        } catch (Exception e)
        {
            System.out.println(e);
            //for testing
        }
        return connection;
    }
}
