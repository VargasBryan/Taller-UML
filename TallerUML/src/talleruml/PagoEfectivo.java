package talleruml;

public class PagoEfectivo implements Pago{
    
    protected float monto;
    
    @Override
    public boolean realizarPago(float monto) {       
        return this.monto >= monto;
    }   
    
}
