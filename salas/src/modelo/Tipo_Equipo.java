/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author morte
 */
public class Tipo_Equipo implements Objetos{
    
    private String id_rol;
    private String descripcion;
    
    public Tipo_Equipo(){}

    public Tipo_Equipo(String id_rol, String descripcion) {
        this.id_rol = id_rol;
        this.descripcion = descripcion;
    }

    /**
     * Get the value of descripcion
     *
     * @return the value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Set the value of descripcion
     *
     * @param descripcion new value of descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Get the value of id_rol
     *
     * @return the value of id_rol
     */
    public String getId_rol() {
        return id_rol;
    }

    /**
     * Set the value of id_rol
     *
     * @param id_rol new value of id_rol
     */
    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
