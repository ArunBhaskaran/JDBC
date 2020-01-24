package main2;
import java.sql.*;
import java.util.*;
public class REgistertation
{
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	
Scanner s=new Scanner(System.in);
int n=s.nextInt();	
String name;
String address;
int contactno;
String emailid;
String proof;
int proofid;

System.out.println("REGISTRATION");

switch(n)
{
case 1:


System.out.print("Enter your name:");
    name=s.next();
    
System.out.print("Enter your address:");
address=s.next();
System.out.print("Enter your Contact Number:");
contactno=s.nextInt();
System.out.print("Enter your E-Mail ID:");
emailid=s.next();
System.out.print("Enter your proof type:");
proof=s.next();
System.out.print("Enter your proof ID:");
proofid=s.nextInt();
Class.forName("com.mysql.jdbc.Driver");
Connection con=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","");
Statement st=con.createStatement();
String sql="insert into `reg` values('"+name+"','"+address+"','"+contactno+"','"+emailid+"','"+proof+"','"+proofid+"')";
st.execute(sql);
break;
case 2:
	Class.forName("com.mysql.jdbc.Driver");
	Connection con1=null;
	con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","");
	Statement st1=con1.createStatement();
	String sql1="select * from reg";
    ResultSet rs=st1.executeQuery(sql1);
    while(rs.next())
    {
    	String Name=rs.getString("name");
    	String Address=rs.getString("address");
    	String Contactno=rs.getString("contactno");
    	String Emailid=rs.getString("emailid");
    	String Proof=rs.getString("proof");
    	String Proofid=rs.getString("proofid");
    	System.out.println(Name+"\t"+Address+"\t"+Contactno+"\t"+Emailid+"\t"+Proof+"\t"+Proofid);
    }
   



}
}
}
