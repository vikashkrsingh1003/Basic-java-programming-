package com.vikash.databaseoperation;
import java.sql.*;
/**
 *
 * @author Vikash Singh
 */
public class InsertData {
    
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
String name="Shivam";
String enroll="123CS3";
int p=81;
int c=78;
int m=69;
int h=50;
int e=49;
int total=p+c+m+h+e;
float per=total/5.0f;

String sql="insert into student values('"+sid+"','"+name+"','"+enroll+"','"+per+"','"+p+"','"+c+"','"+m+"','"+h+"','"+e+"','"+total+"')";

//step4: create an object of Statement
Statement stmt=conn.createStatement();
//step5: call executeUpdate() method
int r=stmt.executeUpdate(sql);
//step6: close the connection
conn.close();
if(r>0){
System.out.println("Data insertion success");
}else{
System.out.println("Data Insertion Fail");
}
}

    private static void values(String sid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

