package ejerciciosparapracticar;

import javax.swing.JOptionPane;

public class contraseña {

	public static void main(String[] args) {

		String clave="";
        String pass="";
        byte i;
        
        clave=JOptionPane.showInputDialog("Introduce una palabra, será la contraseña");
        
        for(i=0;i<3;i++){
            pass=JOptionPane.showInputDialog("Introduce la contraseña");
            if(clave.equals(pass)==false){
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
            }else if(clave.equals(pass)){
                JOptionPane.showMessageDialog(null,"Contraseña correcta. Acceso permitido");
                i=3;
            }
        
        }
        if(clave.equals(pass)==false){
            JOptionPane.showMessageDialog(null,"Has agotado los 3 intentos");
        }

	}

}
