import conversorMonedas.ConvertirMonedas;
import conversorTemperatura.ConvertirTemperatura;

import javax.swing.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ConvertirMonedas convertirMonedas = new ConvertirMonedas();
        ConvertirTemperatura convertirTemperatura = new ConvertirTemperatura();
        boolean repite = true;
        while (repite) {
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (ValidarNumero(input)) {
                        Double inp = Double.valueOf(input);
                        convertirMonedas.InicioConervirMonedas(BigDecimal.valueOf(inp));

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (respuesta == 1) {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            repite = false;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        convertirTemperatura.ConvertirTemperatura(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (respuesta == 1) {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            repite = false;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }
        }

    }

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}