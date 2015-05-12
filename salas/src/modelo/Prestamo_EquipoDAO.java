package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import modelo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SpringLayout;

/**
 *
 * @author Oscar
 */
public class Prestamo_EquipoDAO implements CRUD<Prestamo_EquipoDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from PERSONA";   
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(Prestamo_EquipoDTO prestamo_EquipoDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setInt(1,prestamo_EquipoDTO.getId_persona());
            ps.setString(2,prestamo_EquipoDTO.getFecha_devolucion());
            ps.setString(3, prestamo_EquipoDTO.getFecha_prestamo());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(Prestamo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(Prestamo_EquipoDTO prestamo_EquipoDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1,prestamo_EquipoDTO.getId_persona());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Prestamo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(Prestamo_EquipoDTO prestamo_EquipoDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,prestamo_EquipoDTO.getId_equipo());
            ps.setString(2,prestamo_EquipoDTO.getFecha_prestamo());
            ps.setInt(3,prestamo_EquipoDTO.getId_persona());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Prestamo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public Prestamo_EquipoDTO read(Prestamo_EquipoDTO prestamo_EquipoDTO) {
         Prestamo_EquipoDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ);
            ResultSet rs;
            ps.setInt(1,prestamo_EquipoDTO.getId_persona());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new Prestamo_EquipoDTO(new Prestamo_Equipo("",0,"",""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prestamo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;  

        
        
    }

    @Override
    public List<Prestamo_EquipoDTO> readAll() {
       ArrayList <Prestamo_EquipoDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new Prestamo_EquipoDTO(new Prestamo_Equipo("",0,"","")));
           
        } catch (SQLException ex) {
            Logger.getLogger(Prestamo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
