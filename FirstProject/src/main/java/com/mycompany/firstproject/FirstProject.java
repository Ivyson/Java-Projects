/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstproject;

/**
 *
 * @author Sam
 */
import java.util.*;
import java.sql.*;
public class FirstProject {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        try {
            
            Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String Name = scanner.nextLine();
        //System.out.println("");
        System.out.println("Please Enter Your Surname");
        String Surname = scanner.nextLine();
        System.out.println("Please Enter Your Email");
        String Email = scanner.nextLine();
        System.out.println("How old are you");
        int age = scanner.nextInt();
        scanner.nextLine(); //This is to destroy the new line character rejected by the integer scanning
        //Class.forName()
        Connection connection = DriverManager.getConnection("jdbc:derby:DemoDB;create=true");
            System.out.println("Connected Succesfully");
        } catch (SQLException e) {
        }
        
        
    }
}
