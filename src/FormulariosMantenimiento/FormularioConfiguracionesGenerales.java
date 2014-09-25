package FormulariosMantenimiento;

import FormulariosPrincipales.MENU_ADMINISTRADOR;
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import panFondos.Fondo_Celeste;

public class FormularioConfiguracionesGenerales extends javax.swing.JFrame {
   
    private int IdMoneda;String IdIGVUsado; String ValorUsado;
    private int NuevaMoneda=0;
    private String file,RazonSocial, Ruc, Direccion, Telefono, Nextel,Correo;
    private String web;
    private int NuevoAlmacen=0;
    private int IdAlmacen=0;
    private int ModificarDatos=0;
    private int idIGV;
    private int idEmpleado;
    private final String usuario;
    private int NuevoIGV;
    private int NumInicio=0, NumFin=0;
    private String Documento="OC";
    private String fileAnterior;
    
    public FormularioConfiguracionesGenerales() {
        initComponents();  usuario=MENU_ADMINISTRADOR.Usuario;
        cargarMonedas(); cargarDatosEmpresa();listarIGV();
        CargarFondo();cargarAlmacenes();  cargarNumeroDocumento();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jcmbIGV = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnCancelarMoneda2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblImagen = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel11 = new javax.swing.JLabel();
        btnsubirImg = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btncancImg = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNextel = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtWeb = new javax.swing.JTextField();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel19 = new javax.swing.JLabel();
        jbtnNuevoDatosEmpresa = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jbtnModificarDatoesEmp = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnCancelarMoneda3 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cmbNombreMoneda = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbIdmoneda = new javax.swing.JComboBox();
        cmbTipoCambio = new javax.swing.JComboBox();
        btnNuevaMoneda = new javax.swing.JButton();
        btnCancelarMoneda = new javax.swing.JButton();
        btnNuevaMoneda2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jcmbDescripAlmc = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        cmbIdAlmacen = new javax.swing.JComboBox();
        cmbDireccion = new javax.swing.JComboBox();
        btnCancelarMoneda1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtxtNumInicio = new javax.swing.JTextField();
        jtxtNumFin = new javax.swing.JTextField();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel23 = new javax.swing.JLabel();
        jbtnNuevoDoc = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jbtnModificarNDoc = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btnCancelarMoneda4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" ConfiguracionesGenerales");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " IGV ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
        jPanel2.setOpaque(false);

        jcmbIGV.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jcmbIGV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12 ", "13", "14", "19" }));

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel4.setText("%");

        jLabel8.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel8.setText("IGV Utilizado        ");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/agregar_.png"))); // NOI18N
        jButton5.setToolTipText("Nuevo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnCancelarMoneda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/delete_over.png"))); // NOI18N
        btnCancelarMoneda2.setToolTipText("Cancelar");
        btnCancelarMoneda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMoneda2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmbIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btnCancelarMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jcmbIGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " DATOS DE LA EMPRESA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel1.setText("Razon Social  ");

        txtRazonSocial.setEditable(false);
        txtRazonSocial.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel2.setText("Ruc                ");

        txtRuc.setEditable(false);
        txtRuc.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        txtDireccion.setEditable(false);
        txtDireccion.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel6.setText("Dirección          ");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " LOGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14))); // NOI18N
        jPanel4.setOpaque(false);

        jScrollPane1.setViewportView(lblImagen);

        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setOpaque(false);

        jLabel11.setText("      ");
        jToolBar1.add(jLabel11);

        btnsubirImg.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnsubirImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/image.gif"))); // NOI18N
        btnsubirImg.setBorder(null);
        btnsubirImg.setOpaque(false);
        btnsubirImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubirImgActionPerformed(evt);
            }
        });
        jToolBar1.add(btnsubirImg);

        jLabel12.setText("      ");
        jToolBar1.add(jLabel12);

        btncancImg.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btncancImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/not.gif"))); // NOI18N
        btncancImg.setBorder(null);
        btncancImg.setOpaque(false);
        btncancImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancImgActionPerformed(evt);
            }
        });
        jToolBar1.add(btncancImg);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 91, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel7.setText("Telefono ");

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        txtNextel.setEditable(false);
        txtNextel.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel16.setText("Nextel");

        jLabel17.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel17.setText("Correo");

        txtCorreo.setEditable(false);
        txtCorreo.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel18.setText("Web");

        txtWeb.setEditable(false);
        txtWeb.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jToolBar2.setBorder(null);
        jToolBar2.setFloatable(false);
        jToolBar2.setOpaque(false);

        jLabel19.setText("      ");
        jToolBar2.add(jLabel19);

        jbtnNuevoDatosEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/save.gif"))); // NOI18N
        jbtnNuevoDatosEmpresa.setToolTipText("Nuevo");
        jbtnNuevoDatosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoDatosEmpresaActionPerformed(evt);
            }
        });
        jToolBar2.add(jbtnNuevoDatosEmpresa);

        jLabel22.setText("      ");
        jToolBar2.add(jLabel22);

        jbtnModificarDatoesEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Modificarr.png"))); // NOI18N
        jbtnModificarDatoesEmp.setToolTipText("Nuevo");
        jbtnModificarDatoesEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarDatoesEmpActionPerformed(evt);
            }
        });
        jToolBar2.add(jbtnModificarDatoesEmp);

        jLabel20.setText("      ");
        jToolBar2.add(jLabel20);

        btnCancelarMoneda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/rollback.png"))); // NOI18N
        btnCancelarMoneda3.setToolTipText("Cancelar");
        btnCancelarMoneda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMoneda3ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnCancelarMoneda3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNextel))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtRazonSocial))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtNextel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)))
                            .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/icon_incorrect.png"))); // NOI18N
        btnCancelar.setText(" Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/right.png"))); // NOI18N
        btnAceptar.setText(" Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " MONEDA  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
        jPanel5.setOpaque(false);

        cmbNombreMoneda.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        cmbNombreMoneda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soles ", "Dolares" }));
        cmbNombreMoneda.setEnabled(false);
        cmbNombreMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNombreMonedaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel9.setText("Moneda   ");

        jLabel10.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel10.setText("Valor de Tipo  de Cambio ");

        cmbIdmoneda.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        cmbIdmoneda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Id ...", "1", "2", "3", "4" }));
        cmbIdmoneda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbIdmonedaItemStateChanged(evt);
            }
        });

        cmbTipoCambio.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        cmbTipoCambio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTipoCambio.setEnabled(false);

        btnNuevaMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/agregar_.png"))); // NOI18N
        btnNuevaMoneda.setToolTipText("Nuevo");
        btnNuevaMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMonedaActionPerformed(evt);
            }
        });

        btnCancelarMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/delete_over.png"))); // NOI18N
        btnCancelarMoneda.setToolTipText("Cancelar");
        btnCancelarMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMonedaActionPerformed(evt);
            }
        });

        btnNuevaMoneda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Modificarr.png"))); // NOI18N
        btnNuevaMoneda2.setToolTipText("Nuevo");
        btnNuevaMoneda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMoneda2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cmbIdmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNombreMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(cmbTipoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97)
                .addComponent(btnNuevaMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevaMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbIdmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNombreMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " ALMACEN ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
        jPanel6.setOpaque(false);

        jcmbDescripAlmc.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jcmbDescripAlmc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soles ", "Dolares" }));
        jcmbDescripAlmc.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel13.setText("Almacen ");

        jLabel14.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel14.setText("Direccion ");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/agregar_.png"))); // NOI18N
        jButton4.setToolTipText("Nuevo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cmbIdAlmacen.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        cmbIdAlmacen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Id ...", "1", "2", "3", "4" }));
        cmbIdAlmacen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbIdAlmacenItemStateChanged(evt);
            }
        });

        cmbDireccion.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        cmbDireccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDireccion.setEnabled(false);

        btnCancelarMoneda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/delete_over.png"))); // NOI18N
        btnCancelarMoneda1.setToolTipText("Cancelar");
        btnCancelarMoneda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMoneda1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel13)
                .addGap(28, 28, 28)
                .addComponent(cmbIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmbDescripAlmc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(btnCancelarMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(cmbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcmbDescripAlmc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(cmbIdAlmacen, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(150, 150, 150))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUMERO DE DOCUMENTO ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14), java.awt.Color.black)); // NOI18N
        jPanel7.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel3.setText("Numero Inicio");

        jLabel21.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel21.setText("Numero Fin");

        jtxtNumInicio.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jtxtNumFin.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);
        jToolBar3.setOpaque(false);

        jLabel23.setText("      ");
        jToolBar3.add(jLabel23);

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(51, 51, 51)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtNumInicio)
                    .addComponent(jtxtNumFin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       verificarDatosEmpresa();
        verificarMoneda();     verificarAlmacen();
         verificarIGV();
    }//GEN-LAST:event_btnAceptarActionPerformed

//GEN-FIRST:event_jButton2ActionPerformed
 
//GEN-LAST:event_jButton2ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);  
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnsubirImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubirImgActionPerformed
     cargarImagen(); generarCopiaImagen( ); 
    }//GEN-LAST:event_btnsubirImgActionPerformed

    private void btncancImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancImgActionPerformed
     limpiarImagen();
   }//GEN-LAST:event_btncancImgActionPerformed

    private void cmbIdmonedaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbIdmonedaItemStateChanged
      try{ if(cmbIdmoneda.getSelectedIndex()>=0){
            cmbNombreMoneda.setSelectedIndex(cmbIdmoneda.getSelectedIndex());
            cmbTipoCambio.setSelectedIndex(cmbIdmoneda.getSelectedIndex());
            }
         
       }catch(Exception e){}
    }//GEN-LAST:event_cmbIdmonedaItemStateChanged

    private void btnNuevaMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMonedaActionPerformed
           NuevaMoneda=1;
          
           IdMoneda=cmbIdmoneda.getItemCount();
           IdMoneda=IdMoneda+1;
           
           cmbIdmoneda.removeAllItems();
           cmbIdmoneda.addItem(IdMoneda); 
           cmbIdmoneda.setEnabled(false); 
           
           cmbNombreMoneda.setEnabled(true);
           cmbNombreMoneda.setEditable(true);
           
           cmbNombreMoneda.removeAllItems();
           cmbNombreMoneda.requestFocus();
           
           cmbTipoCambio.setEnabled(true);
           cmbTipoCambio.setEditable(true);
            
           cmbTipoCambio.removeAllItems(); 
    }//GEN-LAST:event_btnNuevaMonedaActionPerformed

    private void cmbNombreMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNombreMonedaActionPerformed
            
    }//GEN-LAST:event_cmbNombreMonedaActionPerformed

    private void btnCancelarMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMonedaActionPerformed
          estadoNormalMoneda();
    }//GEN-LAST:event_btnCancelarMonedaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           NuevoAlmacen=1;
          
           IdAlmacen=cmbIdAlmacen.getItemCount();
           IdAlmacen=IdAlmacen+1;
           
           cmbIdAlmacen.removeAllItems();
           cmbIdAlmacen.addItem(IdAlmacen); 
           cmbIdAlmacen.setEnabled(false); 
           
           jcmbDescripAlmc.setEnabled(true);
           jcmbDescripAlmc.setEditable(true);
           
           jcmbDescripAlmc.removeAllItems();
           jcmbDescripAlmc.requestFocus();
           
          cmbDireccion.setEnabled(true);
          cmbDireccion.setEditable(true);
            
          cmbDireccion.removeAllItems(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         NuevoIGV=1;
        jcmbIGV.setEditable(true); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnCancelarMoneda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMoneda2ActionPerformed
         NuevoIGV=0; jcmbIGV.setEditable(false); 
    }//GEN-LAST:event_btnCancelarMoneda2ActionPerformed

    private void cmbIdAlmacenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbIdAlmacenItemStateChanged
     try{  if ( cmbIdAlmacen.getSelectedIndex() >= 0){
           jcmbDescripAlmc.setSelectedIndex(cmbIdAlmacen.getSelectedIndex());
           cmbDireccion.setSelectedIndex(cmbIdAlmacen.getSelectedIndex()); }
      }catch(Exception e){}
    }//GEN-LAST:event_cmbIdAlmacenItemStateChanged

    private void btnCancelarMoneda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMoneda1ActionPerformed
      estadoNormalAlmacen();
    }//GEN-LAST:event_btnCancelarMoneda1ActionPerformed

    private void jbtnModificarDatoesEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarDatoesEmpActionPerformed
        ModificarDatos=1;
        preparaModificacion();
    }//GEN-LAST:event_jbtnModificarDatoesEmpActionPerformed

    private void btnCancelarMoneda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMoneda3ActionPerformed
       ModificarDatos=0;
       cancelarModificacion(); restaurar() ;
    }//GEN-LAST:event_btnCancelarMoneda3ActionPerformed

    private void jbtnNuevoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoDocActionPerformed
      NuevoNumeroDocumento();
    }//GEN-LAST:event_jbtnNuevoDocActionPerformed

    private void jbtnModificarNDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarNDocActionPerformed
     ActualizarNumeroDocumento();
    }//GEN-LAST:event_jbtnModificarNDocActionPerformed

    private void btnNuevaMoneda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMoneda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaMoneda2ActionPerformed

    private void btnCancelarMoneda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMoneda4ActionPerformed
     cargarNumeroDocumento();
    }//GEN-LAST:event_btnCancelarMoneda4ActionPerformed

    private void jbtnNuevoDatosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoDatosEmpresaActionPerformed
     NuevoDatosEmpresa(); 
    }//GEN-LAST:event_jbtnNuevoDatosEmpresaActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarMoneda;
    private javax.swing.JButton btnCancelarMoneda1;
    private javax.swing.JButton btnCancelarMoneda2;
    private javax.swing.JButton btnCancelarMoneda3;
    private javax.swing.JButton btnCancelarMoneda4;
    private javax.swing.JButton btnNuevaMoneda;
    private javax.swing.JButton btnNuevaMoneda2;
    private javax.swing.JButton btncancImg;
    private javax.swing.JButton btnsubirImg;
    private javax.swing.JComboBox cmbDireccion;
    private javax.swing.JComboBox cmbIdAlmacen;
    private javax.swing.JComboBox cmbIdmoneda;
    private javax.swing.JComboBox cmbNombreMoneda;
    private javax.swing.JComboBox cmbTipoCambio;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton jbtnModificarDatoesEmp;
    private javax.swing.JButton jbtnModificarNDoc;
    private javax.swing.JButton jbtnNuevoDatosEmpresa;
    private javax.swing.JButton jbtnNuevoDoc;
    private javax.swing.JComboBox jcmbDescripAlmc;
    private javax.swing.JComboBox jcmbIGV;
    private javax.swing.JTextField jtxtNumFin;
    private javax.swing.JTextField jtxtNumInicio;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNextel;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtWeb;
    // End of variables declaration//GEN-END:variables

    private void cargarMonedas() {
       cmbIdmoneda.removeAllItems();
       cmbNombreMoneda.removeAllItems();
       cmbTipoCambio.removeAllItems();
       
       MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
        try {
            String sql = " SELECT idMoneda,TipoMoneda,Tipo_de_Cambio FROM  moneda;"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {    String codigo = rs.getString("idMoneda");
                 String moneda= rs.getString("TipoMoneda"); 
                 String cambio = rs.getString("Tipo_de_Cambio"); 
                
                 cmbIdmoneda.addItem(codigo);
                 cmbNombreMoneda.addItem(moneda); 
                 cmbTipoCambio.addItem(cambio);
                 
                 
            }
            rs.close();
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos de los Empleados : "+"\n"+"Verifique la conexion con la Base de Datos \n "+e );
        }
        
    }

    private void CargarFondo() {
           Fondo_Celeste F = new  Fondo_Celeste();
           F.setSize(993,714); 
           this.add(F,BorderLayout.CENTER);
           this.pack();
           this.setLocationRelativeTo(null);// lOCALIZACIÓN CENTRO
    }

    private void verificarMoneda() {
         if(NuevaMoneda==1){
            agregarNuevaMoneda();
            estadoNormalMoneda();
         } 
    }

    private void agregarNuevaMoneda() {
          try{
           MantenimientoDatos objmante = new MantenimientoDatos();
           objmante.InsertarMONEDA(String.valueOf(cmbNombreMoneda.getSelectedItem()),String.valueOf(cmbTipoCambio.getSelectedItem()));
           Mensajes.Informar(this," Se guardo exitosamente la moneda ");
           cambiarSoloVistaMoneda();
          cargarMonedas();
          } catch   ( Exception  e) { Mensajes.Informar(this," No se pudo guardar la moneda en la BD"+e); }
    }

    private void cambiarSoloVistaMoneda() {
           
           cmbIdmoneda.setEnabled(true); 
           
           cmbNombreMoneda.setEnabled(false);
           cmbNombreMoneda.setEditable(false);
            
           cmbTipoCambio.setEnabled(false);
           cmbTipoCambio.setEditable(false);  
    }

    private void cargarImagen() {
        JFileChooser dlg= new JFileChooser();
            // abre la ventana de dialogo
	    int option= dlg.showOpenDialog(this);
            // si hace click en boton abrir del dialogo
	    if(option == JFileChooser.APPROVE_OPTION) {
             // obtiene nombre de archivo seleccionado
             file= dlg.getSelectedFile().getPath();
             // carga imagen en el label central
            try{
                lblImagen.setText(""); 
                lblImagen.setIcon(new ImageIcon(file));
               } catch(Exception e){
                Mensajes.Informar(dlg, "So lo imagen ");
            }
	} 
    
    }
    
    private void limpiarImagen() {
        lblImagen.setText(" -- Imagen ---");
        lblImagen.setIcon(null);
        file="no existe ruta";
       
        if(!file.equals(fileAnterior)){ // Si cambio la ruta
            if("no existe ruta".equals(file)){ // si borro imagen
                     File f1= new File(fileAnterior);
                     f1.delete();
             }else{
                     File f1= new File(fileAnterior);
                     f1.delete();//Eliminamos
                    
                     // Generamos la imagen actual 
                     generarCopiaImagen();
                }
        }
          
    
    }

    private void ActualizarDatosEmpresa() {
      try{
          inicializar();
           MantenimientoDatos objmante = new MantenimientoDatos();
           objmante.actualizarDatosgeneralesempresa(RazonSocial, Ruc, Direccion, Telefono, Nextel,Correo,web);
           Mensajes.Informar(this," Se guardo satisfactoriamente "); 
           generarCopiaImagen( ); 
      } catch   ( Exception  e) { Mensajes.Informar(this," No se pudo registrar la Familia "+e.getLocalizedMessage()); }
    
    }
   
    private void generarCopiaImagen( ){
        try{
            if(!"no existe ruta".equals(file)){
            FileOutputStream fos;
            try (FileInputStream fis = new FileInputStream(file)) {
                String  outFile = "Empresa/Logo.jpg ";
                fos = new FileOutputStream(  outFile);
                FileChannel inChannel = fis.getChannel();
                FileChannel outChannel = fos.getChannel();
                inChannel.transferTo(0, inChannel.size(), outChannel);
             } fos.close();
         }
    }catch (IOException io ) {
     Mensajes.Error(this,"Error al Generar Copia"+io); }
    }

    

    private String ValidarEstado(String atributo) {
      if( atributo.equals("") || atributo == null ||  atributo.equals(" ")) 
           return null;
      else
            return "'"+atributo+"'"; 
    }
     
    private void cargarAlmacenes() {
          MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
          String  Descripcion; int codAlmacen=0;
          cmbIdAlmacen.removeAllItems();
           jcmbDescripAlmc.removeAllItems();
           cmbDireccion.removeAllItems();
          try {
            String sql = "SELECT idAlmacen,Descripcion,Direccion FROM  almacen ;"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            System.out.println(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   codAlmacen = rs.getInt("idAlmacen");
                    Descripcion=rs.getString("Descripcion");
                    String DireccionAlmc = rs.getString("Direccion");
                    
                    cmbIdAlmacen.addItem(codAlmacen);  
                    jcmbDescripAlmc.addItem(Descripcion); 
                    cmbDireccion.addItem(DireccionAlmc);
                }
            }
            objmante.CerrarConexion();  
             
            
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos del los Productos existentes "+"\n"+"Verifique la conexion con la Base de Datos " );
        } 
    }

    private void verificarCambioIGV() {
         if(!String.valueOf(jcmbIGV.getSelectedItem()).equals(ValorUsado)){
            int rspst=Mensajes.confirmar(this,"Esta seguro de Cambia el IGV actual???");
              if(rspst==0){
                 ActualizarUsoIGV();
          
         } 
    }
}

    private void ActualizarUsoIGV() {
      try{
          cargarEmpleado();
          MantenimientoDatos objmante = new MantenimientoDatos();
          obtenerIdIGV();
          objmante.UsarIGV(IdIGVUsado,""+idIGV,idEmpleado);
          Mensajes.Informar(this," Se guardo exitosamente el Cambio ");
          cambiarSoloVistaMoneda();
          cargarMonedas();
      } catch   ( Exception  e) { Mensajes.Informar(this," No se pudo guardar la moneda en la BD"+e); }
        
    }

   

    private void verificarAlmacen() {
         if(NuevoAlmacen==1){
            agregarNuevoAlmacen();
            estadoNormalAlmacen();
         }   
    }

    private void agregarNuevoAlmacen() {
         try{
           MantenimientoDatos objmante = new MantenimientoDatos();
           objmante.InsertarAlmacen(String.valueOf(jcmbDescripAlmc.getSelectedItem()),String.valueOf(cmbDireccion.getSelectedItem()));
           Mensajes.Informar(this," Se guardo exitosamente el Almacen");
           cambiarSoloVistaMoneda();
          cargarMonedas();
          } catch   ( Exception  e) { Mensajes.Informar(this," No se pudo guardar la moneda en la BD"+e); }
      
    }

    private void verificarDatosEmpresa() {
         if(ModificarDatos==1){
            ActualizarDatosEmpresa();
         }
        
    }

    private void preparaModificacion() {
         txtRazonSocial.setEditable(true);
         txtRuc .setEditable(true);
         txtDireccion .setEditable(true);
         txtTelefono .setEditable(true);
         txtNextel .setEditable(true);  txtCorreo .setEditable(true); txtWeb .setEditable(true);
    }
    
    private void cancelarModificacion() {
         txtRazonSocial.setEditable(false);
         txtRuc .setEditable(false);
         txtDireccion.setEditable(false);
         txtTelefono .setEditable(false);
         txtNextel .setEditable(false);  txtCorreo .setEditable(false); txtWeb .setEditable(false);
    }

    private void cargarDatosEmpresa() {
       MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
       
         
          try {
            String sql = "SELECT  RazonSocial,Ruc,Direccion,Telefono,Nextel,"
                    + "Correo,PaginaWeb FROM datosgeneralesempresa;"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   RazonSocial= rs.getString("RazonSocial");
                    Ruc=rs.getString("Ruc");
                    Direccion= rs.getString("Direccion");
                    Telefono=rs.getString("Telefono");
                    Nextel=rs.getString("Nextel");
                    Correo=rs.getString("Correo");
                    web=rs.getString("PaginaWeb");
                    
                    restaurar();
                   
                }
            }
            objmante.CerrarConexion();  
             if(Ruc.length()>0){
                 jbtnNuevoDatosEmpresa.setEnabled(false);
                 jbtnModificarDatoesEmp.setEnabled(true);
             }else{
                 preparaModificacion();
                 jbtnModificarDatoesEmp.setEnabled(false); 
                 txtRazonSocial.requestFocus(); 
             }    
                fileAnterior="EMPRESA/logo.jpg";
                file=fileAnterior;
                lblImagen.setIcon(new ImageIcon(fileAnterior));
            
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos del los Productos existentes "+"\n"+"Verifique la conexion con la Base de Datos " );
        }    
    }

    private void inicializar(){
         RazonSocial=txtRazonSocial.getText();
         Ruc=txtRuc.getText();
         Direccion=txtDireccion.getText();
         Telefono=ValidarEstado(txtTelefono.getText());
         Nextel=ValidarEstado(txtNextel.getText());
         Correo=ValidarEstado(txtCorreo.getText());
         web=ValidarEstado(txtWeb.getText()); 
    }
    
    
     
    private void restaurar() {
         txtRazonSocial.setText(RazonSocial);
         txtRuc .setText(Ruc);
         txtDireccion.setText(Direccion);
         txtTelefono.setText(Telefono);
         txtNextel.setText(Nextel);  txtCorreo.setText(Correo);txtWeb.setText(web);  
    }

    private void estadoNormalAlmacen() {
            NuevoAlmacen=0;
          cmbIdAlmacen.removeAllItems();
          cmbIdAlmacen.setEnabled(true); 
           
           cmbDireccion.setEnabled(false);
           cmbDireccion.setEditable(false);
           
          cmbDireccion.removeAllItems(); 
           
            jcmbDescripAlmc.setEnabled(false);
           jcmbDescripAlmc.setEditable(false);
            
            jcmbDescripAlmc.removeAllItems(); 
           
           cargarAlmacenes();
           
        
    }

    private void estadoNormalMoneda() {
          NuevaMoneda=0;
          
           cmbIdmoneda.removeAllItems();
           cmbIdmoneda.setEnabled(true); 
           
           cmbNombreMoneda.setEnabled(false);
           cmbNombreMoneda.setEditable(false);
           
           cmbNombreMoneda.removeAllItems();
           cmbNombreMoneda.requestFocus();
           
           cmbTipoCambio.setEnabled(false);
           cmbTipoCambio.setEditable(false);
            
           cmbTipoCambio.removeAllItems(); 
           
           cargarMonedas();
    }

    private void listarIGV() {
          MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
          String  valor;  
          jcmbIGV.removeAllItems(); 
          try {
            String sql = "SELECT idIgv,Valor,idEstado FROM  igv;"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   int id=rs.getInt("idIgv");
                    valor=rs.getString("Valor");
                    int idEstado=rs.getInt("idEstado");
                    jcmbIGV.addItem(valor);  
                    
                    if(idEstado==5)     {
                       IdIGVUsado=""+id;
                       ValorUsado=valor; }
                     
                }
            }
            objmante.CerrarConexion();   
            if(jcmbIGV.getItemCount() >=1){
                  jcmbIGV.setSelectedItem(ValorUsado);
            }
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos del los Productos existentes "+"\n"+"Verifique la conexion con la Base de Datos " );
        } 
    }

    private void obtenerIdIGV() {
     MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
     try {
            String sql = "SELECT idIgv  FROM  igv where Valor="+jcmbIGV.getSelectedItem()+";"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   idIGV=rs.getInt("idIgv"); 
                }
            }
            objmante.CerrarConexion();    
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos del los Productos existentes "+"\n"+"Verifique la conexion con la Base de Datos " );
        } 
    }
    
    private void cargarEmpleado() {
        MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
        try {
            String sql = "SELECT  idEmpleado from empleado inner join usuario using(idEmpleado) "
                    + " where usuario='"+usuario+"';"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql); 
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   idEmpleado= rs.getInt("idEmpleado");   
                }
            } objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos de la Base de Datos "+ e );
        } 
    }

    private void verificarIGV() {
          if(NuevoIGV==1){
            agregarNuevoIGV();
         } else {verificarCambioIGV();} 
    }

    private void agregarNuevoIGV() {
          try{
           MantenimientoDatos objmante = new MantenimientoDatos();
           if(jcmbIGV.getItemCount()>=1){
            objmante.InsertarIGV(Double.parseDouble(String.valueOf(jcmbIGV.getSelectedItem())) ,1); 
           }else { objmante.InsertarIGV(Double.parseDouble(String.valueOf(jcmbIGV.getSelectedItem())) ,5); }
          
           Mensajes.Informar(this," Se guardo exitosamente el IGV ");
           NuevoIGV=0; jcmbIGV.setEditable(false); listarIGV();
          
          } catch   ( Exception  e) { Mensajes.Informar(this," No se pudo guardar el IGV"+e); }
      
    }

    private void cargarNumeroDocumento() {
     MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
     try {  
            String sql = "SELECT NumInicio,NumFin FROM  numerodocumentos where Documento='"+Documento+"';"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql); 
            
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {    NumInicio = rs.getInt("NumInicio"); 
                     NumFin    = rs.getInt("NumFin"); 
                     
                     
                     jtxtNumInicio.setText(""+NumInicio);
                     jtxtNumFin   .setText(""+NumFin);
                }
               rs.close();
            } 
               objmante.CerrarConexion();  
               if( NumInicio>0)
                  {jbtnNuevoDoc.setEnabled(false); jbtnModificarNDoc.setEnabled(true); } 
                          else {jbtnNuevoDoc.setEnabled(true);  jbtnModificarNDoc.setEnabled(false);}
               
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos de la Base de Datos "+ e );
        } 
    }

    private void NuevoNumeroDocumento() {
        NumInicio= Integer.parseInt(jtxtNumInicio.getText()); 
        NumFin=  Integer.parseInt(jtxtNumFin.getText()); 
        try{
               MantenimientoDatos objmante = new MantenimientoDatos();
               objmante.InsertarNumeroDocumento(Documento,NumInicio,NumFin); 
               Mensajes.Informar(this," Se registro los numeros del Documento ");
               
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registrod del Num. Documento"+e); }
      
           
    }

    private void ActualizarNumeroDocumento() {
        NumInicio= Integer.parseInt(jtxtNumInicio.getText()); 
        NumFin=  Integer.parseInt(jtxtNumFin.getText()); 
        try{
               MantenimientoDatos objmante = new MantenimientoDatos();
               objmante.actualizarNumeroDocumento(Documento,NumInicio,NumFin); 
               Mensajes.Informar(this," Se registro los numeros del Documento ");
               
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registrod del Num. Documento"+e); }
      
           
    }

    private void NuevoDatosEmpresa() {
        try{
               inicializar();
               MantenimientoDatos objmante = new MantenimientoDatos();
               objmante.insertarDatosgeneralesempresa(RazonSocial, Ruc, Direccion, Telefono, Nextel, Correo, web);
               jbtnNuevoDatosEmpresa.setEnabled(false); jbtnModificarDatoesEmp.setEnabled(true);
               Mensajes.Informar(this," Se registro los datos generales de la empresa");
               
        } catch   ( Exception  e)  { 
               Mensajes.Informar(this," No se pudo guardar los registros"+e); }
      
    }
}
