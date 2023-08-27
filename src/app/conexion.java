/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import static app.producto.PASSWORD;
import static app.producto.URL;
import static app.producto.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/PAPELERIA";
    public static final String USER = "root"; //Usuario de Acceso a MySQL
    public static final String PASSWORD = "Aa123456";
    
    //CONEXION BASE DE DATOS
    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion Existosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    //FIN CONEXION BASE DE DATOS
}
