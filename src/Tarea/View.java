package Tarea;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
	private JPanel panel;
    private JLabel label;

    public View() {
        setTitle("Vista Observer");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel(new BorderLayout());

        JPanel botones = new JPanel();
        JButton btnRojo = new JButton("Rojo");
        JButton btnVerde = new JButton("Verde");
        JButton btnAzul = new JButton("Azul");

        botones.add(btnRojo);
        botones.add(btnVerde);
        botones.add(btnAzul);

        panel.add(botones, BorderLayout.CENTER);
        add(panel);
        setVisible(true);
    }

}
