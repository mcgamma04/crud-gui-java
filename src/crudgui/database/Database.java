/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudgui.database;


import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class Database {
    Connection connection;
    public boolean connectDB() throws ClassNotFoundException{
//        
        try {
           Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "");
             return true;
        }catch (SQLException  sql){
            sql.printStackTrace();
            return false;
      }
    }
        public Connection getConnection(){
        return  connection;
        }
        }

        
