package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaPelis extends JPanel {

	/**
	 * Create the panel.
	 */
	public VentanaPelis() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
		JComboBox cmbxOpc = new JComboBox();
		cmbxOpc.setBounds(255, 68, 117, 22);
		add(cmbxOpc);
		
		JLabel lblOpc = new JLabel("Elige una opcion:");
		lblOpc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOpc.setBounds(111, 68, 134, 22);
		add(lblOpc);
		
		JTextArea txtAPelis = new JTextArea();
		txtAPelis.setBounds(46, 133, 431, 248);
		add(txtAPelis);
		
		JButton btnAtras = new JButton("<--");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAtras.setBounds(128, 432, 89, 29);
		add(btnAtras);
		
		JButton btnAceptar = new JButton("-->");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptar.setBounds(323, 432, 89, 29);
		add(btnAceptar);

	}
}
