
package Conectores;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;

public class Conexion {
    
    String bd = "ejerciciouni";
    String url ="jdbc:mysql://localhost:3306/";
    String user ="root";
    String password ="prueba123";
    String driver ="com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    public Conexion(){
        
    }
    
    public Connection conectar(){
   
        try {
            Class.forName(driver);
            cx= DriverManager.getConnection(url+bd,user,password);
            System.out.println("Se conecto a la BD");
        } catch (ClassNotFoundException |SQLException ex) {
            System.out.println("No se conecto a la BD");
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return cx;
    }
    
   public void cerrar() {
          try {
              cx.close();
              System.out.println("Cerrando conexion a la BD");
          } catch (SQLException ex) {
              java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
      
   }
}
