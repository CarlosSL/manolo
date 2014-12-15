package ejerciciosbuclesanidados;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		do {
			
			System.out.println("Elige que tabla de multiplicar quieres hacer: ");
			numero=teclado.nextInt();
		if(numero >=1 && numero <=10){
			for(int i=1; i<=10 ; i++){
				System.out.println(numero*i);
			}
		}else {
			System.out.println("El numero introducido no esta entre 1 y 10");
		}
			
		}while(numero>=1 && numero<=10);

	}

}
