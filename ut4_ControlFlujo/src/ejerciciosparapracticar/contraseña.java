package ejerciciosparapracticar;

import javax.swing.JOptionPane;

public class contrase�a {

	public static void main(String[] args) {

		String clave="";
        String pass="";
        byte i;
        
        clave=JOptionPane.showInputDialog("Introduce una palabra, ser� la contrase�a");
        
        for(i=0;i<3;i++){
            pass=JOptionPane.showInputDialog("Introduce la contrase�a");
            if(clave.equals(pass)==false){
                JOptionPane.showMessageDialog(null,"Contrase�a incorrecta");
            }else if(clave.equals(pass)){
                JOptionPane.showMessageDialog(null,"Contrase�a correcta. Acceso permitido");
                i=3;
            }
        
        }
        if(clave.equals(pass)==false){
            JOptionPane.showMessageDialog(null,"Has agotado los 3 intentos");
        }

	}

}
