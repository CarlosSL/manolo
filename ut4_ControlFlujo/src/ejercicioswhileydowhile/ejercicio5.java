package ejercicioswhileydowhile;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
	        int pedirnumero;
	        boolean par=false;
	        
	        do  {
	            System.out.println("Introduce un numero, si introduces un n�mero negativo, el programa parar�:");
	            pedirnumero=teclado.nextInt();
	            
	            if (!par && pedirnumero >=0) {
	                 System.out.println("\n----El n�mero que has introducido es "+pedirnumero+".\n");
	                }
	            
	           par=!par; 
	        }while (pedirnumero >=0);
	        System.out.println("\nEl n�mero es negativo. Fin del programa."); 
	        

	}

}
