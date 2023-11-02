package trabajo4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnAceptar;
	private JButton btnDesactivar,btnActivar;
	 

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtFrase = new JLabel("New label");
		txtFrase.setBounds(157, 177, 159, 14);
		contentPane.add(txtFrase);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(199, 32, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(199, 63, 86, 20);
		contentPane.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(176, 143, 89, 23);
		contentPane.add(btnAceptar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(44, 143, 89, 23);
		contentPane.add(btnDesactivar);
		
		btnActivar = new JButton("activar");
		btnActivar.setBounds(303, 143, 89, 23);
	
		contentPane.add(btnActivar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnAceptar==e.getSource()) {
			String nombre = txtNombre.getText();
			String ciudad = txtCiudad.getText();
			String mensaje = "su nombre es"+nombre+"su ciudad es"+ciudad;
			
		}else if(btnDesactivar==e.getSource()) {
			txtCiudad.setEnabled(false);
			txtNombre.setEnabled(false);;
		}
		else if(btnActivar==e.getSource()) {
			txtCiudad.setEnabled(true);
			txtNombre.setEnabled(true);
		}
		
	}

}
