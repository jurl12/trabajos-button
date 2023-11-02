package trabajo1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class principall extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnOcultarNombre, btnOcultarCiudad,btnVisuNombre,btnVisuCiudad;
	JLabel etiNombre,etiCiudad;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principall frame = new principall();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public principall() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 etiNombre = new JLabel("JORGE ANDRES");
		etiNombre.setBackground(Color.BLACK);
		etiNombre.setBounds(94, 72, 158, 41);
		contentPane.add(etiNombre);
		
		 etiCiudad = new JLabel("ARMENIA");
		etiCiudad.setBounds(314, 72, 103, 41);
		contentPane.add(etiCiudad);
		
		 btnOcultarNombre = new JButton("OcultarNombre");
		btnOcultarNombre.setBounds(94, 146, 129, 23);
		contentPane.add(btnOcultarNombre);
		btnOcultarNombre.addActionListener(this);
		
		 btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setBounds(280, 146, 137, 23);
		contentPane.add(btnOcultarCiudad);
		btnOcultarCiudad.addActionListener(this);
		
		
		btnVisuNombre = new JButton("visualizarNombre");
		btnVisuNombre.setBounds(76, 204, 147, 23);
		contentPane.add(btnVisuNombre);
		btnVisuNombre.addActionListener(this);
		
		 btnVisuCiudad = new JButton("visualizar Ciudad");
		btnVisuCiudad.setBounds(265, 204, 147, 23);
		contentPane.add(btnVisuCiudad);
		btnVisuCiudad.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnOcultarNombre==e.getSource()) {
			etiNombre.setVisible(false);
		}
		else if (btnOcultarCiudad==e.getSource()) {
			etiCiudad.setVisible(false);
		}
		else if(btnVisuCiudad==e.getSource()) {
			etiCiudad.setVisible(true);
		}
		else if(btnVisuNombre==e.getSource()) {
			etiNombre.setVisible(true);
		}
		
	}
}
