package Seguridad;

import Seguridad.PanBienvenidos_; 
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import panFondos.Fondo_Usuario;

 
public class FormularioRegistrarUsuario extends javax.swing.JFrame {
    private int CodEmpleado;
    private String Usuario,Contraseña; 
    private int codigoUsuario;
    
    public FormularioRegistrarUsuario(int codEmpl , String usuariodefct, String contraseñadefct) {
        initComponents();
        cargarFondo(); 
        Usuario=usuariodefct;
        Contraseña=contraseñadefct; 
        txtUsuario.requestFocus();
        CodEmpleado=codEmpl;
        cargarNumUsuario();
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtContraVerificada = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" REGISTRAR USUARIO");
        setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N
        jPanel2.setOpaque(false);

        txtContraseña.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel1.setText("USUARIO");

        txtUsuario.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel2.setText("CONTRASEÑA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Verificar Contraseña ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);

        txtContraVerificada.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        txtContraVerificada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraVerificadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtContraVerificada, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtContraVerificada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(txtContraseña)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnAceptar.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/right.png"))); // NOI18N
        btnAceptar.setText(" Aceptar ");
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnAceptar1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnAceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/icon_incorrect.png"))); // NOI18N
        btnAceptar1.setText(" Cancelar ");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       RegistrarUsuario(); 
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtContraVerificadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraVerificadaActionPerformed
      verificarPasIguales();
    }//GEN-LAST:event_txtContraVerificadaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtContraseña.requestFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        txtContraVerificada.requestFocus();
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      usuarioXdefecto();
    }//GEN-LAST:event_formWindowClosed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        usuarioXdefecto();
        this.dispose();
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtContraVerificada;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    
    private void usuarioXdefecto() {
         MantenimientoDatos objmante = new MantenimientoDatos();
         objmante.InsertarUsuario( codigoUsuario, CodEmpleado, Usuario, Contraseña);
         objmante.CerrarConexion();
         Mensajes.Informar(this,"Se Registro exitosamente el usuario");
 }

    private void cargarFondo() {
           Fondo_Usuario F = new  Fondo_Usuario();
           F.setSize(540,329);
           this.add(F,BorderLayout.CENTER);
           this.pack();
           setLocationRelativeTo(null);
    }

  
     private void cargarNumUsuario(){
       try {
            MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
            String sql = "select count(*) as Cant from usuario ;"; // 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())  
                 codigoUsuario= rs.getInt("Cant");     
            rs.close(); 
            objmante.CerrarConexion();   
            codigoUsuario= codigoUsuario+1;
        } catch (Exception e) {
            Mensajes.Error(null," No se pudo ejecutar la consulta : Verifique la conexion");
             
        } 
   }
     
    private void verificarPasIguales() {
         if( String.valueOf(txtContraseña.getPassword()).equals(String.valueOf(txtContraVerificada.getPassword())) )
              btnAceptar.setEnabled(true); 
         else{
             Mensajes.Informar(this,"Ambas Contraseñas no son iguales "+"\n"+"Corriga o ingrese una nueva contraseña");
             txtContraVerificada.setText(""); 
             txtContraVerificada.requestFocus();
        }
    }

    private void RegistrarUsuario() {   
        if(txtUsuario.getText()!=null || txtContraseña.getPassword() !=null )
        {
            try{ 
                    Usuario=txtUsuario.getText();
                    Contraseña=String.valueOf(txtContraVerificada.getPassword()); 
                    MantenimientoDatos objmante = new MantenimientoDatos();
                    objmante.InsertarUsuario( codigoUsuario, CodEmpleado, Usuario, Contraseña);
                    objmante.CerrarConexion();
                    Mensajes.Informar(this,"Se Registro exitosamente el usuario"); 
            } catch(Exception e){
                Mensajes.Error(this, "No se pudo registrar el empleado en la BD"+e);
            }

           if( CodEmpleado==1)
            {  PanBienvenidos_ p1= new  PanBienvenidos_();
                p1.setVisible(true);   //FormularioListarProveedor 
            }  
           this.setVisible(false); 
      } 
    }
     
}
