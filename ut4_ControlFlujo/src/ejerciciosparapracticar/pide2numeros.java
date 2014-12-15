package ejerciciosparapracticar;

import java.util.Scanner;

public class pide2numeros {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
        int num1,num2;
        System.out.println("Introduce dos numeros");
        num1=teclado.nextInt();
        num2=teclado.nextInt();
    while(num1==num2){
        System.out.println("Los números son iguales. Introducelos otra vez");
        num1=teclado.nextInt();
        num2=teclado.nextInt();
    }
    if(num1>num2){
        System.out.println("El número "+num1+" es el mayor");
    }else{
        System.out.println("El número "+num2+" es el mayor");
    }

	}

}
