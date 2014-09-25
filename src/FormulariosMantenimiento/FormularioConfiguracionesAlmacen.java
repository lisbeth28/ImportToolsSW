package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import panFondos.Fondo_Celeste;


public class FormularioConfiguracionesAlmacen extends javax.swing.JFrame {
    
    private int NumInicio,NumFin;
    private String Documento;
    private int NuevaUnidad=0,IdUnidad;
    private int Serie;

    public FormularioConfiguracionesAlmacen() {
        initComponents        ();  CargarFondo      (); 
        cargarNumeroDocumento ("GE"); cargarNumeroDocumento ("GD");  cargarUnidMedida ();  cargarNumeroDocumentoGR("GR");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        cmbUnidad = new javax.swing.JComboBox();
        btnCancelarMoneda5 = new javax.swing.JButton();
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
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtxtNumInicioGD = new javax.swing.JTextField();
        jtxtNumFinGD = new javax.swing.JTextField();
        jToolBar4 = new javax.swing.JToolBar();
        jbtnNuevoDocGD = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jbtnModificarNDocGD = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        btnCancelarGD = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtxtNumInicioGR = new javax.swing.JTextField();
        jtxtNumFinGR = new javax.swing.JTextField();
        jToolBar5 = new javax.swing.JToolBar();
        jbtnNuevoDoc1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jbtnModificarNDoc1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        btnCancelarMoneda6 = new javax.swing.JButton();
        jtxtNumSerie = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONFIGURACIONES DEL SISTEMA");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " UNIDADES ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
        jPanel7.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel15.setText("Unidad de Medida   ");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/adicionar.png"))); // NOI18N
        jButton6.setToolTipText("Nuevo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        cmbUnidad.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        cmbUnidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCancelarMoneda5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/rollback.png"))); // NOI18N
        btnCancelarMoneda5.setToolTipText("Cancelar");
        btnCancelarMoneda5.setBorder(null);
        btnCancelarMoneda5.setOpaque(false);
        btnCancelarMoneda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMoneda5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(cmbUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarMoneda5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(cmbUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelarMoneda5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° DOC. GUIA DE ENTRADA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumInicioGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumFinGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)))
        );

        btnAceptar.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/right.png"))); // NOI18N
        btnAceptar.setText(" Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
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

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° DOC. GUIA DE DEVOLUCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
        jPanel9.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel4.setText("Numero Inicio");

        jLabel22.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel22.setText("Numero Fin");

        jtxtNumInicioGD.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jtxtNumFinGD.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jToolBar4.setBorder(null);
        jToolBar4.setFloatable(false);
        jToolBar4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar4.setOpaque(false);

        jbtnNuevoDocGD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/save.gif"))); // NOI18N
        jbtnNuevoDocGD.setToolTipText("Guardar Nuevo Numero");
        jbtnNuevoDocGD.setBorder(null);
        jbtnNuevoDocGD.setOpaque(false);
        jbtnNuevoDocGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoDocGDActionPerformed(evt);
            }
        });
        jToolBar4.add(jbtnNuevoDocGD);

        jLabel26.setText("      ");
        jToolBar4.add(jLabel26);

        jbtnModificarNDocGD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Modificarr.png"))); // NOI18N
        jbtnModificarNDocGD.setToolTipText("Cancelar");
        jbtnModificarNDocGD.setBorder(null);
        jbtnModificarNDocGD.setOpaque(false);
        jbtnModificarNDocGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarNDocGDActionPerformed(evt);
            }
        });
        jToolBar4.add(jbtnModificarNDocGD);

        jLabel27.setText("      ");
        jToolBar4.add(jLabel27);

        btnCancelarGD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/rollback.png"))); // NOI18N
        btnCancelarGD.setToolTipText("Cancelar");
        btnCancelarGD.setBorder(null);
        btnCancelarGD.setOpaque(false);
        btnCancelarGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarGDActionPerformed(evt);
            }
        });
        jToolBar4.add(btnCancelarGD);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtNumInicioGD)
                    .addComponent(jtxtNumFinGD, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumInicioGD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumFinGD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° DOC. GUIA DE REMISION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
        jPanel10.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel5.setText("Numero Inicio");

        jLabel23.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel23.setText("Numero Fin");

        jtxtNumInicioGR.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jtxtNumFinGR.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jToolBar5.setBorder(null);
        jToolBar5.setFloatable(false);
        jToolBar5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar5.setOpaque(false);

        jbtnNuevoDoc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/save.gif"))); // NOI18N
        jbtnNuevoDoc1.setToolTipText("Guardar Nuevo Numero");
        jbtnNuevoDoc1.setBorder(null);
        jbtnNuevoDoc1.setOpaque(false);
        jbtnNuevoDoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoDoc1ActionPerformed(evt);
            }
        });
        jToolBar5.add(jbtnNuevoDoc1);

        jLabel28.setText("      ");
        jToolBar5.add(jLabel28);

        jbtnModificarNDoc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Modificarr.png"))); // NOI18N
        jbtnModificarNDoc1.setToolTipText("Cancelar");
        jbtnModificarNDoc1.setBorder(null);
        jbtnModificarNDoc1.setOpaque(false);
        jbtnModificarNDoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarNDoc1ActionPerformed(evt);
            }
        });
        jToolBar5.add(jbtnModificarNDoc1);

        jLabel29.setText("      ");
        jToolBar5.add(jLabel29);

        btnCancelarMoneda6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/rollback.png"))); // NOI18N
        btnCancelarMoneda6.setToolTipText("Cancelar");
        btnCancelarMoneda6.setBorder(null);
        btnCancelarMoneda6.setOpaque(false);
        btnCancelarMoneda6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMoneda6ActionPerformed(evt);
            }
        });
        jToolBar5.add(btnCancelarMoneda6);

        jtxtNumSerie.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jtxtNumSerie.setToolTipText("Solo 3 Numeros");

        jLabel30.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel30.setText("Serie ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtNumInicioGR)
                        .addComponent(jtxtNumFinGR, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jtxtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumInicioGR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNumFinGR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       NuevaUnidad=1;
       IdUnidad=cmbUnidad.getItemCount();
       IdUnidad=IdUnidad+1;
          
       cmbUnidad.setEditable(true);
       cmbUnidad.removeAllItems(); 
   }//GEN-LAST:event_jButton6ActionPerformed

    private void jbtnNuevoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoDocActionPerformed
        Documento="GE";
        NuevoNumeroDocumento();
    }//GEN-LAST:event_jbtnNuevoDocActionPerformed

    private void jbtnModificarNDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarNDocActionPerformed
        Documento="GE";
        ActualizarNumeroDocumento();
    }//GEN-LAST:event_jbtnModificarNDocActionPerformed

    private void btnCancelarMoneda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMoneda4ActionPerformed
        Documento="GE";
        cargarNumeroDocumento("GE");
    }//GEN-LAST:event_btnCancelarMoneda4ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        verificarUnidadMedida(); 
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);  
  }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarMoneda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMoneda5ActionPerformed
      cmbUnidad.setEditable(false);
      cargarUnidMedida();
    }//GEN-LAST:event_btnCancelarMoneda5ActionPerformed

    private void jbtnNuevoDocGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoDocGDActionPerformed
         Documento="GD";
         NuevoNumeroDocumentoGD();
    }//GEN-LAST:event_jbtnNuevoDocGDActionPerformed

    private void jbtnModificarNDocGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarNDocGDActionPerformed
         Documento="GD";
         ActualizarNumeroDocumentoGD();
    }//GEN-LAST:event_jbtnModificarNDocGDActionPerformed

    private void btnCancelarGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarGDActionPerformed
        Documento="GD";
        cargarNumeroDocumento("GD");
    }//GEN-LAST:event_btnCancelarGDActionPerformed

    private void jbtnNuevoDoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoDoc1ActionPerformed
        Documento = "GR";
        NuevoNumeroDocumentoNS();
    }//GEN-LAST:event_jbtnNuevoDoc1ActionPerformed

    private void jbtnModificarNDoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarNDoc1ActionPerformed
        Documento = "GR";
        ActualizarNumeroDocumentoGR();
    }//GEN-LAST:event_jbtnModificarNDoc1ActionPerformed

    private void btnCancelarMoneda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMoneda6ActionPerformed
        Documento = "GR";
        cargarNumeroDocumentoGR("GR");
    }//GEN-LAST:event_btnCancelarMoneda6ActionPerformed
 
     private void CargarFondo() {
           Fondo_Celeste F = new  Fondo_Celeste();
           F.setSize(993,714); 
           this.add(F,BorderLayout.CENTER);
           this.pack();
           this.setLocationRelativeTo(null);// lOCALIZACIÓN CENTRO
    }
     
    private void cargarUnidMedida() {
        MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
          String  unidad;  cmbUnidad.removeAllItems(); 
          try {
            String sql = " SELECT  Nombre FROM  unidad_medida;"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            System.out.println(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   unidad = rs.getString("Nombre"); 
                    cmbUnidad.addItem(unidad);   
                }
            }
            objmante.CerrarConexion();   
             } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos del los Productos existentes "+"\n"+"Verifique la conexion con la Base de Datos " );
        } 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarGD;
    private javax.swing.JButton btnCancelarMoneda4;
    private javax.swing.JButton btnCancelarMoneda5;
    private javax.swing.JButton btnCancelarMoneda6;
    private javax.swing.JComboBox cmbUnidad;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JButton jbtnModificarNDoc;
    private javax.swing.JButton jbtnModificarNDoc1;
    private javax.swing.JButton jbtnModificarNDocGD;
    private javax.swing.JButton jbtnNuevoDoc;
    private javax.swing.JButton jbtnNuevoDoc1;
    private javax.swing.JButton jbtnNuevoDocGD;
    private javax.swing.JTextField jtxtNumFinGD;
    private javax.swing.JTextField jtxtNumFinGE;
    private javax.swing.JTextField jtxtNumFinGR;
    private javax.swing.JTextField jtxtNumInicioGD;
    private javax.swing.JTextField jtxtNumInicioGE;
    private javax.swing.JTextField jtxtNumInicioGR;
    private javax.swing.JTextField jtxtNumSerie;
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
               switch (DocumentoB) {
                  case "GE":
                   
                    if( NumInicio>0)
                    {  jtxtNumInicioGE.setText(""+NumInicio);
                       jtxtNumFinGE   .setText(""+NumFin);
                       jbtnNuevoDoc.setEnabled(false); jbtnModificarNDoc.setEnabled(true); } 
                    else { 
                        jtxtNumInicioGE.setText("");  jtxtNumFinGE   .setText("");
                        jbtnNuevoDoc.setEnabled(true);  jbtnModificarNDoc.setEnabled(false);
                    }
               
                    break;
                 case "GD":
                     if( NumInicio>0)
                    {  jtxtNumInicioGD.setText(""+NumInicio);
                       jtxtNumFinGD   .setText(""+NumFin);
                        jbtnNuevoDocGD.setEnabled(false); jbtnModificarNDocGD.setEnabled(true); } 
                    else {
                          jtxtNumInicioGD.setText("");  jtxtNumFinGD   .setText("");
                         jbtnNuevoDocGD.setEnabled(true);  jbtnModificarNDocGD.setEnabled(false);}
               
                    break;
            }
           
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos de la Base de Datos "+ e );
        } 
    }

    private void verificarUnidadMedida() {
          if(NuevaUnidad==1){
            agregarNuevaUnidad();
          
         }  
    }

    private void agregarNuevaUnidad() {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         String unidad=String.valueOf(cmbUnidad.getSelectedItem()) ; 
         objmante.InsertarUM(IdUnidad, unidad);
         cmbUnidad.setEditable(false);
         cargarUnidMedida();
    }

    private void NuevoNumeroDocumentoGD() {
         NumInicio= Integer.parseInt(jtxtNumInicioGD.getText()); 
         NumFin=  Integer.parseInt(jtxtNumFinGD.getText()); 
        try{
               MantenimientoDatos objmante = new MantenimientoDatos();
               objmante.InsertarNumeroDocumento(Documento,NumInicio,NumFin); 
               Mensajes.Informar(this," Se registro los numeros del Documento ");
               jbtnNuevoDocGD.setEnabled(false);
               jbtnModificarNDocGD.setEnabled(true);
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registros del Num. Documento"+e); }
      
    }

    private void ActualizarNumeroDocumentoGD() {
        NumInicio = Integer.parseInt(jtxtNumInicioGD.getText()); 
        NumFin    =  Integer.parseInt(jtxtNumFinGD.getText()); 
        try{
             MantenimientoDatos objmante = new MantenimientoDatos();
             objmante.actualizarNumeroDocumento(Documento,NumInicio,NumFin); 
             Mensajes.Informar(this," Se registro los numeros del Documento ");
               
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registrod del Num. Documento"+e); }
      
    }

    private void NuevoNumeroDocumentoNS() {
        Serie=  Integer.parseInt(jtxtNumSerie   .getText());
        NumInicio= Integer.parseInt(jtxtNumInicioGR.getText()); 
        NumFin=  Integer.parseInt(jtxtNumFinGR.getText()); 
        try{
               MantenimientoDatos objmante = new MantenimientoDatos();
               objmante.InsertarNumero_SerieDocumento(Documento, NumInicio, NumFin, Serie);
               Mensajes.Informar(this," Se registro los numeros del Documento ");
               jbtnNuevoDoc1.setEnabled(false);
               jbtnModificarNDoc1.setEnabled(true);
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registrod del Num. Documento"+e); }
      
    
    }

    private void ActualizarNumeroDocumentoGR() {
       Serie=  Integer.parseInt(jtxtNumSerie   .getText());
        NumInicio= Integer.parseInt(jtxtNumInicioGR.getText()); 
        NumFin=  Integer.parseInt(jtxtNumFinGR.getText()); 
        try{
               MantenimientoDatos objmante = new MantenimientoDatos();
               objmante.actualizarNumero_SerieDocumento(Documento, NumInicio, NumFin, Serie);
               Mensajes.Informar(this," Se registro los numeros del Documento ");
               
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registrod del Num. Documento"+e); }
      
    
    }

    private void cargarNumeroDocumentoGR(String gR) {
       MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         NumInicio =-1; NumFin  =-1; Serie=-1;
         try {  
            String sql = "SELECT SerieInicio, NumInicio,NumFin FROM  numerodocumentos where Documento='"+gR+"';"; 
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
                      jtxtNumInicioGR.setText(""+NumInicio);
                      jtxtNumFinGR   .setText(""+NumFin);
                      jbtnNuevoDoc1.setEnabled(false); jbtnModificarNDoc1.setEnabled(true); } 
            else { 
                      jtxtNumSerie   .setText("");  jtxtNumInicioGR.setText("");  jtxtNumFinGR   .setText("");
                      jbtnNuevoDoc1.setEnabled(true);  jbtnModificarNDoc1.setEnabled(false);
                 }  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos de la Base de Datos "+ e );
        } 
    
    }
    
    
}
