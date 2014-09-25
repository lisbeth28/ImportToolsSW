package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M
 */
public class FormularioMantenimientoClientes extends javax.swing.JFrame {
    DefaultTableModel Modelo;
    String [] Titulo={" Id "," Tipo "," RUC "," Cliente "," Cel. "," Dirección "," Telef. "};
    String [][] datos={};
    private int idCliente, tipoCliente;
    private String ruc, cliente,direccion,telefono;
    private String CodigoConsultar;
    private String consultaSQL;
    private int buscarCliente;
    
    public FormularioMantenimientoClientes() {
        initComponents();
        this.setLocationRelativeTo(null); 
        btngrpTipoCliente.add( jradbtnNatural);
        btngrpTipoCliente.add( jradbtnJuridico); 
        configBasicas(); 
        actualizarTipoCliente( );
        ListarClientes();
        btngrpBuscar.add(jCheckBoxDatoCliente); 
        btngrpBuscar.add(jCheckBoxRuc);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpTipoCliente = new javax.swing.ButtonGroup();
        btngrpBuscar = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabClientes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtDatoBuscar = new javax.swing.JTextField();
        jCheckBoxRuc = new javax.swing.JCheckBox();
        jCheckBoxDatoCliente = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jradbtnJuridico = new javax.swing.JRadioButton();
        jradbtnNatural = new javax.swing.JRadioButton();
        jToolBar5 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel7 = new javax.swing.JLabel();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MANTENIMIENTO _DATOS _CLIENTE ");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jtabClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Tipo de Cliente", "Cliente", "Documento"
            }
        ));
        jtabClientes.setOpaque(false);
        jScrollPane1.setViewportView(jtabClientes);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(244, 244, 244));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Cliente.png"))); // NOI18N
        jButton6.setText(" Nuevo Cliente ");
        jButton6.setToolTipText(" NUEVO");
        jButton6.setBorder(null);
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/mod.png"))); // NOI18N
        jButton4.setText(" Modificar Cliente");
        jButton4.setToolTipText(" MODIFICAR ");
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/trash.gif"))); // NOI18N
        jButton5.setText("Eliminar Cliente");
        jButton5.setToolTipText(" ANULAR ");
        jButton5.setBorder(null);
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtDatoBuscar.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        txtDatoBuscar.setText(" ");
        txtDatoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoBuscarActionPerformed(evt);
            }
        });

        jCheckBoxRuc.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jCheckBoxRuc.setText(" Ruc");
        jCheckBoxRuc.setOpaque(false);
        jCheckBoxRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRucActionPerformed(evt);
            }
        });

        jCheckBoxDatoCliente.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jCheckBoxDatoCliente.setSelected(true);
        jCheckBoxDatoCliente.setText(" Cliente");
        jCheckBoxDatoCliente.setToolTipText("Razon Social /Apellidos y Nombres");
        jCheckBoxDatoCliente.setOpaque(false);
        jCheckBoxDatoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDatoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxRuc)
                    .addComponent(jCheckBoxDatoCliente)
                    .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxDatoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxRuc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jradbtnJuridico.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jradbtnJuridico.setText(" Cliente  Juridico");
        jradbtnJuridico.setOpaque(false);
        jradbtnJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradbtnJuridicoActionPerformed(evt);
            }
        });

        jradbtnNatural.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jradbtnNatural.setSelected(true);
        jradbtnNatural.setText(" Cliente  Natural ");
        jradbtnNatural.setOpaque(false);
        jradbtnNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradbtnNaturalActionPerformed(evt);
            }
        });

        jToolBar5.setBorder(null);
        jToolBar5.setFloatable(false);
        jToolBar5.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Cliente.png"))); // NOI18N
        jLabel1.setText("  TIPO  DE CLIENTE       ");
        jToolBar5.add(jLabel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jradbtnJuridico)
                            .addComponent(jradbtnNatural)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradbtnNatural)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradbtnJuridico)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jToolBar3.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel7.setText(" BUSCAR CLIENTE ");
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(560, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(298, 298, 298)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jradbtnNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradbtnNaturalActionPerformed
        if (jradbtnNatural.isSelected()) {
            limpiarTabla();
            actualizarTipoCliente();
            ListarClientes();
        }
    }//GEN-LAST:event_jradbtnNaturalActionPerformed

    private void jradbtnJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradbtnJuridicoActionPerformed
        if (jradbtnJuridico.isSelected()) {
            limpiarTabla();
            actualizarTipoCliente();
            ListarClientes();
        }
    }//GEN-LAST:event_jradbtnJuridicoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        EliminarCliente();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        modificarCliente() ;
        this.dispose();
   }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     this.dispose();
     actualizarTipoCliente( ) ;
     Formulario_Cliente clienteNuv= new Formulario_Cliente(tipoCliente);
     clienteNuv.setVisible(true); 
   }//GEN-LAST:event_jButton6ActionPerformed

    private void txtDatoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBuscarActionPerformed
      actualizarTipoCliente( ); limpiarTabla(); buscarCliente( );
    }//GEN-LAST:event_txtDatoBuscarActionPerformed

    private void jCheckBoxDatoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDatoClienteActionPerformed
       if(jCheckBoxDatoCliente.isSelected()){
         buscarCliente=1 ;
       }
    }//GEN-LAST:event_jCheckBoxDatoClienteActionPerformed

    private void jCheckBoxRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRucActionPerformed
         if(jCheckBoxRuc.isSelected()){
           buscarCliente=2;
       }
    }//GEN-LAST:event_jCheckBoxRucActionPerformed

  
    private void configBasicas() {
       jtabClientes.setGridColor(Color.WHITE); 
       jtabClientes.setForeground(Color.BLACK);
       jtabClientes.setSelectionBackground(Color.BLACK); 
       jtabClientes.setSelectionForeground(Color.LIGHT_GRAY); 
       jtabClientes.setRowHeight(22);// Ancho 
       jtabClientes.setBackground(Color.LIGHT_GRAY);
       jtabClientes.setFont(new java.awt.Font("Nyala", 0, 14));
       Modelo= new  DefaultTableModel(datos, Titulo);
       jtabClientes.setModel(Modelo);
       
       txtDatoBuscar.setText("");
       txtDatoBuscar.requestFocus();
    }
 
   
    private void listarClienteJuridicos() { // falta arreglar
        MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
        try {
            String sql = " SELECT idCliente,Tipo,RazonSocial as cliente ,Ruc,Direccion,Telefono "
                    + "FROM  cliente  inner join tipo_cliente using(idTipocliente) "
                    + "inner join cliente_juridico using (idCliente) where idEstado<>2;"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   idCliente = rs.getInt("Idcliente");
                     String tipo= rs.getString("Tipo"); 
                    cliente = rs.getString("cliente"); 
                    ruc = rs.getString("Ruc"); 
                    direccion = rs.getString("Direccion");
                    telefono= rs.getString("Telefono");  
                    
                    Object [] fila={idCliente,tipo,ruc,cliente,direccion,telefono};
                    Modelo.addRow(fila);
                }
            }
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Clientes Naturales "+"\n"+"Verifique la conexion con la Base de Datos \n "+e );
        }
               
   }
    private void limpiarTabla() {
        while(jtabClientes.getRowCount()>0){
            Modelo.removeRow(0);
        }
    }
    
    private void listarClienteNatural() {
        MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
        try {
            String sql = "SELECT idCliente,Tipo,concat(ApellidoP,' ',ApellidoM,' ',Nombres) as cliente,Ruc,Direccion,Telefono  "
                    + "FROM  cliente  inner join tipo_cliente using(idTipocliente) "
                    + "inner join  cliente_natural using (idCliente)where idEstado<>2;"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   idCliente = rs.getInt("Idcliente");
                   String tipo= rs.getString("Tipo"); 
                    cliente = rs.getString("cliente"); 
                    ruc = rs.getString("Ruc"); 
                    direccion = rs.getString("Direccion");
                    telefono= rs.getString("Telefono");  
                    
                    Object [] fila={idCliente,tipo,ruc,cliente,direccion,telefono};
                    Modelo.addRow(fila);
                }
            }
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Clientes Naturales "+"\n"+"Verifique la conexion con la Base de Datos \n "+e );
        }
               
   }
    
    private void actualizarTipoCliente( ) {
        if(jradbtnNatural.isSelected()){ tipoCliente =1;  }
         else if(jradbtnJuridico.isSelected()){ tipoCliente=2;  }
    }

    private void ListarClientes() {
        if (tipoCliente==1){ listarClienteNatural() ; }
        else  {listarClienteJuridicos(); } 
    }
   
    private void EliminarCliente() {
        try {
            int index=jtabClientes.getSelectedRow();
            CodigoConsultar= String.valueOf( jtabClientes.getValueAt(index, 0)); 
            String clientEliminar =(String)jtabClientes.getValueAt(index, 1);
            int rspt=Mensajes.confirmar(this, "Esta seguro de anular al cliente "+clientEliminar);
            if(rspt == 0){
                MantenimientoDatos eliminar= new MantenimientoDatos ();
                eliminar.AnularCliente(CodigoConsultar);  
                eliminarfila();
                eliminar.CerrarConexion();
            }
             
        }catch(Exception e){  }
    }
    
    private void eliminarfila() {
        int filas=jtabClientes.getSelectedRowCount();// obtiene numero de filas seleccionadas
	if (filas!=0)  {
		int fila;// una o mas filas seleccionadas
		do {
			fila=jtabClientes.getSelectedRow();// obtiene fila seleccionada
                        if(fila != -1){
                        Modelo.removeRow(fila);
                    }
		} while (fila>=0); // mientras haya filas seleccionadas
	} 
    }  
     
    private void modificarCliente() {
        try{
            int index=jtabClientes.getSelectedRow();
            CodigoConsultar= String.valueOf( jtabClientes.getValueAt(index, 0));
            Formulario_Cliente clienteNuv= new Formulario_Cliente(tipoCliente,CodigoConsultar);
            clienteNuv.setVisible(true); 
            
        } catch(Exception e){
            Mensajes.Error(this, "No funcionop"+e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngrpBuscar;
    private javax.swing.ButtonGroup btngrpTipoCliente;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBoxDatoCliente;
    private javax.swing.JCheckBox jCheckBoxRuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JRadioButton jradbtnJuridico;
    private javax.swing.JRadioButton jradbtnNatural;
    private javax.swing.JTable jtabClientes;
    private javax.swing.JTextField txtDatoBuscar;
    // End of variables declaration//GEN-END:variables

    private void buscarCliente( ) {
        String dato = txtDatoBuscar.getText();
        switch(buscarCliente){
             case (1):{
                 if (tipoCliente==1){
                     consultaSQL="SELECT idCliente,Tipo,concat(ApellidoP,' ',ApellidoM,' ',Nombres) as cliente,Ruc,Direccion,Telefono  "
                    + "FROM  cliente  inner join tipo_cliente using(idTipocliente) "
                    + "inner join  cliente_natural using (idCliente)where idEstado<>2 and concat(ApellidoP,' ',ApellidoM,' ',Nombres) like '%"+dato+"%'; ";
                     EjecutarConsulta();
                 }
                  
                 else {
                     consultaSQL=" SELECT idCliente,Tipo,RazonSocial as cliente ,Ruc,Direccion,Telefono "
                    + "FROM  cliente  inner join tipo_cliente using(idTipocliente) "
                    + "inner join cliente_juridico using (idCliente) where idEstado<>2 and RazonSocial like '%"+dato+"%'; ";
                     EjecutarConsulta();
                 }
                break;}

   
             case (2):{
                     if (tipoCliente==1){
                     consultaSQL="SELECT idCliente,Tipo,concat(ApellidoP,' ',ApellidoM,' ',Nombres) as cliente,Ruc,Direccion,Telefono  "
                    + "FROM  cliente  inner join tipo_cliente using(idTipocliente) "
                    + "inner join  cliente_natural using (idCliente)where idEstado<>2 and Ruc like '%"+dato+"%'; ";
                      EjecutarConsulta();}
                 else {
                     consultaSQL=" SELECT idCliente,Tipo,RazonSocial as cliente ,Ruc,Direccion,Telefono "
                    + "FROM  cliente  inner join tipo_cliente using(idTipocliente) "
                    + "inner join cliente_juridico using (idCliente) where idEstado<>2 and Ruc  like '%"+dato+"%'; ";
                      EjecutarConsulta(); }
                    break;
           }
         }
    }

    private void EjecutarConsulta() {
        try{
          MantenimientoDatos objmante = new MantenimientoDatos();
          PreparedStatement ps = objmante.conexion.prepareStatement(consultaSQL);
           ResultSet rs = ps.executeQuery() ;
                while (rs.next()) 
                {   idCliente = rs.getInt("Idcliente");
                     String tipo= rs.getString("Tipo"); 
                    cliente = rs.getString("cliente"); 
                    ruc = rs.getString("Ruc"); 
                    direccion = rs.getString("Direccion");
                    telefono= rs.getString("Telefono");  
                    
                    Object [] fila={idCliente,tipo,ruc,cliente,direccion,telefono};
                    Modelo.addRow(fila);
                }
            
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Clientes Naturales "+"\n"+"Verifique la conexion con la Base de Datos \n "+e );
        }
    }
 
}