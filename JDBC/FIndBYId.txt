/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vikash.databaseoperation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vikash Singh
 */
public class findById {
    
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
     //step1: Register  the Driver
       Class.forName("com.mysql.cj.jdbc.Driver");
       
         //step2: Create the Connection
       String url = "jdbc:mysql://localhost:3306/student";
       String Username = "root";
       String password = "Vikash@1006";
       Connection conn = DriverManager.getConnection(url,Username,password);
       
        //step3: Write SQL query select
        int id=104;
       String sql = "Select * from student where sid='"+id+"'";
       
       //step4: Create object of Statement
       Statement stmt = conn.createStatement();
        
       //step5: call executeQuery()
       ResultSet rs= stmt.executeQuery(sql);
       
       while (rs.next()){
           
           System.out.println("\t"+rs.getInt("sid")+"\t"+rs.getString("name")+"\t"+rs.getString("enroll")+
                   "\t"+rs.getInt("p")+"\t"+rs.getInt("c")+"\t"+rs.getInt("m")+"\t"+rs.getInt("h")+"\t"+
                   rs.getInt("e")+"\t"+rs.getInt("total")+"\t"+rs.getFloat("per"));
        }
       //step6: Close the Connection
        conn.close();
       
     }
}
