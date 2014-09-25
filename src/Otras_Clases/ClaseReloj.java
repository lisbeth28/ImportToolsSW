package Otras_Clases;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
public class ClaseReloj extends Thread{
	private JLabel lblReloj;
	
	// constructor
	public ClaseReloj(JLabel lblReloj){
		this.lblReloj= lblReloj;
	}
	
	// funcionamiento del reloj
    	public void run() {
    		while(true)	{
    			Date hoy= new Date();
    	                SimpleDateFormat sdf= new SimpleDateFormat("hh:mm:ss");
 	 	        lblReloj.setText(sdf.format(hoy));

			// demora de 1 segundo            
	        try { sleep(1000); } catch (Exception ex) {}
    	}// fin del while
    }// fin del run
}