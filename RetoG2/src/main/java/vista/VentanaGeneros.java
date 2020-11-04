package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class VentanaGeneros extends JPanel {

	/**
	 * Create the panel.
	 */
	public VentanaGeneros() {
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.CYAN, new Color(0, 255, 255), Color.CYAN, Color.CYAN));
		setLayout(null);
		setBounds(150, 150, 430, 525);

	}

}
