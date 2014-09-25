 
package MantenimientoBD;

import Otras_Clases.Mensajes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author M
 */
public class MantenimientoDatos {
    public Connection conexion;
    public Statement instruccion; 
    
    public MantenimientoDatos() { // Al crearse se conectara con la  BD
          //Connection conexion = null; 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/importtoolsfinal","root","mysql");
            if (conexion!= null)
            {  instruccion = conexion.createStatement();
               instruccion.close();   
            }
         }catch(SQLException | ClassNotFoundException ex) { 
            Mensajes.Error(null,"Error en conexion con la Base de Datos "+ex);
        }
            
    }

      
    
   public void InsertarUM (int idUnidad,String unidad) {
         try {
             String strcad = "INSERT INTO  unidad_medida(idUnidad_medida,Nombre) "
                     + "VALUES (" +idUnidad+ ",'" +unidad+"');";
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(strcad);
             Mensajes.Informar(null,"Se registro la Unidad de medida");
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }
    }

     public void InsertarNumeroDocumento(String Doc,int NumInicio,int NumFin) {
         try {
             String strcad = "INSERT INTO numerodocumentos (Documento,NumInicio,NumFin)"
                     + "VALUES ('" +Doc+ "'," +NumInicio+"," +NumFin+");";
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }
    }
     
      public void InsertarNumero_SerieDocumento(String Doc,int NumInicio,int NumFin,int SerieInicio ) {
         try {
             String strcad = "INSERT INTO numerodocumentos (Documento,NumInicio,NumFin,SerieInicio)"
                     + "VALUES ('" +Doc+ "'," +NumInicio+"," +NumFin+"," +SerieInicio+");";
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }
    }
      
       public void actualizarNumeroDocumento(String Doc,int NumInicio,int NumFin) {
         try {
             String strcad = "UPDATE numerodocumentos set NumInicio=" +NumInicio+" ,NumFin=" +NumFin
                           + " WHERE Documento= '"+Doc+ "'";
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }
    }
     
      public void actualizarNumero_SerieDocumento(String Doc,int NumInicio,int NumFin,int SerieInicio ) {
         try {
           String strcad = "UPDATE numerodocumentos set NumInicio=" +NumInicio+" ,NumFin=" +NumFin 
                           + " , SerieInicio="+SerieInicio+" WHERE Documento= '"+Doc+ "'";
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }
    }
      
      
     public void InsertarAlmacen(String descripcion, String dire) {
         try {
             String strcad = "INSERT INTO almacen(Descripcion,Direccion) "
                + "VALUES ('" +descripcion+ "','" +dire+"');";
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }
    }
     
     public void InsertarCatalogoProv ( int idProveedor,int idProductos, double costoProducto) {
       try {
           String  strcad = "INSERT INTO catalogoproveedor(idProveedor,idProductos,costoProducto)"
                   + "VALUES("+idProveedor+","+idProductos+","+costoProducto+");";           
           instruccion = conexion.createStatement();
           System.out.print(strcad);
           instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
      }
     
      public void ModificarCatalogoProv ( int idProveedor,int idProductos, double costoProducto) {
       try {
           String  strcad = "UPDATE catalogoproveedor set costoProducto = "+costoProducto+
                   "WHERE idProveedor="+idProveedor+" AND  idProductos="+idProductos+";";           
           instruccion = conexion.createStatement();
           instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
      }
       
     public void insertarCliente(int IdCliente, int TipoCliente, String ruc, String direccion, String telefono, String e_mail, String celular) {
       try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO cliente(idCliente,idTipocliente,Ruc,Direccion,Telefono,E_mail,Celular) "
                     + "VALUES(" +IdCliente + "," +TipoCliente+ ",'" +ruc+ "','" +direccion+ "'," +telefono+ "," +e_mail+","+celular+");";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
    
     public void insertarClienteJuridico(int IdCliente,String NombreRaz) {
        try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO  cliente_juridico (idCliente,RazonSocial) "
                     + "VALUES(" +IdCliente +",'" +NombreRaz+"');";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }

     public void insertarClienteNatural(int IdCliente,String NombreRaz, String apellidoP,String apellidoM, String DNI) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO  cliente_natural (idCliente,Nombres,ApellidoP,ApellidoM,DNI)"
                     + "VALUES(" +IdCliente +",'" +NombreRaz+"','" +apellidoP+"','" +apellidoM+"','"+DNI+"');";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
   
     public void insertarCotizacion(int idCotizacion,int idEmpleado, int idCliente,int idAlmacen, String Fecha,String NroCotizacion) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO  cotizacion(idCotizacion,idEmpleado,idCliente,idAlmacen,Fecha,NroCotizacion)"
                     + "VALUES(" +idCotizacion+","+idEmpleado+"," +idCliente+"," +idAlmacen+",'"+Fecha+"','"+NroCotizacion+"');";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
  
     public void insertarDetalleCotizacion(int idCotizacion,int idProductos,int Cantidad,double PrecioProducto) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO detalle_cotizacion(idCotizacion,idProductos,Cantidad,PrecioProducto)"
                     + "VALUES("+idCotizacion+","+idProductos+","+Cantidad+","+PrecioProducto+");";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
  
     public void insertarFactura(int idFactura,String Serie,String Numero, int idCliente, String FechaEmision,
             int idCondicionVenta, int idCotizacion ,int idEmpleado,int idAlmacen ,int idIgv, int idMoneda,double ValorVenta,double valorIGV,
             double Total, int idEstado ) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO factura(idFactura,Serie,Numero,FechaEmision,idCondicionVenta,idCotizacion,"
                     + "idCliente,idEmpleado,idAlmacen,idIgv,idMoneda,ValorVenta,valorIGV,Total,"
                     + "idEstado) VALUES(" +idFactura+",'"+Serie+"','" +Numero+"','"+FechaEmision+"',"+idCondicionVenta+","
                     +idCotizacion+","+idCliente+","+idEmpleado+","+idAlmacen+","+idIgv+","+idMoneda+","+ValorVenta+","+valorIGV+","+Total+","+idEstado+");";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
  
    public void insertarDetalleFactura(int idFactura,int idProductos,int Cantidad,double PrecioProducto) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO detalle_factura(idFactura,idProductos,Cantidad,PrecioProducto )"
                     + "VALUES("+idFactura+","+idProductos+","+Cantidad+","+PrecioProducto+");";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
         }     
    }
  
    public void insertarGuiaDevolucion(int idGuiaDevolucion,int idFactura, int idCliente,int idEmpleado,int idAlmacen,int Numero,String FechaEmision) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO  guia_devolucion(idGuiaDevolucion,idFactura,idCliente,idEmpleado,idAlmacen,Numero,"
                     + "FechaEmision ) VALUES(" +idGuiaDevolucion+","+idFactura+"," +idCliente+"," +idEmpleado+","+idAlmacen+","+Numero+
                     ",'"+FechaEmision+"');";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
  
    public void insertarDetalleGuiaDevolucion(int idGuiaDevolucion,int idProductos,int Cantidad ) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO detalle_guia_devolucion (idGuiaDevolucion,idProductos,Cantidad)"
                     + "VALUES("+idGuiaDevolucion+","+idProductos+","+Cantidad+");";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
    
    public void insertarDatosgeneralesempresa( String RazonSocial, String Ruc, String Direccion, String Telefono, 
            String Nextel, String Correo, String web) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO datosgeneralesempresa "
                     + "(idDatosGeneralesEmpresa,RazonSocial,Ruc,Direccion,Telefono,Nextel,Correo,PaginaWeb)"
                     + "VALUES"
                     + "(1,'"+RazonSocial+"','"+Ruc+"','"+Direccion+"',"+Telefono+","+Nextel+","+Correo+","+web +" );";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
     public void actualizarDatosgeneralesempresa( String RazonSocial, String Ruc, String Direccion, String Telefono, 
            String Nextel, String Correo, String web) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "UPDATE datosgeneralesempresa set RazonSocial= '"+RazonSocial+"',Ruc='"+Ruc+"'"
                     + " ,Direccion='"+Direccion+"', Telefono="+Telefono+",Nextel="+Nextel+",Correo="+Correo+""
                     + " PaginaWeb= "+web+"  where idDatosGeneralesEmpresa=1;";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
    public void insertarGuiaRemision(int idGuiaRemision,String Serie, String Numero, int idCliente,int idCotizacion,String FechaEmision,
            int idFactura, String PuntoPartida, String PuntoLlegada, String MotivoTraslado) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO  guia_de_remision(idGuiaRemision,Serie,Numero,idCliente,idCotizacion,FechaEmision,idFactura,"
                     + "PuntoPartida,PuntoLlegada,MotivoTraslado) VALUES(" +idGuiaRemision+","+Serie+"," +Numero+"," +idCliente+","
                     +idCotizacion+",'"+FechaEmision+ "',"+ idFactura+",'"+PuntoPartida+"','"+PuntoLlegada+"','"+MotivoTraslado+"');";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
  
    public void insertarDetalleGuiaRemision(int idGuiaRemision,int idProductos,int Cantidad,double PrecioProducto) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO detalle_guia_remision(idGuiaRemision,idProductos,Cantidad)"
                     + "VALUES("+ idGuiaRemision+","+idProductos+","+Cantidad+");";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
    
    public void insertarNotaCredito(int idNotaCredito,int Serie,int Numero,int idFactura, int idCliente,int idAlmacen ,
             int idEmpleado,int idMoneda,int idIgv, String FechaEmision,double SubTotal,double valorIGV,
             double Total,String MotivoEmision ) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO nota_credito (idNotaCredito,Serie,Numero,idFactura,idCliente,idAlmacen,idEmpleado,idMoneda,"
                     + "idIgv,FechaEmision,SubTotal,valorIGV,Total,MotivoEmision)"
                     + "VALUES(" +idNotaCredito+",'"+Serie+"','" +Numero+"',"+idFactura+","+idCliente+","+idAlmacen+","+idEmpleado+","
                     +idMoneda+","+idIgv+",'"+FechaEmision+"',"+SubTotal+","+valorIGV+","+Total+",'"+MotivoEmision+"');";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
  
    public void insertarDetalleNotaCredito(int idNotaCredito,int idProductos,int Cantidad,double PrecioProducto) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO detalle_notacredito (idNotaCredito,idProductos,Cantidad,PrecioProducto)"
                     + "VALUES("+idNotaCredito+","+idProductos+","+Cantidad+","+PrecioProducto+");";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
    
    public void InsertarOrdenCompra(int idOrdenCompra, int idProveedor ,String NumOrdn ,String FechaEmision,int idempleado
           )// arreglar !! 
     {
       try {
           String  strcad = "INSERT INTO  orden_de_compra ( idOrdenCompra ,idProveedor ,NumeroOC ,FechaEmision,idEmpleado) "
                          + "VALUES ("+idOrdenCompra+","+idProveedor+",'"+NumOrdn+"','"+FechaEmision+"',"+idempleado+");";   // la orden se encuentra en estado solicitada        
           instruccion = conexion.createStatement();
           System.out.print(strcad);
           instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
      }
     
     public void InsertarDetalleOrdenCompra(int idOrdenCompra, int idProducto,int cantidad ,double PrecioCosto) {
       try {
           String  strcad = "INSERT INTO detalle_ordencompra  ( idOrdenCompra , idProductos , cantidad ,PrecioCosto )"
                   + "VALUES("+idOrdenCompra+","+idProducto+","+cantidad+","+PrecioCosto+");";           
           instruccion = conexion.createStatement();
           System.out.print(strcad);
           instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
      }
 
     public void insertarGuiaEntrada(int idguiaEntrada,int idAlmacen,int idOrdenCompra, int NumeroDOC,String Fecha,
            int NumFactura_Invoice, String idGuiaRems_DUA , int idEmpleado,int idMoneda) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO guiaentrada(idguiaEntrada,idAlmacen,idOrdenCompra,NumeroDOC,Fecha,NumFactura_Invoice,"
                     + "GuiaRems_DUA ,idEmpleado,idMoneda  ) VALUES(" +idguiaEntrada+","+idAlmacen+"," +idOrdenCompra+",'" +NumeroDOC+"','"+Fecha+"',"+NumFactura_Invoice+
                     ","+idGuiaRems_DUA+","+idEmpleado+","+idMoneda+");";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
  
    public void insertarDetalleGuiaEntrada(int idguiaEntrada,int idProductos,int Cantidad,double PrecioCosto,double SubTotal) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO detalle_guiaentrada(idguiaEntrada,idProductos,CantidadProductos,PrecioCosto,SubTotal) "
                     + "VALUES("+idguiaEntrada+","+idProductos+","+Cantidad+","+PrecioCosto+",ROUND("+SubTotal+",2));";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
    
    
     public void InsertarEmpleado(int codEMP,String NOM, String APEpater,String APEmatern,String DNI,int idcarg,
              String FechaNac, String tel,String cel,String dire,String correo) {
          try {
             instruccion = conexion.createStatement();
             String  strcad  = "INSERT INTO empleado(idEmpleado,Nombre,ApellidoPaterno,ApellidoMaterno,DNI,idCargo,FechaNacimiento,Telefono,"
                     + "Celular,Direccion,FechaIngreso,FechaAlta,E_Mail,idEstado) "
                     + "VALUES(" + codEMP + ",'" + NOM + "','" +APEpater+ "','" +APEmatern+ "','" +DNI+ "'," +idcarg+",'"+FechaNac+"',"
                     + ""+tel+","+cel+",'"+dire+"',concat(YEAR(now()),'/',MONTH(now()),'/',DAY(now())) ,null,"+correo+",1);";
             instruccion.executeUpdate(strcad); 
             Mensajes.Informar(null,"Se Registro exitosamente al Empleado");
        } catch (SQLException ex) {
           String error1,error2=" ",error3=".";
            if(ex.getLocalizedMessage().length()>72){
                 error1=ex.getLocalizedMessage().substring(0,72);
                 error2=ex.getLocalizedMessage().substring(72,
                      ex.getLocalizedMessage().length());
                 if(error2.length()>72){
                      String auxiliar=error2;   error2=auxiliar.substring(0,72);
                      error3=auxiliar.substring(72,auxiliar.length());
                }
            }else { error1=ex.getLocalizedMessage();}
           
          String mnsjError="ERROR EN LA INSERCION N°" +ex.getSQLState()+ " : "+"\n"
                 +"..............................................."+"\n" 
                 + error1+  "\n" +error2+  "\n"+ error3;
         Mensajes.Error(null,mnsjError);
        }       
     }   
     
     public void InsertarFamilia(String descripcion, String codRef) {
       try {
           String  strcad = "INSERT INTO  familia (CodigoReferencia ,Descripcion  )"
            + "VALUES ('" +codRef+ "','" +descripcion+"');";          
           instruccion = conexion.createStatement();
           instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
      }
      
     public void InsertarIGV(double valor,int estado) {
         String strcad = "INSERT INTO igv (Valor,idEstado) VALUES ( "+valor+","+estado+");";
         try {
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
          Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }
    }
       
     public void UsarIGV(String idAntiguo,String idNuevo,int idEmpleado ) {
          try { 
                String sql= "UPDATE igv SET idEstado=1 WHERE idIgv="+idAntiguo+";";
                String sql2="UPDATE igv SET idEstado=5 WHERE idIgv="+idNuevo+";";
                String sql3="INSERT INTO  historial_igv( idIgv ,FechaInicio,FechaCambio,idEmpleado)"
                + "VALUES("+idNuevo+",concat(YEAR(now()),'/',MONTH(now()),'/',DAY(now())),null,idEmpleado="+idEmpleado+" );";
                
                String sql4="UPDATE historial_igv set FechaCambio=concat(YEAR(now()),'/',MONTH(now()),'/',DAY(now()))"
                        + " ,idEmpleado="+idEmpleado+"   WHERE idIgv="+idAntiguo+";"; 
           
                instruccion = conexion.createStatement();
                instruccion.executeUpdate(sql); 
                instruccion.executeUpdate(sql2);
                instruccion.executeUpdate(sql3); 
                instruccion.executeUpdate(sql4);
                
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al Actualizar el uso del IGV : \n "  + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
    }
       
       public void Insertarkardex_almacen(int idAlmc,int idProductos,int Cantidad) {
          try { 
                String sql= " INSERT INTO kardex_almacen( idAlmacen,idProductos,Stock) VALUES("+idAlmc+","+idProductos+","+Cantidad+" );"; 
                instruccion = conexion.createStatement();
                instruccion.executeUpdate(sql);  
                
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al Actualizar el uso del IGV : \n "  + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
    }
       
     public void InsertarUsuario(int idUsuario,int codEmpl,String usuario,String contraseña) {
        try {
            instruccion = conexion.createStatement();
            String strcad  = "INSERT INTO usuario( idEmpleado,idUsuario,usuario,Contraseña) VALUES"
                    + "("+codEmpl+","+idUsuario+",'"+usuario+"',aes_encrypt('"+contraseña+"','"+usuario+"'));";
             System.out.println(strcad );
            instruccion.executeUpdate(strcad);
            
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }       
     }
   
     public void AnularEmpleado(String cod ){
         String sql= "UPDATE  empleado SET idEstado =2 WHERE idEmpleado="+cod+";";
         try {  
             EliminarUsuario( cod);  
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error Modificacion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
    }
    
      public void EliminarUsuario(String Cod) {
         String sql= "DELETE from usuario WHERE idEmpleado='"+Cod+"';";
         try {  
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error: No se pudo eliminar el usuario: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
    }
    
    public void ModificarEMPLEADO(int  codEMP, String NOM,String ap,String aM,String DNI,int idcargNuev,int idcargAnt,
            String FechaNac, String dire, String tel,String Usur,String celular,String e_mail) {
        try {  
              String strcad = "UPDATE  empleado SET Nombre  = '"+NOM+"',ApellidoPaterno  = '"+ap+"',ApellidoMaterno  = '"+aM+"', DNI  = '"+DNI+"',"
                      + "idCargo = '"+idcargNuev+"',  FechaNacimiento  = '"+FechaNac+"', Telefono  =" +tel+", "
                      + "Celular  = " +celular+", Direccion  = '" +dire+"',  E_Mail  = " +e_mail+"  WHERE idEmpleado="+codEMP+" ;";
              instruccion = conexion.createStatement();
              instruccion.executeUpdate(strcad); 
              
              String strcad2= "UPDATE usuario set Contraseña= aes_encrypt(aes_decrypt(Contraseña ,usuario) , '"+Usur+"' ) "
                      + ",usuario ='"+Usur+"'  where idEmpleado= "+codEMP+";";
              instruccion = conexion.createStatement();
              instruccion.executeUpdate(strcad2); 
               
        } catch (SQLException ex) {
              Mensajes.Error(null,"Error en la Modificacion : " + ex.toString());
        }    
    }
     
     public void InsertarProveedor(int cod,int idTipo,String raz, String ruc, String direcc,String tel, String E_mail,String celular) {
        try { 
         
              String strcad = "INSERT INTO  proveedor (idProveedor,RazonSocial ,Ruc ,idTipoProveedorCompras,Direccion , E_mail ,Celular ,Telefono  )"
                      + "VALUES ("+cod+",'"+raz+"','"+ruc+"',"+idTipo+",'"+direcc+"',"+E_mail+","+celular+","+tel+");";
              instruccion = conexion.createStatement();
              System.out.println(strcad);
              instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }
    }
       
     public void AnularPROVEDOR(int cod){
         try {  
               String sql= "UPDATE  proveedor SET idEstado=2 WHERE idProveedor="+cod+";"; 
               instruccion = conexion.createStatement();
               instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al anular al proveedor SQL:  \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
    }
   
   
     public void ModificarPROVEDOR(int idprov, String raz,String ruc,String dir,String telf,String e_mail,String cel) {
        try {  
             String strcad = "UPDATE proveedor SET  RazonSocial ='"+raz+"', RUC ='"+ruc+"',Direccion='"+dir+"' ,Telefono='"+telf+"', "
                     + " E_mail="+ e_mail+", Celular="+ cel+"  WHERE idProveedor="+idprov+";";
             System.out.println(strcad);
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(strcad);  
        } catch (SQLException ex) {
              Mensajes.Error(null,"Error en la Modificacion :  \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }    
    } 
   
     public void InsertarMONEDA(String tipmon,String tipoCam) { 
        String strcad = "INSERT INTO  moneda( TipoMoneda,Tipo_de_Cambio) "
                + "VALUES('"+tipmon+"',"+tipoCam+" );"; 
         try {
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }
    }
    
      public void ModificarCONTRASEÑA(String codEmpl,String contraseña){
        try {
            String strcad = "UPDATE  usuario SET Contraseña= aes_encrypt('"+contraseña+"',usuario) WHERE  idEmpleado="+codEmpl+";";
            instruccion = conexion.createStatement();
            instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error:No se pudo modificar la contraseña \n "+ ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
        }
        
    }
     
      public void AnularFamilia(String Codigo) {
          String sql= "UPDATE familia SET idEstado=2  WHERE idFamilia="+Codigo+";";
         try {    
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al anular la familia" + ex.toString());
         }
    }
      
       public void ModificarFamilia(int Codigo,String DescripNueva  ) {
          String sql= "UPDATE familia SET Descripcion  = '"+DescripNueva+"'  WHERE idFamilia ="+Codigo+";";
         try {    
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al modificar familia" + ex.toString());
         }
    }
       
    public void anularOrdenCompra(int Codigo ) {
          String sql= "UPDATE orden_de_compra SET idEstado =2  WHERE idOrdenCompra="+Codigo+";";
         try {    
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al anular la familia" + ex.toString());
         }
    }
  
    public void InsertarProducto(int idProducto,int idFamilia,String CodigoReferencia,String descripcion,
            int stockMin,int stockMax,double precioVenta,int stockActual,int idUnidaMedida) {
       try {
           String  strcad = "INSERT INTO  productos ( idProductos,idFamilia,CodigoReferencia ,Descripcion ,StockMin , "
                   + "StockMax ,PrecioVenta,Stock,idUnidad_medida)"
                   + "VALUES("+idProducto+","+idFamilia+",'"+CodigoReferencia+"','"+descripcion+"',"+stockMin+","+stockMax+","
                   +precioVenta+","+ stockActual+","+idUnidaMedida+" );";        
           System.out.print(strcad); 
           instruccion = conexion.createStatement();
           instruccion.executeUpdate(strcad);
           Mensajes.Informar(null,"Se Registro exitosamente el Producto :"+idProducto);
           
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
      }
      public void ModificarProducto(int idproducto,int idFamilia,String Descripcion, int StockMin ,int StockMax,double PrecioVenta,
               int IdUnidad) {
        try {  
             String strcad = "UPDATE productos SET  idFamilia ="+idFamilia+",Descripcion='"+Descripcion+ "',"
                     + "StockMin="+StockMin+" ,StockMax="+StockMax+", PrecioVenta="+PrecioVenta+","
                     + "idUnidad_medida="+IdUnidad+" "
                     + " WHERE  idProductos="+idproducto+";";
             System.out.println(strcad);
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(strcad);  
        } catch (SQLException ex) {
              Mensajes.Error(null,"Error en la Modificacion :  \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }    
    } 
     
     public void AnularProducto(String cod){
         try {  
               String sql= "UPDATE  productos SET idEstado=2 WHERE idProductos="+cod+";"; 
               instruccion = conexion.createStatement();
               instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al anular al  producto :  \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
    }  
   
       public void EliminarGuiaEntrada(String cod){
         try {  
               String sql_1="DELETE FROM  detalle_guiaentrada  WHERE idguiaEntrada="+cod+";"; 
               String sql= "DELETE from  guiaentrada WHERE idguiaEntrada="+cod+";"; 
               instruccion = conexion.createStatement();
               instruccion.executeUpdate(sql_1);
                
               instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al anular al  producto :  \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
    }
        public void EliminarGuiaDevolucion(String cod){
         try {  
               String sql_1="DELETE FROM detalle_guia_devolucion WHERE idGuiaDevolucion="+cod+";"; 
               String sql= "DELETE from  guia_devolucion WHERE idGuiaDevolucion="+cod+";"; 
               instruccion = conexion.createStatement();
               instruccion.executeUpdate(sql_1);
                
               instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al anular al  producto :  \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
    }      
         
     public void EliminarGuiaRemision(String cod){
         try {  
               String sql_1="DELETE FROM  detalle_guia_remision  WHERE idGuiaRemision="+cod+";"; 
               String sql= "DELETE from  guia_de_remision WHERE idGuiaRemision="+cod+";"; 
               instruccion = conexion.createStatement();
               instruccion.executeUpdate(sql_1);
                
               instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al anular al  producto :  \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
    }
          
     public void AnularCliente(String Codigo ) {
        try {    
             String sql= "UPDATE cliente SET idEstado=2  WHERE Idcliente ="+Codigo+";";
             instruccion = conexion.createStatement();
             instruccion.executeUpdate(sql); 
         } catch (SQLException ex) {
             Mensajes.Error(null,"Error al anular la familia" + ex.toString());
         }
    }
   
     public void EliminarCatalogoProv ( int idProveedor,int idProductos ) {
       try {
           String  strcad = "DELETE FROM catalogoproveedor WHERE idProveedor="+idProveedor+" and idProductos="+
                   idProductos+"; ";     
           instruccion = conexion.createStatement();
           System.out.print(strcad);
           instruccion.executeUpdate(strcad);
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error al eliminar" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() );
         }
      }
       
        public void modificarClienteJuridico(int IdCliente,String NombreRaz) {
        try {
             instruccion = conexion.createStatement();
             String  strcad  = " UPDATE  cliente_juridico set RazonSocial ='" +NombreRaz+"' where idCliente="+IdCliente+";";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }

     public void modificarClienteNatural(int IdCliente,String NombreRaz, String apellidoP,String apellidoM, String DNI) {
     try {
             instruccion = conexion.createStatement();
             String  strcad  = "UPDATE cliente_natural set Nombres='" +NombreRaz+"' ,ApellidoP ='"+apellidoP+"',ApellidoM='" +apellidoM+"'"
                     + ",DNI='"+DNI+"' where idCliente="+IdCliente+";";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
  
     public void modificarCliente(int IdCliente, String ruc, String direccion, String telefono, String e_mail, String celular) {
       try {
             instruccion = conexion.createStatement();
             String  strcad  = "UPDATE cliente set Ruc='" +ruc+ "',Direccion ='" +direccion+ "',Telefono=" +telefono+ ","
                     + "E_mail=" +e_mail+",Celular="+celular+" where idCliente="+IdCliente+";";
             System.out.println(strcad );
             instruccion.executeUpdate(strcad); 
        } catch (SQLException ex) {
           Mensajes.Error(null,"Error Insersion SQL: \n" + ex.getLocalizedMessage()+"\n"+ex.getSQLState() ); 
        }     
    }
     
    //Termina la conexion a la base de datos
    public void CerrarConexion() {
        try {
            conexion.close();
            System.out.println("La conexion a la  base de datos " + "dsnEmpresa" + " a terminado");
        } catch (SQLException ex) {
            Mensajes.Error(null,"Error: No se desconectó de la base de datos..." + ex.toString());
        }
    }
 
 
}
