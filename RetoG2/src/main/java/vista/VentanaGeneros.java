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
	

	/**
	 * Create the panel.
	 */
	public VentanaGeneros() {
		hrsSabado = new Date();
		hrsDomingo = new Date();
		hrsSabado.setHours(8);
		hrsSabado.setMinutes(0);
		hrsDomingo.setHours(6);
		hrsDomingo.setMinutes(0);
		patternH = "HH:mm";
		simpleDateFormat = new SimpleDateFormat(patternH);
		ShrsSabado = simpleDateFormat.format(hrsSabado);
		ShrsDomingo = simpleDateFormat.format(hrsDomingo);

		
		
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
		JComboBox cmbxOpc = new JComboBox();
		cmbxOpc.setBounds(257, 72, 117, 22);
		metodos.llenarCmbxOpc1(cmbxOpc);
		add(cmbxOpc);
		
		JLabel lblOpc = new JLabel("Elige una opcion:");
		lblOpc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOpc.setBounds(113, 72, 134, 22);
		add(lblOpc);
		
		JButton btnAtras = new JButton("<--");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAtras.setBounds(130, 421, 89, 29);
		add(btnAtras);
		
		JButton btnAceptar = new JButton("-->");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				metodos.pasarDatosGeneros();
				cmbxOpc.getSelectedItem();
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptar.setBounds(325, 421, 89, 29);
		add(btnAceptar);
		
		JTextArea txtASeleccionadas = new JTextArea();
		txtASeleccionadas.setBounds(257, 158, 230, 139);
		add(txtASeleccionadas);
		
		JLabel lblHrsSabado = new JLabel("Sabado:");
		lblHrsSabado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHrsSabado.setBounds(257, 315, 230, 22);
		lblHrsSabado.setText("Sabado: "+ ShrsSabado);
		add(lblHrsSabado);
		
		JLabel lblHrsDomingo = new JLabel("Domingo:");
		lblHrsDomingo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHrsDomingo.setBounds(257, 348, 230, 22);
		lblHrsDomingo.setText("Domingo: "+ ShrsDomingo); 
		add(lblHrsDomingo);
		
		JLabel lblGeneros = new JLabel("Generos");
		lblGeneros.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGeneros.setBounds(103, 125, 81, 22);
		add(lblGeneros);
		
		JLabel lblSeleccionadas = new JLabel("Pelis seleccionadas");
		lblSeleccionadas.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSeleccionadas.setBounds(304, 125, 147, 22);
		add(lblSeleccionadas);
		
		JLabel lblDrama = new JLabel("1. Drama");
		lblDrama.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDrama.setBounds(86, 159, 81, 22);
		add(lblDrama);
		
		JLabel lblComedia = new JLabel("2. Comedia");
		lblComedia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblComedia.setBounds(86, 204, 81, 22);
		add(lblComedia);
		
		JLabel lblTerror = new JLabel("3. Terror");
		lblTerror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTerror.setBounds(86, 255, 81, 22);
		add(lblTerror);
		
		JLabel lblCienciaFiccion = new JLabel("4. Ciencia Ficci\u00F3n");
		lblCienciaFiccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCienciaFiccion.setBounds(86, 301, 117, 22);
		add(lblCienciaFiccion);
		
		JLabel lblSalir = new JLabel("0. Salir");
		lblSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSalir.setBounds(86, 348, 81, 22);
		add(lblSalir);
		
		JLabel lblDia = new JLabel("");
		lblDia.setBounds(167, 27, 184, 34);
		add(lblDia);

	}

}
