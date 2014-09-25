package Otras_Clases;

public class Producto {
    private int IdProducto;
    private String CodigoReferencia;
    private String Descripcion;
    private String unidMedida;  
    private double precioVenta;
    private int cantidad;
  
    public Producto() { }
 
  
    public String getDescripcion() {
        return Descripcion;
    }
 
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

  
    public String getUnidMedida() {
        return unidMedida;
    }
 
    public void setUnidMedida(String unidMedida) {
        this.unidMedida = unidMedida;
    }
 
    public double getPrecioVenta() {
        return precioVenta;
    }

  
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
 
    /**
     * @return the CodigoReferencia
     */
    public String getCodigoReferencia() {
        return CodigoReferencia;
    }

    /**
     * @param CodigoReferencia the CodigoReferencia to set
     */
    public void setCodigoReferencia(String CodigoReferencia) {
        this.CodigoReferencia = CodigoReferencia;
    }

    /**
     * @return the IdProducto
     */
    public int getIdProducto() {
        return IdProducto;
    }

    /**
     * @param IdProducto the IdProducto to set
     */
    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
     
   

}
