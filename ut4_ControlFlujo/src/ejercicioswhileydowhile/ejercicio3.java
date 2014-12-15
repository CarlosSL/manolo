package ejercicioswhileydowhile;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int numero;
		boolean seguir=true;
		do {
			numero= teclado.nextInt();
			seguir= !(numero%2 ==0);
			if (seguir)
			System.out.println("Has insertado un " + numero);
			else 
				System.out.println("Has insertado un par");
		}while (seguir);
		System.out.println("Fin del programa");

	}

}
