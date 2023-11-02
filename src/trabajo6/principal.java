package trabajo6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class principal extends JFrame implements ActionListener {
    JLabel etiNombre;
     JButton btnEsquina, btnCentro, btnAgrandar, btnAchicar;

    public principal() {
        setTitle("Programa de Etiqueta y Botones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Etiqueta con el nombre
        etiNombre = new JLabel("Jorge Andres");
        etiNombre.setOpaque(true);
        etiNombre.setBackground(Color.YELLOW);
        etiNombre.setBounds(50, 50, 100, 30);
        add(etiNombre);

        // Botón "Esquina"
        btnEsquina = new JButton("Esquina");
        btnEsquina.setBounds(10, 10, 100, 30);
        btnEsquina.addActionListener(this);
        btnEsquina.addMouseListener(new ButtonMouseListener());
        add(btnEsquina);

        // Botón "Centro"
        btnCentro = new JButton("Centro");
        btnCentro.setBounds(120, 10, 100, 30);
        btnCentro.addActionListener(this);
        btnCentro.addMouseListener(new ButtonMouseListener());
        add(btnCentro);

        // Botón "Agrandar"
        btnAgrandar = new JButton("Agrandar");
        btnAgrandar.setBounds(230, 10, 100, 30);
        btnAgrandar.addActionListener(this);
        btnAgrandar.addMouseListener(new ButtonMouseListener());
        add(btnAgrandar);

        // Botón "Achicar"
        btnAchicar = new JButton("Achicar");
        btnAchicar.setBounds(340, 10, 100, 30);
        btnAchicar.addActionListener(this);
        btnAchicar.addMouseListener(new ButtonMouseListener());
        add(btnAchicar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEsquina) {
            etiNombre.setLocation(10, 10);
        } else if (e.getSource() == btnCentro) {
            int x = (getWidth() - etiNombre.getWidth()) / 2;
            int y = (getHeight() - etiNombre.getHeight()) / 2;
            etiNombre.setLocation(x, y);
        } else if (e.getSource() == btnAgrandar) {
            etiNombre.setSize(etiNombre.getWidth() + 10, etiNombre.getHeight() + 5);
        } else if (e.getSource() == btnAchicar) {
            etiNombre.setSize(etiNombre.getWidth() - 10, etiNombre.getHeight() - 5);
        }
    }

    private class ButtonMouseListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            button.setSize(button.getWidth() + 10, button.getHeight() + 5);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            button.setSize(button.getWidth() - 10, button.getHeight() - 5);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            principal ventana = new principal();
            ventana.setVisible(true);
        });
    }
}
