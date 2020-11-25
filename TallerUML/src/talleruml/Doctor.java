package talleruml;

import java.util.TreeSet;

public class Doctor extends Persona{
    protected int regDoctor;
    protected String especialidad;
    protected Secretaria secretaria;
    protected TreeSet<Receta> recetas;
    protected TreeSet<Cita> citasPendientes;
    protected boolean isDesocupado; 
    protected AreaMedica area;
    
    public void recetar(){}
    
    public void agregarPlanNut(){}
    
    public void imprimirReceta(){}
    
    public void registrarSecretaria(){}
    
    public void enviarCorreoMedicamentos(){}
    
    public boolean atenderPaciente(){
        if(this.isDesocupado){
            if(paciente.getIsMedicado()){
                recetar();
                imprimirReceta();
                enviarCorreoMedicamentos();
            }
            if(paciente.gePlanNut(){
                agregarPlanNut();
            }   
            return true;
        }
        return false;
    }
}
