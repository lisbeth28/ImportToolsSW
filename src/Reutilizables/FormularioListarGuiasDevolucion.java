 package Reutilizables;

import FormulariosMantenimiento.Formulario_GenerarNotaCredito;
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import panFondos.FondoBusqueda_2;
 

public class FormularioListarGuiasDevolucion extends javax.swing.JFrame {
 
     
    private String consultaSQL;
    DefaultTableModel Modelo; 
    String [] Titulo={"Id "," Guia D devolución "," Factura","Tipo D cliente","Ruc","Fecha de Emision","Empleado"};
    String [][] datos={};
    private String TipoCliente="Natural";
    
    public FormularioListarGuiasDevolucion( ) { // Buscar para Orden de compra
         initComponents();
         cargarImagen();  
         configBasicas();   
         
         buttonGroup1.add(jcheckTodosfecha);
         buttonGroup1.add(jcheckSerieNum);
         buttonGroup1.add( jchecktodosCliente);
         
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
        jToolBar1 = new javax.swing.JToolBar();
        btnDato_Cliente1 = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabOrdenCompra = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Guia de Devolucion");

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
        jcheckSerieNum.setText(" Numero");
        jcheckSerieNum.setOpaque(false);

        jchecktodosCliente.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchecktodosCliente.setSelected(true);
        jchecktodosCliente.setText(" Todos por Cliente");
        jchecktodosCliente.setToolTipText("Ingresar Ruc");
        jchecktodosCliente.setOpaque(false);

        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setOpaque(false);

        btnDato_Cliente1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnDato_Cliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/icon_incorrect.png"))); // NOI18N
        btnDato_Cliente1.setToolTipText("Salir");
        btnDato_Cliente1.setOpaque(false);
        btnDato_Cliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDato_Cliente1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDato_Cliente1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jchecktodosCliente)
                            .addComponent(jcheckSerieNum)
                            .addComponent(jcheckTodosfecha))
                        .addGap(379, 379, 379))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar3.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);

        jLabel1.setText("   ");
        jToolBar3.add(jLabel1);

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel7.setText("LISTA DE GUIAS DE DEVOLUCION ");
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

        jButton1.setText("GENERAR GUIA ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDato_Cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDato_Cliente1ActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnDato_Cliente1ActionPerformed

    private void txtDatoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBuscarActionPerformed
      limpiarTabla() ;
        ValidacionBusqueda();
    }//GEN-LAST:event_txtDatoBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          int index=jtabOrdenCompra.getSelectedRow();
          String  CodigoConsultar= String.valueOf(jtabOrdenCompra.getValueAt(index, 0));TipoCliente="Natural";
          TipoCliente= String.valueOf(jtabOrdenCompra.getValueAt(index, 4));
          int IdTipoCliente =2;
          if(!"Natural".equals(TipoCliente)){ IdTipoCliente =2; }
          Formulario_GenerarNotaCredito notaCredito = new Formulario_GenerarNotaCredito (CodigoConsultar,IdTipoCliente  );
          notaCredito.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDato_Cliente1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
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
                        consultaSQL="SELECT gd.idGuiaDevolucion,gd.Numero,concat(f.Serie,' - ',f.Numero)as factura,tc.Tipo,c.Ruc,gd.FechaEmision, "
                                + "concat(e.ApellidoPaterno,' ',e.ApellidoMaterno,' ',e.Nombre) as empl FROM  guia_devolucion gd "
                                + "inner join empleado e using(idEmpleado) inner join cliente c using(idCliente) "
                                + "inner join tipo_cliente tc using(idTipocliente) inner join factura f using(idFactura) "
                                + "where gd.idEstado<>2 and Numero like '%"+DatoBuscar+"%';"; 
                         EjecutarConsulta(consultaSQL); 
                        break;   } 
               
                   case (2):    { // fecha 
                        consultaSQL="SELECT gd.idGuiaDevolucion,gd.Numero,concat(f.Serie,' - ',f.Numero)as factura,tc.Tipo,c.Ruc,gd.FechaEmision, "
                                + "concat(e.ApellidoPaterno,' ',e.ApellidoMaterno,' ',e.Nombre) as empl FROM  guia_devolucion gd "
                                + "inner join empleado e using(idEmpleado) inner join cliente c using(idCliente) "
                                + "inner join tipo_cliente tc using(idTipocliente) inner join factura f using(idFactura) "
                                + "where gd.idEstado<>2  order by  gd.FechaEmision ;"; 
                          EjecutarConsulta(consultaSQL); 
                        break;   } 
                   
                   case (3):    { // todos
                        consultaSQL="SELECT gd.idGuiaDevolucion,gd.Numero,concat(f.Serie,' - ',f.Numero)as factura,tc.Tipo,"
                                + "c.Ruc,gd.FechaEmision, "
                                + "concat(e.ApellidoPaterno,' ',e.ApellidoMaterno,' ',e.Nombre) as empl FROM  guia_devolucion gd "
                                + "inner join empleado e using(idEmpleado) inner join cliente c using(idCliente) "
                                + "inner join tipo_cliente tc using(idTipocliente) inner join factura f using(idFactura) "
                                + "where gd.idEstado<>2 and c.Ruc like '%"+DatoBuscar+"%';"; 
                          EjecutarConsulta(consultaSQL); 
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
                 { String idGuiaDevolucion = rs.getString("idGuiaDevolucion");
                   String Numero = rs.getString("Numero"); 
                   
                   String factura = rs.getString("factura"); 
                   String Tipo= rs.getString ("Tipo");  
                   String Ruc= rs.getString ("Ruc"); 
                   String empl= rs.getString ("empl");
                    
                   String FechaEmision= rs.getString ("FechaEmision");
                    
                   encontrado=true; 
                   Object [] fila={ idGuiaDevolucion,"N° "+Numero,factura ,Tipo,Ruc,FechaEmision ,empl};
                   Modelo.addRow(fila);
                 
            }
                objmante.CerrarConexion();  
         if (encontrado!=true){
                Mensajes.Alarma(this,"No se encontro al Empleado Solicitado");  }
             
       }} catch (SQLException | NullPointerException e) {
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
