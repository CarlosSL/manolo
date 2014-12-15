package ejerciciosifelse;

import javax.swing.JOptionPane;

public class Temperatura {

	public static void main(String[] args) {
		
		String gradosFahrenheit;
		
		gradosFahrenheit= JOptionPane.showInputDialog("Dime la Temperatura en grados Fahrenheit");
		
		int Fahrenheit= Integer.parseInt(gradosFahrenheit);
		
		
		int Centigrados = (int) ((Fahrenheit - 32)/ 1.8);
		JOptionPane.showMessageDialog(null, " La tempteratura que has introducido es de " + Fahrenheit +  "La Temperatura en ºC es de"  + Centigrados);
		if (Centigrados <=0) {
			JOptionPane.showMessageDialog(null, "¡Congelacion!");
		}
	}

}
