package talleruml;

import java.util.Date;
import java.util.TreeSet;

public class Receta {
    protected Date fecha;
    protected TreeSet<Medicamento> medicamentos;
    protected PlanNutricional planNut;
    protected Doctor doctor;
    
    public Receta(){
        medicamentos = new TreeSet();
        planNut = new PlanNutricional();
    }
}
