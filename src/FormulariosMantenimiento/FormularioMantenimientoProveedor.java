package FormulariosMantenimiento;
 
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
 
public class FormularioMantenimientoProveedor extends javax.swing.JFrame {
    
    DefaultTableModel Modelo;
    String [] Titulo={"Id"," Razon Social","RUC","Telefono"," Direccion","E_mail"};
    String [][] datos={};
    
    private int CodigoConsultar,tipoProv; 
    private String consultaSQL;
     
    public FormularioMantenimientoProveedor() {
        initComponents();
        configTabla();   this.setLocationRelativeTo(null); 
        actualizarTipoProveedor();
        ListarProveedores();
        rbtnLocal.setSelected(true); 
        btnGroup1.add(rbtnLocal);
        btnGroup1.add(rbtnExtranjero); 
        
        buttonGroup1.add(jchekboxId);
        buttonGroup1.add(jchekboxRuc); 
        buttonGroup1.add(jchekboxRazonSoc); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup1 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jchekboxRazonSoc = new javax.swing.JCheckBox();
        jchekboxRuc = new javax.swing.JCheckBox();
        txtDatoBuscar = new javax.swing.JTextField();
        jchekboxId = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        rbtnExtranjero = new javax.swing.JRadioButton();
        rbtnLocal = new javax.swing.JRadioButton();
        jToolBar5 = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel7 = new javax.swing.JLabel();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabProveedores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MANTENER PROVEDOR");

        jPanel4.setBackground(new java.awt.Color(244, 244, 244));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Cliente.png"))); // NOI18N
        jButton7.setText(" Nuevo Proveedor");
        jButton7.setBorder(null);
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/RepotTodos.gif"))); // NOI18N
        jButton4.setText(" Modificar Proveedor");
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/trash.gif"))); // NOI18N
        jButton5.setText(" Eliminar Proveedor");
        jButton5.setBorder(null);
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/restaurar_2.png"))); // NOI18N
        jButton8.setText("Catalogo Proveedor");
        jButton8.setBorder(null);
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jchekboxRazonSoc.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchekboxRazonSoc.setText(" Razon Social ");
        jchekboxRazonSoc.setOpaque(false);

        jchekboxRuc.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchekboxRuc.setText(" Ruc");
        jchekboxRuc.setToolTipText("Razon Social /Apellidos y Nombres");
        jchekboxRuc.setOpaque(false);

        txtDatoBuscar.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        txtDatoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoBuscarActionPerformed(evt);
            }
        });

        jchekboxId.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchekboxId.setSelected(true);
        jchekboxId.setText(" Id");
        jchekboxId.setToolTipText("Razon Social /Apellidos y Nombres");
        jchekboxId.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDatoBuscar)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jchekboxRazonSoc)
                            .addComponent(jchekboxRuc)
                            .addComponent(jchekboxId))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jchekboxId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchekboxRuc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchekboxRazonSoc)
                .addGap(7, 7, 7)
                .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        rbtnExtranjero.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        rbtnExtranjero.setText(" Proveedor Extranjero");
        rbtnExtranjero.setOpaque(false);
        rbtnExtranjero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnExtranjeroActionPerformed(evt);
            }
        });

        rbtnLocal.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        rbtnLocal.setSelected(true);
        rbtnLocal.setText(" Proveedor Local");
        rbtnLocal.setOpaque(false);
        rbtnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLocalActionPerformed(evt);
            }
        });

        jToolBar5.setBorder(null);
        jToolBar5.setFloatable(false);
        jToolBar5.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Cliente.png"))); // NOI18N
        jLabel3.setText("  TIPO  DE  PROVEEDOR     ");
        jToolBar5.add(jLabel3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnExtranjero)
                            .addComponent(rbtnLocal)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnLocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnExtranjero)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jToolBar3.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel7.setText(" BUSCAR  PROVEEDOR  ");
        jToolBar3.add(jLabel7);

        jToolBar4.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar4.setBorder(null);
        jToolBar4.setFloatable(false);

        jLabel8.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/acccioness.png"))); // NOI18N
        jLabel8.setText(" ACCIONES              ");
        jToolBar4.add(jLabel8);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jtabProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Empleado", "Cargo", "Direccion", "Telefono", "Celular", "Sueldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtabProveedores);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        EliminarProvedor();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       modificarProveedor();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      String TipoProveedor;
        if(rbtnLocal.isSelected()){ 
            TipoProveedor=rbtnLocal.getText();
            Formulario_Proveedor PNuevo = new Formulario_Proveedor(TipoProveedor);
            PNuevo.setVisible(true); 
            this.setVisible(false);
            
       }else  if(rbtnExtranjero.isSelected()){
            TipoProveedor=rbtnExtranjero.getText();
            Formulario_Proveedor PNuevo = new Formulario_Proveedor(TipoProveedor);
            PNuevo.setVisible(true); 
            this.setVisible(false);
       }else {Mensajes.Alarma(this, "Tipo de Proveedor Invalido");
        }
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtDatoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBuscarActionPerformed
       int tipodDato=0; actualizarTipoProveedor() ;
        if(jchekboxId.isSelected()){tipodDato=1;} 
        else if(jchekboxRuc.isSelected()){tipodDato=2;} 
        else if(jchekboxRazonSoc.isSelected()){tipodDato=3;} 
        buscarProveedor(tipodDato);
        txtDatoBuscar.setText("");
        txtDatoBuscar.requestFocus();
    }//GEN-LAST:event_txtDatoBuscarActionPerformed

    private void rbtnExtranjeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnExtranjeroActionPerformed
        if (rbtnExtranjero.isSelected()) {
            limpiarTabla();
            actualizarTipoProveedor();
            ListarProveedores();
        }
    }//GEN-LAST:event_rbtnExtranjeroActionPerformed

    private void rbtnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLocalActionPerformed
        if (rbtnLocal.isSelected()) {
            limpiarTabla();
            actualizarTipoProveedor();
            ListarProveedores();
        }
    }//GEN-LAST:event_rbtnLocalActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      int index=jtabProveedores.getSelectedRow();
       if(index>=0){
         int idProvedor= Integer.parseInt(String.valueOf(jtabProveedores.getValueAt(index, 0)).trim()); 
         Formulario_CatalogoProveedor catalogo= new Formulario_CatalogoProveedor(idProvedor);
         this.dispose();  catalogo.setVisible(true);
       }else {Mensajes.Alarma(this,"Seleccione un Proveedor de la tabla ");
       }
       
    }//GEN-LAST:event_jButton8ActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JCheckBox jchekboxId;
    private javax.swing.JCheckBox jchekboxRazonSoc;
    private javax.swing.JCheckBox jchekboxRuc;
    private javax.swing.JTable jtabProveedores;
    private javax.swing.JRadioButton rbtnExtranjero;
    private javax.swing.JRadioButton rbtnLocal;
    private javax.swing.JTextField txtDatoBuscar;
    // End of variables declaration//GEN-END:variables
  
 
 private void EliminarProvedor() {
        try {
            int index=jtabProveedores.getSelectedRow();
             if(index>=0){
                    CodigoConsultar= Integer.parseInt(String.valueOf(jtabProveedores.getValueAt(index, 0)).trim());   
                    String proveedor =(String)jtabProveedores.getValueAt(index, 1);
                    int rspt=Mensajes.confirmar(this, "Esta seguro de anular al PROVEEDOR ' "+proveedor+" '");
                    if(rspt == 0){
                        MantenimientoDatos eliminar= new MantenimientoDatos ();
                        eliminar.AnularPROVEDOR(CodigoConsultar);  
                        eliminarfila();
                        eliminar.CerrarConexion();
                   }
            }else { Mensajes.Alarma(this,"Seleccione un Proveedor de la tabla ");    }
       
        }catch(Exception e){ 
            Mensajes.Alarma(this,"No se pudo eliminar al proveedor : "+"\n"+e.getLocalizedMessage() );
        }
    }
  
    private void eliminarfila() {
        int filas=jtabProveedores.getSelectedRowCount();// obtiene numero de filas seleccionadas
	if (filas!=0)  {
		int fila;// una o mas filas seleccionadas
		do {
			fila=jtabProveedores.getSelectedRow();// obtiene fila seleccionada
                        if(fila != -1){
                        Modelo.removeRow(fila);
                    }
		} while (fila>=0); // mientras haya filas seleccionadas
	} 
    }
    
    
    private void configTabla() {
       jtabProveedores.setRowHeight(22);// Ancho 
       jtabProveedores.setFont(new java.awt.Font("Nyala", 0, 14));
       Modelo= new  DefaultTableModel(datos, Titulo);
       jtabProveedores.setModel(Modelo);
    }

    private void modificarProveedor() {
        try{
            int index=jtabProveedores.getSelectedRow();
            if(index>=0){
                CodigoConsultar= Integer.parseInt(String.valueOf(jtabProveedores.getValueAt(index, 0)).trim());  
                Formulario_Proveedor F1= new Formulario_Proveedor(CodigoConsultar);
                F1.setVisible(true);
                this.setVisible(false);
            } else{ Mensajes.Alarma(this,"Seleccione un Proveedor de la tabla ");}
            
        } catch(Exception e){
            Mensajes.Error(this, "Error : "+e);
        }
    }

    private void limpiarTabla() {
        while(jtabProveedores.getRowCount()>0){
            Modelo.removeRow(0);
        }
    }

    private void buscarProveedor(int tipodDato) {
        
         String DatoBuscar=txtDatoBuscar.getText(); 
         consultaSQL=""; 
           switch(tipodDato)
              {   case (1):    { // Id
                        consultaSQL="SELECT idProveedor, RazonSocial, Ruc,Direccion ,Telefono ,E_mail "
                                + " from proveedor Where idProveedor="+DatoBuscar+" and idTipoProveedorCompras="+tipoProv+";";
                        EjecutarConsulta(consultaSQL); 
                        break;   } 
                   case (2):    { //Ruc
                       consultaSQL="SELECT idProveedor, RazonSocial, Ruc,Direccion ,Telefono ,E_mail "
                               + " from proveedor where  Ruc like'%"+DatoBuscar+"'% and idTipoProveedorCompras="+tipoProv+";";
                          EjecutarConsulta(consultaSQL); 
                        break;   }
                   case (3):    { // RazonSocial
                        consultaSQL="SELECT idProveedor, RazonSocial, Ruc,Direccion ,Telefono ,E_mail"
                                + " from proveedor where RazonSocial like '%"+DatoBuscar+"%' and idTipoProveedorCompras="+tipoProv+";";
                        EjecutarConsulta(consultaSQL);  
                        break;   }
             }
        
    
    }
    private void EjecutarConsulta(String consultaSQL) {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         try {
          
             PreparedStatement ps = objmante.conexion.prepareStatement(consultaSQL);
             ResultSet rs = ps.executeQuery();
             boolean encontrado=false;
             while (rs.next()) 
              { int id= rs.getInt("idProveedor");
                String RazonSocial = rs.getString("RazonSocial");
                String Ruc = rs.getString("Ruc");
                String Telefono= rs.getString("Telefono");
                String Direccion= rs.getString("Direccion");
                String E_mail = rs.getString("E_mail");  
                
                
                encontrado=true;
                limpiarTabla();
              Object [] fila={id,RazonSocial,Ruc,Telefono,Direccion,E_mail};
                Modelo.addRow(fila);
             }
             rs.close();
             objmante.CerrarConexion();  
         if (encontrado!=true){
                Mensajes.Alarma(this,"No se encontro al Proveedor Solicitado");  }
             
       }catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos del Proveedor : "+e);
       }
    }
     

    private void actualizarTipoProveedor() {
         if(rbtnLocal.isSelected()){ tipoProv =1;  }
         else if(rbtnExtranjero.isSelected()){ tipoProv =2;  }
    }
 

    private void ListarProveedores(){
          MantenimientoDatos objmante = new MantenimientoDatos(); 
         try {
           String sql = "SELECT idProveedor, RazonSocial,Ruc,Direccion,Telefono ,"
                   + "E_mail FROM  proveedor where idTipoProveedorCompras="+tipoProv+";";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {    int proveedor_ID= rs.getInt("idProveedor");
               String RazonSocial = rs.getString("RazonSocial");
               String Ruc = rs.getString("Ruc");
               String Telefono= rs.getString("Telefono");
               String Direccion= rs.getString("Direccion");
                String E_mail = rs.getString("E_mail");  
           
                Object [] fila={proveedor_ID,RazonSocial,Ruc,Telefono,Direccion,E_mail};
                Modelo.addRow(fila);
            }
            rs.close();
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Productos: "+"\n"+"Verifique la conexion con la Base de Datos "+e );
        }
               
    }

    private void listarProvExtranjero() {
                   MantenimientoDatos objmante = new MantenimientoDatos(); 
         try {
           String sql = " SELECT T_proveedor_ID,RazonSocial,Ruc,"
                   + "Direccion,Telefono,E_mail"
                   + "FROM proveedor where idtipo_proveedorCompras = 2;";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {    int proveedor_ID= rs.getInt(" T_proveedor_ID");
               String RazonSocial = rs.getString("RazonSocial");
               String Ruc = rs.getString("Ruc");
               String Telefono= rs.getString("Telefono");
               String Direccion= rs.getString("Direccion");
                String E_mail = rs.getString("E_mail");  
           
                Object [] fila={proveedor_ID,RazonSocial,Ruc,Telefono,Direccion,E_mail};
                Modelo.addRow(fila);
            }
            rs.close();
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Productos: "+"\n"+"Verifique la conexion con la Base de Datos "+e );
        }
    }

     
   
}
