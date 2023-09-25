package moneda;

import java.math.BigDecimal;

public class Moneda {
    protected BigDecimal valor;
    protected String pais;

    protected String nombre;

    public Moneda(double valor, String pais, String nombre){
        this.valor = BigDecimal.valueOf(valor);
        this.pais  = pais;
        this.nombre = nombre;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = BigDecimal.valueOf(valor);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
