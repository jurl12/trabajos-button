package trabajo3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class principal extends JFrame implements ActionListener,KeyListener {

	private JPanel contentPane;
	private JTextField txtTexto;
	private JButton btnVaciar;
	JLabel etiTexto;

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
		
		 etiTexto = new JLabel("New label");
		etiTexto.setBounds(118, 72, 175, 20);
		contentPane.add(etiTexto);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(161, 20, 86, 20);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		btnVaciar = new JButton("New button");
		btnVaciar.setBounds(161, 127, 89, 23);
		contentPane.add(btnVaciar);
		btnVaciar.addActionListener(this);
		txtTexto.addKeyListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnVaciar==e.getSource()) {
			txtTexto.setText("");
		    etiTexto.setText("");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		etiTexto.setText(txtTexto.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
