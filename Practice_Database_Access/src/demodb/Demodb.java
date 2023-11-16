/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package demodb;

//import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.*;
import java.sql.SQLException;

/**
 *
 * @author Sam
 */
public class Demodb {

    public Demodb() {
    }
    public void addRecord(String surname, String names, String email, int age, Connection conn) {
    try {
        String sql = "INSERT INTO AccountsDB (Surname, Names, Email, Age) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, surname);
        pstmt.setString(2, names);
        pstmt.setString(3, email);
        pstmt.setInt(4, age);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
    public void modifyRecord(int id, String surname, String names, String email, int age, Connection conn) {
    try {
        String sql = "UPDATE Accounts SET Surname = ?, Names = ?, Email = ?, Age = ? WHERE ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, surname);
        pstmt.setString(2, names);
        pstmt.setString(3, email);
        pstmt.setInt(4, age);
        pstmt.setInt(5, id);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

    public boolean recordExists(String surname, String names, String email, int age, Connection conn) {
    boolean exists = false;
    try {
        String sql = "SELECT * FROM AccountsDB WHERE Surname = ? AND Names = ? AND Email = ? AND Age = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, surname);
        pstmt.setString(2, names);
        pstmt.setString(3, email);
        pstmt.setInt(4, age);
        ResultSet rs = pstmt.executeQuery();
        exists = rs.next();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return exists;
}



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         String url = "jdbc:ucanaccess://C:\\Users\\Sam\\OneDrive\\Documents\\AccountsDB.accdb";
         Connection conn = DriverManager.getConnection(url);
            System.out.println("Connection Successful");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Your Name");
        String Name = scanner.nextLine();
        System.out.println("Please Enter Your Surname");
        String Surname = scanner.nextLine();
        System.out.println("Please Enter Your Email");
        String Email = scanner.nextLine();
        System.out.println("How old are you");
        int age = scanner.nextInt();
        scanner.nextLine(); //This is to destroy the new line character rejected by the integer scanning
        //Class.forName()
        Demodb obj = new Demodb();
        //Firstly before we create an account we need to know if the account already exists
         boolean exists = obj.recordExists(Surname, Name, Email, age, conn);
         if(exists){
             System.out.println("Your account already exists!");
         }
         else{
        obj.addRecord(Surname, Name, Email, age, conn);
             System.out.println("The Account was created successfully!");
         }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Demodb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Demodb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
