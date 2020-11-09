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

public class VentanaLogin extends JPanel {
	private JTextField txtFUser;
	private JTextField txtFContr;

	/**
	 * Create the panel.
	 */
	public VentanaLogin() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setBounds(150, 150, 530, 505);
		setLayout(null);
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUser.setBounds(60, 142, 83, 29);
		add(lblUser);
		
		JLabel lblContr = new JLabel("Contrase\u00F1a:");
		lblContr.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblContr.setBounds(60, 218, 95, 29);
		add(lblContr);
		
		txtFUser = new JTextField();
		txtFUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFUser.setBounds(176, 142, 192, 24);
		add(txtFUser);
		txtFUser.setColumns(10);
		
		txtFContr = new JTextField();
		txtFContr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFContr.setColumns(10);
		txtFContr.setBounds(176, 218, 192, 24);
		add(txtFContr);
		
		JButton btnAtras = new JButton("<--");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAtras.setBounds(125, 418, 89, 29);
		add(btnAtras);
		
		JButton btnAceptar = new JButton("-->");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptar.setBounds(320, 418, 89, 29);
		add(btnAceptar);
		
		JLabel lblDia = new JLabel("D\u00EDa:");
		lblDia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDia.setBounds(119, 306, 95, 29);
		add(lblDia);
		
		JComboBox cmbXDia = new JComboBox();
		cmbXDia.setBounds(224, 306, 130, 28);
		add(cmbXDia);
	}
}
