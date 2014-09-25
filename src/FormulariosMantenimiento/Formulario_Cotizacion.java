package FormulariosMantenimiento;
 

import FormulariosPrincipales.MENU_VENDEDOR;
import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.*;
import Reutilizables.FormularioListaClientes;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public final class Formulario_Cotizacion extends javax.swing.JFrame {
 
     private JComboBox combo=new JComboBox();
     private String [] DescripcionesAlmacen = new String[6];
     
     private  int idTipoCliente,idCotizacion=0,idCliente=0,idAlmacen=1; 
  
     private String fecha;
     
     DefaultTableModel Modelo;
     String [] Titulo={"Codigo Producto","Descripcion","Cantidad","Unidad","Precio Costo"};
     String [][] datos={};
    
     private Producto unProducto= new Producto();
     private static ListaProductoS ListaProducto = new ListaProductoS() ;
     private String consultaSQL;
     private int idEmpleado;
     private int NumInicio,NumFin,NumActual;
      
     
    public Formulario_Cotizacion( ) { // tipo mantenimiento 1 nuevo
        initComponents();
        configTabla();
        FechaDelSistema.fechaDelSistema();  
         
        lblFecha.setText(FechaDelSistema.Fecha+" ");
        fecha=FechaDelSistema.FechaMYSQL;
        
        
        setLocationRelativeTo(null); 
        cargarNumCodigo(); ActualizarCodigo();
        
        buttonGroupTipoComp.add(jradbtnNatural);
        buttonGroupTipoComp.add(jradbtnJuridico);
        
        buttonGroupBusqueda.add(jchekBxId); 
        buttonGroupBusqueda.add(jchekBxRuc); 
        buttonGroupBusqueda.add(jcheckBxRazonSocial); 
        
        cargarAlmacenes(); cargarEmpleado(); cargarNumeroDocumento();
        
        actualizarTipoCliente() ;   cargarProductosALMACEN();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoComp = new javax.swing.ButtonGroup();
        buttonGroupBusqueda = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        tgbtnOcultar = new javax.swing.JToggleButton();
        pnlMenu = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        BtnAceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pnlCriterioBusqProv = new javax.swing.JPanel();
        jchekBxRuc = new javax.swing.JCheckBox();
        jcheckBxRazonSocial = new javax.swing.JCheckBox();
        txtDatoBuscar = new javax.swing.JTextField();
        jchekBxId = new javax.swing.JCheckBox();
        jToolBar1 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnListarClientes = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cmbIdAlmacen = new javax.swing.JComboBox();
        lblDescripcionAlmacen = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jradbtnJuridico = new javax.swing.JRadioButton();
        jradbtnNatural = new javax.swing.JRadioButton();
        jToolBar7 = new javax.swing.JToolBar();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblNumeroCO = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblRuc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleCotizacion = new javax.swing.JTable();
        jToolBar6 = new javax.swing.JToolBar();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" COTIZACION  ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar2.setBorder(null);
        jToolBar2.setFloatable(false);
        jToolBar2.setOpaque(false);

        tgbtnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/abajo.png"))); // NOI18N
        tgbtnOcultar.setFocusable(false);
        tgbtnOcultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbtnOcultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tgbtnOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnOcultarActionPerformed(evt);
            }
        });
        jToolBar2.add(tgbtnOcultar);

        pnlMenu.setBackground(new java.awt.Color(244, 244, 244));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        BtnAceptar.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        BtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/right.png"))); // NOI18N
        BtnAceptar.setText(" Aceptar ");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/icon_incorrect.png"))); // NOI18N
        jButton1.setText(" Cancelar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnlCriterioBusqProv.setBackground(new java.awt.Color(255, 255, 255));

        jchekBxRuc.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchekBxRuc.setText(" Ruc");
        jchekBxRuc.setOpaque(false);

        jcheckBxRazonSocial.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jcheckBxRazonSocial.setText(" Razon Social /Apellidos yNombre(s)");
        jcheckBxRazonSocial.setToolTipText("Razon Social /Apellidos y Nombres");
        jcheckBxRazonSocial.setOpaque(false);

        txtDatoBuscar.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        txtDatoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoBuscarActionPerformed(evt);
            }
        });

        jchekBxId.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jchekBxId.setSelected(true);
        jchekBxId.setText(" Id");
        jchekBxId.setOpaque(false);

        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setOpaque(false);

        jButton5.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/proveedor.png"))); // NOI18N
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        javax.swing.GroupLayout pnlCriterioBusqProvLayout = new javax.swing.GroupLayout(pnlCriterioBusqProv);
        pnlCriterioBusqProv.setLayout(pnlCriterioBusqProvLayout);
        pnlCriterioBusqProvLayout.setHorizontalGroup(
            pnlCriterioBusqProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriterioBusqProvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCriterioBusqProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCriterioBusqProvLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDatoBuscar))
                    .addGroup(pnlCriterioBusqProvLayout.createSequentialGroup()
                        .addGroup(pnlCriterioBusqProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jchekBxRuc)
                            .addComponent(jcheckBxRazonSocial)
                            .addComponent(jchekBxId))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCriterioBusqProvLayout.setVerticalGroup(
            pnlCriterioBusqProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriterioBusqProvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jchekBxId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jchekBxRuc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcheckBxRazonSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCriterioBusqProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar3.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);

        jLabel6.setText("   ");
        jToolBar3.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/buscarr.png"))); // NOI18N
        jLabel7.setText(" BUSCAR  CLIENTE");
        jToolBar3.add(jLabel7);

        jLabel15.setText("                         ");
        jToolBar3.add(jLabel15);

        btnListarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/listarProveedores.png"))); // NOI18N
        btnListarClientes.setToolTipText(" Ver Lista de Proveedores ");
        btnListarClientes.setBorder(null);
        btnListarClientes.setFocusable(false);
        btnListarClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListarClientes.setOpaque(false);
        btnListarClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesActionPerformed(evt);
            }
        });
        jToolBar3.add(btnListarClientes);

        jToolBar4.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar4.setBorder(null);
        jToolBar4.setFloatable(false);

        jLabel9.setText("   ");
        jToolBar4.add(jLabel9);

        jLabel11.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/acccioness.png"))); // NOI18N
        jLabel11.setText(" ACCIONES              ");
        jToolBar4.add(jLabel11);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        cmbIdAlmacen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbIdAlmacen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbIdAlmacenItemStateChanged(evt);
            }
        });
        cmbIdAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdAlmacenActionPerformed(evt);
            }
        });

        lblDescripcionAlmacen.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        lblDescripcionAlmacen.setText("ALMACEN GENERAL ");

        jLabel16.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/almacen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(lblDescripcionAlmacen)
                .addGap(28, 28, 28)
                .addComponent(cmbIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcionAlmacen)
                    .addComponent(cmbIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jradbtnJuridico.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jradbtnJuridico.setText(" Cliente  Juridico");
        jradbtnJuridico.setOpaque(false);
        jradbtnJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradbtnJuridicoActionPerformed(evt);
            }
        });

        jradbtnNatural.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jradbtnNatural.setSelected(true);
        jradbtnNatural.setText(" Cliente  Natural ");
        jradbtnNatural.setOpaque(false);
        jradbtnNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradbtnNaturalActionPerformed(evt);
            }
        });

        jToolBar7.setBorder(null);
        jToolBar7.setFloatable(false);
        jToolBar7.setOpaque(false);

        jLabel17.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Cliente.png"))); // NOI18N
        jLabel17.setText("  TIPO  DE CLIENTE       ");
        jToolBar7.add(jLabel17);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jradbtnJuridico)
                            .addComponent(jradbtnNatural)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jToolBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradbtnNatural)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradbtnJuridico)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCriterioBusqProv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCriterioBusqProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Nyala", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("C O T I Z A C I O N ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel1.setText("Nro  ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblNumeroCO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblNumeroCO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 15))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel4.setText("Cliente");

        jLabel5.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel5.setText("Dirección    ");

        jLabel8.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel8.setText("Ruc            ");

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de Emision       ");

        lblFecha.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("12/04/2012");

        lblRazonSocial.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        lblDireccion.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N

        lblRuc.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        lblRuc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 49, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(lblFecha)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tablaDetalleCotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaDetalleCotizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaDetalleCotizacionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaDetalleCotizacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaDetalleCotizacionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDetalleCotizacion);

        jToolBar6.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar6.setBorder(null);
        jToolBar6.setFloatable(false);

        jLabel12.setText("   ");
        jToolBar6.add(jLabel12);

        jLabel14.setText("    ");
        jToolBar6.add(jLabel14);

        btnNuevo.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/record_add.png"))); // NOI18N
        btnNuevo.setText("Agregar Fila");
        btnNuevo.setToolTipText(" Nuevo ");
        btnNuevo.setBorder(null);
        btnNuevo.setOpaque(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar6.add(btnNuevo);

        jLabel13.setText("     ");
        jToolBar6.add(jLabel13);

        jButton4.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/record_del.png"))); // NOI18N
        jButton4.setText("Eliminar Fila");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar6.add(jButton4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jToolBar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      

    }//GEN-LAST:event_formWindowOpened

    private void tablaDetalleCotizacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaDetalleCotizacionKeyTyped
        
       
    }//GEN-LAST:event_tablaDetalleCotizacionKeyTyped

    private void tablaDetalleCotizacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaDetalleCotizacionKeyPressed
        
    }//GEN-LAST:event_tablaDetalleCotizacionKeyPressed

    private void tablaDetalleCotizacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaDetalleCotizacionKeyReleased
        
    }//GEN-LAST:event_tablaDetalleCotizacionKeyReleased

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
      verificarCabezeraCotizacion();
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      mostrarInterfazMantenimiento();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      eliminar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      nuevaFila() ; 
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtDatoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBuscarActionPerformed
      actualizarTipoCliente( ) ;
      buscarCliente();  
    }//GEN-LAST:event_txtDatoBuscarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      actualizarTipoCliente( ) ;
       buscarCliente(); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesActionPerformed
      FormularioListaClientes listar = new FormularioListaClientes( );
      listar.setVisible(true); 
    }//GEN-LAST:event_btnListarClientesActionPerformed

    private void tgbtnOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnOcultarActionPerformed
        String Boton= String.valueOf(tgbtnOcultar.getSelectedObjects());
        if(Boton.equals("null")) // Despresionastes
         {   pnlMenu.setVisible(true); 
         }
        else //presionado"
        {    pnlMenu.setVisible(false); 
        }  
    }//GEN-LAST:event_tgbtnOcultarActionPerformed

    private void jradbtnJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradbtnJuridicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jradbtnJuridicoActionPerformed

    private void jradbtnNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradbtnNaturalActionPerformed
   
    }//GEN-LAST:event_jradbtnNaturalActionPerformed

    private void cmbIdAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdAlmacenActionPerformed
       
    }//GEN-LAST:event_cmbIdAlmacenActionPerformed

    private void cmbIdAlmacenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbIdAlmacenItemStateChanged
  try{
       int idNuevo=Integer.parseInt(String.valueOf(cmbIdAlmacen.getSelectedItem()));  
       
        if(cmbIdAlmacen.getSelectedIndex()>=0 && idNuevo != idAlmacen ){
             int rspst = Mensajes.confirmar(this, "Si cambia de almacen se perdera todos los datos ingresados en el detalle de la cotizacion \n "
             + "Esta seguro de Cambiar de Almacen ???");
                 if (rspst == 0) {
                   idAlmacen=idNuevo;
                   String Descripcion= DescripcionesAlmacen [idAlmacen] ; 
                   lblDescripcionAlmacen.setText(Descripcion); 
                   
                   limpiarTabla() ;
                   
                   cargarProductosALMACEN();
               }
           }
        } catch(Exception e){}
        
    }//GEN-LAST:event_cmbIdAlmacenItemStateChanged
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton btnListarClientes;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroupBusqueda;
    private javax.swing.ButtonGroup buttonGroupTipoComp;
    private javax.swing.JComboBox cmbIdAlmacen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JToolBar jToolBar7;
    private javax.swing.JCheckBox jcheckBxRazonSocial;
    private javax.swing.JCheckBox jchekBxId;
    private javax.swing.JCheckBox jchekBxRuc;
    private javax.swing.JLabel jlblNumeroCO;
    private javax.swing.JRadioButton jradbtnJuridico;
    private javax.swing.JRadioButton jradbtnNatural;
    private javax.swing.JLabel lblDescripcionAlmacen;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JPanel pnlCriterioBusqProv;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTable tablaDetalleCotizacion;
    private javax.swing.JToggleButton tgbtnOcultar;
    private javax.swing.JTextField txtDatoBuscar;
    // End of variables declaration//GEN-END:variables

    private void configTabla() {
        // ********       MODELO DE LA TABLA     ***************
       Modelo= new  DefaultTableModel(datos, Titulo);
       tablaDetalleCotizacion.setModel(Modelo);// Establecemos el modelo a nuestra tabla 
       tablaDetalleCotizacion.setRowMargin(2);//Establece el espacio entre celdas de filas adyacentes.
        tablaDetalleCotizacion.setRowHeight(22);// Anchop
    }

    private void mostrarInterfazMantenimiento() {
         this.dispose();
         FormularioMantenimientoCotizacion form= new FormularioMantenimientoCotizacion();
         form.setVisible(true); 
    } 

    private void cargarEmpleado() {
        MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
        String usuario=MENU_VENDEDOR.UsuarioVendedor;
        try {
            String sql = "SELECT  idEmpleado from empleado inner join usuario using(idEmpleado)  "
                    + "where usuario='"+usuario+"';"; 
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
    
    private void cargarNumCodigo() {
         try {
            MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
            String sql = "select Max(idCotizacion)  as Cant from cotizacion"; // 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next())  
                      idCotizacion=rs.getInt("Cant");
            }
            objmante.CerrarConexion();     
        } catch (Exception e) {
            Mensajes.Error(null," No se pudo establecer una conexion con la BD : Verifique la conexion");
            
        }
    }

    private void ActualizarCodigo() {
       idCotizacion=idCotizacion+1; 
    }
 
    private void nuevaFila() { 
        Object[] fila = {"",  "",  "", "" };
        Modelo.addRow(fila);
    }
    
    public void eliminar(){
       
	int filas=tablaDetalleCotizacion.getSelectedRowCount();// obtiene numero de filas seleccionadas
	if (filas==0) // no hay filas seleccionadas
		JOptionPane.showMessageDialog(this,"Debe seleccionar una o más filas!");
	else {
		int fila;// una o mas filas seleccionadas
		do {
			fila=tablaDetalleCotizacion.getSelectedRow();// obtiene fila seleccionada
                        if(fila != -1){
                        // remueve fila obtenida
			Modelo.removeRow(fila);
                    }
		} while (fila>=0); // mientras haya filas seleccionadas
	}// fin del else
}
     private void limpiarTabla() {
        while(tablaDetalleCotizacion.getRowCount()>0){
            Modelo.removeRow(0);
        }
    }

    public void setUpColumnProd(JTable table , TableColumn ColumnUnid)  { // ARREGLAR
        // creamos el combo k estar en la columna unid de memdida
        combo=new JComboBox();
        combo.removeAllItems();
        combo.addItem("Prod ... ");
        cargarComboCodigoProducto();
        
        ColumnUnid.setCellEditor(new DefaultCellEditor (combo));
	combo.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
           comboItemStateChanged(evt);  }
        
        private void comboItemStateChanged(ItemEvent evt) {
           String Codigo= String.valueOf(combo.getSelectedItem()); 
           completarDatos(Codigo);
        }
           private void completarDatos(String Codigo) {
            NodoProductos auxiliar=ListaProducto.buscaProducto(Codigo);
            unProducto=auxiliar.getunProducto();
            int indice =tablaDetalleCotizacion.getSelectedRow(); 
            tablaDetalleCotizacion.setValueAt(unProducto.getDescripcion(), indice, 1);
            tablaDetalleCotizacion.setValueAt(unProducto.getUnidMedida(), indice, 3);
            tablaDetalleCotizacion.setValueAt(unProducto.getPrecioVenta(), indice, 4);
       }
              
 });
}

    private void cargarComboCodigoProducto() {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         String codReferencia,unid ;
         int IdProd,cant; double precio; 
         try {
             String sql = "SELECT pA. idProductos,p.CodigoReferencia,p.Descripcion,pA.cantidad ,um.Nombre, p.PrecioVenta "
                    + "FROM  productos_almacen pA inner join  productos  p using (idProductos)  "
                    + "inner join unidad_medida um using(idUnidad_medida)  "
                    + "where p.idEstado <> 2 and pA.idAlmacen="+idAlmacen+";"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            System.out.println(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   IdProd = rs.getInt("idProductos");
                    codReferencia = rs.getString("CodigoReferencia");
                    String Descripcion = rs.getString("Descripcion");
                    cant=rs.getInt("cantidad");
                    unid = rs.getString("Nombre");
                    precio= rs.getDouble("PrecioVenta");
                    
                    combo.addItem(codReferencia); 
                    
                    unProducto=new Producto();
                    unProducto.setIdProducto(IdProd);
                    unProducto.setCodigoReferencia(codReferencia); 
                    unProducto.setDescripcion(Descripcion); 
                    unProducto.setCantidad(cant); 
                    unProducto.setUnidMedida(unid); 
                    unProducto.setPrecioVenta(precio); 
                    
                    ListaProducto.agrega(unProducto); 
                }
            }
            objmante.CerrarConexion();  
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos del los Productos Verifique la conexion con la"
                    + " Base de Datos "+e );
        } 
    }

    private void verificarDatosCotizacion() { 
        int Numfilas=tablaDetalleCotizacion.getRowCount();
        String Error="";
	if (Numfilas==0) {   JOptionPane.showMessageDialog(this,"No existen productos Solicitados!!");}
	else {
                for(int i=0;i<Numfilas;i++)
                {   if(comprovarExistenciaDatos(i)==false)
                         Error=Error +(i+1)+", "; 
                }
                if(Error.equals("") ){
                      actualizarTipoCliente( );   
                       GuardarCabezeraCotizacion() ;
                       GuardarDetalleCotizacion();
                       ActualizarCodigo() ;
                       inicializarTodo();
                       JOptionPane.showMessageDialog(this,"Se Guardo Satisfactoriamente");
                }  else{
                    JOptionPane.showMessageDialog(this,"Faltan datos en las Filas :"+Error); 
                   }
                
           }
  
    
    }
  
    private void verificarCabezeraCotizacion(){
     if(idCliente!= 0 && jlblNumeroCO.getText() != null){
       verificarDatosCotizacion() ;
     }else {Mensajes.Informar(this,"No se ha elegido a un Cliente o Nro de la Cotizacion");
     }
    }
    
    private void GuardarCabezeraCotizacion() {
         try {
            String  NroCotizacion=jlblNumeroCO.getText();
            MantenimientoDatos objmante  = new MantenimientoDatos();
            objmante.insertarCotizacion(idCotizacion, idEmpleado, idCliente, idAlmacen, fecha,NroCotizacion);
            objmante.CerrarConexion();
        } catch(Exception ex)  {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage() );
        }    
 }

    private boolean comprovarExistenciaDatos(int indice) {
       if(tablaDetalleCotizacion.getValueAt(indice, 0).equals("") )
            return false;
        else{ // Si existe codigo
             if(tablaDetalleCotizacion.getValueAt(indice, 1).equals("") )
             return false;
             else{// Si existe Descripcion
                 if(tablaDetalleCotizacion.getValueAt(indice, 2).equals("") )
                   return false;
                 else{// Si existe Cantidad
                     if(tablaDetalleCotizacion.getValueAt(indice, 3).equals("") )
                   return false;
                     else{// Si existe Unidad
                         if(tablaDetalleCotizacion.getValueAt(indice, 4).equals("") )
                         return false;
                         else{//si existe precio
                             return true;
                         }
                     }
                 }
             }
        }

    }
  
    public void inicializarTodo(){
  //*************** Limpia la Tabla*********************
            int filas = tablaDetalleCotizacion.getRowCount();
           // remueve todas las filas de la tabla
            for (int fila=0; fila<filas; fila++)
            Modelo.removeRow(0);
 // **************Agrega una Fila a la Tabla *********
        nuevaFila(); 
}
 
    private void GuardarDetalleCotizacion() {
         int Numfilas=tablaDetalleCotizacion.getRowCount();
         for(int i=0;i<Numfilas;i++)
           {   guardarDetalle(i);  }
    }

    private void guardarDetalle(int i) {
           String CodigoProd=(String) tablaDetalleCotizacion.getValueAt(i,0);
              int cantidad=Integer.parseInt( String.valueOf(tablaDetalleCotizacion.getValueAt(i,2)));  
              double  precio = Double.parseDouble( String.valueOf(tablaDetalleCotizacion.getValueAt(i,4)));  
              NodoProductos auxiliar = ListaProducto.buscaProducto(CodigoProd);
              unProducto =auxiliar.getunProducto(); 
              try {
                MantenimientoDatos objmante  = new MantenimientoDatos();
                objmante.insertarDetalleCotizacion(idCotizacion,unProducto.getIdProducto(), cantidad, precio);
                objmante.CerrarConexion();
            } catch(Exception ex)  {
            Mensajes.Error(null,"Error Insersion SQL: " + ex.getLocalizedMessage() );
        } 
    }
 
     // PROCESO DE BUSQUEDA
    private void actualizarTipoCliente( ) {
        if(jradbtnNatural.isSelected()){ idTipoCliente=1;  }
         else if(jradbtnJuridico.isSelected()){idTipoCliente=2;  }
    }

    private void buscarCliente() {
         String DatoBuscar=txtDatoBuscar.getText(); 
         if(jcheckBxRazonSocial.isSelected()){ 
             if (idTipoCliente==1){  EjecutarBusqueda(1,DatoBuscar );  } // BUSCAR X NOMBRE Y APELLIDO CLIENTE NAT
             else { EjecutarBusqueda(4,DatoBuscar );} 
         }
         else if(jchekBxRuc.isSelected()){ 
            if (idTipoCliente==1){ EjecutarBusqueda(2,DatoBuscar ); }
            else { EjecutarBusqueda(5,DatoBuscar ); }
         
         } else if(jchekBxId.isSelected()){ 
            if (idTipoCliente==1){ EjecutarBusqueda(3,DatoBuscar ); }
            else { EjecutarBusqueda(6,DatoBuscar );}
         }
         consultaSQL="";  
    }
     
    private void EjecutarBusqueda(int Tipo,String DatoBuscar){
        switch(Tipo)
              {   case (1):    { // NATURAL NOMBRE Y APELLIDO
                        consultaSQL="SELECT tp.Tipo, c.idCliente,c.Ruc,concat(cn.Nombres,' ',cn.ApellidoP,' ',cn.ApellidoM) as 'Cliente' "
                                + ",c.Direccion FROM  cliente c INNER JOIN  cliente_natural cn using( idCliente) inner join tipo_cliente tp using(idTipocliente) "
                                + "where c.idEstado <>2 and c.idTipocliente=1   and concat(cn.Nombres,' ',cn.ApellidoP,' ',cn.ApellidoM) like '%"+DatoBuscar+"%';";
                        EjecutarConsulta(consultaSQL); 
                        break;   } 
                   case (2):    { // Ruc NATURAL
                        consultaSQL="SELECT tp.Tipo, c.idCliente,c.Ruc,concat(cn.Nombres,' ',cn.ApellidoP,' ',cn.ApellidoM) as 'Cliente' "
                                + ",c.Direccion FROM  cliente c INNER JOIN  cliente_natural cn using( idCliente) inner join tipo_cliente tp using(idTipocliente) "
                                + "where c.idEstado <>2 and c.idTipocliente=1   and c.Ruc ='"+DatoBuscar+"';";
                          EjecutarConsulta(consultaSQL); 
                        break;   } 
                   case (3):    { // Id NATURAL
                        consultaSQL="SELECT tp.Tipo, c.idCliente,c.Ruc,concat(cn.Nombres,' ',cn.ApellidoP,' ',cn.ApellidoM) as 'Cliente' "
                                + ",c.Direccion FROM  cliente c INNER JOIN  cliente_natural cn using( idCliente) inner join tipo_cliente tp using(idTipocliente) "
                                + "where c.idEstado <>2 and c.idTipocliente=1   and c.idCliente="+DatoBuscar+";";
                          EjecutarConsulta(consultaSQL); 
                        break;   } 
                  case (4):    { // JURIDICO razon social
                        consultaSQL=" SELECT tp.Tipo, c.idCliente,c.Ruc, cj.RazonSocial  as 'Cliente' "
                                + ",c.Direccion FROM  cliente c INNER JOIN   cliente_juridico cj using( idCliente) inner join tipo_cliente tp using(idTipocliente) "
                                + "where c.idEstado <>2 and c.idTipocliente=2 and cj.RazonSocial  like '%"+DatoBuscar+"%';";
                        EjecutarConsulta(consultaSQL); 
                        break;   } 
                   case (5):    { // Ruc NATURAL
                        consultaSQL=" SELECT tp.Tipo, c.idCliente,c.Ruc, cj.RazonSocial  as 'Cliente' "
                                + ",c.Direccion FROM  cliente c INNER JOIN   cliente_juridico cj using( idCliente) inner join tipo_cliente tp using(idTipocliente) "
                                + "where c.idEstado <>2 and c.idTipocliente=2 and   c.Ruc ='"+DatoBuscar+"';";
                          EjecutarConsulta(consultaSQL); 
                        break;   } 
                   case (6):    { // Id juridico 
                        consultaSQL=" SELECT tp.Tipo, c.idCliente,c.Ruc, cj.RazonSocial  as 'Cliente' "
                                + ",c.Direccion FROM  cliente c INNER JOIN   cliente_juridico cj using( idCliente) inner join tipo_cliente tp using(idTipocliente) "
                                + "where c.idEstado <>2 and c.idTipocliente=2 and idCliente="+DatoBuscar+";";
                          EjecutarConsulta(consultaSQL); 
                        break;   }      
             }
    }
   
    private void EjecutarConsulta(String consultaSQL) {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         String raz = null,ruc= null,direccion= null; int codigo=0;
         try {
             PreparedStatement ps = objmante.conexion.prepareStatement(consultaSQL);
            boolean encontrado;
            try (ResultSet rs = ps.executeQuery()) {
                encontrado = false;
                while (rs.next()) 
                 {  codigo = rs.getInt("idCliente");
                    ruc= rs.getString("Ruc");
                    raz = rs.getString("Cliente"); 
                    direccion= rs.getString("Direccion"); 
                    encontrado=true;
                    
                }
            }
                objmante.CerrarConexion();  
         if (encontrado==true){
              
                   idCliente=codigo;
                   lblRazonSocial.setText(raz);
                   lblRuc.setText(ruc);
                   lblDireccion.setText(direccion);
                    
                
         }else {  Mensajes.Alarma(this,"No se encontro al Cliente Solicitado");}
             
       }catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos del empleado : "+e);
       }
    }

    
    private void cargarProductosALMACEN() {
          setUpColumnProd( tablaDetalleCotizacion, tablaDetalleCotizacion.getColumn("Codigo Producto"));
          nuevaFila();
    }

    
    private void cargarAlmacenes() {
          MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
          String  Descripcion; int codAlmacen=0;
          cmbIdAlmacen.removeAllItems();
          try {
            String sql = "SELECT idAlmacen,Descripcion FROM  almacen ;"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql);
            System.out.println(sql);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {   codAlmacen = rs.getInt("idAlmacen");
                    Descripcion=rs.getString("Descripcion");
                    cmbIdAlmacen.addItem(codAlmacen);  
                    DescripcionesAlmacen [codAlmacen]=Descripcion; 
                }
            }
            objmante.CerrarConexion();  
            cmbIdAlmacen.setSelectedIndex(0);   idAlmacen = Integer.parseInt(String.valueOf(cmbIdAlmacen.getSelectedItem()));
            Descripcion = DescripcionesAlmacen[idAlmacen];  lblDescripcionAlmacen.setText(Descripcion);
            
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos del los Productos existentes "+"\n"+"Verifique la conexion con la Base de Datos " );
        } 
    }

    
    private void cargarNumeroDocumento() {
     MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
     try {  
           
            String sql = "SELECT NumInicio,NumFin FROM  numerodocumentos where Documento='CO';"; 
            PreparedStatement ps = objmante.conexion.prepareStatement(sql); 
            
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {    NumInicio = rs.getInt("NumInicio"); 
                     NumFin    = rs.getInt("NumFin"); 
                  
                }
               rs.close();
            } 
               objmante.CerrarConexion();  
               if( NumInicio>0) {
                   obtenerUltimoNumero();
                   if(NumActual >0){
                     
                       if(NumActual<=NumInicio && NumActual <NumFin){  NumActual=NumActual+1;
                    
                     } else if(NumActual==NumFin) {  Mensajes.Alarma(this,"Ingrese otro rango de Numero de documentos"); }
                   
                   }  else { NumActual=NumInicio; }
                
               }else {
                   Mensajes.Alarma(this,"No se a registrado un rango de Numero de documentos" ); 
                    this.dispose(); 
               }
              jlblNumeroCO.setText(""+NumActual);
              
         } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos de la Base de Datos "+ e );
        } 
    }

    private void obtenerUltimoNumero() {
          try{
             MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
             String sql = "SELECT MAX(NroCotizacion) as NumMax from cotizacion;"; 
             PreparedStatement ps = objmante.conexion.prepareStatement(sql); 
             try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) 
                {    NumActual= rs.getInt("NumMax");  
                  
                }
               rs.close();
            } 
               objmante.CerrarConexion(); 
        
    } catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los codigos de la Base de Datos "+ e );
        } 
    }

  
   
}