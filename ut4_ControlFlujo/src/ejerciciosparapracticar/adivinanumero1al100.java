package ejerciciosparapracticar;

import java.util.Scanner;

public class adivinanumero1al100 {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
        
        int aleatorio=(int)(Math.random()*100);
        int intentos;
        int numero=0;
        System.out.println("Introduce un número del 1 al 100 [tienes 10 intentos]");
        for(intentos=0;intentos<10;intentos++){
            numero=teclado.nextInt();
            if(numero<aleatorio){
            System.out.println("Te has quedado corto.");
            }else if(numero>aleatorio){
            System.out.println("Te has pasado.");
            }else if(numero==aleatorio){
            System.out.println("Muy bien has acertado");
            intentos=10;
            }
        }
        if(numero!=aleatorio){
            System.out.println("Lo siento no lo has conseguido");
        }

	}

}
