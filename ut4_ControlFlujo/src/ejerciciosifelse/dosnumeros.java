package ejerciciosifelse;

import java.util.Scanner;

public class dosnumeros {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int numero1,numero2;
		
		System.out.println("Dame dos numeros: ");
		numero1=teclado.nextInt();
		numero2=teclado.nextInt();
		
		if (numero1>numero2) {
			System.out.println("El numero mayor es el primero");
		} else if (numero1<numero2) {
			System.out.println("El numero mayor es el segundo");
			} else 
			System.out.println("Los dos numeros son iguales");
		
		}
		/*
		int maximo;
		
		
		if (numero1>numero2)
			maximo=numero1
			else
				maximo=numero2;
		System.out.println("El numero mayor es el " + maximo);
		
		maximo = numero1>numero2 ? numero1 : numero2;
		*/
	}


