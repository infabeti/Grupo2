package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controlador.*;
import javax.swing.JPasswordField;

public class VentanaLogin extends JPanel {
	private JTextField txtFUser;
	private JLabel lblDia;
	private JLabel lblUser;
	private JLabel lblContr;
	private JButton btnAceptar;
	private JComboBox cmbXDia;
	private JPasswordField pswFContraseña;

	/**
	 * Create the panel.
	 */
	public VentanaLogin() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setBounds(150, 150, 530, 505);
		setLayout(null);
		
		txtFUser = new JTextField();
		lblDia = new JLabel("D\u00EDa:");
		lblUser = new JLabel("Usuario:");
		lblContr = new JLabel("Contrase\u00F1a:");
		btnAceptar = new JButton("-->");
		cmbXDia = new JComboBox();
		pswFContraseña = new JPasswordField();
		
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUser.setBounds(60, 142, 83, 29);
		add(lblUser);
		
		lblContr.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblContr.setBounds(60, 218, 95, 29);
		add(lblContr);
		
		txtFUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFUser.setBounds(176, 142, 192, 24);
		add(txtFUser);
		txtFUser.setColumns(10);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Metodos.comprobarLogIn(txtFUser.getText(), pswFContraseña.getText())) {
					Metodos.recogerDia(cmbXDia.getSelectedIndex());
					CambiosDeVentana.cambioAGeneros();
				}
					
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptar.setBounds(210, 417, 89, 29);
		add(btnAceptar);
		
		lblDia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDia.setBounds(119, 306, 95, 29);
		add(lblDia);
		
		cmbXDia.setBounds(224, 306, 130, 28);
		cmbXDia.addItem("Sabado");
		cmbXDia.addItem("Domingo");
		add(cmbXDia);
		
		pswFContraseña.setBounds(176, 223, 192, 24);
		add(pswFContraseña);
	}
}
