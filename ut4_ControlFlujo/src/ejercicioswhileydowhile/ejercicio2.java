package ejercicioswhileydowhile;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numero=1;
		int contador=0;
		int multiplicar=1;
		//int acumulador=1;
		
		while(numero!=0){
			multiplicar=multiplicar*numero;
			System.out.println("Dame numeros: ");
			numero=input.nextInt();
			contador++;
		};
		//solucion do while
		/*do{
			numero= input.nextInt();
			if (numero==0)
			continue;
			acumulador *= numero;
			//es lo mismo que la fila 24 acumulador=acumulador * numero;
			contador++;
			}
		} while(numero!=0);
		
		 do{
			numero= input.nextInt();
			if (numero==0)
			break;
			acumulador *= numero;
			contador++;
					}
			} while(true);*/
		
		contador--;
		//System.out.println("Has insertado "+contador+" numeros y el resultado de multiplicar todos ellos es: "+acumulador);
		System.out.println("Has insertado "+contador+" numeros y el resultado de multiplicar todos ellos es: "+multiplicar);
	}

}
