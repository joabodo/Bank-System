package DBConnection;

import java.sql.*;

public abstract class DBConnect {
    
    Connection con= getConnection();
    public Connection getConnection(){
        Connection connection=null;
        try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver loaded successfully");
}catch(ClassNotFoundException cnfe){
    System.out.println(cnfe.getMessage());
}
    
    try{
     
        connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "suplexcity1.");
        System.out.println("Successfully connected");
        }catch(SQLException sqle){
        System.out.println("Could not connect to database:\n"+sqle.getMessage());
}
   return connection;
}
    
    
    public abstract void selectOperation(String a);
     
    public abstract void insertOperation(String b,String c,String d,String e);
      
    public abstract void updateOperation(String f,String g);
       
    public abstract void deleteOperation(String h);
    
    public abstract void Login(String i,String j);

    
}