package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

 
public class FormularioMantenimientoCotizacion extends javax.swing.JFrame {
   
    DefaultTableModel Modelo;
    String [] Titulo={"Id","fecha de emis.","Almacen","Id Cliente","Tipo Cliente"," Cliente "};
    String [][] datos={};
    private int tipoCliente;
    
    public FormularioMantenimientoCotizacion() {
        initComponents();
        configurarTabla();
        this.setLocationRelativeTo(null); 
        
        btnGroupTipoCliente.add(rbtnNatural); 
        btnGroupTipoCliente.add(rdbtnJuridico); 
        
        
        actualizarTipoClientePedido();
        ListarCotizaciones();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTipoCliente = new javax.swing.ButtonGroup();
        btnGroupBusq = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        rbtnNatural = new javax.swing.JRadioButton();
        rdbtnJuridico = new javax.swing.JRadioButton();
        jToolBar5 = new javax.swing.JToolBar();
        jLabel5 = new javax.swing.JLabel();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tresultados1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MANTENIMIENTO PEDIDO");

        jPanel4.setBackground(new java.awt.Color(244, 244, 244));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton9.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/nuevaOrden.png"))); // NOI18N
        jButton9.setText(" Nuevo Cotizacion");
        jButton9.setBorder(null);
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/trash.gif"))); // NOI18N
        jButton12.setText(" Eliminar Cotizacion");
        jButton12.setBorder(null);
        jButton12.setOpaque(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        rbtnNatural.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        rbtnNatural.setText(" Cliente Natural ");
        rbtnNatural.setOpaque(false);
        rbtnNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNaturalActionPerformed(evt);
            }
        });

        rdbtnJuridico.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        rdbtnJuridico.setSelected(true);
        rdbtnJuridico.setText("Cliente Juridico");
        rdbtnJuridico.setOpaque(false);
        rdbtnJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnJuridicoActionPerformed(evt);
            }
        });

        jToolBar5.setBorder(null);
        jToolBar5.setFloatable(false);
        jToolBar5.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Cliente.png"))); // NOI18N
        jLabel5.setText("  TIPO  DE CLIENTE   ");
        jToolBar5.add(jLabel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnNatural)
                            .addComponent(rdbtnJuridico))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbtnJuridico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnNatural)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jToolBar4.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar4.setBorder(null);
        jToolBar4.setFloatable(false);

        jLabel8.setText("   ");
        jToolBar4.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/acccioness.png"))); // NOI18N
        jLabel9.setText(" ACCIONES              ");
        jToolBar4.add(jLabel9);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Tresultados1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tresultados1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       Formulario_Cotizacion nuevaCotizacion = new Formulario_Cotizacion();
       this.dispose();
       nuevaCotizacion.setVisible(true); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         
    }//GEN-LAST:event_jButton12ActionPerformed

    private void rbtnNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNaturalActionPerformed
        if (rbtnNatural.isSelected()) {
            limpiarTabla();
            actualizarTipoClientePedido();
            ListarCotizaciones();
        }
    }//GEN-LAST:event_rbtnNaturalActionPerformed

    private void rdbtnJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnJuridicoActionPerformed
        if (rdbtnJuridico.isSelected()) {
            limpiarTabla();
            actualizarTipoClientePedido();
            ListarCotizaciones();
        }
    }//GEN-LAST:event_rdbtnJuridicoActionPerformed
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tresultados1;
    private javax.swing.ButtonGroup btnGroupBusq;
    private javax.swing.ButtonGroup btnGroupTipoCliente;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JRadioButton rbtnNatural;
    private javax.swing.JRadioButton rdbtnJuridico;
    // End of variables declaration//GEN-END:variables
 
    private void limpiarTabla() {
           while(Tresultados1.getRowCount()>0){
            Modelo.removeRow(0);
        }
    }
 
      private void configurarTabla() {
        Modelo= new  DefaultTableModel(datos, Titulo);
        Tresultados1.setModel(Modelo);
        Tresultados1.setFont(new java.awt.Font("Nyala", 0, 14));
    }

    private void actualizarTipoClientePedido() {
        if(rdbtnJuridico.isSelected()){  tipoCliente=1;  }
         else if(rbtnNatural.isSelected()){  tipoCliente=2;  }
         
    }

    private void ListarCotizaciones() {
           if (tipoCliente==1){ listarPedidoClienteNatural() ; }
          else  {listarPedidoClienteJuridicos(); } 
    }

    private void listarPedidoClienteNatural() {
      try {
             MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
             String IdCotizacion,FechadeEmision,descripAlm,Idcliente,NombreTipoCL,Cliente,TipoEstado; 
             String sql = "SELECT  c.idCotizacion ,c.Fecha , Al.Descripcion, c.Idcliente , TCL.Tipo, "
                     + "CLJ.RazonSocial as 'Cliente' ,E.TipoEstado  FROM  cotizacion c INNER JOIN estado E using(idEstado)  "
                     + "INNER JOIN almacen Al using(idAlmacen) INNER JOIN cliente CL using(Idcliente)  "
                     + "INNER JOIN tipo_cliente TCL using(idTipocliente) INNER JOIN cliente_juridico CLJ using(Idcliente) where c.idEstado <>2 ;";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   IdCotizacion= rs.getString("idCotizacion");
                    FechadeEmision= rs.getString("Fecha");
                    descripAlm= rs.getString("Descripcion");
                    Idcliente = rs.getString("Idcliente");
                    NombreTipoCL=rs.getString("Tipo");
                    Cliente= rs.getString("Cliente");
                    TipoEstado=rs.getString("TipoEstado");
                    Object [] fila={IdCotizacion,FechadeEmision,descripAlm,Idcliente,NombreTipoCL,Cliente,TipoEstado};
                    Modelo.addRow(fila);
                }
            }
            objmante.CerrarConexion();
        } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de las Facturas : "+e );
        }
    
    }

    private void listarPedidoClienteJuridicos() {
         try {
             MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
             String IdCotizacion,FechadeEmision,descripAlm,Idcliente,NombreTipoCL,Cliente,TipoEstado; 
             String sql = "SELECT  c.idCotizacion ,c.Fecha, Al.Descripcion, c.Idcliente , TCL.Tipo,"
                     + " concat(CLN.ApellidoP,' ',CLN.ApellidoM,' ',CLN.Nombres ) as 'Cliente', E.TipoEstado  FROM  cotizacion c "
                     + "INNER JOIN estado E using(idEstado)  INNER JOIN almacen Al using(idAlmacen) "
                     + "INNER JOIN cliente CL using(Idcliente) "
                     + "INNER JOIN tipo_cliente TCL using(idTipocliente)  "
                     + "INNER JOIN cliente_natural CLN using(Idcliente) where c.idEstado <>2 ;";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                while (rs.next()) 
                {   IdCotizacion= rs.getString("idCotizacion");
                    FechadeEmision= rs.getString("Fecha");
                    descripAlm= rs.getString("Descripcion");
                    Idcliente = rs.getString("Idcliente");
                    NombreTipoCL=rs.getString("Tipo");
                    Cliente= rs.getString("Cliente");
                    TipoEstado=rs.getString("TipoEstado");
                    Object [] fila={IdCotizacion,FechadeEmision,descripAlm,Idcliente,NombreTipoCL,Cliente,TipoEstado};
                    Modelo.addRow(fila);
                }
            
            objmante.CerrarConexion();
        } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de las Facturas : "+e );
        } 
    }
 

     
    
    
}
