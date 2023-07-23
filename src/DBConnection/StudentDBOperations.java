package DBConnection;

import java.sql.*;
import java.util.Scanner;

public class StudentDBOperations extends DBConnect {

    @Override
    public void selectOperation(String Banker_Num) {
        String query = "SELECT * FROM banker WHERE Banker_Num = " + Banker_Num + ";";

        try {
            //create a statement
            PreparedStatement pst = null;
            pst = con.prepareStatement(query);

            //execute statement and store result in a resultset
            ResultSet rs = null;
            rs = pst.executeQuery();

            //process resultset
            while (rs.next()) {
                int id = rs.getInt("Banker_Num");
                String name = rs.getString("Banker_Name");
                int name2 = rs.getInt("Account_Balance");
                System.out.println(id + " " + name + " " + name2);

            }
        } catch (SQLException sqle) {
            System.out.println("Error" + sqle.getMessage());
        }
        try {
            con.close();
        } catch (SQLException sQLException) {
            System.out.println("Err: " + sQLException);
        }
    }

    @Override
    public void insertOperation(String Banker_Name, String Banker_Password, String Account_Balance, String Banker_Num) {

        try {
            Statement stmt = con.createStatement();
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO banker VALUES ('" + Banker_Name + "','" + Banker_Password + "','" + Account_Balance + "','" + Banker_Num + "')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

        } catch (SQLException sqle) {
            System.out.println("Error" + sqle.getMessage());
        }
        try {
            con.close();
        } catch (SQLException sQLException) {
            System.out.println("Err: " + sQLException);
        }
    }

    @Override
    public void updateOperation(String Banker_Name, String Banker_Num) {
        String query = "SELECT * FROM banker ";
        try {

            PreparedStatement pst = null;
            pst = con.prepareStatement(query);

            ResultSet rs = null;
            rs = pst.executeQuery();
            Statement stmt = con.createStatement();
            String sql = "UPDATE banker SET Banker_Name='" + Banker_Name + "' WHERE Banker_Num='" + Banker_Num + "'";
            System.out.println("Update done.");
            stmt.executeUpdate(sql);

            while (rs.next()) {
                int id = rs.getInt("Banker_Num");
                String name = rs.getString("Banker_Name");
                String name1 = rs.getString("Banker_Password");
                String name2 = rs.getString("Account_Balance");
                System.out.println(id + " " + name + " " + name1 + " " + name2);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteOperation(String Banker_Num) {
        try {

            String sql = "Delete  from Banker  where Banker_Num='" + Banker_Num + "'";
            PreparedStatement p = null;
            p = con.prepareStatement(sql);
            p.execute();
            System.out.println("Record removed successfully");

        } catch (SQLException sqle) {
            System.out.println("Error" + sqle.getMessage());
        }
    }

    @Override
    public void Login(String Banker_Num, String Banker_Password) {

    }
}
