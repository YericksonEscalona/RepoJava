
package Conectores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.Estudiante;


public class EstudianteServicios {
   private final String tabla = "estudiante";
   
   public void guardar(Connection conexion, Estudiante estudiante) throws SQLException{
      try{
         PreparedStatement consulta;
         if(null == estudiante.getId_estudiante()){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(Nombre,Apellido,Cedula,Sexo,idEdoCivil,idEstado,idDoc) VALUES( ?, ?, ?, ?, ?, ?, ?)");
            //consulta.setInt(1, estudiante.getId_estudiante());
            consulta.setString(1, estudiante.getNombre());
            consulta.setString(2, estudiante.getApellido());
            consulta.setString(3, estudiante.getCedula());
            consulta.setString(4, estudiante.getSexo());
            consulta.setInt(5, estudiante.getIdEdoCivil());
            consulta.setInt(6, estudiante.getIdEstado());
            consulta.setInt(7, estudiante.getIdDoc());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET Nombre = ?, Apellido = ?, Cedula = ?, Sexo = ?, idEdoCivil = ?, idEstado = ?, idDoc = ? WHERE Idestudiante = ?");
            consulta.setString(1, estudiante.getNombre());
            consulta.setString(2, estudiante.getApellido());
            consulta.setString(3, estudiante.getCedula());
            consulta.setString(4, estudiante.getSexo());
            consulta.setInt(5, estudiante.getIdEdoCivil());
            consulta.setInt(6, estudiante.getIdEstado());
            consulta.setInt(7, estudiante.getIdDoc());
            consulta.setInt(8, estudiante.getId_estudiante());
         }
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   
   public Estudiante recuperarPorId(Connection conexion, int Id_estudiante) throws SQLException {
      Estudiante estudiante = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT Idestudiante,Nombre,Apellido,Cedula,Sexo,idEdoCivil,idEstado,idDoc FROM " + this.tabla + " WHERE Idestudiante = ?" );
         consulta.setInt(1, Id_estudiante);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            estudiante = new Estudiante(Id_estudiante, resultado.getString("Nombre"), resultado.getString("Apellido"),resultado.getString("Cedula"),resultado.getString("Sexo"), resultado.getInt("idEdoCivil"),resultado.getInt("idEstado"),resultado.getInt("idDoc"));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return estudiante;
   }
   
    public void eliminar(Connection conexion, Estudiante estudiante) throws SQLException{
        try{
           PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE Idestudiante = ?");
           consulta.setInt(1, estudiante.getId_estudiante());
           consulta.executeUpdate();
        }catch(SQLException ex){
           throw new SQLException(ex);
        }
    }
}

