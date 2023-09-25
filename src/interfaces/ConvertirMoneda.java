package interfaces;

import moneda.Moneda;

import java.math.BigDecimal;

public interface ConvertirMoneda {

    BigDecimal convertirAMoneda(Moneda moneda, BigDecimal valor);
    BigDecimal convertirAMonedaLocal(Moneda moneda, BigDecimal valor);
}
