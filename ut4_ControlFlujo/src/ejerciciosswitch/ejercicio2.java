package ejerciciosswitch;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia;
		System.out.print("Dame el d�a de la semana (en letra): ");
		dia = teclado.next();
		/*
		 * dia = dia.toLowerCase();
		 */
		switch (dia.toLowerCase()) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("D�a laborable.");
			break;
		case "sabado":
		case "domingo":
			System.out.println("D�a festivo");
			break;
	}
	}
}
