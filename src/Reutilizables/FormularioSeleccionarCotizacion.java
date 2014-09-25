 
package Reutilizables;

import FormulariosMantenimiento.Formulario_GenerarFactura;
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

 
public class FormularioSeleccionarCotizacion extends javax.swing.JFrame {

    private String consultaSQL;
    DefaultTableModel Modelo;
                   
    String [] Titulo={" Id CO ","Vendedor(a)","Id TC ","TC","idCliente","DatoCliente","idAlmacen","Fecha"};
    String [][] datos={}; 
    
    public FormularioSeleccionarCotizacion() {
        initComponents();   setLocationRelativeTo(null);  configBasicas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabOrdenCompra = new javax.swing.JTable();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jcheckfecha = new javax.swing.JCheckBox();
        txtDatoBuscar = new javax.swing.JTextField();
        jcheckId = new javax.swing.JCheckBox();
        jchecktodos = new javax.swing.JCheckBox();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("  LISTA DE COTIZACIONES SOLICITADAS       ");

        jtabOrdenCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtabOrdenCompra);

        jToolBar3.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);

        jLabel1.setText("   ");
        jToolBar3.add(jLabel1);

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/acccioness.png"))); // NOI18N
        jLabel7.setText("ACCIONES");
        jToolBar3.add(jLabel7);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jcheckfecha.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckfecha.setText(" Fecha");
        jcheckfecha.setOpaque(false);

        txtDatoBuscar.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtDatoBuscar.setText(" ");
        txtDatoBuscar.setToolTipText("Enter para buscar ...");
        txtDatoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoBuscarActionPerformed(evt);
            }
        });

        jcheckId.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckId.setText(" Id");
        jcheckId.setOpaque(false);

        jchecktodos.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchecktodos.setSelected(true);
        jchecktodos.setText(" Todos");
        jchecktodos.setToolTipText("");
        jchecktodos.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcheckfecha)
                    .addComponent(jcheckId)
                    .addComponent(jchecktodos)
                    .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcheckId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcheckfecha)
                .addGap(2, 2, 2)
                .addComponent(jchecktodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jToolBar4.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar4.setBorder(null);
        jToolBar4.setFloatable(false);

        jLabel2.setText("   ");
        jToolBar4.add(jLabel2);

        jLabel8.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel8.setText("BUSCAR COTIZACIÓN");
        jToolBar4.add(jLabel8);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/listarProveedores.png"))); // NOI18N
        jButton1.setText("GENERAR FACTURA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBuscarActionPerformed
         ValidacionBusqueda();
    }//GEN-LAST:event_txtDatoBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.dispose();
         int index=jtabOrdenCompra.getSelectedRow();
         String  CodigoConsultar= String.valueOf(jtabOrdenCompra.getValueAt(index, 0));
         int idTipoCliente=Integer.parseInt( String.valueOf(jtabOrdenCompra.getValueAt(index, 2)));  
         String idCliente= String.valueOf(jtabOrdenCompra.getValueAt(index, 4)); 
         String idAlmacen= String.valueOf(jtabOrdenCompra.getValueAt(index, 6)); 
         Formulario_GenerarFactura factura = new Formulario_GenerarFactura (CodigoConsultar,idTipoCliente,idCliente,idAlmacen);
         factura.setVisible(true); 
         
    }//GEN-LAST:event_jButton1ActionPerformed
  
    
     private void ValidacionBusqueda() {
        limpiarTabla();
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
                        consultaSQL="SELECT co.idCotizacion, concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno) as Empleado, c.idTipocliente, "
                                + "tc.Tipo,co.idCliente,concat(cn.Nombres,' ',cn.ApellidoP,' ',cn.ApellidoM) as Cliente,co.idAlmacen,co.Fecha "
                                + "FROM cotizacion co  inner join cliente c using (idCliente) inner join empleado e using(idEmpleado)"
                                + "inner join tipo_cliente tc using (idTipocliente) inner join cliente_natural cn using (idCliente)"
                                + "where co.idEstado=4 and idCotizacion='"+DatoBuscar+"';";
                         EjecutarConsulta(consultaSQL); 
                        
                          consultaSQL="SELECT co.idCotizacion, concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno) as Empleado, c.idTipocliente,"
                                  + "tc.Tipo,co.idCliente,concat(cj.RazonSocial) as Cliente,co.idAlmacen,co.Fecha "
                                  + "FROM cotizacion co  inner join cliente c using (idCliente) inner join empleado e using(idEmpleado)"
                                  + "inner join tipo_cliente tc using (idTipocliente) inner join cliente_juridico cj using (idCliente)"
                                  + "where co.idEstado=4 and idCotizacion='"+DatoBuscar+"';";
                        EjecutarConsulta(consultaSQL); 
                           
                        break;   } 
               
                   case (2):    { // fecha 
                        consultaSQL="SELECT co.idCotizacion, concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno) as Empleado, c.idTipocliente, "
                                + "tc.Tipo,co.idCliente,concat(cn.Nombres,' ',cn.ApellidoP,' ',cn.ApellidoM) as Cliente,co.idAlmacen,co.Fecha "
                                + "FROM cotizacion co  inner join cliente c using (idCliente) inner join empleado e using(idEmpleado)"
                                + "inner join tipo_cliente tc using (idTipocliente) inner join cliente_natural cn using (idCliente)"
                                + "where co.idEstado=4 and Fecha='"+DatoBuscar+"';";
                        EjecutarConsulta(consultaSQL); 
                        
                          consultaSQL="SELECT co.idCotizacion, concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno) as Empleado, c.idTipocliente,"
                                  + "tc.Tipo,co.idCliente, concat(cj.RazonSocial) as Cliente,co.idAlmacen,co.Fecha "
                                  + "FROM cotizacion co  inner join cliente c using (idCliente) inner join empleado e using(idEmpleado)"
                                  + "inner join tipo_cliente tc using (idTipocliente) inner join cliente_juridico cj using (idCliente)"
                                  + "where co.idEstado=4 and Fecha='"+DatoBuscar+"';"; 
                         EjecutarConsulta(consultaSQL); 
                           
                        break;   } 
                   
                   case (3):    { // todos
                         consultaSQL="SELECT co.idCotizacion, concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno) as Empleado, c.idTipocliente, "
                                + "tc.Tipo, co.idCliente, concat(cn.Nombres,' ',cn.ApellidoP,' ',cn.ApellidoM) as Cliente,co.idAlmacen,co.Fecha "
                                + "FROM cotizacion co  inner join cliente c using (idCliente) inner join empleado e using(idEmpleado)"
                                + "inner join tipo_cliente tc using (idTipocliente) inner join cliente_natural cn using (idCliente)"
                                + "where co.idEstado=4;";
                         EjecutarConsulta(consultaSQL); 
                        
                          consultaSQL="SELECT co.idCotizacion, concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno) as Empleado, c.idTipocliente,"
                                  + "tc.Tipo,co.idCliente, concat(cj.RazonSocial) as Cliente,co.idAlmacen,co.Fecha "
                                  + "FROM cotizacion co  inner join cliente c using (idCliente) inner join empleado e using(idEmpleado)"
                                  + "inner join tipo_cliente tc using (idTipocliente) inner join cliente_juridico cj using (idCliente)"
                                  + "where co.idEstado=4;";
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
                 { String codigo = rs.getString("idCotizacion");
                   String Empleado = rs.getString("Empleado");
                   String idTipocliente = rs.getString("idTipocliente"); 
                   String Tipo= rs.getString("Tipo");
                   String idCliente= rs.getString("idCliente");
                   String Cliente= rs.getString("Cliente");
                   String idAlmacen= rs.getString("idAlmacen");
                   String Fecha= rs.getString("Fecha"); 
                   
                   
                   Object [] fila={codigo,Empleado,idTipocliente,Tipo,idCliente,Cliente,idAlmacen,Fecha };
                   Modelo.addRow(fila);
                }
            }
                objmante.CerrarConexion();  
         
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
       jtabOrdenCompra.setRowHeight(22);// Ancho  
       jtabOrdenCompra.setFont(new java.awt.Font("Nyala", 0, 14));
       Modelo= new  DefaultTableModel(datos, Titulo);
       jtabOrdenCompra.setModel(Modelo);
       
       txtDatoBuscar.setText("");
       txtDatoBuscar.requestFocus();
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JCheckBox jcheckId;
    private javax.swing.JCheckBox jcheckfecha;
    private javax.swing.JCheckBox jchecktodos;
    private javax.swing.JTable jtabOrdenCompra;
    private javax.swing.JTextField txtDatoBuscar;
    // End of variables declaration//GEN-END:variables
}
