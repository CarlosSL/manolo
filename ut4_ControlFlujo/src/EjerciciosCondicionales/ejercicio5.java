package EjerciciosCondicionales;

import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main(String[] args) {
		
		String a�ocadena= JOptionPane.showInputDialog(null, "Introduce el a�o");
		
		int a�o = Integer.parseInt(a�ocadena);
		
		
		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0) && (a�o % 100 == 0)))
			JOptionPane.showMessageDialog(null,"El a�o es bisiesto");
		else
			JOptionPane.showMessageDialog(null,"El a�o no es bisiesto");
		
		}
	}


