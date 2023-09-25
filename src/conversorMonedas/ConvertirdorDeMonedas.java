package conversorMonedas;
import interfaces.ConvertirMoneda;
import moneda.Moneda;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertirdorDeMonedas implements ConvertirMoneda{
    @Override
    public BigDecimal convertirAMoneda(Moneda moneda, BigDecimal valor) {
        return valor.divide(moneda.getValor(),2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal convertirAMonedaLocal(Moneda moneda, BigDecimal valor) {
        return valor.multiply(moneda.getValor());
    }
}
