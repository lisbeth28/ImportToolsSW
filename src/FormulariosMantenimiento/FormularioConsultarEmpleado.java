 package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import panFondos.Fondo_Consultas;
 
public class FormularioConsultarEmpleado extends javax.swing.JFrame {
    
     
    public FormularioConsultarEmpleado(String Codigo) {
        initComponents();
        cargarImagen();
        cargarDatos(Codigo);
        txtCodigo.setText(Codigo);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblVenta1 = new javax.swing.JLabel();
        txte_mail = new javax.swing.JTextField();
        lblVenta3 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblVenta4 = new javax.swing.JLabel();
        txtAnios = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtmeses = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtdias = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaNac = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        txtIngresoPlanilla = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblVenta2 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA DE DATOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " OTROS  DATOS ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jPanel1.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel4.setText("Direccion ");

        lblVenta1.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        lblVenta1.setText("E_mail  ");

        txte_mail.setEditable(false);
        txte_mail.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txte_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txte_mailActionPerformed(evt);
            }
        });

        lblVenta3.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        lblVenta3.setText("Celular");

        txtCelular.setEditable(false);
        txtCelular.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        txtDireccion.setEditable(false);
        txtDireccion.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel6.setText("Telefono ");

        lblVenta4.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        lblVenta4.setText("Tiempo Trabajando ");

        txtAnios.setEditable(false);
        txtAnios.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtAnios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAniosActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel13.setText("Años");

        txtmeses.setEditable(false);
        txtmeses.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtmeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmesesActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel12.setText("Meses ");

        jLabel14.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel14.setText("Dias ");

        txtdias.setEditable(false);
        txtdias.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtdias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblVenta4))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAnios, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmeses, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdias, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(lblVenta3)
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addComponent(txtDireccion))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblVenta1)
                                .addGap(18, 18, 18)
                                .addComponent(txte_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVenta3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVenta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txte_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVenta4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnios, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmeses, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PRINCIPALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel3.setText("Id                             ");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel1.setText("Apellido y Nombres ");

        txtEmpleado.setEditable(false);
        txtEmpleado.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtEmpleado.setText(" ");
        txtEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel10.setText("DNI  ");

        txtDNI.setEditable(false);
        txtDNI.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento ");

        txtFechaNac.setEditable(false);
        txtFechaNac.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel7.setText("Cargo ");

        txtUsuario.setEditable(false);
        txtUsuario.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel9.setText("Usuario  ");

        txtCargo.setEditable(false);
        txtCargo.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        txtIngresoPlanilla.setEditable(false);
        txtIngresoPlanilla.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtIngresoPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresoPlanillaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel11.setText("Fecha de Ingreso ");

        lblVenta2.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        lblVenta2.setText("Edad ");

        txtEdad.setEditable(false);
        txtEdad.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmpleado)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaNac)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                .addComponent(txtIngresoPlanilla))
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblVenta2)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIngresoPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/icon_incorrect.png"))); // NOI18N
        jButton1.setText(" CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoActionPerformed
       
    }//GEN-LAST:event_txtEmpleadoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
     
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false); 
        mostrarInterfazMantenimiento();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txte_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txte_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txte_mailActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtIngresoPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresoPlanillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresoPlanillaActionPerformed

    private void txtmesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmesesActionPerformed

    private void txtAniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAniosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAniosActionPerformed

    private void txtdiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiasActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblVenta1;
    private javax.swing.JLabel lblVenta2;
    private javax.swing.JLabel lblVenta3;
    private javax.swing.JLabel lblVenta4;
    private javax.swing.JTextField txtAnios;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtIngresoPlanilla;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtdias;
    private javax.swing.JTextField txte_mail;
    private javax.swing.JTextField txtmeses;
    // End of variables declaration//GEN-END:variables

    private void cargarImagen() {
         Fondo_Consultas F = new  Fondo_Consultas();
         F.setSize(990,560); // [913, 512]
         this.add(F,BorderLayout.CENTER);
         this.pack(); 
         this.setLocationRelativeTo(null);// lOCALIZACIÓN CENTRO
    }

   
  
    private void cargarDatos(String Codigo) {
         
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         String  empleado,FechaNomina,e_mail,DNI,direccion,telefono,FechaNac,celular,Cargo;
         String Usuario; int edad; 
         try {
            
            String sql = "SELECT e.idEmpleado,concat(e.Nombre,' ',e.ApellidoPaterno,' ',e.ApellidoMaterno) as emp,e.DNI,c.Nombre,"
                    + "e.FechaNacimiento,TIMESTAMPDIFF(year,e.FechaNacimiento, NOW()) as edad,"
                    + "e.Telefono,e.Celular,e.Direccion,e.E_Mail,e.FechaIngreso ,u.usuario FROM cargo c "
                    + "JOIN empleado e using(idCargo) JOIN Usuario u using(idEmpleado)   where idEmpleado="+Codigo+";";           
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {   
                empleado = rs.getString("emp"); 
                DNI=rs.getString("DNI");
                Cargo = rs.getString("Nombre");
                FechaNac= rs.getString("FechaNacimiento");
                edad=rs.getInt("edad");   
                telefono= rs.getString("Telefono");
                celular = rs.getString("Celular");
                direccion = rs.getString("Direccion"); 
                e_mail = rs.getString("E_Mail"); 
                FechaNomina= rs.getString("FechaIngreso");
                
                Usuario = rs.getString("usuario");
                
                
                txtCodigo.setText(Codigo); 
                txtEmpleado.setText(empleado ) ; 
                txtDNI.setText(DNI); txtEdad.setText(String.valueOf(edad));
                txtFechaNac.setText( FechaNac );         
                txtCargo.setText(  Cargo ); 
                 
                txtDireccion.setText( direccion ); 
                txtCelular.setText(celular); 
                txte_mail.setText( e_mail );  
                txtTelefono.setText( telefono ); 
                txtUsuario.setText(Usuario );  
                txtIngresoPlanilla.setText(FechaNomina);  
                 
            }
            rs.close();
            objmante.CerrarConexion(); 
            ConsultarTiempoTrabajo(Codigo);
        } catch (SQLException e) {
            Mensajes.Error(this,"Error. No se pudo ejecutar la consulta: " + e.toString());
        }
         
    }

    private void ConsultarTiempoTrabajo(String Codigo) {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         int año=0,mes=0,dias=0;
         try {
            
            String sql = "call uspObtenerTiempTrabEmpl("+Codigo+");";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {  
                año=rs.getInt("años");
                mes=rs.getInt("meses");
                dias=rs.getInt("diasTrab");
            }
            rs.close();
            objmante.CerrarConexion(); 
            txtAnios.setText(String.valueOf(año));
            txtmeses.setText(String.valueOf(mes));
            txtdias.setText(String.valueOf(dias));
         } catch (SQLException e) {
            Mensajes.Error(this,"Error. No se pudo ejecutar la consulta: " + e.toString());
        }
    }
    
     private void mostrarInterfazMantenimiento() {
        FormularioMantenerEmpleado form= new FormularioMantenerEmpleado ();
        form.setVisible(true); 
    }
}
