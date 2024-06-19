/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class DBConnection {
    private static DBConnection dbconnection;
    private Connection connection;
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/abclibrarymanagementdb","root","1234");
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
       if(dbconnection==null){
           dbconnection=new DBConnection();
       } 
       return dbconnection;
}
    public Connection getConnection(){
        return connection;
    }
}