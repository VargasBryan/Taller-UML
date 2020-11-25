/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.Date;
import java.util.TreeSet;

/**
 *
 * @author Administrador
 */
class Persona {
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNac;
    
    protected Administrador administrador;
    
    public boolean login(){
        return true;
    }
    public boolean logOut(){
        return true;
    }
}
