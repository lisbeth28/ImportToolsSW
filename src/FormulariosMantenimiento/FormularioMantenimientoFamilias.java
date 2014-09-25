package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

 
public class FormularioMantenimientoFamilias extends javax.swing.JFrame {
  
    DefaultTableModel Modelo;
    String [] Titulo={"Id ","Codigo"," Descripcion"};
    String [][] datos={};
    private String consultaSQL;
    
    public FormularioMantenimientoFamilias() {
        initComponents(); 
        this.setLocationRelativeTo(null); 
        ConfigurarTabla();
        listarFamilia(); 
        
        buttonGroup1.add(jchekboxId);  buttonGroup1.add(jchekboxTodos); 
    } 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnlMenuAcciones = new javax.swing.JPanel();
        jpnlBotones = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jpnlBusqueda = new javax.swing.JPanel();
        jchekboxId = new javax.swing.JCheckBox();
        jchekboxTodos = new javax.swing.JCheckBox();
        txtDatoBuscar = new javax.swing.JTextField();
        jtlbrBuscarFamilia = new javax.swing.JToolBar();
        jlblTituloBusqueda = new javax.swing.JLabel();
        jtlbrAcciones = new javax.swing.JToolBar();
        jlblTituloAcciones = new javax.swing.JLabel();
        jpnlListaFamilias = new javax.swing.JPanel();
        jscrlpnTabla = new javax.swing.JScrollPane();
        jtableFamilias = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MANTENIMIENTO FAMILIAS");

        jpnlMenuAcciones.setBackground(new java.awt.Color(244, 244, 244));

        jpnlBotones.setBackground(new java.awt.Color(255, 255, 255));

        jButton9.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/nuevoProd.png"))); // NOI18N
        jButton9.setText(" Nueva Familia ");
        jButton9.setBorder(null);
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/mod.png"))); // NOI18N
        jButton13.setText(" Modificar Familia ");
        jButton13.setBorder(null);
        jButton13.setOpaque(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/trash.gif"))); // NOI18N
        jButton12.setText(" Eliminar Familia ");
        jButton12.setBorder(null);
        jButton12.setOpaque(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlBotonesLayout = new javax.swing.GroupLayout(jpnlBotones);
        jpnlBotones.setLayout(jpnlBotonesLayout);
        jpnlBotonesLayout.setHorizontalGroup(
            jpnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnlBotonesLayout.setVerticalGroup(
            jpnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnlBusqueda.setBackground(new java.awt.Color(255, 255, 255));

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

        jchekboxTodos.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchekboxTodos.setText(" Todos");
        jchekboxTodos.setToolTipText("Razon Social /Apellidos y Nombres");
        jchekboxTodos.setOpaque(false);
        jchekboxTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchekboxTodosActionPerformed(evt);
            }
        });

        txtDatoBuscar.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        txtDatoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlBusquedaLayout = new javax.swing.GroupLayout(jpnlBusqueda);
        jpnlBusqueda.setLayout(jpnlBusquedaLayout);
        jpnlBusquedaLayout.setHorizontalGroup(
            jpnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlBusquedaLayout.createSequentialGroup()
                        .addGroup(jpnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jchekboxTodos)
                            .addComponent(jchekboxId))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtDatoBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jpnlBusquedaLayout.setVerticalGroup(
            jpnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jchekboxId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jchekboxTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jtlbrBuscarFamilia.setBackground(new java.awt.Color(231, 231, 231));
        jtlbrBuscarFamilia.setBorder(null);
        jtlbrBuscarFamilia.setFloatable(false);

        jlblTituloBusqueda.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jlblTituloBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jlblTituloBusqueda.setText(" BUSCAR FAMILIA");
        jtlbrBuscarFamilia.add(jlblTituloBusqueda);

        jtlbrAcciones.setBackground(new java.awt.Color(231, 231, 231));
        jtlbrAcciones.setBorder(null);
        jtlbrAcciones.setFloatable(false);

        jlblTituloAcciones.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jlblTituloAcciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/acccioness.png"))); // NOI18N
        jlblTituloAcciones.setText(" ACCIONES              ");
        jtlbrAcciones.add(jlblTituloAcciones);

        javax.swing.GroupLayout jpnlMenuAccionesLayout = new javax.swing.GroupLayout(jpnlMenuAcciones);
        jpnlMenuAcciones.setLayout(jpnlMenuAccionesLayout);
        jpnlMenuAccionesLayout.setHorizontalGroup(
            jpnlMenuAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMenuAccionesLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jpnlMenuAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtlbrAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtlbrBuscarFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpnlMenuAccionesLayout.setVerticalGroup(
            jpnlMenuAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMenuAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtlbrBuscarFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtlbrAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jpnlListaFamilias.setBackground(new java.awt.Color(255, 255, 255));

        jtableFamilias.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jtableFamilias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""},
                {null, null, null}
            },
            new String [] {
                "COD", "id", "descrip"
            }
        ));
        jscrlpnTabla.setViewportView(jtableFamilias);

        javax.swing.GroupLayout jpnlListaFamiliasLayout = new javax.swing.GroupLayout(jpnlListaFamilias);
        jpnlListaFamilias.setLayout(jpnlListaFamiliasLayout);
        jpnlListaFamiliasLayout.setHorizontalGroup(
            jpnlListaFamiliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlListaFamiliasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscrlpnTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnlListaFamiliasLayout.setVerticalGroup(
            jpnlListaFamiliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlListaFamiliasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscrlpnTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
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
                .addComponent(jpnlListaFamilias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnlMenuAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlListaFamilias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      this.dispose();
        Formulario_Familia nuevaFamilia = new Formulario_Familia();
      nuevaFamilia.setVisible(true);  
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
     AnularFamilia();         
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      int index=jtableFamilias.getSelectedRow();
      int  Codigo= Integer.parseInt((String)jtableFamilias.getValueAt(index, 0));  
      Formulario_Familia moneda1= new Formulario_Familia(Codigo);
      moneda1.setVisible(true); 
      this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void txtDatoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBuscarActionPerformed
        if(jchekboxId.isSelected()){ 
        buscarFamilia (); }
        txtDatoBuscar.setText("");
        txtDatoBuscar.requestFocus();   
    }//GEN-LAST:event_txtDatoBuscarActionPerformed

    private void jchekboxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchekboxIdActionPerformed
txtDatoBuscar.requestFocus();
   }//GEN-LAST:event_jchekboxIdActionPerformed

    private void jchekboxTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchekboxTodosActionPerformed
     txtDatoBuscar.requestFocus();
     if(jchekboxTodos.isSelected()){  limpiarTabla() ; listarFamilia(); } 
    }//GEN-LAST:event_jchekboxTodosActionPerformed
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jchekboxId;
    private javax.swing.JCheckBox jchekboxTodos;
    private javax.swing.JLabel jlblTituloAcciones;
    private javax.swing.JLabel jlblTituloBusqueda;
    private javax.swing.JPanel jpnlBotones;
    private javax.swing.JPanel jpnlBusqueda;
    private javax.swing.JPanel jpnlListaFamilias;
    private javax.swing.JPanel jpnlMenuAcciones;
    private javax.swing.JScrollPane jscrlpnTabla;
    private javax.swing.JTable jtableFamilias;
    private javax.swing.JToolBar jtlbrAcciones;
    private javax.swing.JToolBar jtlbrBuscarFamilia;
    private javax.swing.JTextField txtDatoBuscar;
    // End of variables declaration//GEN-END:variables
 
     private void listarFamilia() {
        MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
        try {
            String sql = "SELECT  idFamilia  , Descripcion , CodigoReferencia FROM familia where  idEstado =1;"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {   String codigo = rs.getString("idFamilia");
                String descripcion= rs.getString("Descripcion"); 
                String codRef = rs.getString("CodigoReferencia"); 
                Object [] fila={codigo,codRef ,descripcion};
                Modelo.addRow(fila);
            }
            rs.close();
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Empleados : "+"\n"+"Verifique la conexion con la Base de Datos \n "+e );
        }
}
      private void AnularFamilia() {
        try {
            int index=jtableFamilias.getSelectedRow();
            String Codigo= (String)jtableFamilias.getValueAt(index, 0);
            String Moneda= (String)jtableFamilias.getValueAt(index, 1);
            int rspt=Mensajes.confirmar(this, "Esta seguro de eliminar la Familia "+Moneda);
            if(rspt == 0){
                MantenimientoDatos eliminar= new MantenimientoDatos ();
                eliminar.AnularFamilia(Codigo);   
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
     
    private void ConfigurarTabla() {
       jtableFamilias.setGridColor(Color.WHITE); 
       jtableFamilias.setForeground(Color.BLACK);
       jtableFamilias.setSelectionBackground(Color.BLACK); 
       jtableFamilias.setSelectionForeground(Color.LIGHT_GRAY); 
       jtableFamilias.setRowHeight(22);// Ancho 
       jtableFamilias.setBackground(Color.LIGHT_GRAY);
       jtableFamilias.setFont(new java.awt.Font("Nyala", 0, 14));
       Modelo= new  DefaultTableModel(datos, Titulo);
       jtableFamilias.setModel(Modelo);
       
    }
 
    
     private void buscarFamilia () {
         String DatoBuscar = txtDatoBuscar.getText();
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         try {
             consultaSQL="SELECT idFamilia, Descripcion, CodigoReferencia "
                                + "from familia  Where idEstado <> 2  and idFamilia ="+DatoBuscar+";";
         
             PreparedStatement ps = objmante.conexion.prepareStatement(consultaSQL);
             ResultSet rs = ps.executeQuery();
             boolean encontrado=false;
             while (rs.next()) 
              { String id = rs.getString("idFamilia");
                String descripcion = rs.getString("Descripcion"); 
                String codreferencia=rs.getString("CodigoReferencia"); 
                
                encontrado=true;
                limpiarTabla();
                Object [] fila={id,descripcion,codreferencia};
                Modelo.addRow(fila);
             }
             rs.close();
             objmante.CerrarConexion();  
         if (encontrado!=true){
                Mensajes.Alarma(this,"No se encontro al familia Solicitado");  }
             
       }catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de la familia : "+e);
       }
    }
}
