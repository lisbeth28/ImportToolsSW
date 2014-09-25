 package Reutilizables;

import FormulariosMantenimiento.Formulario_OrdenCompra;
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import panFondos.FondoBusqueda_2;
 

public class FormularioConsultarProveedor extends javax.swing.JFrame {
 
     
    private String consultaSQL;
    DefaultTableModel Modelo;
    String [] Titulo={" Id Proveedor "," Razon Social","Ruc ","Tipo de Proveedor"};
    String [][] datos={}; 
    public FormularioConsultarProveedor( ) { // Buscar para Orden de compra
         initComponents();
         cargarImagen();  
         configBasicas();   
          
         buttonGroup1.add(jcheckProvLoc); 
         buttonGroup1.add(jcheckProvExtranj);
         
          buscarProveedor();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jcheckProvLoc = new javax.swing.JCheckBox();
        jcheckProvExtranj = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabProveedores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Buscar Proveedor");

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);

        jcheckProvLoc.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckProvLoc.setSelected(true);
        jcheckProvLoc.setText(" Proveedores Locales ");
        jcheckProvLoc.setToolTipText("");
        jcheckProvLoc.setOpaque(false);
        jcheckProvLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckProvLocActionPerformed(evt);
            }
        });

        jcheckProvExtranj.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckProvExtranj.setText(" Proveedores Extranjeros");
        jcheckProvExtranj.setToolTipText("");
        jcheckProvExtranj.setOpaque(false);
        jcheckProvExtranj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckProvExtranjActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel7.setText("  LISTA DE  PROVEEDORES                   ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcheckProvExtranj)
                            .addComponent(jcheckProvLoc))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcheckProvLoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcheckProvExtranj)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcheckProvLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckProvLocActionPerformed
     buscarProveedor();
    }//GEN-LAST:event_jcheckProvLocActionPerformed

    private void jcheckProvExtranjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckProvExtranjActionPerformed
     buscarProveedor();
    }//GEN-LAST:event_jcheckProvExtranjActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox jcheckProvExtranj;
    private javax.swing.JCheckBox jcheckProvLoc;
    private javax.swing.JTable jtabProveedores;
    // End of variables declaration//GEN-END:variables

     private void cargarImagen() { 
           FondoBusqueda_2 F= new FondoBusqueda_2();
           F.setSize(670,390);  
           this.add(F,BorderLayout.CENTER);
           this.pack();
           this.setLocationRelativeTo(null); 
        }
  
   
    private void buscarProveedor() {
        int tipodDato=0;  limpiarTabla();
         if(jcheckProvLoc.isSelected()){
             tipodDato = 1; }  
         else if(jcheckProvExtranj.isSelected()){ tipodDato=2;  } 
         
         consultaSQL=""; 
           switch(tipodDato)
              {   case (1):    { // Prov Locales 
                        consultaSQL="SELECT p.idProveedor,p.RazonSocial,p.Ruc,pc.TipoProvedor  "
                                + "from proveedor p INNER JOIN tipo_proveedor_compras pc using(idTipoProveedorCompras)  "
                                + "where p.idTipoProveedorCompras =1 and p.idEstado=1 ;";
                        EjecutarConsulta(consultaSQL); 
                        break;   } 
                    
                   case (2):    { // Prov Extranj
                         consultaSQL="SELECT p.idProveedor,p.RazonSocial,p.Ruc,pc.TipoProvedor  "
                                + "from proveedor p INNER JOIN tipo_proveedor_compras pc using(idTipoProveedorCompras)  "
                                + "where p.idTipoProveedorCompras =2 and p.idEstado=1 ;";
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
                 { String codigo = rs.getString("idProveedor");
                   String raz = rs.getString("RazonSocial"); 
                   String ruc= rs.getString("Ruc");
                   String tipo= rs.getString("TipoProvedor"); 
                   encontrado=true;
                  
                   Object [] fila={codigo,raz,ruc,tipo };
                   Modelo.addRow(fila);
                }
            }
                objmante.CerrarConexion();  
         if (encontrado!=true){
                Mensajes.Alarma(this,"No se encontro al Empleado Solicitado");  }
             
       }catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos del empleado : "+e);
       }
    }

  private void limpiarTabla() {
        while(jtabProveedores.getRowCount()>0){
            Modelo.removeRow(0);
        }
  }

     private void configBasicas() {
       jtabProveedores.setRowHeight(22);// Ancho  
       jtabProveedores.setFont(new java.awt.Font("Nyala", 0, 14));
       Modelo= new  DefaultTableModel(datos, Titulo);
       jtabProveedores.setModel(Modelo);
        
    }
}
