package EjerciciosCondicionales;

import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main(String[] args) {
		
		String añocadena= JOptionPane.showInputDialog(null, "Introduce el año");
		
		int año = Integer.parseInt(añocadena);
		
		
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0) && (año % 100 == 0)))
			JOptionPane.showMessageDialog(null,"El año es bisiesto");
		else
			JOptionPane.showMessageDialog(null,"El año no es bisiesto");
		
		}
	}


