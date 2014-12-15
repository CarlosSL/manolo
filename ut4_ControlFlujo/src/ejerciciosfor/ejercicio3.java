package ejerciciosfor;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		int numero,acumulador,i;
		acumulador=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce seis numeros: ");
		
		for(i=0;i<6;i++) {
		numero=teclado.nextInt();
		acumulador += numero;
			
		}
		System.out.println("El resultado de la suma es " + acumulador);
	}

}
