package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import panFondos.Fondo_Registros;

public class Formulario_Cliente extends javax.swing.JFrame {
   
    public  int TipoCliente,IdCliente;
    private int TipoMantenimiento=0;
    private String ruc,NombreRaz,DNI;
    private String direccion,telefono,celular,e_mail,apellidoP,apellidoM;
    
    public Formulario_Cliente(int tipoCliente) {// Nuevo Tipo Mant =1
        initComponents();
        cargarFondo();
       
        TipoCliente=tipoCliente; 
        elegirInterfazCliente();
        btnRestaurar.setVisible(false); 
        TipoMantenimiento=1;
        cargarNumCliente();
        actualizarCodigo();
        
    }
    public Formulario_Cliente(int tipoCliente,String idCliente) {// Tipo Mant =2
        initComponents();
        cargarFondo();  
        TipoCliente=tipoCliente; 
         elegirInterfazCliente();
        IdCliente=Integer.parseInt(idCliente); 
        TipoMantenimiento=2;
        
        btnRestaurar.setVisible(true); 
        cargarDatosCliente( );  
           
    } 
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre_Raz = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtDNI = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" CLIENTE ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(142, 236, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " DATOS PRINCIPAL  ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14))); // NOI18N
        jPanel3.setOpaque(false);

        txtTelefono.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel5.setText("Id                     ");

        txtDireccion.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono             ");

        jLabel6.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel6.setText("Dirección            ");

        txtRuc.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel7.setText("RUC                   ");

        lblIdCliente.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        lblIdCliente.setText("35");

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel3.setText("Nombre (s)     ");

        txtApellidoP.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel2.setText("Apellidos            ");

        txtNombre_Raz.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtNombre_Raz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_RazActionPerformed(evt);
            }
        });

        txtApellidoM.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblIdCliente))
                            .addComponent(txtNombre_Raz, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoM))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdCliente))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoP)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtApellidoM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre_Raz)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(25, 25, 25))
        );

        jPanel5.setBackground(new java.awt.Color(153, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " OTROS DATOS  ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14))); // NOI18N
        jPanel5.setOpaque(false);

        txtDNI.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        lblDNI.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        lblDNI.setText("DNI                   ");

        jLabel9.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel9.setText("Celular               ");

        txtCelular.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel8.setText("E-Mail               ");

        txtEmail.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(lblDNI)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCelular)
                    .addComponent(txtDNI)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDNI)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnRegistrar.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/right.png"))); // NOI18N
        btnRegistrar.setText(" Aceptar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/icon_incorrect.png"))); // NOI18N
        btnCancelar.setText(" Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRestaurar.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/restaurar.png"))); // NOI18N
        btnRestaurar.setText("  Restaurar  ");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRestaurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestaurar)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
    }//GEN-LAST:event_formWindowClosing

    private void txtApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPActionPerformed
         txtNombre_Raz.requestFocus();
         txtNombre_Raz.setText("");
    }//GEN-LAST:event_txtApellidoPActionPerformed

    private void txtNombre_RazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_RazActionPerformed
        txtDNI.requestFocus();
        txtDNI.setText("");
    }//GEN-LAST:event_txtNombre_RazActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
      txtDireccion.requestFocus();
      txtDireccion.setText("");
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        txtEmail.requestFocus();
        txtEmail.setText("");
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        btnRegistrar.setEnabled(true);
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      mostrarInterfazMantenimiento(); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
     switch(TipoMantenimiento)
    {
        case 1:{ // Agregar un Cliente
            if (verificarDatosNecesarios()) {
                 
                registrarCliente( ) ; 
                 limpiar();
                 actualizarCodigo();
            }  
        break;}
       
        case 2:{ // Modificar un Cliente
               if (verificarDatosNecesarios()){
                   modificarCliente();
                   mostrarInterfazMantenimiento();
               }else {
                   Mensajes.Alarma(this,"Falta Ingresar correctamente uno de estos Datos: \n - Nombre y Apellidos,\n -DNI \n -Fecha de Nacimiento "
                   + "\n -Cargo \n -Direccion  \n Revise Cuidadosamente los datos Ingresados ..... ");
               }
       break;}
    }        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMActionPerformed
 
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre_Raz;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void elegirInterfazCliente() {
       if(TipoCliente==1){
           this.setTitle(" CLIENTE NATURAL "); 
           
       }else  if(TipoCliente==2){
           this.setTitle(" CLIENTE JURIDICO"); 
           
           jLabel2.setText("Razón Social    "); 
           txtApellidoP.setVisible(false);   txtApellidoM.setVisible(false);  jLabel3.setVisible(false); 
           
           txtNombre_Raz.setBounds(txtRuc.getBounds());
           lblDNI.setVisible(false); txtDNI.setVisible(false); 
       }
    } 
    
    private void cargarFondo(){
           Fondo_Registros F = new Fondo_Registros();
           F.setSize(920,669);
           this.add(F,BorderLayout.CENTER);
           this.pack();
           setLocationRelativeTo(null);
           txtApellidoP.requestFocus();  
         
   }
     
    private void cargarNumCliente(){
       try {
            MantenimientoDatos  objmante = new MantenimientoDatos();// abrimos conexion 
            String sql = "select max(Idcliente)as Cant from cliente;"; // 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())  
                 IdCliente= rs.getInt("Cant");     
            rs.close(); 
            objmante.CerrarConexion();  
        } catch (Exception e) {
            Mensajes.Error(null," No se pudo ejecutar la consulta : Verifique la conexion"+e); 
            this.dispose();
        } 
   }
      
    private void actualizarCodigo() {
        IdCliente=IdCliente+1; 
        lblIdCliente.setText(""+IdCliente); 
    }

    private boolean verificarDatosNecesarios() {
      boolean respuesta=false;
      if( txtRuc.getText() == null ? ("") != null : !txtRuc.getText().equals("") )
       {  if (txtNombre_Raz.getText() == null ? ("") != null : !txtNombre_Raz.getText().equals(""))
                  {   if (txtTelefono.getText() == null ? ("") != null : !txtTelefono.getText().equals(""))
                      {  
                          respuesta=true;
                                 
                      } else{  Mensajes.Alarma(this,"La direccion del empleado es necesaria "); } 
                  } else{  Mensajes.Alarma(this,"Son 8 digitos en el DNI "); } 
            
         }else{  Mensajes.Alarma(this,"El Ruc no puede estar Vacio "); } 
      return respuesta;
    }

    private void registrarCliente() {
          ActualizarDatos();
          try{ 
              MantenimientoDatos registrar= new MantenimientoDatos(); 
              registrar.insertarCliente(IdCliente,TipoCliente,ruc,direccion,telefono,e_mail,celular);
              if(TipoCliente==1){  registrar.insertarClienteNatural(IdCliente,NombreRaz, apellidoP,apellidoM,DNI);}
              else if(TipoCliente==2){   registrar.insertarClienteJuridico(IdCliente,NombreRaz );}
              Mensajes.Informar(this,"Se Registro exitosamente al Cliente :"+IdCliente);
              registrar.CerrarConexion() ;  
        } catch(Exception e){
            Mensajes.Error(this,"Error no se pudo guardar por =>"+e.getLocalizedMessage());
        }
    }

     private void ActualizarDatos() {
          ruc=txtRuc.getText();
          NombreRaz=txtNombre_Raz.getText();
          direccion=txtDireccion.getText();
          telefono=ValidarEstado(txtTelefono.getText()); 
          celular=ValidarEstado(txtCelular.getText());
          e_mail=ValidarEstado(txtEmail.getText()); 
         if(TipoCliente==1){ // Natural
              apellidoP=txtApellidoP.getText();
              apellidoM=txtApellidoM.getText();
              DNI=txtDNI.getText(); 
         }
    }
     
    private void modificarCliente() {
           ActualizarDatos();
          try{ 
              MantenimientoDatos modificarCliente = new MantenimientoDatos(); 
              modificarCliente.modificarCliente(IdCliente, ruc, direccion, telefono, e_mail, celular);
              if(TipoCliente==1){  modificarCliente .modificarClienteNatural(IdCliente, NombreRaz, apellidoP, apellidoM, DNI); }
              else if(TipoCliente==2){   modificarCliente.modificarClienteJuridico(IdCliente, NombreRaz); }
              Mensajes.Informar(this,"Se Modifico exitosamente al Cliente :"+IdCliente);
              modificarCliente.CerrarConexion() ;  
        } catch(Exception e){
            Mensajes.Error(this,"Error no se pudo guardar por =>"+e.getLocalizedMessage());
        }
    }

    private void mostrarInterfazMantenimiento() {
        this.setVisible(false);
        FormularioMantenimientoClientes manCliente= new FormularioMantenimientoClientes();
        manCliente.setVisible(true);
        manCliente.requestFocus();
    }
    
    
   private String ValidarEstado(String atributo) {
      if( atributo.equals("") || atributo == null ||  atributo.equals(" ")) 
           return null;
      else
            return "'"+atributo+"'"; 
    }

    private void limpiar() {
          txtRuc.setText("");
          txtNombre_Raz.setText("");
          txtDireccion.setText("");
          txtTelefono.setText("");
          txtCelular.setText("");
          txtEmail.setText("");
          txtApellidoP.setText("");
          txtDNI.setText(""); 
    }

    private void cargarDatosClienteNatural() {
     MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         try {
            String sql = "SELECT Ruc,Nombres,ApellidoP,ApellidoM,DNI,Direccion,Telefono,Celular,E_mail  "
                    + "FROM cliente inner join cliente_natural  using(idCliente) where idCliente="+IdCliente+" ;";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) { 
                    ruc= rs.getString("Ruc"); 
                    NombreRaz= rs.getString("Nombres"); 
                    apellidoP= rs.getString("ApellidoP"); 
                    apellidoM= rs.getString("ApellidoM"); 
                    DNI=rs.getString("DNI");  
                    direccion = rs.getString("Direccion");
                    telefono=rs.getString("Telefono");
                    celular=rs.getString("Celular"); 
                    e_mail=rs.getString("E_Mail"); 
                     
                    restaurar();
                    
                }
            }
            objmante.CerrarConexion();
        } catch (SQLException | NullPointerException e) {
            Mensajes.Error(this,"Error. No se pudo obtener los datos del empleado : " + e.getLocalizedMessage() );
        }
    }
   
     private void cargarDatosClienteJuridico() {
     MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         try {
            String sql = "SELECT idCliente,Ruc,RazonSocial,Direccion,Telefono,E_mail,Celular FROM cliente inner join cliente_juridico  using(idCliente)  where idCliente="+IdCliente+" ;";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) { 
                    ruc= rs.getString("Ruc"); 
                    NombreRaz= rs.getString("RazonSocial");  
                    direccion = rs.getString("Direccion");
                    telefono=rs.getString("Telefono");
                    e_mail=rs.getString("E_Mail"); 
                    celular=rs.getString("Celular"); 
                    restaurar();
                    
                }
            }
            objmante.CerrarConexion();
        } catch (SQLException | NullPointerException e) {
            Mensajes.Error(this,"Error. No se pudo obtener los datos del empleado : " + e.getLocalizedMessage() );
        }
    }
    
 private void restaurar() {
    txtRuc.setText(ruc);
    txtNombre_Raz.setText( NombreRaz);
    txtDireccion.setText(direccion);
    txtTelefono.setText(telefono); 
    txtCelular.setText(celular);
    txtEmail.setText( e_mail); 
         if(TipoCliente==1){ // Natural
             txtApellidoP.setText( apellidoP );
             txtApellidoM.setText( apellidoM );
             txtDNI.setText(DNI); 
         }             
    }

    private void cargarDatosCliente() {
         if(TipoCliente==1){ cargarDatosClienteNatural();}
         else if(TipoCliente==2){  cargarDatosClienteJuridico();}
    }

}
