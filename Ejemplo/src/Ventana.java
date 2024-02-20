import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
	
		

		public Ventana () {
			setVisible(true);
			setSize(1000,500);
			setLocation(100,100);
			setLocationRelativeTo(null);
			setResizable(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setTitle("Mi ventana");
			
			setMinimumSize(new Dimension(200,200));
			setMaximumSize(new Dimension(700,750));
			
			this.setLayout(null);
			inicioComponentes();
			
			
		}
		
		public void inicioComponentes() {
			
			JPanel login = new JPanel();
			login.setSize(this.getWidth()/2,this.getHeight());
			login.setBackground(Color.red);
			
			JLabel login_tag = new JLabel("accender",0);
			login_tag.setSize(300,80);
			login_tag.setFont(new Font ("bradLey Hand", Font.BOLD, 40));
			login_tag.setForeground(Color.white);
			login_tag.setLocation(100,20);
			login_tag.setOpaque(true);
			login_tag.setBackground(Color.gray);
			login.add(login_tag);
			
			//size
			//location
			//background = opaque
			//string
			
			JPanel registro = new JPanel();
			registro.setSize(this.getWidth()/2,this.getHeight());
			registro.setLocation(500,0);
			registro.setBackground(Color.green);
			
		
			JLabel title= new JLabel("Hola Mundo ", SwingConstants.CENTER);
			title.setFont(new Font("Arial", Font.PLAIN, 24));
			title.setFont(new Font("Arial", Font.PLAIN, 24));
			

			this.add(login);
			//this.add(registro);
			
		}
}
