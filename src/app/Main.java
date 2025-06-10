package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel panel;

    public Main() {
        setTitle("Selector de Color");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.WHITE); // color inicial
        add(panel);

        JButton botonRojo = new JButton("Rojo");
        JButton botonVerde = new JButton("Verde");
        JButton botonAzul = new JButton("Azul");

        panel.add(botonRojo);
        panel.add(botonVerde);
        panel.add(botonAzul);

        
        botonRojo.addActionListener(e -> cambiarColor(Color.RED));
        botonVerde.addActionListener(e -> cambiarColor(Color.GREEN));
        botonAzul.addActionListener(e -> cambiarColor(Color.BLUE));
    }

    public void cambiarColor(Color color) {
        panel.setBackground(color);
        
    }

    public Color getColorActual() {
        return panel.getBackground();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
}