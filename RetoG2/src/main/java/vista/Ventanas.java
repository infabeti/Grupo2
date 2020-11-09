package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventanas extends JFrame {

	private static JFrame frame;


	/**
	 * Create the frame.
	 */
	public Ventanas() {
		frame = new JFrame();
		frame.setBounds(150, 150, 540, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void cambiarVentana(JPanel panela) {
		frame.setContentPane(panela);
		frame.setPreferredSize(panela.getSize());
		frame.setResizable(false);
		frame.pack();
		frame.setPreferredSize(null);
	}

}
