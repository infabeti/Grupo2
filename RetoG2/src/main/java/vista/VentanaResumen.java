package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class VentanaResumen extends JPanel {

	/**
	 * Create the panel.
	 */
	public VentanaResumen() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
		JButton btnAtras = new JButton("<--");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAtras.setBounds(116, 426, 89, 29);
		add(btnAtras);
		
		JButton btnAceptar = new JButton("-->");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptar.setBounds(311, 426, 89, 29);
		add(btnAceptar);
		
		JLabel lblResumen = new JLabel("Resumen");
		lblResumen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblResumen.setBounds(200, 42, 108, 29);
		add(lblResumen);
		
		JTextArea txtAResumen = new JTextArea();
		txtAResumen.setBounds(68, 100, 390, 278);
		add(txtAResumen);
		
		

	}

}
