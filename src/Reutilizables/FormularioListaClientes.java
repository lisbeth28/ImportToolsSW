 package Reutilizables;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import panFondos.FondoBusqueda_2;
 

public class FormularioListaClientes extends javax.swing.JFrame {
 
      
    DefaultTableModel Modelo;
    String [] Titulo={" Id Proveedor "," Razon Social","Ruc ","Tipo de Proveedor"};
    String [][] datos={}; 
   
    public FormularioListaClientes( ) { // Buscar para Orden de compra
         initComponents();
         cargarImagen();  
         configBasicas();   
         
         buttonGroupTipoComp.add(jradbtnNatural);
         buttonGroupTipoComp.add(jradbtnJuridico);
         
          listarClienteNatural();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoComp = new javax.swing.ButtonGroup();
        buttonGroupBusqueda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabProveedores = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jradbtnJuridico = new javax.swing.JRadioButton();
        jradbtnNatural = new javax.swing.JRadioButton();
        jToolBar7 = new javax.swing.JToolBar();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LISTA DE CLIENTES ");

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);

        jtabProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtabProveedores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setOpaque(false);

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

        jToolBar7.setBorder(null);
        jToolBar7.setFloatable(false);
        jToolBar7.setOpaque(false);

        jLabel17.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Cliente.png"))); // NOI18N
        jLabel17.setText("  TIPO  DE CLIENTE       ");
        jToolBar7.add(jLabel17);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jradbtnJuridico)
                    .addComponent(jradbtnNatural))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToolBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jradbtnNatural)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradbtnJuridico)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jradbtnJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradbtnJuridicoActionPerformed
        if(jradbtnJuridico.isSelected()){ limpiarTabla() ; listarClienteJuridicos();}
    }//GEN-LAST:event_jradbtnJuridicoActionPerformed

    private void jradbtnNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradbtnNaturalActionPerformed
        if(jradbtnNatural.isSelected()){ limpiarTabla() ; listarClienteNatural();}
   }//GEN-LAST:event_jradbtnNaturalActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupBusqueda;
    private javax.swing.ButtonGroup buttonGroupTipoComp;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar7;
    private javax.swing.JRadioButton jradbtnJuridico;
    private javax.swing.JRadioButton jradbtnNatural;
    private javax.swing.JTable jtabProveedores;
    // End of variables declaration//GEN-END:variables

     private void cargarImagen() { 
           FondoBusqueda_2 F= new FondoBusqueda_2();
           F.setSize(670,390);  
           this.add(F,BorderLayout.CENTER);
           this.pack();
           this.setLocationRelativeTo(null); 
        }
   
   

  private void limpiarTabla() {
        while(jtabProveedores.getRowCount()>0){
            Modelo.removeRow(0);
        }
    }

     private void configBasicas() {
       jtabProveedores.setGridColor(Color.WHITE); 
       jtabProveedores.setForeground(Color.BLACK);
       jtabProveedores.setSelectionBackground(Color.BLACK); 
       jtabProveedores.setSelectionForeground(Color.LIGHT_GRAY); 
       jtabProveedores.setRowHeight(22);// Ancho 
       jtabProveedores.setBackground(Color.LIGHT_GRAY);
       jtabProveedores.setFont(new java.awt.Font("Nyala", 0, 14));
       Modelo= new  DefaultTableModel(datos, Titulo);
       jtabProveedores.setModel(Modelo);
       
        
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
                {   int idCliente = rs.getInt("Idcliente");
                    String tipo= rs.getString("Tipo"); 
                    String cliente = rs.getString("cliente"); 
                    String ruc = rs.getString("Ruc"); 
                    String  direccion = rs.getString("Direccion");
                    String telefono= rs.getString("Telefono");  
                    
                    Object [] fila={idCliente,tipo,ruc,cliente,direccion,telefono};
                    Modelo.addRow(fila);
                }
            }
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Clientes Naturales "+"\n"+"Verifique la conexion con la Base de Datos \n "+e );
        }
               
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
                {   int idCliente = rs.getInt("Idcliente");
                     String tipo= rs.getString("Tipo"); 
                     String  cliente = rs.getString("cliente"); 
                     String  ruc = rs.getString("Ruc"); 
                     String direccion = rs.getString("Direccion");
                     String telefono= rs.getString("Telefono");  
                    
                    Object [] fila={idCliente,tipo,ruc,cliente,direccion,telefono};
                    Modelo.addRow(fila);
                }
            }
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Clientes Naturales "+"\n"+"Verifique la conexion con la Base de Datos \n "+e );
        }
               
   }

}
