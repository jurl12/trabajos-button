package trabajo2;

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
	private JTextField txtTexto;
	JButton btnTraspasa1 ,btnTraspasa2; 
	JLabel eti1,eti2;

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
		
		txtTexto = new JTextField();
		txtTexto.setBounds(184, 40, 86, 20);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		 btnTraspasa1 = new JButton("traspasa1");
		btnTraspasa1.setBounds(74, 143, 89, 23);
		contentPane.add(btnTraspasa1);
		btnTraspasa1.addActionListener(this);
		
		 btnTraspasa2 = new JButton("traspasa2");
		btnTraspasa2.setBounds(233, 143, 89, 23);
		contentPane.add(btnTraspasa2);
		btnTraspasa2.addActionListener(this);
		
		 eti1 = new JLabel("New label");
		eti1.setBounds(93, 94, 46, 14);
		contentPane.add(eti1);
		
		eti2 = new JLabel("New label");
		eti2.setBounds(257, 94, 46, 14);
		contentPane.add(eti2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnTraspasa1==e.getSource()) {
			eti1.setText(txtTexto.getText());
		}
		if (btnTraspasa2==e.getSource()) {
			eti2.setText(txtTexto.getText());;
		}
		
	}
}
