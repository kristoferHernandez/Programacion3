import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaComponentes extends JFrame{
	
	public VentanaComponentes () {
		
		this.setVisible(true);//hace que la venna sea visible
		this.setSize(1000,500);//tamaño de la ventana
		this.setTitle("Mi ventana");//pone un titulo 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//esto cierra la ventana 
		
		this.setMinimumSize(new Dimension (250,250));//tamaño minimo
		this.setMaximumSize(new Dimension (1000,270));//tamaño maximo
		
		this.setLocation(200,200);//es la localidad de la ventana 
		
		this.setLayout(null);
		
		this.setLocationRelativeTo(null);//centrar pantalla
			
		iniciarComponentes();//ayuda a agregar el JPanel
	}
	
	public void iniciarComponentes() {
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.GRAY);
		login.setLayout(null);
		
		JLabel login_tag = new JLabel("ACCENDER",0);
		login_tag.setSize(300,80);
		login_tag.setFont(new Font ("bradLey Hand", Font.BOLD, 30));
		login_tag.setForeground(Color.black);
		login_tag.setLocation(100,20);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.pink);
		login.add(login_tag);
		
		
		JLabel usr_tag=new JLabel("Nombre de Usuario: ");
		
		usr_tag.setBounds(100, 120, 300, 40);
		usr_tag.setFont(new Font ("bradLey Hand", Font.BOLD, 20));
		login.add(usr_tag);
		
		
		JTextField ust_field = new JTextField();
		ust_field.setBounds(100,160,300,40);
		login.add(ust_field);
		
		JLabel pwd_tag=new JLabel("Contraseña: ");
		
		pwd_tag.setBounds(100, 200, 300, 40);
		pwd_tag.setFont(new Font ("bradLey Hand", Font.BOLD, 20));
		login.add(pwd_tag);
		
		JPasswordField pwd_field = new JPasswordField();
		
		pwd_field.setBounds(100, 240, 300, 40);
		login.add(pwd_field);
		
		JCheckBox casilla = new JCheckBox("Recuerdame");
		casilla.setBounds(100, 290, 100, 20);
		login.add(casilla);
		
		JLabel forgot_tag =new JLabel("¿Olvido su contraseña? ");
		
		forgot_tag.setBounds(260, 290, 200, 20);
		login.add(forgot_tag);
		
		JButton login_Boton = new JButton("Accender");
		login_Boton.setBounds(150, 350, 200, 80);
		login.add(login_Boton);
		//size
		//location
		//background = opaque
		//string
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(500,0);
		registro.setBackground(Color.green);
		

		this.add(login);
		this.add(registro);
	}
	

}
