 package Reutilizables;

import FormulariosMantenimiento.Formulario_GenerarGuiaDevolucion;
import FormulariosMantenimiento.Formulario_GenerarGuiaRemision;
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import panFondos.FondoBusqueda_2;
 

public class FormularioListarFacturas extends javax.swing.JFrame {
 
     
    private String consultaSQL;
    DefaultTableModel Modelo; // codigo,orden,RazonSocial, FechaEmision, Ruc,empl,Total,FechaCancelada };
    String [] Titulo={"Id "," Factura "," Condicion D venta ","Fecha D emision","Cliente","Ruc","Empleado","Total","Cancelado el :"};
    String [][] datos={};
    private String TipoCliente="Natural";
    int TipoGuia=0;
            
    public FormularioListarFacturas( int tipo) { // Buscar para Orden de compra
         initComponents();
         cargarImagen();  
         configBasicas();   
         
         buttonGroup1.add(jcheckTodosfecha);
         buttonGroup1.add(jcheckSerieNum);
         buttonGroup1.add( jchecktodosCliente);
         TipoGuia=tipo;
         
         
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jcheckTodosfecha = new javax.swing.JCheckBox();
        txtDatoBuscar = new javax.swing.JTextField();
        jcheckSerieNum = new javax.swing.JCheckBox();
        jchecktodosCliente = new javax.swing.JCheckBox();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabOrdenCompra = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR FACTURA");

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jcheckTodosfecha.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckTodosfecha.setText(" Todos Ordenados por Fecha");
        jcheckTodosfecha.setToolTipText("Intro para empesar la busqueda");
        jcheckTodosfecha.setOpaque(false);

        txtDatoBuscar.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtDatoBuscar.setText(" ");
        txtDatoBuscar.setToolTipText("Enter para buscar ...");
        txtDatoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoBuscarActionPerformed(evt);
            }
        });

        jcheckSerieNum.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckSerieNum.setText(" Serie- Num");
        jcheckSerieNum.setOpaque(false);

        jchecktodosCliente.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchecktodosCliente.setSelected(true);
        jchecktodosCliente.setText(" Todos por Cliente");
        jchecktodosCliente.setToolTipText("Ingresar Ruc");
        jchecktodosCliente.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchecktodosCliente)
                    .addComponent(jcheckSerieNum)
                    .addComponent(jcheckTodosfecha))
                .addGap(379, 379, 379))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jcheckSerieNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcheckTodosfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jchecktodosCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jToolBar3.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);

        jLabel1.setText("   ");
        jToolBar3.add(jLabel1);

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel7.setText("  LISTA DE FACTURAS       ");
        jToolBar3.add(jLabel7);

        jtabOrdenCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Codigo Referente", "Razon Social", "Tipo de Proveedor"
            }
        ));
        jScrollPane1.setViewportView(jtabOrdenCompra);

        jButton1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/adicionar.png"))); // NOI18N
        jButton1.setText("GENERAR GUIA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBuscarActionPerformed
        limpiarTabla() ;
        ValidacionBusqueda();
    }//GEN-LAST:event_txtDatoBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
          int index=jtabOrdenCompra.getSelectedRow();
          String  CodigoConsultar= String.valueOf(jtabOrdenCompra.getValueAt(index, 0)) ;
          
          TipoCliente="Natural";
          TipoCliente= String.valueOf(jtabOrdenCompra.getValueAt(index, 4));
          int IdTipoCliente =2;
         
          if(TipoGuia==1){
           if(!"Natural".equals(TipoCliente)){ IdTipoCliente =2; }
           Formulario_GenerarGuiaDevolucion guiaDev = new Formulario_GenerarGuiaDevolucion(CodigoConsultar,IdTipoCliente  );
           guiaDev.setVisible(true);
           this.dispose();
        } else if (TipoGuia==2){
           Formulario_GenerarGuiaRemision generarGR= new Formulario_GenerarGuiaRemision(CodigoConsultar);
           generarGR.setVisible(true); 
           this.dispose();
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JCheckBox jcheckSerieNum;
    private javax.swing.JCheckBox jcheckTodosfecha;
    private javax.swing.JCheckBox jchecktodosCliente;
    private javax.swing.JTable jtabOrdenCompra;
    private javax.swing.JTextField txtDatoBuscar;
    // End of variables declaration//GEN-END:variables

     private void cargarImagen() { 
           FondoBusqueda_2 F= new FondoBusqueda_2();
           F.setSize(670,390);  
           this.add(F,BorderLayout.CENTER);
           this.pack();
           this.setLocationRelativeTo(null); 
        }
  
   private void ValidacionBusqueda() {
        buscarProveedor();
        txtDatoBuscar.setText("");
        txtDatoBuscar.requestFocus();
    }
    
    private void buscarProveedor() {
         String DatoBuscar=txtDatoBuscar.getText();
         int tipodDato=0;
          
         if(jcheckSerieNum.isSelected()){  tipodDato =1;  }
         else if(jcheckTodosfecha.isSelected()){ tipodDato=2;  }  
         else if(jchecktodosCliente.isSelected()){ tipodDato=3;  } 
         
         consultaSQL=""; 
           switch(tipodDato)
              {   case (1):    { // Serie y Numero
                        consultaSQL="SELECT f.idFactura,concat(f.Serie,'-',f.Numero) as Factura,CV.CondicionDeVenta ,f.FechaEmision,tc.Tipo,"
                                + "c.Ruc,concat(ApellidoPaterno,' ',ApellidoMaterno,' ',Nombre)as empl,f.Total,FechaCancelada "
                                + "FROM  factura f inner join cliente c using(idCliente) "
                                + "join  tipo_cliente tc using( idTipocliente) "
                                + "inner join condicion_de_venta CV using(idCondicionVenta) "
                                + "inner join empleado using(idEmpleado) "
                                + "where f.idEstado <>2 and concat(f.Serie,'-',f.Numero) like '%"+DatoBuscar+"%';"; 
                          System.out.print(consultaSQL);  EjecutarConsulta(consultaSQL); 
                        break;   } 
               
                   case (2):    { // fecha 
                        consultaSQL="SELECT f.idFactura,concat(f.Serie,'-',f.Numero) as Factura,CV.CondicionDeVenta ,f.FechaEmision,tc.Tipo,"
                                + "c.Ruc,concat(ApellidoPaterno,' ',ApellidoMaterno,' ',Nombre)as empl,f.Total,FechaCancelada "
                                + "FROM  factura f inner join cliente c using(idCliente) "
                                + "join  tipo_cliente tc using( idTipocliente) "
                                + "inner join condicion_de_venta CV using(idCondicionVenta) "
                                + "inner join empleado using(idEmpleado) "
                                + "where f.idEstado <>2 order by  f.FechaEmision ;"; 
                        System.out.print(consultaSQL);   EjecutarConsulta(consultaSQL); 
                        break;   } 
                   
                   case (3):    { // todos
                        consultaSQL="SELECT f.idFactura,concat(f.Serie,'-',f.Numero) as Factura,CV.CondicionDeVenta ,f.FechaEmision,tc.Tipo,"
                                + "c.Ruc,concat(ApellidoPaterno,' ',ApellidoMaterno,' ',Nombre)as empl,f.Total,FechaCancelada "
                                + "FROM  factura f inner join cliente c using(idCliente) "
                                + "join  tipo_cliente tc using( idTipocliente) "
                                + "inner join condicion_de_venta CV using(idCondicionVenta) "
                                + "inner join empleado using(idEmpleado) "
                                + "where f.idEstado <>2 and Ruc like '%"+DatoBuscar+"%';"; 
                         System.out.print(consultaSQL);  EjecutarConsulta(consultaSQL); 
                        break;   } 
             }
        
    }
 

   private void EjecutarConsulta(String consultaSQL) {
      
       MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         try {
             PreparedStatement ps = objmante.conexion.prepareStatement(consultaSQL);
            boolean encontrado;
            try (ResultSet rs = ps.executeQuery()) {
                encontrado = false;
                while (rs.next()) 
                 { String codigo = rs.getString("idFactura");
                   String orden = rs.getString("Factura"); 
                   
                   String condicion = rs.getString("CondicionDeVenta"); 
                   String FechaEmision= rs.getString ("FechaEmision");
                   String tipoCl = rs.getString("Tipo"); 
                   String Ruc= rs.getString ("Ruc");
                   String empl= rs.getString ("empl");
                   
                   String Total= rs.getString ("Total");
                   String FechaCancelada= rs.getString ("FechaCancelada");
                    
                   encontrado=true; 
                   Object [] fila={codigo,orden,condicion, FechaEmision,tipoCl, Ruc,empl,Total,FechaCancelada };
                   Modelo.addRow(fila);
                }
            }
                objmante.CerrarConexion();  
         if (encontrado!=true){
                Mensajes.Alarma(this,"No se encontro facturas");  }
             
       }catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos del empleado : "+e);
       }
    }

  private void limpiarTabla() {
        while(jtabOrdenCompra.getRowCount()>0){
            Modelo.removeRow(0);
        }
    }

     private void configBasicas() {
       jtabOrdenCompra.setGridColor(Color.WHITE); 
       jtabOrdenCompra.setForeground(Color.BLACK);
       jtabOrdenCompra.setSelectionBackground(Color.BLACK); 
       jtabOrdenCompra.setSelectionForeground(Color.LIGHT_GRAY); 
       jtabOrdenCompra.setRowHeight(22);// Ancho 
       jtabOrdenCompra.setBackground(Color.LIGHT_GRAY);
       jtabOrdenCompra.setFont(new java.awt.Font("Nyala", 0, 14));
       Modelo= new  DefaultTableModel(datos, Titulo);
       jtabOrdenCompra.setModel(Modelo);
       
       txtDatoBuscar.setText("");
       txtDatoBuscar.requestFocus();
    }
     
    
 
}
