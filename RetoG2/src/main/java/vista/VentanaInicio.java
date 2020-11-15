package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class VentanaInicio extends JPanel {

	/**
	 * Create the panel.
	 * @throws InterruptedException 
	 */
	public VentanaInicio() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
		JLabel lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblBienvenido.setBounds(101, 173, 360, 134);
		add(lblBienvenido);
	}
	

}
