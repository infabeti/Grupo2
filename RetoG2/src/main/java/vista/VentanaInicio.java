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
	public VentanaInicio() throws InterruptedException {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 430, 525);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblNewLabel.setBounds(124, 159, 360, 134);
		add(lblNewLabel);
	}
}
