package trabajo10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal {
    public static void main(String[] args) {
  
        JFrame ventana = new JFrame("Eventos del Mouse");
        ventana.setSize(300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        
        JTextField txtNumero = new JTextField(10);

        
        JLabel eti0 = new JLabel("0");
        ventana.add(eti0);
        JLabel eti1 = new JLabel("1");
        ventana.add(eti1);
        JLabel eti2 = new JLabel("2");
        ventana.add(eti2);
        JLabel eti3 = new JLabel("3");
        ventana.add(eti3);
        JLabel eti4 = new JLabel("4");
        ventana.add(eti4);
        JLabel eti5 = new JLabel("5");
        ventana.add(eti5);
        JLabel eti6 = new JLabel("6");
        ventana.add(eti6);
        JLabel eti7 = new JLabel("7");
        ventana.add(eti7);
        JLabel eti8 = new JLabel("8");
        ventana.add(eti8);
        JLabel eti9 = new JLabel("9");
        ventana.add(eti9);

       
        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumero.setText("");
            }
        });
        
        ventana.add(txtNumero);
        ventana.add(btnBorrar);

       
        eti0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + "0");
            }
        });

        eti1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + "1");
            }
        });

        eti2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + "2");
            }
        });

        eti3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + "3");
            }
        });

        eti4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + "4");
            }
        });

        eti5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + "5");
            }
        });

        eti6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + "6");
            }
        });

        eti7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + "7");
            }
        });

        eti8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + "8");
            }
        });

        eti9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + "9");
            }
        });

    
        ventana.setVisible(true);
    }
}
