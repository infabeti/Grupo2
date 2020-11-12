package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import controlador.CambiosDeVentana;
import controlador.Metodos;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPelis extends JPanel {

	private JComboBox cmbxOpc;
	private JLabel lblOpc;
	private JTextArea txtAPelis;
	private JButton btnAtras;
	private JButton btnAceptar;

	/**
	 * Create the panel.
	 */
	public VentanaPelis() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 530, 505);

		lblOpc = new JLabel("Elige una opcion:");
		txtAPelis = new JTextArea();
		btnAtras = new JButton("<--");
		btnAceptar = new JButton("-->");
		cmbxOpc = new JComboBox();
		
		txtAPelis = Metodos.cargarPelis(txtAPelis);

		cmbxOpc.setBounds(255, 68, 117, 22);
		add(cmbxOpc);

		lblOpc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOpc.setBounds(111, 68, 134, 22);
		add(lblOpc);

		txtAPelis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAPelis.setBounds(46, 133, 431, 248);
		add(txtAPelis);

		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAtras.setBounds(128, 432, 89, 29);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CambiosDeVentana.cambioAGeneros();
			}
		});
		add(btnAtras);

		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptar.setBounds(323, 432, 89, 29);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CambiosDeVentana.cambioAResumen();
			}
		});
		add(btnAceptar);

	}
}
