package Otras_Clases;

import java.util.GregorianCalendar;

public class FechaDelSistema {
    
    public static String Fecha,FechaMYSQL;
    public static int dia;
    public static int mes;
    public static int año;
    
     public static void fechaDelSistema(){
         //crea un objeto para la fecha
         GregorianCalendar fecha=new GregorianCalendar();
         //obtiene dia, mes,año del sistema
         dia=fecha.get(fecha.DAY_OF_MONTH);
         mes=fecha.get(fecha.MONTH)+1;
         año=fecha.get(fecha.YEAR);
         //JUNTA DIA,MES,AÑO CON SEPARADOR SLASH
          Fecha=String.valueOf(dia)+"/"+nombreDeMes(mes)+"/"+String.valueOf(año);
          FechaMYSQL=String.valueOf(año)+"/"+mes+"/"+String.valueOf(dia);
           
     }
     
     public static String nombreDeMes(int mes){
         switch(mes){
             case 1:return "Enero";
             case 2:return "Febrero";
             case 3:return "Marzo";
             case 4:return "Abril";
             case 5:return "Mayo";
             case 6:return "Junio";
             case 7:return "Julio";
             case 8:return "Agosto";
             case 9:return "Setiembre";
             case 10:return "Octubre";
             case 11:return "Noviembre";
             case 12:return "DICIEMBRE";

         }
         return "error";
     }
     
      
}
