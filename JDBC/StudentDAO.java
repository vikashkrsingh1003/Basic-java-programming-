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

//import com.vikash.bean.studentBean;
//import com.vikash.utility.ConnectionPool;
//import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//
//public class StudentDAO {
// static Connection conn;
// 
//    public int updateStudent (studentBean sb) {
//        
//     //step1:
//    //step2:
//    conn=ConnectionPool.connectDB();
//    //step3: Wrtite SQL Query
//          int total=sb.getP()+sb.getC()+sb.getE()+sb.getH()+sb.getM();
//    float per=total/5.0f;
//    
//     String sql="update student set name = '"+sb.getName()+"', enroll = '"+sb.getEnroll()+"',p = '"+sb.getP()+"',c= '"+sb.getC()+"',m='"+sb.getM()+"',h ='"+sb.getH()+"',e ='"+sb.getE()+"',"
//             + "total ='"+total+"',per ='"+per+"' where sid = '"+sb.getSid()+"'";
//     int r=0;
    
    
     
         //public int addStudent(studentBean sb){
//    int r=0;
//    //step1:
//    //step2:
//    conn=ConnectionPool.connectDB();
//    //step3: Wrtite SQL Query
//    int total=sb.getP()+sb.getC()+sb.getE()+sb.getH()+sb.getM();
//    float per=total/5.0f;
//    String sql="insert into student values('"+sb.getSid()+"','"+sb.getName()+"','"+sb.getEnroll()+"','"+sb.getP()+"','"+sb.getC()+"','"+sb.getM()+"','"+sb.getH()+"','"+sb.getE()+"','"+total+"','"+per+"')";

//    public int deleteStudent (int sid) {
//        
//     //step1:
//    //step2:
//    conn=ConnectionPool.connectDB();
//    int r =0;
//    //step3: Wrtite SQL Query
//    
//      String sql="delete from student where sid ='"+sid+"'";
//    
//
//    try {
////step4: Create Object of Statement
//Statement stmt=conn.createStatement();
//    //step5: call executeUpdate()
//         r=stmt.executeUpdate(sql);
//         //step6: close the connection
//         conn.close();
//     } catch (SQLException ex) {
//         Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
//     }
//     
//    
//   return r;
//}
    
  


//    public static void main(String[] args) {
////        studentBean sb=new studentBean();
////        sb.setC(67);
////        sb.setE(78);
////        sb.setEnroll("123CS123");
////        sb.setH(67);
////        sb.setM(55);
////        sb.setName("xxxxx");
////        sb.setP(66);
////        sb.setSid(104);
////        StudentDAO sd=new StudentDAO();
////        int result=sd.updateStudent(sb);
////        if(result>0){
////            System.out.println("Student update Success");
////        }else{
////            System.out.println("Student Not update");
////        }
//
//StudentDAO sd=new StudentDAO();
//int x=sd.deleteStudent(104);
//if(x>0){
//     System.out.println("deletion Success");
//      }else{
//           System.out.println(" Not Success ");
//      }
//
//
//    }
//}


import com.vikash.bean.studentBean;
import java.util.ArrayList;
import com.vikash.bean.studentBean;
import com.vikash.utility.ConnectionPool;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



class StudentDAO{
static Connection conn;
//public ArrayList<studentBean> findAll(){
////step1:
////step2:
//conn=ConnectionPool.connectDB();
//ArrayList<studentBean> list=new ArrayList<studentBean>();
////step3: Write SQL Query select
//String sql="select * from student";
//try {
////step4: Create an Object of Statement
//Statement stmt=conn.createStatement();
//
////step5: Call executeQuery method
//ResultSet rs=stmt.executeQuery(sql);
////step6: Extract data from the ResultSet and add into ArrayList
//while(rs.next()){
//studentBean x=new studentBean();
////step1: Fetch data from resultSet and Set Into the Bean
//x.setSid(rs.getInt("sid"));
//x.setName(rs.getString("name"));
//x.setEnroll(rs.getString("enroll"));
//x.setP(rs.getInt("p"));
//x.setC(rs.getInt("c"));
//x.setM(rs.getInt("m"));
//x.setH(rs.getInt("h"));
//x.setE(rs.getInt("e"));
//x.setTotal(rs.getInt("total"));
//x.setPer(rs.getFloat("per"));
////step2: add bean object into list
//list.add(x);
//}
////step7: Close the Connection
//conn.close();
//} catch (SQLException ex) {
//Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
//}
//return list;
//}
//public static void main(String[] args) {
////4. call findAll Method
//StudentDAO sd=new StudentDAO();
//ArrayList<studentBean>al=sd.findAll();
//for(studentBean s:al){
//System.out.println("\t"+s.getSid()+"\t"+s.getName()+"\t"+s.getEnroll()+"\t"+s.getP()+"\t"+s.getC()+"\t"+s.getM()+"\t"+s.getH()+"\t"+s.getE()+"\t"+s.getTotal()+"\t"+s.getPer());
//
//}
//}
//}

//Find by ID 

public  studentBean  findById( int id){
//step1:
//step2:
studentBean x = new studentBean();
conn=ConnectionPool.connectDB();

//step3: Write SQL Query select
String sql="select * from student where sid = '"+id+"'";
try {
//step4: Create an Object of Statement
Statement stmt=conn.createStatement();

//step5: Call executeQuery method
ResultSet rs=stmt.executeQuery(sql);
//step6: Extract data from the ResultSet and add into ArrayList
while(rs.next()){

//step1: Fetch data from resultSet and Set Into the Bean
x.setSid(rs.getInt("sid"));
x.setName(rs.getString("name"));
x.setEnroll(rs.getString("enroll"));
x.setP(rs.getInt("p"));
x.setC(rs.getInt("c"));
x.setM(rs.getInt("m"));
x.setH(rs.getInt("h"));
x.setE(rs.getInt("e"));
x.setTotal(rs.getInt("total"));
x.setPer(rs.getFloat("per"));
//step2: add bean object into list

}
//step7: Close the Connection
conn.close();
} catch (SQLException ex) {
Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
}
return x;
}
public static void main(String[] args) {
//4. call findAll Method
StudentDAO sd=new StudentDAO();
studentBean s =sd.findById(101);

System.out.println("\t"+s.getSid()+"\t"+s.getName()+"\t"+s.getEnroll()+"\t"+s.getP()+"\t"+s.getC()+"\t"+s.getM()+"\t"+s.getH()+"\t"+s.getE()+"\t"+s.getTotal()+"\t"+s.getPer());


}
}

