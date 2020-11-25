/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

/**
 *
 * @author Administrador
 */
public class Secretaria extends Persona{
    protected Cita cita;
    public boolean verificarCita(){
        return true;
    }
    
    public void agendarCita(){}
}
