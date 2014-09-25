 
package FormulariosMantenimiento;
 
import MantenimientoBD.MantenimientoDatos; 
import Otras_Clases.Mensajes;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class FormularioMantenerEmpleado extends javax.swing.JFrame {
    DefaultTableModel Modelo;
    String [] Titulo={" Id "," Empleado "," Cargo ","DNI"," Cel. "," Telef. "," Dirección ","E_Mail"};
    String [][] datos={};
    
    private String CodigoConsultar,consultaSQL;
    private String Cargo,codigo,empleado,telefono,Celular,cargo,direccion,E_Mail ;
    
    
    
    public FormularioMantenerEmpleado() {
        initComponents();
        configurarTabla(); 
        this.setLocationRelativeTo(null); 
        listarEmpleados(); 
        btngrpTipoBusq.add(jchekboxId);
        btngrpTipoBusq.add(jchekboxApeNomb); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpTipoBusq = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jchekboxApeNomb = new javax.swing.JCheckBox();
        jchekboxId = new javax.swing.JCheckBox();
        txtDatoBuscar = new javax.swing.JTextField();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel7 = new javax.swing.JLabel();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" MANTENIMIENTO _DATOS DEL EMPLEADO ");

        jPanel5.setBackground(new java.awt.Color(244, 244, 244));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/AgregarEmpleado.gif"))); // NOI18N
        jButton6.setText(" Nuevo Empleado");
        jButton6.setToolTipText("Nuevo");
        jButton6.setBorder(null);
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/RepotTodos.gif"))); // NOI18N
        jButton4.setText(" Modificar Empleado");
        jButton4.setToolTipText("Modificar");
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/consultar.gif"))); // NOI18N
        jButton3.setText(" Consultar Empleado");
        jButton3.setToolTipText("Consultar");
        jButton3.setBorder(null);
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/trash.gif"))); // NOI18N
        jButton5.setText(" Eliminar Empleado");
        jButton5.setToolTipText("Anular");
        jButton5.setBorder(null);
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jchekboxApeNomb.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchekboxApeNomb.setText(" Apellidos y Nombre");
        jchekboxApeNomb.setOpaque(false);

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
                            .addComponent(jchekboxApeNomb)
                            .addComponent(jchekboxId))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jchekboxId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchekboxApeNomb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar3.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel7.setText(" BUSCAR EMPLEADO ");
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
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jtabEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jtabEmpleados.setEditingRow(0);
        jtabEmpleados.setOpaque(false);
        jtabEmpleados.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jtabEmpleados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Formulario_Empleado  EMPL1 = new Formulario_Empleado();
        EMPL1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        modificarEmpleado();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        consultar();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        EliminarEmpleado();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtDatoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBuscarActionPerformed
        int tipodDato=0;
        if(jchekboxId.isSelected()){tipodDato=1;} 
        else if(jchekboxApeNomb.isSelected()){tipodDato=2;} 
        buscarEmpleado(tipodDato);
        txtDatoBuscar.setText("");
        txtDatoBuscar.requestFocus();
    }//GEN-LAST:event_txtDatoBuscarActionPerformed

    private void jchekboxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchekboxIdActionPerformed
      
    }//GEN-LAST:event_jchekboxIdActionPerformed
 private void listarEmpleados() {
        MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
        try {
            String sql = "SELECT e.idEmpleado,concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno) as NombreApellido,"
                        + "e.DNI,e.Telefono,e.Celular,e.Direccion,e.E_Mail,c.Nombre FROM cargo c "
                        + "JOIN empleado e using(idCargo)  where idEstado <> 2;"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   codigo = rs.getString("idEmpleado");
                    empleado = rs.getString("NombreApellido"); 
                    String DNI = rs.getString("DNI"); 
                    telefono = rs.getString("Telefono");
                    Celular = rs.getString("Celular");
                    direccion = rs.getString("Direccion");
                    E_Mail  = rs.getString("E_Mail"); 
                    cargo = rs.getString("Nombre");
                    
                    Object [] fila={codigo,empleado,cargo,DNI,Celular,telefono,direccion,E_Mail  };
                    Modelo.addRow(fila);
                }
            }
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Empleados : "+"\n"+"Verifique la conexion con la Base de Datos \n "+e );
        }   
   }

    private void EliminarEmpleado() {
        try {
            int index=jtabEmpleados.getSelectedRow();
            CodigoConsultar= (String)jtabEmpleados.getValueAt(index, 0);
            if (!"1".equals(CodigoConsultar)){
            Cargo= (String)jtabEmpleados.getValueAt(index, 2);
            String empEliminar =(String)jtabEmpleados.getValueAt(index, 1);
            int rspt=Mensajes.confirmar(this, "Esta seguro de anular al "+Cargo+" "+empEliminar);
            if(rspt == 0){
                MantenimientoDatos eliminar= new MantenimientoDatos ();
                eliminar.AnularEmpleado(CodigoConsultar);  
                eliminarfila();
                eliminar.CerrarConexion();
            }
            }else 
                Mensajes.Informar(this,"No se puede eliminar al Administrador del Sistema");
        }catch(Exception e){  }
    }
 
    private void eliminarfila() {
        int filas=jtabEmpleados.getSelectedRowCount();// obtiene numero de filas seleccionadas
	if (filas!=0)  {
		int fila;// una o mas filas seleccionadas
		do {
			fila=jtabEmpleados.getSelectedRow();// obtiene fila seleccionada
                        if(fila != -1){
                        Modelo.removeRow(fila);
                    }
		} while (fila>=0); // mientras haya filas seleccionadas
	} 
    } 

    private void configurarTabla() {
      
       jtabEmpleados.setRowHeight(22);// Ancho  
       jtabEmpleados.setFont(new java.awt.Font("Nyala", 0, 14));
       Modelo= new  DefaultTableModel(datos, Titulo);
       jtabEmpleados.setModel(Modelo);
       
       txtDatoBuscar.setText("");
       txtDatoBuscar.requestFocus();
    }

    private void consultar() {
        try{
            int index=jtabEmpleados.getSelectedRow();
            CodigoConsultar= (String)jtabEmpleados.getValueAt(index, 0);
            FormularioConsultarEmpleado consulta= new FormularioConsultarEmpleado(CodigoConsultar);
            consulta.setVisible(true); 
        }catch(Exception e){ 
            Mensajes.Error(this, "No funcionop"+e);
        }
    }

    private void modificarEmpleado() {
        try{
            int index=jtabEmpleados.getSelectedRow();
            CodigoConsultar= (String)jtabEmpleados.getValueAt(index, 0);
            
            Formulario_Empleado F1= new  Formulario_Empleado(CodigoConsultar);
            F1.setVisible(true);
            
        } catch(Exception e){
            Mensajes.Error(this, "No funcionop"+e);
        }
    }

    private void limpiarTabla() {
        while(jtabEmpleados.getRowCount()>0){
            Modelo.removeRow(0);
        }
    }

private void buscarEmpleado(int tipodDato) {
         String DatoBuscar=txtDatoBuscar.getText();
        consultaSQL=""; 
        switch(tipodDato)
            {   case (1):    { // Id
                    consultaSQL="SELECT e.idEmpleado,concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno) as NombreApellido,"
                    + "e.DNI,e.Telefono,e.Celular,e.Direccion,e.E_Mail,c.Nombre FROM cargo c "
                    + "JOIN empleado e using(idCargo)  where idEstado <> 2 and  idEmpleado ="+DatoBuscar+";";
                    EjecutarConsulta(consultaSQL); 
                    break;   } 
                case (2):    { //Apellido y Nombres
                    consultaSQL="SELECT e.idEmpleado,concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno) as NombreApellido,"
                    + "e.DNI,e.Telefono,e.Celular,e.Direccion,e.E_Mail,c.Nombre FROM cargo c "
                    + "JOIN empleado e using(idCargo)  where idEstado <> 2 and concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno)like'%"+DatoBuscar+"%';";
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
              { codigo = rs.getString("idEmpleado");
                empleado = rs.getString("NombreApellido"); 
                cargo = rs.getString("Nombre");
                direccion = rs.getString("Direccion");
                telefono = rs.getString("Telefono");
                Celular = rs.getString("Celular");
                E_Mail  = rs.getString("E_Mail"); 
                encontrado=true;
                limpiarTabla();
                Object [] fila={codigo,empleado,cargo,Celular,telefono,direccion,E_Mail  };
                Modelo.addRow(fila);
             }
             rs.close();
             objmante.CerrarConexion();  
         if (encontrado!=true){
                Mensajes.Alarma(this,"No se encontro al Empleado Solicitado");  }
             
       }catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos del empleado : "+e);
       }
    } 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngrpTipoBusq;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JCheckBox jchekboxApeNomb;
    private javax.swing.JCheckBox jchekboxId;
    private javax.swing.JTable jtabEmpleados;
    private javax.swing.JTextField txtDatoBuscar;
    // End of variables declaration//GEN-END:variables
}
