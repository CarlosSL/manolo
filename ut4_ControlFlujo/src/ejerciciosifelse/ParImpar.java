package ejerciciosifelse;

import javax.swing.JOptionPane;

public class ParImpar {

	public static void main(String[] args) {
		String numeroparimpar;

        numeroparimpar = JOptionPane.showInputDialog("Necesitamos averiguar si un n�mero es par o impar.\nIntroduce el n�mero:");

        int num = Integer.parseInt(numeroparimpar);
        Integer.toString(num);
        
        if (num%2==0)
            JOptionPane.showMessageDialog(null, "Tu n�mero es el "+num+ "\n�Y ES PAR!");
        else JOptionPane.showMessageDialog(null, "�ES IMPAR!");

	}

}
