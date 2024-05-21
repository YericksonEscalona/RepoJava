
package Conectores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.Documento;
import modelos.Estudiante;


public class DocumentoServicios {
    private final String tabla = "documento";
    
     public void guardar(Connection conexion, Documento doc) throws SQLException{
      try{
         PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(idDocumento,HayCartaOp,HayCedula,HayFondoN,HayNotas,HayTituloB) VALUES( ?, ?, ?, ?, ?, ?)");
            consulta.setInt(1, doc.getId_documento());
            consulta.setBoolean(2, doc.isHayCar()); 
            consulta.setBoolean(3, doc.isHayCed()); 
            consulta.setBoolean(4, doc.isHayFon()); 
            consulta.setBoolean(5, doc.isHayNot()); 
            consulta.setBoolean(6, doc.isHayTit()); 

         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
     
    public void modificar(Connection conexion, Documento doc) throws SQLException{
      try{
        PreparedStatement consulta;
        consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET HayCartaOp = ?, HayCedula = ?, HayFondoN = ?, HayNotas = ?, HayTituloB = ? WHERE idDocumento = ?");

        consulta.setBoolean(1, doc.isHayCar()); 
        consulta.setBoolean(2, doc.isHayCed()); 
        consulta.setBoolean(3, doc.isHayFon()); 
        consulta.setBoolean(4, doc.isHayNot()); 
        consulta.setBoolean(5, doc.isHayTit()); 
        consulta.setInt(6, doc.getId_documento());

         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
    
    public Documento recuperarPorId(Connection conexion, int iddoc) throws SQLException {
      Documento doc = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT idDocumento,HayCedula,HayTituloB,HayCartaOp,HayFondoN,HayNotas FROM " + this.tabla + " WHERE idDocumento = ?" );
         consulta.setInt(1, iddoc);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            doc = new Documento(iddoc, resultado.getBoolean("HayCedula"), resultado.getBoolean("HayTituloB"),resultado.getBoolean("HayCartaOp"),resultado.getBoolean("HayFondoN"), resultado.getBoolean("HayNotas"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return doc;
   }
}


