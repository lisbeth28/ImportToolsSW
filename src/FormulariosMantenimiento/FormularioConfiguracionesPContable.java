package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import panFondos.Fondo_Celeste;


public class FormularioConfiguracionesPContable extends javax.swing.JFrame {
    
    private int NumInicio,NumFin,Serie;
    private String Documento; 

    public FormularioConfiguracionesPContable() {
        initComponents        ();  CargarFondo      (); 
        cargarNumeroDocumentof ();    cargarNumeroDocumentoNC();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtxtNumInicioGE = new javax.swing.JTextField();
        jtxtNumFinGE = new javax.swing.JTextField();
        jToolBar3 = new javax.swing.JToolBar();
        jbtnNuevoDoc = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jbtnModificarNDoc = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btnCancelarMoneda4 = new javax.swing.JButton();
        jtxtNumSerie = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtxtNumInicioGE1 = new javax.swing.JTextField();
        jtxtNumFinGE1 = new javax.swing.JTextField();
        jToolBar4 = new javax.swing.JToolBar();
        jbtnNuevoDoc1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jbtnModificarNDoc1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        btnCancelarMoneda5 = new javax.swing.JButton();
        jtxtNumSerie1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONFIGURACIONES DEL SISTEMA");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° DOC. FACTURA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
        jPanel8.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel3.setText("Numero Inicio");

        jLabel21.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel21.setText("Numero Fin");

        jtxtNumInicioGE.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jtxtNumFinGE.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);
        jToolBar3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar3.setOpaque(false);

        jbtnNuevoDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/save.gif"))); // NOI18N
        jbtnNuevoDoc.setToolTipText("Guardar Nuevo Numero");
        jbtnNuevoDoc.setBorder(null);
        jbtnNuevoDoc.setOpaque(false);
        jbtnNuevoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoDocActionPerformed(evt);
            }
        });
        jToolBar3.add(jbtnNuevoDoc);

        jLabel24.setText("      ");
        jToolBar3.add(jLabel24);

        jbtnModificarNDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Modificarr.png"))); // NOI18N
        jbtnModificarNDoc.setToolTipText("Cancelar");
        jbtnModificarNDoc.setBorder(null);
        jbtnModificarNDoc.setOpaque(false);
        jbtnModificarNDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarNDocActionPerformed(evt);
            }
        });
        jToolBar3.add(jbtnModificarNDoc);

        jLabel25.setText("      ");
        jToolBar3.add(jLabel25);

        btnCancelarMoneda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/rollback.png"))); // NOI18N
        btnCancelarMoneda4.setToolTipText("Cancelar");
        btnCancelarMoneda4.setBorder(null);
        btnCancelarMoneda4.setOpaque(false);
        btnCancelarMoneda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMoneda4ActionPerformed(evt);
            }
        });
        jToolBar3.add(btnCancelarMoneda4);

        jtxtNumSerie.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jtxtNumSerie.setToolTipText("Solo 3 Numeros");

        jLabel22.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel22.setText("Serie ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtNumInicioGE)
                        .addComponent(jtxtNumFinGE, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jtxtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumInicioGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumFinGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° DOC. NOTA DE CRÉDITO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
        jPanel9.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel4.setText("Numero Inicio");

        jLabel23.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel23.setText("Numero Fin");

        jtxtNumInicioGE1.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jtxtNumFinGE1.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jToolBar4.setBorder(null);
        jToolBar4.setFloatable(false);
        jToolBar4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar4.setOpaque(false);

        jbtnNuevoDoc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/save.gif"))); // NOI18N
        jbtnNuevoDoc1.setToolTipText("Guardar Nuevo Numero");
        jbtnNuevoDoc1.setBorder(null);
        jbtnNuevoDoc1.setOpaque(false);
        jbtnNuevoDoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoDoc1ActionPerformed(evt);
            }
        });
        jToolBar4.add(jbtnNuevoDoc1);

        jLabel26.setText("      ");
        jToolBar4.add(jLabel26);

        jbtnModificarNDoc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Modificarr.png"))); // NOI18N
        jbtnModificarNDoc1.setToolTipText("Cancelar");
        jbtnModificarNDoc1.setBorder(null);
        jbtnModificarNDoc1.setOpaque(false);
        jbtnModificarNDoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarNDoc1ActionPerformed(evt);
            }
        });
        jToolBar4.add(jbtnModificarNDoc1);

        jLabel27.setText("      ");
        jToolBar4.add(jLabel27);

        btnCancelarMoneda5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/rollback.png"))); // NOI18N
        btnCancelarMoneda5.setToolTipText("Cancelar");
        btnCancelarMoneda5.setBorder(null);
        btnCancelarMoneda5.setOpaque(false);
        btnCancelarMoneda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMoneda5ActionPerformed(evt);
            }
        });
        jToolBar4.add(btnCancelarMoneda5);

        jtxtNumSerie1.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jtxtNumSerie1.setToolTipText("Solo 3 Numeros");

        jLabel28.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel28.setText("Serie ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtNumInicioGE1)
                        .addComponent(jtxtNumFinGE1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jtxtNumSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumInicioGE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumFinGE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNuevoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoDocActionPerformed
        Documento="FA";
        Serie=  Integer.parseInt(jtxtNumSerie   .getText());
        NumInicio= Integer.parseInt(jtxtNumInicioGE.getText()); 
        NumFin=  Integer.parseInt(jtxtNumFinGE.getText()); 
        NuevoNumeroDocumento();
    }//GEN-LAST:event_jbtnNuevoDocActionPerformed

    private void jbtnModificarNDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarNDocActionPerformed
        Documento="FA";
         Serie=  Integer.parseInt(jtxtNumSerie   .getText());
        NumInicio= Integer.parseInt(jtxtNumInicioGE.getText()); 
        NumFin=  Integer.parseInt(jtxtNumFinGE.getText()); 
        ActualizarNumeroDocumento();
    }//GEN-LAST:event_jbtnModificarNDocActionPerformed

    private void btnCancelarMoneda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMoneda4ActionPerformed
         Documento="FA";
         cargarNumeroDocumentof (); 
    }//GEN-LAST:event_btnCancelarMoneda4ActionPerformed

    private void jbtnNuevoDoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoDoc1ActionPerformed
        Documento="NC";
        Serie=  Integer.parseInt(jtxtNumSerie1   .getText());
        NumInicio= Integer.parseInt(jtxtNumInicioGE1.getText()); 
        NumFin=  Integer.parseInt(jtxtNumFinGE1.getText()); 
        NuevoNumeroDocumento();
    }//GEN-LAST:event_jbtnNuevoDoc1ActionPerformed

    private void jbtnModificarNDoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarNDoc1ActionPerformed
          Documento="NC";
          Serie=  Integer.parseInt(jtxtNumSerie1   .getText());
        NumInicio= Integer.parseInt(jtxtNumInicioGE1.getText()); 
        NumFin=  Integer.parseInt(jtxtNumFinGE1.getText()); 
         ActualizarNumeroDocumento();
    }//GEN-LAST:event_jbtnModificarNDoc1ActionPerformed

    private void btnCancelarMoneda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMoneda5ActionPerformed
        Documento="NC";
       cargarNumeroDocumentoNC();
    }//GEN-LAST:event_btnCancelarMoneda5ActionPerformed
 
     private void CargarFondo() {
           Fondo_Celeste F = new  Fondo_Celeste();
           F.setSize(993,714); 
           this.add(F,BorderLayout.CENTER);
           this.pack();
           this.setLocationRelativeTo(null);// lOCALIZACIÓN CENTRO
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarMoneda4;
    private javax.swing.JButton btnCancelarMoneda5;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JButton jbtnModificarNDoc;
    private javax.swing.JButton jbtnModificarNDoc1;
    private javax.swing.JButton jbtnNuevoDoc;
    private javax.swing.JButton jbtnNuevoDoc1;
    private javax.swing.JTextField jtxtNumFinGE;
    private javax.swing.JTextField jtxtNumFinGE1;
    private javax.swing.JTextField jtxtNumInicioGE;
    private javax.swing.JTextField jtxtNumInicioGE1;
    private javax.swing.JTextField jtxtNumSerie;
    private javax.swing.JTextField jtxtNumSerie1;
    // End of variables declaration//GEN-END:variables

    private void NuevoNumeroDocumento() {
       
        try{
               MantenimientoDatos objmante = new MantenimientoDatos();
               objmante.InsertarNumero_SerieDocumento(Documento, NumInicio, NumFin, Serie);
               Mensajes.Informar(this," Se registro los numeros del Documento ");
               jbtnNuevoDoc.setEnabled(false);
               jbtnModificarNDoc.setEnabled(true);
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registrod del Num. Documento"+e); }
      
    }

    private void ActualizarNumeroDocumento() {
      
        try{
               MantenimientoDatos objmante = new MantenimientoDatos();
               objmante.actualizarNumero_SerieDocumento(Documento, NumInicio, NumFin, Serie);
               Mensajes.Informar(this," Se registro los numeros del Documento ");
               
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registrod del Num. Documento"+e); }
      
    }

    private void cargarNumeroDocumentof( ) {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         NumInicio =-1; NumFin  =-1; Serie=-1;
         try {  
            String sql = "SELECT SerieInicio, NumInicio,NumFin FROM  numerodocumentos where Documento='FA';"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql); 
            
            try (ResultSet rs = ps.executeQuery()) 
            {  while (rs.next()) 
                {    Serie     = rs.getInt("SerieInicio"); 
                     NumInicio = rs.getInt("NumInicio"); 
                     NumFin    = rs.getInt("NumFin");    
                }  rs.close();
            }  objmante.CerrarConexion(); 
            if( Serie >0)
                 {    jtxtNumSerie   .setText(""+Serie);
                      jtxtNumInicioGE.setText(""+NumInicio);
                      jtxtNumFinGE   .setText(""+NumFin);
                      jbtnNuevoDoc.setEnabled(false); jbtnModificarNDoc.setEnabled(true); } 
            else { 
                      jtxtNumSerie   .setText("");  jtxtNumInicioGE.setText("");  jtxtNumFinGE   .setText("");
                      jbtnNuevoDoc.setEnabled(true);  jbtnModificarNDoc.setEnabled(false);
                 }  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos de la Base de Datos "+ e );
        } 
    }
    
    private void cargarNumeroDocumentoNC() {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         NumInicio =-1; NumFin  =-1; Serie=-1;
         try {  
            String sql = "SELECT SerieInicio, NumInicio,NumFin FROM  numerodocumentos where Documento='NC';"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql); 
            
            try (ResultSet rs = ps.executeQuery()) 
            {  while (rs.next()) 
                {    Serie     = rs.getInt("SerieInicio"); 
                     NumInicio = rs.getInt("NumInicio"); 
                     NumFin    = rs.getInt("NumFin");    
                }  rs.close();
            }  objmante.CerrarConexion(); 
            if( Serie >0)
                 {    jtxtNumSerie1   .setText(""+Serie);
                      jtxtNumInicioGE1.setText(""+NumInicio);
                      jtxtNumFinGE1   .setText(""+NumFin);
                      jbtnNuevoDoc1.setEnabled(false); jbtnModificarNDoc1.setEnabled(true); } 
            else { 
                      jtxtNumSerie1   .setText("");  jtxtNumInicioGE1.setText("");  jtxtNumFinGE1   .setText("");
                      jbtnNuevoDoc1.setEnabled(true);  jbtnModificarNDoc1.setEnabled(false);
                 }  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos de la Base de Datos "+ e );
        } 
    }
  
}
