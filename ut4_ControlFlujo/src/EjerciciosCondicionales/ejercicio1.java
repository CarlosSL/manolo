package EjerciciosCondicionales;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		String numero;
		int oculto;
		
		oculto= (int )(Math.random() * 10 + 1);;
		
        numero = JOptionPane.showInputDialog("Introduce un número del 1 al 10");

        int num = Integer.parseInt(numero);
        
        
        if (num==oculto)
            JOptionPane.showMessageDialog(null, "¡Has acertado!");
        else 
        	JOptionPane.showMessageDialog(null, "¡Prueba otra vez! - El oculto era el " + oculto);

	}

}
