package conversorMonedas;

import moneda.MonedaDolar;
import moneda.MonedaEuro;
import moneda.MonedaYen;

import javax.swing.*;
import java.math.BigDecimal;

public class ConvertirMonedas {

    ConvertirdorDeMonedas convertirdorDeMonedas = new ConvertirdorDeMonedas();
    public void InicioConervirMonedas(BigDecimal input){
        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Bolivianos a Dólar", "De Bolivianos a Euro","De Bolivianos a Yen","De Dólar a Bolivianos", "De Euro a Bolivianos","De Yen a Bolivianos"},
                "Seleccion")).toString();

        switch(opcion) {
            case "De Bolivianos a Dólar":
                JOptionPane.showMessageDialog(null, "Tienes $ " +convertirdorDeMonedas.convertirAMoneda(new MonedaDolar(),input)+ " Dolares");
                break;
            case "De Bolivianos a Euro":
                JOptionPane.showMessageDialog(null, "Tienes $ " +convertirdorDeMonedas.convertirAMoneda(new MonedaEuro(),input)+ " Euros");
                break;
            case "De Bolivianos a Yen":
                JOptionPane.showMessageDialog(null, "Tienes $ " +convertirdorDeMonedas.convertirAMoneda(new MonedaYen(),input)+ " Yenes");
                break;
            case "De Dólar a Bolivianos":
                JOptionPane.showMessageDialog(null, "Tienes $ " +convertirdorDeMonedas.convertirAMonedaLocal(new MonedaDolar(),input)+ " Bolivianos");
                break;
            case "De Euro a Bolivianos":
                JOptionPane.showMessageDialog(null, "Tienes $ " +convertirdorDeMonedas.convertirAMonedaLocal(new MonedaEuro(),input)+ " Bolivianos");
                break;
            case "De Yen a Bolivianos":
                JOptionPane.showMessageDialog(null, "Tienes $ " +convertirdorDeMonedas.convertirAMonedaLocal(new MonedaYen(),input)+ " Bolivianos");
                break;
        }
    }
}
