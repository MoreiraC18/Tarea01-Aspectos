package app;

import java.awt.Color;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public aspect ObserverAspect {

    pointcut cambioColor(Main ventana, Color nuevoColor):
        execution(void Main.cambiarColor(Color)) &&
        args(nuevoColor) &&
        target(ventana);

    after(Main ventana, Color nuevoColor): cambioColor(ventana, nuevoColor) {
    	
    	String nombreColor = obtenerNombreColor(nuevoColor);
    	String horaCambio = LocalTime.now().withNano(0).toString();
    	
    	System.out.println("[Observer] El color ha cambiado a: " + nombreColor + " a las " + horaCambio);
    	JOptionPane.showMessageDialog(null,"¡El color ha cambiado a: " + nombreColor + "!\nHora del cambio: " + horaCambio);
    }
    

    private String obtenerNombreColor(Color color) {
        if (color.equals(Color.RED)) return "Rojo";
        if (color.equals(Color.GREEN)) return "Verde";
        if (color.equals(Color.BLUE)) return "Azul";
        return "Otro";
    }
    

}
