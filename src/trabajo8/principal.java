package trabajo8;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPrimerTrismestre;
	private JTextField txtSegundoSemestre;
	private JTextField txtTercerTrimestre;
	private JButton btnCalcular;
	private JLabel etiResultado;
	private JLabel etiNotaFinal;

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
		
		txtPrimerTrismestre = new JTextField();
		txtPrimerTrismestre.setBounds(56, 43, 86, 20);
		contentPane.add(txtPrimerTrismestre);
		txtPrimerTrismestre.setColumns(10);
		
		txtSegundoSemestre = new JTextField();
		txtSegundoSemestre.setBounds(161, 43, 86, 20);
		contentPane.add(txtSegundoSemestre);
		txtSegundoSemestre.setColumns(10);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setBounds(257, 43, 86, 20);
		contentPane.add(txtTercerTrimestre);
		txtTercerTrimestre.setColumns(10);
		
		btnCalcular = new JButton("New button");
		btnCalcular.setBounds(137, 176, 89, 23);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(this);
		
		etiResultado = new JLabel("New label");
		etiResultado.setBounds(74, 103, 68, 23);
		contentPane.add(etiResultado);
		
		etiNotaFinal = new JLabel("New label");
		etiNotaFinal.setBounds(249, 107, 73, 19);
		contentPane.add(etiNotaFinal);
		
	}

	@Override
	
	public void actionPerformed(ActionEvent e) {
	    String primerTrimestre = txtPrimerTrismestre.getText();
	    int numero1 = Integer.parseInt(primerTrimestre);
	    String segundoTrimestre = txtSegundoSemestre.getText();
	    int numero2 = Integer.parseInt(segundoTrimestre);
	    String tercerTrimestre = txtTercerTrimestre.getText();
	    int numero3 = Integer.parseInt(tercerTrimestre);
	    int resultado = (numero1 + numero2 + numero3) / 3;
	    String resultadoStr = Integer.toString(resultado);
	    
	    if (btnCalcular == e.getSource()) {
	        etiNotaFinal.setText(resultadoStr);

	        if (resultado >= 5) {
	            etiResultado.setText("Aprobado");
	            etiResultado.setForeground(Color.GREEN);
	        } else {
	            etiResultado.setText("Suspendido");
	            etiResultado.setForeground(Color.red);
	        }
	    }
	}}

