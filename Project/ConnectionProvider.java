/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;

/**
 *
 * @author Rose Maria
 */
public class ConnectionProvider {

    static Connection con;

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/meowiee", "root", "");
        } catch (Exception e) {
            System.out.println("Connection Error: " + e);
        }
        return con;
    }
}
