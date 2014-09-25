
package Otras_Clases;

public class ListaIdObjetos{
	private  NodoIdObjetos  inicio;
	private  NodoIdObjetos  fin;
	
	// constructor
	public ListaIdObjetos(){inicio=null; fin=null;}

	// get/set
	public void setInicio( NodoIdObjetos  inicio){this.inicio=inicio;	}
	public void setFin( NodoIdObjetos  fin){this.fin=fin;	}
	public  NodoIdObjetos  getInicio(){return inicio;	}
	public  NodoIdObjetos  getFin(){ return fin;	}
	
	// metodos de administracion
	 
          public void agrega(  IdObjetos  unProducto){
		 NodoIdObjetos  nuevo , auxiliar;
		//...preparar nuevo nodo ... 
 		nuevo = new NodoIdObjetos (unProducto);
		nuevo.setApuntSgte(null);
		nuevo.setApuntAnt(null);
	
		//...adicionar nuevo nodo a la lista... 
		if(inicio == null) {
			//primer nodo
			inicio = nuevo;
			fin = inicio;
		} else 
                if(unProducto.getReferencia().compareTo(
                    inicio.getunProducto().getReferencia() )<0) {
                    //antes del primer nodo
                    nuevo.setApuntSgte(inicio);
                    inicio.setApuntAnt(nuevo);
                    inicio = nuevo;
                } else	
                if(unProducto.getReferencia().compareTo(
                    fin.getunProducto().getReferencia() )>0 ||
			unProducto.getReferencia().compareTo(
                    fin.getunProducto().getReferencia() )==0)	{
                    //después del último nodo
                    nuevo.setApuntAnt(fin);
                    fin.setApuntSgte(nuevo);
                    fin = nuevo;
		} else {
                    //entre dos nodos ya existentes
                    auxiliar = inicio;

                    // ubica el anterior
                    while(unProducto.getReferencia().compareTo(
			auxiliar.getunProducto().getReferencia() )>0||
			unProducto.getReferencia().compareTo(
			auxiliar.getunProducto().getReferencia())==0)
                        auxiliar = auxiliar.getApuntSgte();
	
                    // enlaza
                    nuevo.setApuntSgte(auxiliar);
                    nuevo.setApuntAnt(auxiliar.getApuntAnt());
                    auxiliar.getApuntAnt().setApuntSgte(nuevo);
                    auxiliar.setApuntAnt(nuevo);
		}	
	}

        
	//.....busca un codigo en la lista
	public NodoIdObjetos buscaProducto(String CodigoProducto ) {
            // empieza por el primero de la lista
            NodoIdObjetos Auxiliar = inicio;

            // mientras no sea nulo
            while(Auxiliar != null)	{ 
		if( CodigoProducto .equals(Auxiliar.getunProducto().getReferencia() ))
                    return Auxiliar;// lo encontró
		else
                    Auxiliar = Auxiliar.getApuntSgte(); // pasa al siguiente
	}// fin del while
	// terminó la lista y no lo encontró
	return null;
	}
}
