package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class FormularioMantenimientoProducto extends javax.swing.JFrame {
    DefaultTableModel Modelo; //  
    String [] Titulo={" Id "," Familia "," Codigo Referencia "," Descripción "," Unidad"," Precio "};
    String [][] datos={}; 
    private int idProducto; 
    private String descripcion,unidad,precio,Familia;
    private String codigoRef;
    private String consultaSQL;
    
    public FormularioMantenimientoProducto() {
        initComponents();
        configTabla();
        listarProductos() ; buttonGroup1.add(jchekboxId);
buttonGroup1.add(jchekboxFamilia);buttonGroup1.add(jchekboxCodigo);         
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jchekboxCodigo = new javax.swing.JCheckBox();
        jchekboxId = new javax.swing.JCheckBox();
        jchekboxFamilia = new javax.swing.JCheckBox();
        txtDatoBuscar = new javax.swing.JTextField();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel7 = new javax.swing.JLabel();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableFamilias = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MANTENIMIENTO  PRODUCTOS ");

        jPanel5.setBackground(new java.awt.Color(244, 244, 244));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/nuevoProd.png"))); // NOI18N
        jButton4.setText(" Nuevo Producto ");
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/mod.png"))); // NOI18N
        jButton7.setText(" Modificar Producto ");
        jButton7.setBorder(null);
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/trash.gif"))); // NOI18N
        jButton6.setText(" Eliminar Producto ");
        jButton6.setBorder(null);
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jchekboxCodigo.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchekboxCodigo.setText(" Codigo de Referencia");
        jchekboxCodigo.setOpaque(false);

        jchekboxId.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchekboxId.setSelected(true);
        jchekboxId.setText(" Id");
        jchekboxId.setToolTipText("Razon Social /Apellidos y Nombres");
        jchekboxId.setOpaque(false);
        jchekboxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchekboxIdActionPerformed(evt);
            }
        });

        jchekboxFamilia.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchekboxFamilia.setText(" Familia ");
        jchekboxFamilia.setToolTipText("Razon Social /Apellidos y Nombres");
        jchekboxFamilia.setOpaque(false);
        jchekboxFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchekboxFamiliaActionPerformed(evt);
            }
        });

        txtDatoBuscar.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        txtDatoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDatoBuscar)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jchekboxFamilia)
                            .addComponent(jchekboxCodigo)
                            .addComponent(jchekboxId))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jchekboxId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jchekboxFamilia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchekboxCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jToolBar3.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel7.setText(" BUSCAR PRODUCTO ");
        jToolBar3.add(jLabel7);

        jToolBar4.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar4.setBorder(null);
        jToolBar4.setFloatable(false);

        jLabel8.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/acccioness.png"))); // NOI18N
        jLabel8.setText(" ACCIONES              ");
        jToolBar4.add(jLabel8);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jtableFamilias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtableFamilias);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      AnularProducto();   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      int index=jtableFamilias.getSelectedRow();
      int  Codigo= Integer.parseInt( String.valueOf(jtableFamilias.getValueAt(index, 0)));   
      Formulario_Producto cambiarProd= new Formulario_Producto(Codigo);
      cambiarProd.setVisible(true); 
      this.dispose();     
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     Formulario_Producto nuevoProd = new Formulario_Producto();
     nuevoProd.setVisible(true); 
     this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jchekboxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchekboxIdActionPerformed

   }//GEN-LAST:event_jchekboxIdActionPerformed

    private void jchekboxFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchekboxFamiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchekboxFamiliaActionPerformed

    private void txtDatoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBuscarActionPerformed
        int tipodDato=0;   limpiarTabla();
        if(jchekboxId.isSelected()){tipodDato=1;} 
        else if(jchekboxFamilia.isSelected()){tipodDato=2;} 
        else if(jchekboxCodigo.isSelected()){tipodDato=3;} 
        buscarProducto(tipodDato);
        txtDatoBuscar.setText("");
        txtDatoBuscar.requestFocus();
    }//GEN-LAST:event_txtDatoBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JCheckBox jchekboxCodigo;
    private javax.swing.JCheckBox jchekboxFamilia;
    private javax.swing.JCheckBox jchekboxId;
    private javax.swing.JTable jtableFamilias;
    private javax.swing.JTextField txtDatoBuscar;
    // End of variables declaration//GEN-END:variables

      private void configTabla() {
       jtableFamilias.setRowHeight(22);// Anchop
       jtableFamilias.setFont(new java.awt.Font("Nyala", 0, 14));
       Modelo= new  DefaultTableModel(datos, Titulo);
       jtableFamilias.setModel(Modelo);
    }
      
    private void listarProductos() {
        MantenimientoDatos objmante = new MantenimientoDatos(); 
         try {
           String sql = " SELECT p.idProductos , f.Descripcion as 'Familia',"
                    + "p.CodigoReferencia, p.Descripcion ,un.Nombre as 'Unidad', "
                    + "p. PrecioVenta FROM  productos p inner join  unidad_medida un using (idUnidad_medida)"
                    + "inner join familia f using(idFamilia) where p.idEstado =1;";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {   idProducto= rs.getInt("idProductos");
                Familia = rs.getString("Familia");
                codigoRef = rs.getString("CodigoReferencia");
                descripcion= rs.getString("Descripcion");
                unidad = rs.getString("Unidad");  
                precio = rs.getString("PrecioVenta");
                Object [] fila={idProducto,Familia,codigoRef,descripcion,unidad,precio};
                Modelo.addRow(fila);
            }
            rs.close();
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Productos: "+"\n"+"Verifique la conexion con la Base de Datos "+e );
        }   
   }
    
      private void buscarProducto(int tipodDato) {
        String DatoBuscar=txtDatoBuscar.getText(); 
         consultaSQL=""; 
           switch(tipodDato)
              {   case (1):    { // Id
                        consultaSQL=" SELECT p.idProductos , f.Descripcion as 'Familia',"
                    + "p.CodigoReferencia, p.Descripcion ,un.Nombre as 'Unidad', "
                    + "p. PrecioVenta FROM  productos p inner join  unidad_medida un using (idUnidad_medida)"
                    + "inner join familia f using(idFamilia) where p.idEstado =1 and p.idProductos= "+DatoBuscar+" ;";
                        EjecutarConsulta(consultaSQL); 
                        break;   } 
                   case (2):    { // Familia
                      consultaSQL=" SELECT p.idProductos , f.Descripcion as 'Familia',"
                    + "p.CodigoReferencia, p.Descripcion ,un.Nombre as 'Unidad', "
                    + "p. PrecioVenta FROM  productos p inner join  unidad_medida un using (idUnidad_medida)"
                    + "inner join familia f using(idFamilia) where p.idEstado =1 and f.Descripcion like '%"+DatoBuscar+"%' ;";
                      System.out.println( consultaSQL); 
                      EjecutarConsulta(consultaSQL);  
                        break;   }
                   case (3):    { // RazonSocial
                       consultaSQL=" SELECT p.idProductos , f.Descripcion as 'Familia',"
                    + "p.CodigoReferencia, p.Descripcion ,un.Nombre as 'Unidad', "
                    + "p. PrecioVenta FROM  productos p inner join  unidad_medida un using (idUnidad_medida)"
                    + "inner join familia f using(idFamilia) where p.idEstado =1 and p.CodigoReferencia like '%"+DatoBuscar+"%' ;";
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
              {idProducto= rs.getInt("idProductos");
                Familia = rs.getString("Familia");
                codigoRef = rs.getString("CodigoReferencia");
                descripcion= rs.getString("Descripcion");
                unidad = rs.getString("Unidad");  
                precio = rs.getString("PrecioVenta");
                Object [] fila={idProducto,Familia,codigoRef,descripcion,unidad,precio};
                Modelo.addRow(fila);
                encontrado=true;
             }
             rs.close();
             objmante.CerrarConexion();  
         if (encontrado!=true){
                Mensajes.Alarma(this,"No se encontro al Provducto Solicitado");  }
             
       }catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos del Proveedor : "+e);
       }
    }
      private void AnularProducto() {
        try {
            int index=jtableFamilias.getSelectedRow();
            String Codigo= String.valueOf(jtableFamilias.getValueAt(index, 0)); 
            String producto= String.valueOf(jtableFamilias.getValueAt(index, 3)); 
            int rspt=Mensajes.confirmar(this, "Esta seguro de anular el Producto "+producto);
            if(rspt == 0){
                MantenimientoDatos eliminar= new MantenimientoDatos ();
                eliminar.AnularProducto(Codigo);    
                eliminarfila();
                eliminar.CerrarConexion();
            }
           
        }catch(Exception e){  }
    }
      
       private void eliminarfila() {
        int filas=jtableFamilias.getSelectedRowCount();// obtiene numero de filas seleccionadas
	if (filas!=0)  {
		int fila;// una o mas filas seleccionadas
		do {
			fila=jtableFamilias.getSelectedRow();// obtiene fila seleccionada
                        if(fila != -1){
                        Modelo.removeRow(fila);
                    }
		} while (fila>=0); // mientras haya filas seleccionadas
	} 
    }
     private void limpiarTabla() {
        while(jtableFamilias.getRowCount()>0){
            Modelo.removeRow(0);
        }
    }

    
     
}
