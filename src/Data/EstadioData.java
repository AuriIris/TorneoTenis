/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Modelo.Conexion;
import Modelo.Estadio;
import Modelo.Jugador;
import Modelo.Sponsor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martinbordon
 */
public class EstadioData {
    private Connection con;
    
    public EstadioData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }
    
     public EstadioData() {
        //To change body of generated methods, choose Tools | Templates.
    }
     
       public void guardarEstadio(Estadio estadio) {
     
            String sql = "INSERT INTO estadio(nombre,ciudad,categoria, activo, direccionComercial, dimension) VALUES (?,?,?,?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                
                ps.setString(1, estadio.getNombre());
                ps.setString(2, estadio.getCiudad());
                ps.setString(3, estadio.getCategoria());
                ps.setBoolean(4, estadio.isActivo());
                ps.setString(5, estadio.getDireccionComercial());
                ps.setString(6, estadio.getDimension());
                ps.executeUpdate();
                
                System.out.println("Estadio guardado con exito.");
        } catch (SQLException ex) {
            System.out.println("Error al guardar "+ex);
        }
    }
       
      public Estadio buscarEstadio (int ID){
         Estadio estadio = new Estadio();
         String sql = "SELECT * FROM estadio Where idEstadio=?";
         try{
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1, ID);
         ResultSet rs = ps.executeQuery();
         if(rs.next()) {
            estadio = new Estadio();
            estadio.setIdEstadio(rs.getInt(1));
            estadio.setCiudad(rs.getString(2));
            estadio.setCategoria(rs.getString(3));
            estadio.setActivo(rs.getBoolean(4));
            estadio.setDireccionComercial(rs.getString(5));
            estadio.setDimension(rs.getString(6));
            
        }   
        }
        catch(SQLException ex){
         System.out.println("Estadio no encontrado: " + ex);
        }
        return estadio;
}     

      public void modificadarSponsor (Estadio e) {
        String sql = "UPDATE estadio SET ciudad=?, direccionComercial=?, dimension=?, activo=?,  Where idEstadio=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,e.getCiudad());
            ps.setString(2, e.getCategoria());
            ps.setString(3, e.getDireccionComercial());
            ps.setString(4, e.getDimension());
            ps.setBoolean(5, e.isActivo());
            ps.setInt(6, e.getIdEstadio());

            ps.executeUpdate();
            ps.close();
                System.out.println("Estadio modificada con exito.");
        }
        catch (SQLException ex){
                System.out.println("Error al actualizar Estadio: "+ex);
        }
 }
       
       public Estadio bajaEstadio (int id){
         Estadio estadio = new Estadio();
         String sql = "UPDATE estadio SET activo=? WHERE idSponsor=?";
         try{
         PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
         System.out.println("Estadio no encontrado: " + ex);
        }
        return estadio;
}   
      
       public Estadio altaEstadio (int id){
         Estadio estadio = new Estadio();
         String sql = "UPDATE estadio SET activo=? WHERE idEstadio=?";
         try{
         PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, true);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
         System.out.println("Estadio no encontrado: " + ex);
        }
        return estadio;
    }
       
       
       public void borrarEstadio(int id){
            String sql="DELETE FROM estadio WHERE idEstadio=?";
            PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
                ps.close();

                System.out.println("Estadio borrado definitivamente");
            } catch (SQLException ex) {
                 System.out.println("Error al borrar "+ex);
            }
    }
       
       
            public List<Estadio> buscarTodosEstadio(){
        List<Estadio> resultados;
        resultados = new ArrayList<>();
        Estadio estadio= null;
        String sql = "SELECT * FROM estadio ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        while(rs.next()){
                 estadio=new Estadio();
                 estadio.setIdEstadio(rs.getInt(1));
                 estadio.setCiudad(rs.getString(2));
                 estadio.setCategoria(rs.getString(3));
                 estadio.setActivo(rs.getBoolean(4));
                 estadio.setDireccionComercial(rs.getString(5));
                 estadio.setDimension(rs.getString(6));
                 resultados.add(estadio);
            }
            ps.close();
            }
        catch(SQLException ex){
                System.out.println("No se encontraron resultados: "+ ex);
            }
        return resultados;
  }

}