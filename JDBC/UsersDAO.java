/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vikash.dao;

/**
 *
 * @author Vikash Singh
 */
import com.vikash.bean.UsersBean;
import com.vikash.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class UsersDAO {
     static Connection conn;
     
     public int registerUser(UsersBean ub){
int r=0;
//step1:
//step2:
conn=ConnectionPool.connectDB();
//step3:

String sql = "insert into users values('"+ub.getUid()+"','"+ub.getName()+"','"+ub.getUsername()+"','"+ub.getPassword()+"','"+ub.getEmail()+"','"+ub.getMobile()+"')";

try {
//step4:
Statement stmt=conn.createStatement();
//step5:
r=stmt.executeUpdate(sql);
//step6:
conn.close();
} catch (SQLException ex) {
Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
}

return r;
     }
     
   public int loginCheck(String userName,String password){
int id=0;
conn=ConnectionPool.connectDB();
String sql="select uid from users where username='"+userName+"' and password='"+password+"'";
try {
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(sql);
if(rs.next()){
id=rs.getInt("uid");
}
conn.close();
} catch (SQLException ex) {
Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
}
return id;
}  
     
     public static void main(String[] args) {

//1. call registerUser()
// UsersBean ub=new UsersBean();
// ub.setUid(101);
// ub.setName("vikash");
// ub.setUsername("vikash123");
// ub.setPassword("8789");
// ub.setEmail("vikash@123gmai.com");
// ub.setMobile("8789841693");
//
// UsersDAO ud=new UsersDAO();
// int r=ud.registerUser(ub);
// if(r>0){
// System.out.println("Registration success ");
// }else{
// System.out.println("Registration fail ");
// }
UsersDAO ud=new UsersDAO();
int r = ud.loginCheck("vikash123","8789");
if(r>0){
    System.out.println("login successfully");
}
else{
    System.out.println("login failed");
}
     
     }
}
