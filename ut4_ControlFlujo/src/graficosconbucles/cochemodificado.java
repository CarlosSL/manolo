package graficosconbucles;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class cochemodificado {

	public static void main(String[] args) throws InterruptedException {
		Rectangle cuadrado;
		Rectangle cuadrado1;
		Ellipse rueda;
		Ellipse rueda1;

		cuadrado=new Rectangle(25,180,100,50);
		cuadrado1=new Rectangle(25,130,50,50);
		rueda=new Ellipse(0,200,50,50);
		rueda1=new Ellipse(100,200,50,50);

		rueda.fill();
		rueda.setColor(Color.BLACK);
		rueda1.fill();
		rueda1.setColor(Color.BLACK);
		cuadrado.fill();
		cuadrado.setColor(Color.GRAY);
		cuadrado1.fill();
		cuadrado1.setColor(Color.GRAY);
		int movimiento= 5;
	
		for (int i=0;;i++) {
		Thread.sleep(20);
		cuadrado.translate(movimiento,0);
		cuadrado1.translate(movimiento,0);
		rueda.translate(movimiento,0);
		rueda1.translate(movimiento,0);
		if(i==99) movimiento=-movimiento;
		else if (i==199){ 
			i=-1;
			movimiento=-movimiento;
		}
		}
		
		
}

	}


