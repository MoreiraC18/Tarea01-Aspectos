package app;

import java.awt.Color;

public aspect ObserverAspect {

    pointcut cambioColor(Main ventana, Color nuevoColor):
        execution(void Main.cambiarColor(Color)) &&
        args(nuevoColor) &&
        target(ventana);

    after(Main ventana, Color nuevoColor): cambioColor(ventana, nuevoColor) {
        System.out.println("[Observer] El color ha cambiado a: " + obtenerNombreColor(nuevoColor));
    }

    private String obtenerNombreColor(Color color) {
        if (color.equals(Color.RED)) return "Rojo";
        if (color.equals(Color.GREEN)) return "Verde";
        if (color.equals(Color.BLUE)) return "Azul";
        return "Otro";
    }
}
