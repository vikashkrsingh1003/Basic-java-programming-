*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vikash.databaseoperation;

import java.sql.*;
/**
 *
 * @author Vikash Singh
 */
public class UpdateData {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step1: Register the driver
    Class.forName("com.mysql.cj.jdbc.Driver");
    
  //step2: Create the Connection
    
 String url="jdbc:mysql://localhost:3306/student";
String un="root" ;
String ps="Vikash@1006";
Connection conn=DriverManager.getConnection(url, un, ps);

 //step3: Write Sql insert query
 
 int sid=104;
String name="ROHIT SHARMA";
String enroll="123CS45";
int p=51;
int c=88;
int m=49;
int h=90;
int e=89;
int total=p+c+m+h+e;
float per=total/5.0f;
 
String sql= "update student set  name ='"+name+"',enroll='"+enroll+"',p= '"+p+"',c='"+c+"',m='"+m+"',h='"+h+"',e='"+e+"',total='"+total+"' ,per='"+per+"' where sid = '"+sid+"'";
  
  //step4: create an object of Statement
Statement stmt=conn.createStatement();
//step5: call executeUpdate() method
int r=stmt.executeUpdate(sql);
//step6: close the connection
conn.close();
if(r>0){
System.out.println("Data Update success");
}else{
System.out.println("Data DataUpdate Fail");
}
}

    private static void values(String sid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    
    

