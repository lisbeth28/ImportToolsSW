
package Otras_Clases;

//Clase para una lista doble y un arbol:

public class NodoProductos {
	private Producto unProducto;// informacion
	private NodoProductos ApuntAnt;	// enlace con el anterior
	private NodoProductos ApuntSgte;// enlace con el siguiente
	
	// constructor
	public NodoProductos( Producto unProducto){
            this.unProducto = unProducto;
        }
	
	// get/set
        public void setunProducto( Producto  unProducto){
            this.unProducto = unProducto;
        }
	public void setApuntSgte(NodoProductos ApuntSgte){this.ApuntSgte=ApuntSgte;}
	public void setApuntAnt(NodoProductos ApuntAnt){this.ApuntAnt = ApuntAnt;}
	
	public Producto  getunProducto(){return unProducto;	}
	public NodoProductos getApuntSgte(){return ApuntSgte;	}
	public NodoProductos getApuntAnt(){return ApuntAnt;	}
}
