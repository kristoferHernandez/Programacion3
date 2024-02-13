package ventnana;

import javax.swing.JFrame;

public class ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame ("ejemplo");
		
		ventana.setVisible(false);
		ventana.setSize(100,100);
		ventana.setLocation(100,100);
		System.out.println("hola");
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println(ventana);
	}

}
