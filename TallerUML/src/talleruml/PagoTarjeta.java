package talleruml;

import java.util.Date;

public class PagoTarjeta implements Pago{
    
    protected float monto;
    protected String numero;
    protected Date expira;
    protected String propietario;
    protected String banco;

    @Override
    public boolean realizarPago(float monto) {
        return this.monto>= monto;
    }
    
}
