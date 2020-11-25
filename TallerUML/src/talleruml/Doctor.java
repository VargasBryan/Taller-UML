package talleruml;

import java.util.TreeSet;

public class Doctor extends Persona{
    protected int regDoctor;
    protected String especialidad;
    protected Secretaria secretaria;
    protected TreeSet<Receta> recetas;
    protected TreeSet<Cita> citasPendientes;
    
    protected AreaMedica area;
    public void recetar(){}
    
    public void agregarPlanNut(){}
    
    public void imprimirReceta(){}
    
    public void registrarSecretaria(){}
    
}
