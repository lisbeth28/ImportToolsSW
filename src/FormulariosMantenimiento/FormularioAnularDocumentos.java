 package FormulariosMantenimiento;

import MantenimientoBD.MantenimientoDatos;
import Otras_Clases.Mensajes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

 
public class FormularioAnularDocumentos extends javax.swing.JFrame {

    DefaultTableModel Modelo;
    String [] Titulo={"Id","Documento","Almacen","Empleado","Referencia"," Moneda ","Fecha","Estado"};
    String [][] datos={};
    private String idAnular;
    
    public FormularioAnularDocumentos() {
        initComponents();   this.setLocationRelativeTo(null); 
        configurarTabla(); listarGuiaEntrada();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblTablaGuias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ANULAR GUIAS ");

        jtblTablaGuias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblTablaGuias);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/Guiasss.png"))); // NOI18N

        jRadioButton1.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText(" Entrada ");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel2.setText("TIPO DE GUIA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioButton1)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jRadioButton1)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jToolBar4.setBackground(new java.awt.Color(231, 231, 231));
        jToolBar4.setBorder(null);
        jToolBar4.setFloatable(false);

        jLabel8.setText("   ");
        jToolBar4.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Nyala", 0, 13)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/acccioness.png"))); // NOI18N
        jLabel9.setText(" ACCIONES              ");
        jToolBar4.add(jLabel9);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton12.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/trash.gif"))); // NOI18N
        jButton12.setText(" Eliminar");
        jButton12.setBorder(null);
        jButton12.setOpaque(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Nyala", 0, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gif/rollback.png"))); // NOI18N
        jButton13.setText(" Salir");
        jButton13.setBorder(null);
        jButton13.setOpaque(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        validarEliminacion();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
      if(jRadioButton1.isSelected()){
        limpiarTabla(); listarGuiaEntrada();
      }
    }//GEN-LAST:event_jRadioButton1ActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JTable jtblTablaGuias;
    // End of variables declaration//GEN-END:variables

    private void listarGuiaEntrada() {
     String  consultaSQL=" SELECT ge.idguiaEntrada as id,concat('N°',ge.NumeroDOC) as Num,a.Descripcion,"
             + "concat(e.ApellidoPaterno,' ',e.ApellidoMaterno,' ',e.Nombre) "
            + "as empleado,concat('OC:N°',oc.NumeroOC) as docRef,m.TipoMoneda,ge.Fecha,et.TipoEstado "
            + "FROM guiaentrada ge inner join almacen a using(idAlmacen) "
            + "inner join estado et using(idEstado ) "
            + "inner join empleado e using(idEmpleado) "
            + "inner join moneda m  using(idMoneda) "
            + "inner join orden_de_compra oc using(idOrdenCompra);"; 
     EjecutarConsulta(consultaSQL); 
   }
     
     private void limpiarTabla() {
           while(jtblTablaGuias.getRowCount()>0){
            Modelo.removeRow(0);
        }
    }
      
    private void EjecutarConsulta(String consultaSQL) {
         MantenimientoDatos objmante = new MantenimientoDatos();// abrimos conexion 
         try {
             PreparedStatement ps = objmante.conexion.prepareStatement(consultaSQL);
             boolean encontrado;
             try (ResultSet rs = ps.executeQuery()) 
             {
                encontrado = false;
                while (rs.next()) 
                {  String codigo = rs.getString("id");
                   String num = rs.getString("Num"); 
                   String almacen= rs.getString("Descripcion"); 
                   String empleado= rs.getString("empleado"); 
                   String docRef= rs.getString("docRef");  
                   String TipoMoneda= rs.getString("TipoMoneda"); 
                  
                   String  FechaEmision= rs.getString("Fecha"); 
                   String estodOc= rs.getString("TipoEstado"); 
                   encontrado=true;
                   
                   
                   Object [] fila={codigo,num,almacen,empleado,docRef,TipoMoneda,FechaEmision,estodOc };
                  Modelo.addRow(fila);
                   
                }
            }
                objmante.CerrarConexion();  
         if (encontrado!=true){
                Mensajes.Alarma(this," No se encontraron Guia de entradas disponibles");  }
        }catch (SQLException | NullPointerException e) {
            Mensajes.Alarma(this,"No se pudo extraer los datos del empleado : "+e);
       }
    }
    
     private void configurarTabla() {
        Modelo= new  DefaultTableModel(datos, Titulo);
        jtblTablaGuias.setModel(Modelo);
        jtblTablaGuias.setFont(new java.awt.Font("Nyala", 0, 14));
    }

    private void validarEliminacion() {
         int index=jtblTablaGuias.getSelectedRow();
         idAnular= String.valueOf( jtblTablaGuias.getValueAt(index, 0)); 
         String docEliminar= String.valueOf( jtblTablaGuias.getValueAt(index, 1)); 
         if(jRadioButton1.isSelected()){
              int rspt=Mensajes.confirmar(this, "Esta seguro de eliminar la Guia de Entrada  "+docEliminar);
              if(rspt == 0){ anularGuiaEntrada();}
         }
    }
    
    private void anularGuiaEntrada(){
         try {
                MantenimientoDatos eliminar= new MantenimientoDatos ();
                eliminar.EliminarGuiaEntrada(idAnular)  ;
                eliminarfila();
                eliminar.CerrarConexion();
            } catch(Exception e){  }
    }
   private void eliminarfila() {
        int filas=jtblTablaGuias.getSelectedRowCount();// obtiene numero de filas seleccionadas
	if (filas!=0)  {
		int fila;// una o mas filas seleccionadas
		do {
			fila=jtblTablaGuias.getSelectedRow();// obtiene fila seleccionada
                        if(fila != -1){
                        Modelo.removeRow(fila);
                    }
		} while (fila>=0); // mientras haya filas seleccionadas
	} 
    }  
}
