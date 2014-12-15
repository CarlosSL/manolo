package EJEMPLOS;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int numero = teclado.nextInt();
		
		if (numero==1) {
			System.out.println("El numero es uno");
		} else if (numero==2)
			System.out.println("Has elegido 2");
		else if (numero==10)
			System.out.println("El numero es 10");
		
		switch (numero) {
			case 1:
				System.out.println("El numero es 10");
				break;
			case 2:
				System.out.println("Has elegido 2");
				break;
			case 10:
				System.out.println("El numero es 10");
				break;
		}
		
		String cadena="hola";
		switch (cadena) {
		case "hola":
			break;
		case "adios":
			break;
		
		}
	}

}
