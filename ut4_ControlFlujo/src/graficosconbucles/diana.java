package graficosconbucles;

import graphics.Color;

import graphics.Ellipse;

public class diana {

public static void main(String[] args) throws InterruptedException {
		
		Ellipse disc[] =new Ellipse[10];
		int max,min, i;
		Color colorAleatorio;
		min = 0;
		max = 255;
		
		//(int)(Math.random() * (max - min)) + min; 

		for(i=0;i<10;i++)
			disc[i]=new Ellipse(i*10,i*10,200-i*20,200-i*20);
		for (i = 0; i < 10 ; i++){
			colorAleatorio=new Color((int)(Math.random() * (max - min)) + min, 
										(int)(Math.random() * (max - min)) + min, 
										(int)(Math.random() * (max - min)) + min);
			
			disc[i].setColor(colorAleatorio);	
			disc[i].fill();
			
			Thread.sleep(500);
			}
		
	
		
		
		
		
	}


}
