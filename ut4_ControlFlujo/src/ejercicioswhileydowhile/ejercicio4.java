package ejercicioswhileydowhile;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
	        int numeroLeido;
	        int numerosLeidos=0;
	        int primerNumero=0;
	        
	        System.out.println("Introduce numero, si introduces un n�mero negativo, el programa parar�:");
	        numeroLeido=teclado.nextInt();
	        numerosLeidos++;
	        primerNumero=numeroLeido;
	        
	        while (numeroLeido>=0) {    
	            
	            numerosLeidos++;
	            System.out.println("Introduce otro numero, si introduces un n�mero negativo, el programa parar�:");
	            numeroLeido=teclado.nextInt();
	            
	            if (numeroLeido < 0) {
	               
	                    System.out.println("El n�mero es negativo. Fin del programa.");
	                
	            }
	            
	        }
	        
	       System.out.println("El primer numero fue el: "+ primerNumero);

	}

}
