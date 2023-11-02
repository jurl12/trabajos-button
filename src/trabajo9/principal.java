package trabajo9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal {
    public static void main(String[] args) {
        // Crear una ventana
        JFrame ventana = new JFrame("Concatenar Palabras");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        // Cuadros de texto
        JTextField txtPalabra1 = new JTextField();
        JTextField txtPalabra2 = new JTextField();
        txtPalabra1.setBounds(20, 20, 120, 30);
        txtPalabra2.setBounds(150, 20, 120, 30);

        // Etiqueta para mostrar el resultado
        JLabel etiTexto = new JLabel();
        etiTexto.setBounds(20, 60, 250, 30);

        // Botón para concatenar
        JButton btnConcatena = new JButton("Concatenar");
        btnConcatena.setBounds(20, 100, 250, 30);
        btnConcatena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palabra1 = txtPalabra1.getText();
                String palabra2 = txtPalabra2.getText();
                String resultado = palabra1 + palabra2;
                etiTexto.setText(resultado);
            }
        });

        // Agregar componentes a la ventana
        ventana.add(txtPalabra1);
        ventana.add(txtPalabra2);
        ventana.add(etiTexto);
        ventana.add(btnConcatena);

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}
