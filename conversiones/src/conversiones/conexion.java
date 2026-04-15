/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversiones;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    
    public Connection getConexion(){
        Connection con = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/programas";
            String user = "root";
            String pass = "zeusonario"; 
            
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        
        return con;
    }
}