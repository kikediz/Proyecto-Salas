/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar
 */
public class Conexion {
    public static Conexion instancia; 
    private Connection cnn;
   private Conexion(){
        try {//org.apache.derby.jdbc.EmbeddedDriver
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cnn=DriverManager.getConnection("jdbc:derby://localhost:1527/vvv","morte","123456");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("error 1"+ex.getMessage());
        } catch (SQLException ex) {
          System.out.println("error 2"+ex.getMessage());
        }
   }
   
   public synchronized static Conexion entregarConexion() {
   if(instancia==null)
   { 
   instancia=new Conexion();
   }
   return instancia;
   
   
   
   } 
   public void cerraConexion(){
   instancia=null;
   }

    /**
     * @return the cnn
     */
    public Connection getCnn() {
        return cnn;
    }
   
   
}
