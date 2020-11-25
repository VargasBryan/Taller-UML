package talleruml;

public class PagoPayPal implements Pago{
    
    protected float monto;
    protected String email;
    
    @Override
    public boolean realizarPago(float monto) {
        return this.monto>= monto && email != null;
    }
}
