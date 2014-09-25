package Seguridad;

import FormulariosPrincipales.MENU_ADMINISTRADOR;
import FormulariosPrincipales.MENU_ALMACENERO;
import FormulariosPrincipales.MENU_COBRANZAS;
import FormulariosPrincipales.MENU_VENDEDOR;
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.StringTokenizer;
import panFondos.PnlFondoInterfAcceso;

public class panAcceso extends javax.swing.JFrame {
   
    private String Usuario;
    private String Contraseña;
    private String Cargo=null;
    int cont=120, contadorCargado=120;
    Thread hilo;
    Object objeto = new Object();
    int intentosUSUARIO=3;
    int intentosCONTRASEÑA=3;
    
    public panAcceso() {
        initComponents();
        setLocationRelativeTo(null);
        cargarFondo();
        barraCuenta.setVisible(false);  
        cargarCuenta() ;  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        lblBienvenido = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        barraCuenta = new javax.swing.JProgressBar();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IMPORT TOOLS WAREHOUSE AND TRADING SYSTEM");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA   :");

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jLabel1.setText("USUARIO         :");

        TxtUsuario.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        lblBienvenido.setBackground(new java.awt.Color(204, 204, 204));
        lblBienvenido.setFont(new java.awt.Font("NSimSun", 0, 15)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(0, 0, 255));
        lblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenido.setText("SOLO PERSONAL AUTORIZADO");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        barraCuenta.setStringPainted(true);

        btnEntrar.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/IconoLogin.png"))); // NOI18N
        btnEntrar.setText("   INGRESAR  ");
        btnEntrar.setEnabled(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, 10)
                .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtUsuario)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(barraCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBienvenido))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        ComprobarUsuario (TxtUsuario.getText().trim());
        comprobarIntentos();
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
      if( !("".equals(TxtUsuario.getText())))
           verificarPassword();
      comprobarIntentos();  
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
         definirMenu();
         grabarcuentaTotal();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       grabarcuentaTotal();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarCuenta();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       grabarcuentaTotal();
    }//GEN-LAST:event_formWindowClosing
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JProgressBar barraCuenta;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
 
    private void ComprobarUsuario(String usuar) {
        lblBienvenido.setText("  SOLO PERSONAL AUTORIZADO  ");
        lblBienvenido.setForeground(new java.awt.Color(0,0,255));
        try {
                MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
                String sql = "SELECT  u.usuario,aes_decrypt(u.Contraseña ,u.usuario) as Contraseña,c.Nombre as Cargo FROM cargo c INNER JOIN empleado e using( idCargo) "
                + "INNER JOIN Usuario u using(idEmpleado)  WHERE u.usuario ='"+usuar+"';";     
                PreparedStatement ps = objmante.conexion.prepareStatement(sql);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) 
                    {   Usuario= rs.getString("usuario");  
                        Contraseña= rs.getString("Contraseña");  
                        Cargo= rs.getString("Cargo"); 
                    }
                }
                objmante.CerrarConexion();
                if( ( Usuario== null || Usuario.equals(""))){
                        lblBienvenido.setText("  !!! Nombre de usuario no existe !!! ");
                        lblBienvenido.setForeground(new java.awt.Color(255, 0, 0));
                        intentosUSUARIO=intentosUSUARIO-1;
                        TxtUsuario.setText(""); 
                        TxtUsuario.requestFocus();
                }else {
                        txtPassword.requestFocus();
                        lblBienvenido.setText(" INGRESE CONTRASEÑA ");
                        lblBienvenido.setForeground(new java.awt.Color(0,0,255));
                }
        } catch (Exception e ) {
                        Mensajes.Error(this,"Error. No se pudo ejecutar la consulta: "+e);
                        TxtUsuario.requestFocus();
                        TxtUsuario.setText("");
                }
 }  
    
 
    private void verificarPassword() {
          lblBienvenido.setText("  SOLO PERSONAL AUTORIZADO  ");
          lblBienvenido.setForeground(new java.awt.Color(0,0,255));
          ComprobarUsuario (TxtUsuario.getText().trim());
          if( TxtUsuario.getText()!= null ){
            String pass = new String(txtPassword.getPassword());
            if(pass.equals(Contraseña)){
                btnEntrar.setEnabled(true);
                limpiar();
                lblBienvenido.setText("  PUEDE INGRESAR ");
                lblBienvenido.setForeground(new java.awt.Color(0,0,255));
            } else{
                lblBienvenido.setText("  !!! CONTRASEÑA INCORRECTA  !!! ");
                lblBienvenido.setForeground(new java.awt.Color(255, 0, 0));
                txtPassword.setText("");
                txtPassword.requestFocus();
                intentosCONTRASEÑA=intentosCONTRASEÑA-1;
            }
          }  
    }
 
     private void grabarcuentaTotal() {
         try {  if(cont>120)
                      cont=120;
                  FileWriter fw = new FileWriter("cuenta.txt");
            try ( PrintWriter pw = new PrintWriter(fw)) {
                   pw.println(cont+"," );
            }
           } catch(Exception ex){ Mensajes.Alarma(this, "no grabo"+ex); } 
          
    }

    private void cargarCuenta() {
        try {
              TxtUsuario.requestFocus();
              FileReader fr = new FileReader("cuenta.txt");
              try ( BufferedReader br = new BufferedReader(fr)) {
                  String linea;
                  while((linea=br.readLine())!=null){
                        StringTokenizer st = new StringTokenizer(linea,",");
                        contadorCargado=Integer.parseInt(st.nextToken());
                        if ( contadorCargado !=120){
                             bloquearTodo(); 
                        }                  
                }
            }
        }catch(IOException | NumberFormatException ex){  contadorCargado=0; }   
        
    }
     private void bloquearTodo() {
             barraCuenta.setVisible(true); 
             TxtUsuario.setEnabled(false); 
             txtPassword.setEnabled(false); 
             btnEntrar.setEnabled(false);
             Mensajes.Alarma(this," 3 Intentos Fallidos por favor espere 3 min"); 
             iniciaCuenta();
        
    }
     public void iniciaCuenta() {
        if( hilo == null ) {
        hilo = new ThreadCarga();
        hilo.start();
      }
   }

    private void limpiar() {
         TxtUsuario.setText("");
         txtPassword.setText(""); 
    }
    
    class ThreadCarga extends Thread {
      public void run() {
      barraCuenta.setValue( 0 );
      barraCuenta.setMinimum(0 );
      barraCuenta.setMaximum( 120 );
      for ( cont=contadorCargado; cont <=120; cont++ ) {
          barraCuenta.setValue( cont );
          lblBienvenido.setVisible(false);  
          btnEntrar.setVisible(false); 
      if(cont==120){
           habilitarTodo();
           barraCuenta.setVisible(false);
           
           lblBienvenido.setVisible(true);  
           lblBienvenido.setForeground(new java.awt.Color(0,0,255));
           lblBienvenido.setText(" SOLO PERSONAL AUTORIZADO ");  
           btnEntrar.setVisible(true);
      }
      synchronized( objeto ) {
          try {
          objeto.wait( 100 );
        } catch( InterruptedException e ) { }
       }
      } 
      hilo = null;
    }
    
  }
     private void habilitarTodo() {
             TxtUsuario.setEnabled(true); 
             txtPassword.setEnabled(true);  
             intentosUSUARIO=3;
             intentosCONTRASEÑA=3;
             contadorCargado=120;
        }
    private void comprobarIntentos() {
        
          if(intentosUSUARIO <= 0 ){
             contadorCargado= 0;
             bloquearTodo();}
          else if(intentosCONTRASEÑA <= 0 ){
             contadorCargado= 0;
             bloquearTodo();}
      }  
    


    private void cargarFondo() {
       PnlFondoInterfAcceso F = new  PnlFondoInterfAcceso();
       F.setSize(670,349); 
       this.add(F,BorderLayout.CENTER);
       this.pack(); 
    }

    
    private void definirMenu() {
        if(( TxtUsuario.getText() != null || txtPassword.getPassword() != null) ){
           switch (Cargo) {
            case "Administrador":
                {
                    MENU_ADMINISTRADOR jFrame= new   MENU_ADMINISTRADOR(Usuario);
                    jFrame.setVisible(true);
                    this.setVisible(false);
                    break;
                }
            case "Vendedor":
                {
                    MENU_VENDEDOR jFrame= new MENU_VENDEDOR(Usuario);
                    jFrame.setVisible(true);
                    this.setVisible(false);
                    break;
                }
            case "P.Contable":
                {
                    MENU_COBRANZAS jFrame = new   MENU_COBRANZAS(Usuario);
                    jFrame.setVisible(true);
                    this.setVisible(false);
                    break;
                }
            case "Almacen":
                {
                    MENU_ALMACENERO jFrame= new  MENU_ALMACENERO (Usuario);
                    jFrame.setVisible(true);
                    this.setVisible(false);
                    break;
                }
        }
        } else {
            lblBienvenido.setText(" INGRESE ALGUN USUARIO ");
            lblBienvenido.setForeground(new java.awt.Color(0,0,255));
        }
        }
      
    
}



