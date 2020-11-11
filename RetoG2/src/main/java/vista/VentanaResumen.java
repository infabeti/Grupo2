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

	private JButton btnAtras;
	private JButton btnAceptar;
	private JLabel lblResumen;
	private JTextArea txtAResumen;

	/**
	 * Create the panel.
	 */
	public VentanaResumen() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 530, 505);

		btnAtras = new JButton("<--");
		btnAceptar = new JButton("-->");
		lblResumen = new JLabel("Resumen");
		txtAResumen = new JTextArea();

		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAtras.setBounds(116, 426, 89, 29);
		add(btnAtras);

		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptar.setBounds(311, 426, 89, 29);
		add(btnAceptar);

		lblResumen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblResumen.setBounds(200, 42, 108, 29);
		add(lblResumen);

		txtAResumen.setBounds(68, 100, 390, 278);
		add(txtAResumen);

	}

}
