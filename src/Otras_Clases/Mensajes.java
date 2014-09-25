/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Otras_Clases;

import java.awt.Component;
import javax.swing.JOptionPane;
 
public class Mensajes {
 // **************** METODOS PARA LOS MENSAJES ****************

   public static void Informar(Component gui,String texto) {
        JOptionPane.showMessageDialog(gui,texto,"Mensaje ",1);
        
        // 0=Error / 1= Signo de admiracion  /2= Alarma/ 3=imagen ?/ 
    }
   public static void Alarma(Component gui,String texto) {
        JOptionPane.showMessageDialog(gui,texto,"Mensaje ",2);
        // 0=Error / 1= Signo de admiracion  /2= Alarma/ 3=imagen ?/ 
    }
   
    public static void Error (Component gui,String texto){
    JOptionPane.showMessageDialog(gui, texto,"Error",0);
     }
    
    public static int confirmar(Component gui, String pregunta)                     {
        int r = JOptionPane.showConfirmDialog(gui,pregunta,"Responda",0);
	return r;                                                         }
   // *************************************************************
  
}
