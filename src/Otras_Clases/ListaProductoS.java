
package Otras_Clases;

public class ListaProductoS{
	private NodoProductos inicio;
	private NodoProductos fin;
	
	// constructor
	public ListaProductoS(){inicio=null; fin=null;}

	// get/set
	public void setInicio(NodoProductos inicio){this.inicio=inicio;	}
	public void setFin(NodoProductos fin){this.fin=fin;	}
	public NodoProductos getInicio(){return inicio;	}
	public NodoProductos getFin(){ return fin;	}
	
	// metodos de administracion
	  public void agrega(Producto unProducto){
		NodoProductos  nuevo , auxiliar;
		//...preparar nuevo nodo ... 
 		nuevo = new NodoProductos(unProducto);
		nuevo.setApuntSgte(null);
		nuevo.setApuntAnt(null);
	
		//...adicionar nuevo nodo a la lista... 
		if(inicio == null) {
			//primer nodo
			inicio = nuevo;
			fin = inicio;
		} else 
                if(unProducto.getCodigoReferencia().compareTo(
                    inicio.getunProducto().getCodigoReferencia() )<0) {
                    //antes del primer nodo
                    nuevo.setApuntSgte(inicio);
                    inicio.setApuntAnt(nuevo);
                    inicio = nuevo;
                } else	
                if(unProducto.getCodigoReferencia().compareTo(
                    fin.getunProducto().getCodigoReferencia() )>0 ||
			unProducto.getCodigoReferencia().compareTo(
                    fin.getunProducto().getCodigoReferencia() )==0)	{
                    //después del último nodo
                    nuevo.setApuntAnt(fin);
                    fin.setApuntSgte(nuevo);
                    fin = nuevo;
		} else {
                    //entre dos nodos ya existentes
                    auxiliar = inicio;

                    // ubica el anterior
                    while(unProducto.getCodigoReferencia().compareTo(
			auxiliar.getunProducto().getCodigoReferencia() )>0||
			unProducto.getCodigoReferencia().compareTo(
			auxiliar.getunProducto().getCodigoReferencia())==0)
                        auxiliar = auxiliar.getApuntSgte();
	
                    // enlaza
                    nuevo.setApuntSgte(auxiliar);
                    nuevo.setApuntAnt(auxiliar.getApuntAnt());
                    auxiliar.getApuntAnt().setApuntSgte(nuevo);
                    auxiliar.setApuntAnt(nuevo);
		}	
	}
 
        
	//.....busca un codigo en la lista
	public NodoProductos buscaProducto(String CodigoReferencia ) {
         
            NodoProductos Auxiliar = inicio;
           while(Auxiliar != null)	{ 
		if( CodigoReferencia.equals( Auxiliar.getunProducto().getCodigoReferencia() ))
                {  return Auxiliar;// lo encontró
                }
		else
                    Auxiliar = Auxiliar.getApuntSgte(); // pasa al siguiente
	}// fin del while
	// terminó la lista y no lo encontró
	return null;
	}
}
