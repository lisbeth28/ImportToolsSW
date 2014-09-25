package Reutilizables;

import FormulariosMantenimiento.Formulario_GenerarGuiaEntrada;
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import panFondos.FondoBusqueda_2;
 

public class FormularioConsultarOrdenCompra extends javax.swing.JFrame {
 
     
    private String consultaSQL;
    DefaultTableModel Modelo;
    String [] Titulo={"Id ","Orden de Compra"," Proveedor ","Tipo de Compra","Fecha","Estado"};
    String [][] datos={};
    private String TipoCompra="Importadas";
    
    public FormularioConsultarOrdenCompra( ) { // Buscar para Orden de compra
         initComponents();
         cargarImagen  ();  
         configBasicas ();   
         
         buttonGroup1.add(jcheckfecha);
         buttonGroup1.add(jcheckId);
         buttonGroup1.add( jchecktodos);
         
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabOrdenCompra = new javax.swing.JTable();
        jcheckfecha = new javax.swing.JCheckBox();
        jcheckId = new javax.swing.JCheckBox();
        jchecktodos = new javax.swing.JCheckBox();
        jToolBar1 = new javax.swing.JToolBar();
        btnDato_Cliente1 = new javax.swing.JButton();
        txtDatoBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR ORDEN DE COMPRA");

        jLabel7.setBackground(new java.awt.Color(241, 241, 241));
        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel7.setText("  LISTAR ORDENES DE COMPRA SIN CANCELAR          ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/RepotTodos.gif"))); // NOI18N
        jButton1.setText("GENERAR GUIA ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jcheckfecha.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckfecha.setText(" Fecha");
        jcheckfecha.setOpaque(false);

        jcheckId.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckId.setText(" Id");
        jcheckId.setOpaque(false);

        jchecktodos.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchecktodos.setSelected(true);
        jchecktodos.setText(" Todos");
        jchecktodos.setToolTipText("");
        jchecktodos.setOpaque(false);

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

        txtDatoBuscar.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtDatoBuscar.setText(" ");
        txtDatoBuscar.setToolTipText("Enter para buscar ...");
        txtDatoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jcheckId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcheckfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchecktodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcheckId)
                        .addComponent(jcheckfecha)
                        .addComponent(jchecktodos)
                        .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDato_Cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDato_Cliente1ActionPerformed
     this.dispose();
    }//GEN-LAST:event_btnDato_Cliente1ActionPerformed

    private void txtDatoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBuscarActionPerformed
        limpiarTabla();
        ValidacionBusqueda();
    }//GEN-LAST:event_txtDatoBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          int index=jtabOrdenCompra.getSelectedRow();
          String  CodigoConsultar= String.valueOf(jtabOrdenCompra.getValueAt(index, 0));
          TipoCompra= String.valueOf(jtabOrdenCompra.getValueAt(index, 4));
          int IdTipoCompra=2;
          if(!"Importadas".equals(TipoCompra)){ IdTipoCompra=1; }
          Formulario_GenerarGuiaEntrada guiaEntrega = new Formulario_GenerarGuiaEntrada(CodigoConsultar,IdTipoCompra);
         this.dispose(); guiaEntrega.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDato_Cliente1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JCheckBox jcheckId;
    private javax.swing.JCheckBox jcheckfecha;
    private javax.swing.JCheckBox jchecktodos;
    private javax.swing.JTable jtabOrdenCompra;
    private javax.swing.JTextField txtDatoBuscar;
    // End of variables declaration//GEN-END:variables

     private void cargarImagen() { 
           FondoBusqueda_2 F= new FondoBusqueda_2();
           F.setSize(690,490); // 550, 359 
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
          
         if(jcheckId.isSelected()){  tipodDato =1;  }
         else if(jcheckfecha.isSelected()){ tipodDato=2;  }  
         else if(jchecktodos.isSelected()){ tipodDato=3;  } 
         
         consultaSQL=""; 
           switch(tipodDato)
              {   case (1):    { // Id
                        consultaSQL="SELECT  oc.idOrdenCompra, concat('N°',oc.NumeroOC )as orden,p.RazonSocial,p.idTipoProveedorCompras, "
                                + "oc.FechaEmision,e.TipoEstado as estodOc FROM orden_de_compra oc inner join estado e using(idEstado) "
                                + "inner join proveedor p using(idProveedor) where oc.idEstado=4 and oc.idOrdenCompra='"+DatoBuscar+"';"; 
                          EjecutarConsulta(consultaSQL); 
                        break;   } 
               
                   case (2):    { // fecha 
                        consultaSQL="SELECT  oc.idOrdenCompra, concat('N°',oc.NumeroOC )as orden,p.RazonSocial,p.idTipoProveedorCompras, "
                                + "oc.FechaEmision,e.TipoEstado as estodOc FROM orden_de_compra oc inner join estado e using(idEstado) "
                                + "inner join proveedor p using(idProveedor) where oc.idEstado=4 and oc.FechaEmision='"+DatoBuscar+"';"; 
                          EjecutarConsulta(consultaSQL); 
                        break;   } 
                   
                   case (3):    { // todos
                        consultaSQL="SELECT  oc.idOrdenCompra, concat('N°',oc.NumeroOC )as orden,p.RazonSocial,p.idTipoProveedorCompras, "
                                + "oc.FechaEmision,e.TipoEstado as estodOc FROM orden_de_compra oc inner join estado e using(idEstado) "
                                + "inner join proveedor p using(idProveedor) where oc.idEstado=4 ";
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
                 { String codigo = rs.getString("idOrdenCompra");
                   String orden = rs.getString("orden"); 
                   
                   String RazonSocial = rs.getString("RazonSocial"); 
                   int idTipoProveedorCompras= rs.getInt("idTipoProveedorCompras");
                   
                   if(idTipoProveedorCompras==1){TipoCompra="Local";}
                   else { TipoCompra="Importadas"; }
                   
                   String  FechaEmision= rs.getString("FechaEmision"); 
                   String estodOc= rs.getString("estodOc"); 
                   encontrado=true;
                   limpiarTabla();
                   
                   Object [] fila={codigo,orden,RazonSocial,TipoCompra,FechaEmision,estodOc };
                   Modelo.addRow(fila);
                   
                }
            }
                objmante.CerrarConexion();  
         if (encontrado!=true){
                Mensajes.Alarma(this," No se encontro la Orden de Compra ");  }
             
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
