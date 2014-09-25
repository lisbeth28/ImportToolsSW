package FormulariosMantenimiento;


/***************************************************************
NOMBRE:
FECHA Y CREADOR:
DESCRIPCION:PERMITE MANTENER LOS DATOS DE UNA ORDEN DE COMPRA
DETALLE:
MODIFICACION
***************************************************************/
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class FormularioMantenimientoOrdCompra extends javax.swing.JFrame {
    
    
    DefaultTableModel Modelo;
    String [] Titulo={"Id","Fecha de Emision","Estado","Proveedor","Tipo de Compra"};
    String [][] datos={};
    private int tipoCompra=1;
    
    public FormularioMantenimientoOrdCompra() {
        initComponents(); 
        configurarTabla(); 
        this.setLocationRelativeTo(null); 
        
        btngpTipoCompras.add(jrbtnLocal); 
        btngpTipoCompras.add(jrdbtnImport); 
        
        btngpCriteriosBusqda.add(jcheckId); 
        btngpCriteriosBusqda.add(jcheckFecha); 
        
        jrbtnLocal.setSelected(true); 
        actualizarTipoCompra();
        ListarCompra();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngpTipoCompras = new javax.swing.ButtonGroup();
        btngpCriteriosBusqda = new javax.swing.ButtonGroup();
        jpnlMenuAcciones = new javax.swing.JPanel();
        jpnlBotonesAccion = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jpnlBuscarOC = new javax.swing.JPanel();
        jcheckFecha = new javax.swing.JCheckBox();
        jcheckId = new javax.swing.JCheckBox();
        txtRazon_Apellidos = new javax.swing.JTextField();
        jpnlTipoCompras = new javax.swing.JPanel();
        jrdbtnImport = new javax.swing.JRadioButton();
        jrbtnLocal = new javax.swing.JRadioButton();
        jToolBar5 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jtlbrBuscarOC = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtlbrAcciones = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpnlTablaOC = new javax.swing.JPanel();
        jscrlpnTablaListaOC = new javax.swing.JScrollPane();
        jtblListaOrdenesCompras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("            MANTENER ORDEN DE COMPRA");

        jpnlMenuAcciones.setBackground(new java.awt.Color(244, 244, 244));

        jpnlBotonesAccion.setBackground(new java.awt.Color(255, 255, 255));

        btnNuevo.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/nuevaOrden.png"))); // NOI18N
        btnNuevo.setText(" Nueva Orden de Compra ");
        btnNuevo.setToolTipText(" Nuevo ");
        btnNuevo.setBorder(null);
        btnNuevo.setOpaque(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/trash.gif"))); // NOI18N
        btnEliminar.setText(" Eliminar Orden de Compra ");
        btnEliminar.setToolTipText(" Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setOpaque(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlBotonesAccionLayout = new javax.swing.GroupLayout(jpnlBotonesAccion);
        jpnlBotonesAccion.setLayout(jpnlBotonesAccionLayout);
        jpnlBotonesAccionLayout.setHorizontalGroup(
            jpnlBotonesAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBotonesAccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlBotonesAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnlBotonesAccionLayout.setVerticalGroup(
            jpnlBotonesAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBotonesAccionLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );

        jpnlBuscarOC.setBackground(new java.awt.Color(255, 255, 255));

        jcheckFecha.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckFecha.setText(" Fecha ");
        jcheckFecha.setOpaque(false);

        jcheckId.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckId.setSelected(true);
        jcheckId.setText(" Id ");
        jcheckId.setToolTipText("Razon Social /Apellidos y Nombres");
        jcheckId.setOpaque(false);

        txtRazon_Apellidos.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        txtRazon_Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazon_ApellidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlBuscarOCLayout = new javax.swing.GroupLayout(jpnlBuscarOC);
        jpnlBuscarOC.setLayout(jpnlBuscarOCLayout);
        jpnlBuscarOCLayout.setHorizontalGroup(
            jpnlBuscarOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBuscarOCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlBuscarOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcheckFecha)
                    .addComponent(jcheckId)
                    .addComponent(txtRazon_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlBuscarOCLayout.setVerticalGroup(
            jpnlBuscarOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBuscarOCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcheckId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcheckFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(txtRazon_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnlTipoCompras.setBackground(new java.awt.Color(255, 255, 255));

        jrdbtnImport.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jrdbtnImport.setText(" Compras Importadas");
        jrdbtnImport.setOpaque(false);
        jrdbtnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdbtnImportActionPerformed(evt);
            }
        });

        jrbtnLocal.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jrbtnLocal.setSelected(true);
        jrbtnLocal.setText(" Compras Locales");
        jrbtnLocal.setOpaque(false);
        jrbtnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnLocalActionPerformed(evt);
            }
        });

        jToolBar5.setBorder(null);
        jToolBar5.setFloatable(false);
        jToolBar5.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/carritos.png"))); // NOI18N
        jLabel2.setText("  TIPO  DE COMPRA     ");
        jToolBar5.add(jLabel2);

        javax.swing.GroupLayout jpnlTipoComprasLayout = new javax.swing.GroupLayout(jpnlTipoCompras);
        jpnlTipoCompras.setLayout(jpnlTipoComprasLayout);
        jpnlTipoComprasLayout.setHorizontalGroup(
            jpnlTipoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTipoComprasLayout.createSequentialGroup()
                .addGroup(jpnlTipoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlTipoComprasLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jpnlTipoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrdbtnImport)
                            .addComponent(jrbtnLocal)))
                    .addGroup(jpnlTipoComprasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlTipoComprasLayout.setVerticalGroup(
            jpnlTipoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlTipoComprasLayout.createSequentialGroup()
                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbtnLocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrdbtnImport)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jtlbrBuscarOC.setBackground(new java.awt.Color(231, 231, 231));
        jtlbrBuscarOC.setBorder(null);
        jtlbrBuscarOC.setFloatable(false);

        jLabel1.setText("   ");
        jtlbrBuscarOC.add(jLabel1);

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel7.setText(" BUSCAR ORDEN DE COMPRA ");
        jtlbrBuscarOC.add(jLabel7);

        jtlbrAcciones.setBackground(new java.awt.Color(231, 231, 231));
        jtlbrAcciones.setBorder(null);
        jtlbrAcciones.setFloatable(false);

        jLabel3.setText("   ");
        jtlbrAcciones.add(jLabel3);

        jLabel8.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/acccioness.png"))); // NOI18N
        jLabel8.setText(" ACCIONES              ");
        jtlbrAcciones.add(jLabel8);

        javax.swing.GroupLayout jpnlMenuAccionesLayout = new javax.swing.GroupLayout(jpnlMenuAcciones);
        jpnlMenuAcciones.setLayout(jpnlMenuAccionesLayout);
        jpnlMenuAccionesLayout.setHorizontalGroup(
            jpnlMenuAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMenuAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlMenuAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtlbrAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlBotonesAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlBuscarOC, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jtlbrBuscarOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlTipoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jpnlMenuAccionesLayout.setVerticalGroup(
            jpnlMenuAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMenuAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlTipoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtlbrBuscarOC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlBuscarOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtlbrAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlBotonesAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpnlTablaOC.setBackground(new java.awt.Color(255, 255, 255));

        jtblListaOrdenesCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Fecha de Emision", "Proveedor", "Estado", "Tipo de Compra"
            }
        ));
        jscrlpnTablaListaOC.setViewportView(jtblListaOrdenesCompras);

        javax.swing.GroupLayout jpnlTablaOCLayout = new javax.swing.GroupLayout(jpnlTablaOC);
        jpnlTablaOC.setLayout(jpnlTablaOCLayout);
        jpnlTablaOCLayout.setHorizontalGroup(
            jpnlTablaOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTablaOCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscrlpnTablaListaOC, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnlTablaOCLayout.setVerticalGroup(
            jpnlTablaOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTablaOCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscrlpnTablaListaOC)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlMenuAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlTablaOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnlTablaOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jpnlMenuAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        actualizarTipoCompra();
        Formulario_OrdenCompra orden = new Formulario_OrdenCompra ( );
        orden.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jrdbtnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdbtnImportActionPerformed
        if (jrdbtnImport.isSelected()) {
            limpiarTabla();
            actualizarTipoCompra();
            ListarCompra();
        }
    }//GEN-LAST:event_jrdbtnImportActionPerformed

    private void jrbtnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnLocalActionPerformed
        if (jrbtnLocal.isSelected()) {
            limpiarTabla();
            actualizarTipoCompra();
            ListarCompra();
        }
    }//GEN-LAST:event_jrbtnLocalActionPerformed

    private void txtRazon_ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazon_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazon_ApellidosActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup btngpCriteriosBusqda;
    private javax.swing.ButtonGroup btngpTipoCompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JCheckBox jcheckFecha;
    private javax.swing.JCheckBox jcheckId;
    private javax.swing.JPanel jpnlBotonesAccion;
    private javax.swing.JPanel jpnlBuscarOC;
    private javax.swing.JPanel jpnlMenuAcciones;
    private javax.swing.JPanel jpnlTablaOC;
    private javax.swing.JPanel jpnlTipoCompras;
    private javax.swing.JRadioButton jrbtnLocal;
    private javax.swing.JRadioButton jrdbtnImport;
    private javax.swing.JScrollPane jscrlpnTablaListaOC;
    private javax.swing.JTable jtblListaOrdenesCompras;
    private javax.swing.JToolBar jtlbrAcciones;
    private javax.swing.JToolBar jtlbrBuscarOC;
    private javax.swing.JTextField txtRazon_Apellidos;
    // End of variables declaration//GEN-END:variables
 
    private void configurarTabla() {
        Modelo= new  DefaultTableModel(datos, Titulo);
        jtblListaOrdenesCompras.setModel(Modelo);
        jtblListaOrdenesCompras.setFont(new java.awt.Font("Nyala", 0, 14));
    }
    
     private void actualizarTipoCompra() {
        if(jrbtnLocal.isSelected()){  tipoCompra=1;  }
         else if(jrdbtnImport.isSelected()){  tipoCompra=2;  }
    }

    private void limpiarTabla() {
           while(jtblListaOrdenesCompras.getRowCount()>0){
            Modelo.removeRow(0);
        }
    }
 

    private void ListarCompra() {
        String sql="";
        if(tipoCompra==1){
            sql = "SELECT o.idOrdenCompra,o.FechaEmision,e.TipoEstado,p.RazonSocial "
                    + "FROM  orden_de_compra o INNER JOIN estado e using(idEstado)   "
                     + "INNER JOIN  proveedor p using(idProveedor)  where o.idEstado<> 2 and p.idTipoProveedorCompras=1 ;";
        }else { 
            sql = "SELECT o.idOrdenCompra,o.FechaEmision,e.TipoEstado,p.RazonSocial "
                    + "FROM  orden_de_compra o INNER JOIN estado e using(idEstado)   "
                     + "INNER JOIN  proveedor p using(idProveedor)  where o.idEstado<> 2 and p.idTipoProveedorCompras=2;";
        }
          try {
             MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
             String IdOrdenC,FechadeEmision,Estado,Proveedor ; 
             
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   IdOrdenC= rs.getString("idOrdenCompra");
                    FechadeEmision= rs.getString("FechaEmision");
                    Estado= rs.getString("TipoEstado");
                    Proveedor= rs.getString("RazonSocial"); 
                    String TipoComp="Local";
                    if(tipoCompra==2){  TipoComp="Importada";}
                    
                    Object [] fila={ IdOrdenC,FechadeEmision,Estado,Proveedor,TipoComp };
                    Modelo.addRow(fila);
                }
            }
            objmante.CerrarConexion();
        } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de las Facturas : "+e );
        }
     }
}
