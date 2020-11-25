/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Cita {
    protected Date fecha;
    protected boolean pagada;
    protected String registradaPor;
    protected Paciente paciente;
    protected java.util.Collection paciente = new java.util.TreeSet();
    protected java.util.Collection doctor = new java.util.TreeSet();
    
    public void realizarPago(Pago pago){}
}
