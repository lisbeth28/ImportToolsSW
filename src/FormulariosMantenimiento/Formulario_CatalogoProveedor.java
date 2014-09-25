
package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import panFondos.Fondo_Registros;

 
public class Formulario_CatalogoProveedor extends javax.swing.JFrame {
   
    private DefaultTableModel Modelo;
    String [] Titulo={"Codigo ","Descripción "," Costo "};
    String [][] datos={}; 
    int IdProveedor, idProducto=1; String CodigoReferencia;
    private double costoProducto; int cantidadProd=0;
    JComboBox comboIdFamilia= new JComboBox();
    private String idFamilia;
    
    public Formulario_CatalogoProveedor(int IdProv) {
        initComponents();
        IdProveedor=IdProv;
        cargarFondo(); cargarDatosPROV();
        lblProveedorDatos.setText("  PROVEEDOR N° "+IdProveedor+" ");
        configTabla();
        ListarCatalogoProveedor();
        cargarListaFamilias();
      
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbIdProducto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        lblIdProveedor = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblRuc = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        comboFamilia = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboProducto = new javax.swing.JComboBox();
        lblProveedorDatos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcostoProducto = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabProveedores = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" REGISTRAR CATALOGO PROVEEDOR ");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Nyala", 1, 13)); // NOI18N
        jLabel6.setText("Id Producto    :");

        lbIdProducto.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        lbIdProducto.setText("12");

        jLabel8.setFont(new java.awt.Font("Nyala", 1, 13)); // NOI18N
        jLabel8.setText("Descripción    :");

        lblDescripcion.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcion.setText("VTX00001");

        jLabel10.setFont(new java.awt.Font("Nyala", 1, 13)); // NOI18N
        jLabel10.setText("Precio Venta   :");

        lblPrecioVenta.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        lblPrecioVenta.setText("126");

        jLabel9.setFont(new java.awt.Font("Nyala", 1, 13)); // NOI18N
        jLabel9.setText("Id Proveedor   :");

        lblIdProveedor.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        lblIdProveedor.setText("12");

        jLabel11.setFont(new java.awt.Font("Nyala", 1, 13)); // NOI18N
        jLabel11.setText("Ruc             :");

        lblRuc.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        lblRuc.setText("12");

        jLabel12.setFont(new java.awt.Font("Nyala", 1, 13)); // NOI18N
        jLabel12.setText("Razón Social  :");

        lblRazonSocial.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        lblRazonSocial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRazonSocial.setText("VTX00001");

        jLabel13.setFont(new java.awt.Font("Nyala", 1, 13)); // NOI18N
        jLabel13.setText("Total Prod.    :");

        lblTotal.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        lblTotal.setText("0");

        btnCancelar.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/rollback.png"))); // NOI18N
        btnCancelar.setText(" Regresar ");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Nyala", 1, 13)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Cliente.png"))); // NOI18N
        jLabel14.setText(" PROVEEDOR :");

        jLabel15.setFont(new java.awt.Font("Nyala", 1, 13)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/nuevoProd.png"))); // NOI18N
        jLabel15.setText(" PRODUCTO SELECCIONADO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRazonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 32, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel8))
                                                .addGap(22, 22, 22)
                                                .addComponent(lbIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(22, 22, 22)
                                                .addComponent(lblPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblIdProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblRuc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRazonSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(10, 10, 10))
                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(39, 39, 39)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbIdProducto))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblPrecioVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);

        comboFamilia.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        comboFamilia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFamilia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFamiliaItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nyala", 1, 12)); // NOI18N
        jLabel1.setText("FAMILIA ");

        jLabel7.setFont(new java.awt.Font("Nyala", 1, 12)); // NOI18N
        jLabel7.setText("PRODUCTO ");

        comboProducto.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        comboProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Productos ..." }));
        comboProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProductoItemStateChanged(evt);
            }
        });

        lblProveedorDatos.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        lblProveedorDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProveedorDatos.setText(" PROVEEDOR N°345673 TRADE TOOLS CIA S.A.C");

        jLabel5.setFont(new java.awt.Font("Nyala", 1, 12)); // NOI18N
        jLabel5.setText("COSTO ");

        txtcostoProducto.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/adicionar.png"))); // NOI18N
        jButton1.setText("Agregar ");
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jLabel2.setText("    ");
        jToolBar1.add(jLabel2);

        jButton3.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Modificarr.png"))); // NOI18N
        jButton3.setText("Modificar");
        jButton3.setBorder(null);
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jLabel3.setText("    ");
        jToolBar1.add(jLabel3);

        jButton2.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/delete_over.png"))); // NOI18N
        jButton2.setText("Quitar ");
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jtabProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Producto", "Title 2", "Codigo Referencia"
            }
        ));
        jScrollPane1.setViewportView(jtabProveedores);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblProveedorDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel5)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtcostoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProveedorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtcostoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     FormularioMantenimientoProveedor mantenimientoProv= new  FormularioMantenimientoProveedor();
     this.dispose();  mantenimientoProv.setVisible(true); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void comboProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProductoItemStateChanged
          CodigoReferencia=String.valueOf(comboProducto.getSelectedItem()); 
          rellenarDatosProducto();  txtcostoProducto.requestFocus();
    }//GEN-LAST:event_comboProductoItemStateChanged

    private void comboFamiliaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFamiliaItemStateChanged
      try{ if(comboFamilia.getSelectedIndex()>=0){
            comboIdFamilia.setSelectedIndex(comboFamilia.getSelectedIndex());
            idFamilia=String.valueOf(comboIdFamilia.getSelectedItem()); 
            listarProductos(); }
         
       }catch(Exception e){}
    }//GEN-LAST:event_comboFamiliaItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     registrarProductoCatalogo(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     eliminarCatalogoProveedor();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    ActualizarCosto(); 
    }//GEN-LAST:event_jButton3ActionPerformed
   
    private void cargarFondo(){
           Fondo_Registros F = new Fondo_Registros();
           F.setSize(970, 477);
           this.add(F,BorderLayout.CENTER);
           this.pack();
           setLocationRelativeTo(null);
           
         
   }
    
    private void listarProductos() {
        comboProducto.removeAllItems(); 
         MantenimientoDatos objmante = new MantenimientoDatos(); 
         try {
           String sql = "SELECT CodigoReferencia,PrecioVenta FROM productos where idFamilia="+idFamilia+";";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {    String codigoRef = rs.getString("CodigoReferencia"); 
                 comboProducto.addItem(codigoRef);
            }
            rs.close();
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Productos: "+"\n"+"Verifique la conexion con la Base de Datos "+e );
        }
               
   }
    
     private void configTabla() {
       jtabProveedores.setGridColor(Color.WHITE); 
       jtabProveedores.setForeground(Color.BLACK);
       jtabProveedores.setSelectionBackground(Color.BLACK); 
       jtabProveedores.setSelectionForeground(Color.LIGHT_GRAY); 
       jtabProveedores.setRowHeight(22);// Anchop
       jtabProveedores.setBackground(Color.LIGHT_GRAY);
       jtabProveedores.setFont(new java.awt.Font("Nyala", 0, 14));
       Modelo= new  DefaultTableModel(datos, Titulo);
       jtabProveedores.setModel(Modelo);
    }
   
     
   
    
    public void eliminar(){
       
	int filas=jtabProveedores.getSelectedRowCount();// obtiene numero de filas seleccionadas
	if (filas==0) // no hay filas seleccionadas
		JOptionPane.showMessageDialog(this,"Debe seleccionar una o más filas!");
	else {
		int fila;// una o mas filas seleccionadas
		do {
			fila=jtabProveedores.getSelectedRow();// obtiene fila seleccionada
                        if(fila != -1){
                        // remueve fila obtenida
			Modelo.removeRow(fila);
                    }
		} while (fila>=0); // mientras haya filas seleccionadas
	}// fin del else
}
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox comboFamilia;
    private javax.swing.JComboBox comboProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jtabProveedores;
    private javax.swing.JLabel lbIdProducto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblIdProveedor;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblProveedorDatos;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtcostoProducto;
    // End of variables declaration//GEN-END:variables

    private void ListarCatalogoProveedor() {
        try{
              MantenimientoDatos objmante = new MantenimientoDatos(); 
              String sql="SELECT  P.CodigoReferencia,P.Descripcion,C.costoProducto "
                      + "FROM catalogoproveedor C inner join productos P using(idProductos) "
                      + "where C.idProveedor="+IdProveedor+";";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {   String codigoProd= rs.getString("CodigoReferencia");
                String Descripcion = rs.getString("Descripcion");
                String costoProd = rs.getString("costoProducto"); 
           
                cantidadProd=cantidadProd=+1;
                
                Object [] fila={codigoProd,Descripcion,costoProd };
                Modelo.addRow(fila);  
            }
            rs.close();
            objmante.CerrarConexion();  
           lblTotal.setText(""+cantidadProd);
        } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Productos: "+"\n"+"Verifique la conexion con la Base de Datos "+e );
        }
    }

    private void rellenarDatosProducto() {
          try{
            MantenimientoDatos objmante = new MantenimientoDatos(); 
            String sql="SELECT idProductos,Descripcion,PrecioVenta "
                    + "FROM productos where CodigoReferencia='"+CodigoReferencia+"';";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {   String codigoProd= rs.getString("idProductos");
                String Descripcion = rs.getString("Descripcion");
                double PrecioVenta= rs.getDouble("PrecioVenta"); 
           
                lbIdProducto.setText(codigoProd);
                lblDescripcion.setText(Descripcion);
                lblPrecioVenta.setText(PrecioVenta+"");
            }
            rs.close();
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Productos: "+"\n"+"Verifique la conexion con la Base de Datos "+e );
        }
    }

    private void registrarProductoCatalogo() {
          try{ 
              idProducto= Integer.parseInt(lbIdProducto.getText());  
              costoProducto=Double.parseDouble(txtcostoProducto.getText().trim());
              MantenimientoDatos registrar= new MantenimientoDatos(); 
              registrar.InsertarCatalogoProv(IdProveedor, idProducto, costoProducto); 
               Object[] fila = { CodigoReferencia,lblDescripcion.getText(),txtcostoProducto.getText() };
               Modelo.addRow(fila);
              Mensajes.Informar(this,"Se Registro exitosamente el Producto al Catalogo del Proveedor");
              registrar.CerrarConexion() ;  
        } catch(Exception e){
            Mensajes.Error(this,"Error no se pudo guardar por =>"+e.getLocalizedMessage());
        }
    }

    private void eliminarCatalogoProveedor() {
          try{ 
              int index=jtabProveedores.getSelectedRow(); 
              CodigoReferencia= String.valueOf(jtabProveedores.getValueAt(index, 0));   
              rellenarDatosProducto();
              idProducto=Integer.parseInt(lbIdProducto.getText());
              int rspst=Mensajes.confirmar(this,"Esta seguro de eliminar al Producto :"+CodigoReferencia+" del catalogo del proveedor ???"); 
              if (rspst==0){
               MantenimientoDatos eliminar = new MantenimientoDatos();
               eliminar.EliminarCatalogoProv(IdProveedor, idProducto);
               eliminarfila();
               Mensajes.Informar(this,"Se elimino exitosamente el Producto al Catalogo del Proveedor");
               eliminar.CerrarConexion() ; 
              }
              
        } catch(Exception e){
            Mensajes.Error(this,"Error no se pudo eliminar por =>"+e.getLocalizedMessage());
        } 
    }

    private void cargarListaFamilias() {
         comboFamilia.removeAllItems(); 
         comboIdFamilia.removeAllItems();
         int codFamilia;String codigoRef; 
         MantenimientoDatos objmante = new MantenimientoDatos(); 
         try {
           String sql = "SELECT idFamilia,Descripcion FROM  familia where idEstado=1;";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())  {
                  codFamilia=rs.getInt("idFamilia");
                  codigoRef = rs.getString("Descripcion"); 
                  comboFamilia.addItem(codigoRef);
                  comboIdFamilia.addItem( codFamilia);
            }
            rs.close();
            objmante.CerrarConexion();  
            idFamilia= String.valueOf(comboIdFamilia.getItemAt(0)) ; 
            listarProductos();
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Producon la Base de Datos "+e );
        }
             
         
    }

    private void cargarDatosPROV() {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
          try {
            String sql = "SELECT p.RazonSocial,p.Ruc from proveedor p where p.idProveedor ='"+IdProveedor+"';";
             
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {     
                    String razon = rs.getString("RazonSocial");
                    String   ruc= rs.getString("Ruc");  
                     
                     lblIdProveedor.setText(""+IdProveedor);
                     lblRuc.setText(ruc); lblRazonSocial.setText(razon);
                }
            }
            objmante.CerrarConexion();
        } catch (SQLException | NullPointerException e) {
            Mensajes.Error(this,"Error. No se pudo obtener los datos del proveedor: " + e.getLocalizedMessage() );
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

    private void ActualizarCosto() {
           int index=jtabProveedores.getSelectedRow(); 
           costoProducto=Double.parseDouble(txtcostoProducto.getText());   
           CodigoReferencia= String.valueOf(jtabProveedores.getValueAt(index, 0));   
           rellenarDatosProducto();
           idProducto=Integer.parseInt(lbIdProducto.getText());
              int rspst=Mensajes.confirmar(this,"Esta seguro de eliminar al Producto :"+CodigoReferencia+" del catalogo del proveedor ???"); 
              if (rspst==0){
               MantenimientoDatos eliminar = new MantenimientoDatos();
               eliminar.ModificarCatalogoProv(IdProveedor, idProducto,costoProducto);
               eliminarfila();
               Mensajes.Informar(this,"Se elimino exitosamente el Producto al Catalogo del Proveedor");
               eliminar.CerrarConexion() ; 
    }
    }
}
