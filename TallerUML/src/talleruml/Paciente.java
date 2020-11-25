package talleruml;

import java.util.TreeSet;

public class Paciente extends Persona{
    protected String email;
    protected Cita cita;
    protected HistoriaClinica historiaClinica;
    protected TreeSet<Receta> recetas;
    
    public Paciente(){
        historiaClinica = new HistoriaClinica();
        recetas = new TreeSet<>();
    }
    
    public boolean solicitarCita(){
        TreeSet<Cita> buscarCita = cita.doctor.citasPendientes;
        boolean condicion = true;
        for(Cita c: buscarCita){
            if(c.fecha.equals(cita.fecha))
                condicion = false;
        }           
        return condicion;
    }
}
