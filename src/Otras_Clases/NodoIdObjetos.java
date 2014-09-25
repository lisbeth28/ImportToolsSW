
package Otras_Clases;

//Clase para una lista doble y un arbol:

public class NodoIdObjetos {
	private IdObjetos IdObjeto;// informacion
	private NodoIdObjetos ApuntAnt;	// enlace con el anterior
	private NodoIdObjetos ApuntSgte;// enlace con el siguiente
	
	// constructor
	public NodoIdObjetos( IdObjetos IdObjeto){
            this.IdObjeto = IdObjeto;
        }
	
	// get/set
        public void setunProducto( IdObjetos IdObjeto){
            this.IdObjeto = IdObjeto;
        }
	public void setApuntSgte(NodoIdObjetos ApuntSgte){this.ApuntSgte=ApuntSgte;}
	public void setApuntAnt(NodoIdObjetos ApuntAnt){this.ApuntAnt = ApuntAnt;}
	
	public IdObjetos getunProducto(){return IdObjeto ;	}
	public NodoIdObjetos getApuntSgte(){return ApuntSgte;	}
	public NodoIdObjetos getApuntAnt(){return ApuntAnt;	}
}
