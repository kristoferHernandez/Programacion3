import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	/*Constructor que define los atributos base
	 * de mi ventana */
	public Ventana() {
		this.setTitle("ASd");
		
		this.setVisible(true);
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle("Mi ventana");
		
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(270,270));
		this.setResizable(true);
		this.setLocation(200,200);
		
		
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(Color.blue);
		this.add(login);
		
	}
}
