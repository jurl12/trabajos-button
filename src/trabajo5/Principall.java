package trabajo5;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.MouseEvent;
import javax.swing.JLabel;

public class Principall extends JFrame implements MouseListener{

	private JPanel contentPane;
	JLabel etiOcultar,eti4, eti2, eti3, eti1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principall frame = new Principall();
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
	public Principall() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 eti1 = new JLabel("New label");
		eti1.setBounds(105, 100, 46, 14);
		contentPane.add(eti1);
		
		 eti3 = new JLabel("New label");
		eti3.setBounds(227, 100, 46, 14);
		contentPane.add(eti3);
		
		 eti2 = new JLabel("New label");
		eti2.setBounds(161, 100, 46, 14);
		contentPane.add(eti2);
		
		 eti4 = new JLabel("New label");
		eti4.setBounds(286, 100, 46, 14);
		contentPane.add(eti4);
		
		etiOcultar = new JLabel("etiOcultar");
		etiOcultar.setBounds(191, 173, 46, 14);
		contentPane.add(etiOcultar);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		if (etiOcultar.equals(e.getSource())) {
			eti1.setVisible(false);
			eti2.setVisible(false);
			eti3.setVisible(false);
			eti4.setVisible(false);
		}
		
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
	 if (etiOcultar.equals(e.getSource())) {
			eti1.setVisible(true);
			eti2.setVisible(true);
			eti3.setVisible(true);
			eti4.setVisible(true);
		}
		
	}
}
