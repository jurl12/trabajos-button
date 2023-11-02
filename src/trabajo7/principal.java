package trabajo7;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class principal extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton btnVerde, btnRojo, btnAzul, btnFondoAzul, btnFondoRojo, btnFondoVerde,btnTrasparente,btnOpaca;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    principal frame = new principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public principal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnVerde = new JButton("verde");
        btnVerde.setBounds(169, 170, 89, 23);
        btnVerde.addActionListener(this);
        contentPane.add(btnVerde);

        btnRojo = new JButton("rojo");
        btnRojo.setBounds(94, 170, 89, 23);
        btnRojo.addActionListener(this);
        contentPane.add(btnRojo);

        btnFondoRojo = new JButton("fondoRojo");
        btnFondoRojo.setBounds(42, 100, 89, 23);
        btnFondoRojo.addActionListener(this);
        contentPane.add(btnFondoRojo);

        btnFondoAzul = new JButton("fondoAzul");
        btnFondoAzul.setBounds(293, 100, 89, 23);
        btnFondoAzul.addActionListener(this);
        contentPane.add(btnFondoAzul);

        btnFondoVerde = new JButton("fondoVerde");
        btnFondoVerde.setBounds(169, 100, 89, 23);
        btnFondoVerde.addActionListener(this);
        contentPane.add(btnFondoVerde);

        btnAzul = new JButton("azul");
        btnAzul.setBounds(266, 170, 89, 23);
        btnAzul.addActionListener(this);
        contentPane.add(btnAzul);
        
         btnTrasparente = new JButton("trasparente");
        btnTrasparente.setBounds(94, 42, 89, 23);
        contentPane.add(btnTrasparente);
        btnTrasparente.addActionListener(this);
        
        btnOpaca = new JButton("opaca");
        btnOpaca.setBounds(252, 42, 89, 23);
        contentPane.add(btnOpaca);
        btnOpaca.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAzul) {
            btnAzul.setForeground(Color.blue);
        } else if (e.getSource() == btnVerde) {
            btnVerde.setForeground(Color.green);
        } else if (e.getSource() == btnRojo) {
            btnRojo.setForeground(Color.red);
        } else if (e.getSource() == btnFondoAzul) {
            btnFondoAzul.setBackground(Color.blue);
        } else if (e.getSource() == btnFondoRojo) {
            btnFondoRojo.setBackground(Color.red);
        } else if (e.getSource() == btnFondoVerde) {
            btnFondoVerde.setBackground(Color.green);
        }else if (btnTrasparente==e.getSource()) {
          
            btnTrasparente.setOpaque(false);
            btnTrasparente.setContentAreaFilled(false);
            btnTrasparente.setBorderPainted(false);
        } else if (e.getSource() == btnOpaca) {
            
            btnTrasparente.setOpaque(true);
            btnTrasparente.setContentAreaFilled(true);
            btnTrasparente.setBorderPainted(true);
        }
    }
}
