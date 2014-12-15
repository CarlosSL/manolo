package EJEMPLOS;

import java.util.Scanner;

public class ejemploforejercicio1for {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int i;
		String leido;
		//incrementando
		for(i=0;i<5;i++) {
			leido=teclado.nextLine();
			System.out.println(leido);
		}
		/*decrementando
		for(i=5;i>0;i--) {
			leido=teclado.nextLine();
			System.out.println(leido);
		}*/

	}

}
