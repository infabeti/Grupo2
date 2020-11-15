package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;

import controlador.*;

public class VentanaGeneros extends JPanel {

	private Date hrsSabado;
	private Date hrsDomingo;
	private String patternH;
	private SimpleDateFormat simpleDateFormat;
	private String ShrsSabado;
	private String ShrsDomingo;

	private JComboBox cmbxOpc;
	private JLabel lblOpc;
	private JLabel lblHrsSabado;
	private JLabel lblHrsDomingo;
	private JLabel lblGeneros;
	private JLabel lblSeleccionadas;
	private JLabel lblDia;
	private JButton btnAtras;
	private JButton btnAceptar;
	private JTextArea txtASeleccionadas;
	private JTextArea txtAGeneros;

	/**
	 * Create the panel.
	 */
	public VentanaGeneros() {
		cmbxOpc = new JComboBox();
		lblOpc = new JLabel("Elige una opcion:");
		lblHrsSabado = new JLabel("Sabado:");
		lblHrsDomingo = new JLabel("Domingo:");
		lblGeneros = new JLabel("Generos");
		lblSeleccionadas = new JLabel("Pelis seleccionadas");
		lblDia = new JLabel("");
		btnAtras = new JButton("<--");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CambiosDeVentana.cambioALogin();
			}
		});
		btnAceptar = new JButton("-->");
		txtASeleccionadas = new JTextArea();
		txtAGeneros = new JTextArea();
		
		txtAGeneros = Metodos.llenarGeneros(txtAGeneros);
		txtASeleccionadas = Metodos.sacarPelis(txtASeleccionadas);
		cmbxOpc = Metodos.llenarCmbxOpc1(cmbxOpc, txtAGeneros);

		
		ShrsSabado = Metodos.calcularHorasSabado();
		ShrsDomingo = Metodos.calcularHorasDomingo();

		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 530, 505);

		cmbxOpc.setBounds(257, 72, 117, 22);
		add(cmbxOpc);

		lblOpc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOpc.setBounds(113, 72, 134, 22);
		add(lblOpc);

		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAtras.setBounds(130, 421, 89, 29);
		add(btnAtras);

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Metodos.pasarOpc1((int)cmbxOpc.getSelectedItem());
				CambiosDeVentana.cambioAPelis();
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptar.setBounds(325, 421, 89, 29);
		add(btnAceptar);

		txtASeleccionadas.setBounds(257, 158, 230, 139);
		txtASeleccionadas.setEditable(false);
		txtASeleccionadas.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtASeleccionadas.setEditable(false);
		add(txtASeleccionadas);

		lblHrsSabado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHrsSabado.setBounds(257, 315, 230, 22);
		lblHrsSabado.setText(ShrsSabado);
		add(lblHrsSabado);

		lblHrsDomingo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHrsDomingo.setBounds(257, 348, 230, 22);
		lblHrsDomingo.setText(ShrsDomingo);
		add(lblHrsDomingo);

		lblGeneros.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGeneros.setBounds(103, 125, 81, 22);
		add(lblGeneros);

		lblSeleccionadas.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSeleccionadas.setBounds(304, 125, 147, 22);
		add(lblSeleccionadas);

		lblDia.setBounds(167, 27, 184, 34);
		add(lblDia);

		txtAGeneros.setBounds(48, 158, 171, 225);
		txtAGeneros.setEditable(false);
		txtAGeneros.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtAGeneros.setEditable(false);
		add(txtAGeneros);

	}
}
