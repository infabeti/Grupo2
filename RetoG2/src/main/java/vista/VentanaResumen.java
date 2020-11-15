package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import controlador.*;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaResumen extends JPanel {
	private JButton btnSalir;
	private JButton btnGeneros;
	private JLabel lblResumen;
	private JTextArea txtAResumen;

	/**
	 * Create the panel.
	 */
	public VentanaResumen() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
		lblResumen = new JLabel("Resumen");
		txtAResumen = new JTextArea();
		btnSalir = new JButton("Salir");
		btnGeneros = new JButton("Generos");
		
		txtAResumen = Metodos.llenarResumen(txtAResumen);
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CambiosDeVentana.cambioResumenLogin();
			}
		});
		
		btnGeneros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CambiosDeVentana.cambioAGeneros();
			}
		});

		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSalir.setBounds(331, 426, 89, 29);
		add(btnSalir);

		lblResumen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblResumen.setBounds(200, 42, 108, 29);
		add(lblResumen);

		txtAResumen.setBounds(68, 100, 390, 278);
		txtAResumen.setEditable(false);
		add(txtAResumen);
		
		btnGeneros.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnGeneros.setBounds(94, 426, 101, 29);
		add(btnGeneros);

	}
}
