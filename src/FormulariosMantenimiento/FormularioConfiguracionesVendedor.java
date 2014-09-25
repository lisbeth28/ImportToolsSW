package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import panFondos.Fondo_Celeste;


public class FormularioConfiguracionesVendedor extends javax.swing.JFrame {
    
    private int NumInicio,NumFin;
    private String Documento; 

    public FormularioConfiguracionesVendedor() {
        initComponents        ();  CargarFondo      (); 
        cargarNumeroDocumento ("CO");  
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONFIGURACIONES DEL SISTEMA");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° DOC. COTIZACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(51, 51, 51)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtNumInicioGE)
                    .addComponent(jtxtNumFinGE, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumInicioGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumFinGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNuevoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoDocActionPerformed
        Documento="CO";
        NuevoNumeroDocumento();
    }//GEN-LAST:event_jbtnNuevoDocActionPerformed

    private void jbtnModificarNDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarNDocActionPerformed
        Documento="CO";
        ActualizarNumeroDocumento();
    }//GEN-LAST:event_jbtnModificarNDocActionPerformed

    private void btnCancelarMoneda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMoneda4ActionPerformed
         Documento="CO";
        cargarNumeroDocumento("CO");
    }//GEN-LAST:event_btnCancelarMoneda4ActionPerformed
 
     private void CargarFondo() {
           Fondo_Celeste F = new  Fondo_Celeste();
           F.setSize(993,714); 
           this.add(F,BorderLayout.CENTER);
           this.pack();
           this.setLocationRelativeTo(null);// lOCALIZACIÓN CENTRO
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarMoneda4;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton jbtnModificarNDoc;
    private javax.swing.JButton jbtnNuevoDoc;
    private javax.swing.JTextField jtxtNumFinGE;
    private javax.swing.JTextField jtxtNumInicioGE;
    // End of variables declaration//GEN-END:variables

    private void NuevoNumeroDocumento() {
       NumInicio= Integer.parseInt(jtxtNumInicioGE.getText()); 
        NumFin=  Integer.parseInt(jtxtNumFinGE.getText()); 
        try{
               MantenimientoDatos objmante = new MantenimientoDatos();
               objmante.InsertarNumeroDocumento(Documento,NumInicio,NumFin); 
               Mensajes.Informar(this," Se registro los numeros del Documento ");
               jbtnNuevoDoc.setEnabled(false);
               jbtnModificarNDoc.setEnabled(true);
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registrod del Num. Documento"+e); }
      
    }

    private void ActualizarNumeroDocumento() {
        NumInicio= Integer.parseInt(jtxtNumInicioGE.getText()); 
         NumFin=  Integer.parseInt(jtxtNumFinGE.getText()); 
        try{
               MantenimientoDatos objmante = new MantenimientoDatos();
               objmante.actualizarNumeroDocumento(Documento,NumInicio,NumFin); 
               Mensajes.Informar(this," Se registro los numeros del Documento ");
               
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registrod del Num. Documento"+e); }
      
    }

    private void cargarNumeroDocumento(String DocumentoB) {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         NumInicio =-1; NumFin  =-1; 
         try {  
            String sql = "SELECT NumInicio,NumFin FROM  numerodocumentos where Documento='"+DocumentoB+"';"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql); 
            
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {    NumInicio = rs.getInt("NumInicio"); 
                     NumFin    = rs.getInt("NumFin");    
                }  rs.close();
            }  objmante.CerrarConexion(); 
              if( NumInicio>0)
                    {  jtxtNumInicioGE.setText(""+NumInicio);
                       jtxtNumFinGE   .setText(""+NumFin);
                       jbtnNuevoDoc.setEnabled(false); jbtnModificarNDoc.setEnabled(true); } 
                    else { 
                        jtxtNumInicioGE.setText("");  jtxtNumFinGE   .setText("");
                        jbtnNuevoDoc.setEnabled(true);  jbtnModificarNDoc.setEnabled(false);
                    }  
            
           
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos de la Base de Datos "+ e );
        } 
    }
  
}
