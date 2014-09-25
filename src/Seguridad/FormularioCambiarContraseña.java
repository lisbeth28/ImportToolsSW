package Seguridad;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import panFondos.Fondo_Contraseña;

 
public class FormularioCambiarContraseña extends javax.swing.JFrame {
    String idUsuario;
    String Usuario,Contraseña;
     
    public FormularioCambiarContraseña(String User ) {
        initComponents();
        cargarFondo(); 
        Usuario=User;
        setLocationRelativeTo(null); 
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtContraseñaActual = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtContraNuevaVerif = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtContraNueva = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CAMBIAR CONTRASEÑA");
        setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N
        jPanel2.setOpaque(false);

        txtContraseñaActual.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtContraseñaActual.setToolTipText("");
        txtContraseñaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActualActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("CONTRASEÑA            :");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " NUEVA CONTRASEÑA ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.setOpaque(false);

        txtContraNuevaVerif.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtContraNuevaVerif.setEnabled(false);
        txtContraNuevaVerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraNuevaVerifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtContraNuevaVerif)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtContraNuevaVerif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("NUEVA CONTRASEÑA :");

        txtContraNueva.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtContraNueva.setToolTipText("");
        txtContraNueva.setEnabled(false);
        txtContraNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraNuevaActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/right.png"))); // NOI18N
        btnAceptar.setText("  ACEPTAR");
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnAceptar1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnAceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/icon_incorrect.png"))); // NOI18N
        btnAceptar1.setText(" CANCELAR");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContraNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContraseñaActual))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContraNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       int rspst=Mensajes.confirmar(this, "¿Esta seguro(a) de cambia su contraseña?");
       if (rspst==0){ ModificarPasword(); }
       else {limpiar();}
      
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtContraNuevaVerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraNuevaVerifActionPerformed
      verificarPasIguales();
    }//GEN-LAST:event_txtContraNuevaVerifActionPerformed

    private void txtContraseñaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActualActionPerformed
        cargarDatos( );
        if(String.valueOf(txtContraseñaActual.getPassword()).equals(Contraseña )) {
           txtContraNueva.setEnabled(true);   
           txtContraNueva.requestFocus();} else{Mensajes.Informar(this, "Contraseña Invalida"+Contraseña );
        }
    }//GEN-LAST:event_txtContraseñaActualActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
    }//GEN-LAST:event_formWindowClosed

    private void txtContraNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraNuevaActionPerformed
        txtContraNuevaVerif.setEnabled(true);
        txtContraNuevaVerif.requestFocus();
    }//GEN-LAST:event_txtContraNuevaActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtContraNueva;
    private javax.swing.JPasswordField txtContraNuevaVerif;
    private javax.swing.JPasswordField txtContraseñaActual;
    // End of variables declaration//GEN-END:variables
   

    private void cargarFondo() {
           Fondo_Contraseña F = new  Fondo_Contraseña();
           F.setSize(640,329);
           this.add(F,BorderLayout.CENTER);
           this.pack();
           this.setLocationRelativeTo(null);// lOCALIZACIÓN CENTRO
    }

    private void verificarPasIguales() {
        
        if( String.valueOf(txtContraNueva.getPassword()).equals(String.valueOf(txtContraNuevaVerif.getPassword())) ){
              btnAceptar.setEnabled(true); 
            Contraseña=(String.valueOf(txtContraNuevaVerif.getPassword()));
                }
        else{
             Mensajes.Informar(this,"Ambas Contraseñas no son iguales "+"\n"+"Corriga o ingrese una nueva contraseña");
             txtContraNuevaVerif.setText(""); 
             txtContraNuevaVerif.requestFocus();
        }
    }

    private void ModificarPasword() {
              MantenimientoDatos objmante = new MantenimientoDatos();
              objmante.ModificarCONTRASEÑA(idUsuario, Contraseña);
              objmante.CerrarConexion();
              Mensajes.Informar(this, "Se modifico su contraseña, satisfactoriamente");
              this.setVisible(false);
         
    }

    private void cargarDatos( ) {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         try {
            String sql = "SELECT u.idUsuario,aes_decrypt(u.Contraseña ,u.usuario) "
                        + "as Contraseña  FROM Usuario u   WHERE u.usuario ='"+Usuario +"'";
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {     idUsuario =rs.getString("idUsuario");
                  Contraseña = rs.getString("Contraseña");
            }
            rs.close();
            objmante.CerrarConexion();  
        } catch (SQLException |NullPointerException  e) {
            Mensajes.Error(this,"No se pudo verificar la contraseña " );
            txtContraseñaActual.setText(""); 
        }
        
    }

    private void limpiar() {
         txtContraseñaActual.setText("");
         txtContraNueva.setText("");
         txtContraNuevaVerif.setText("");
    }

     
}
