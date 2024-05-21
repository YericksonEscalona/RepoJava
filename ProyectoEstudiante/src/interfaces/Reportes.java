
package interfaces;

import Conectores.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Reportes extends javax.swing.JFrame {

    Conexion cx;
    public Reportes() {
        initComponents();
        this.setTitle("REPORTERIA");
        //this.setSize(350,300);
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        setResizable(false);
        lblEstado.setVisible(false);
        cbEstado.setVisible(false);
        
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        cbReporte = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEstudiante = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        cbReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "General de estudiantes", "Estudiante por estado" }));
        cbReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReporteActionPerformed(evt);
            }
        });
        getContentPane().add(cbReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 160, -1));

        jLabel1.setText("Tipo de reporte");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 20));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Amazonas", "Anzoátegui", "Apure", "Aragua", "Barinas", "Bolívar", "Carabobo", "Cojedes", "Delta Amacuro", "Dependencias Federales", "Distrito Federal", "Falcón", "Guárico", "Lara", "Mérida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Táchira", "Trujillo", "Vargas", "Yaracuy", "Zulia" }));
        getContentPane().add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        lblEstado.setText("Estado");
        getContentPane().add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 40, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("MÓDULO DE REPORTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jtEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtEstudiante);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReporteActionPerformed
        if(cbReporte.getSelectedIndex()==2){
            lblEstado.setVisible(true);
            cbEstado.setVisible(true);
        }else{
            lblEstado.setVisible(false);
            cbEstado.setVisible(false);
            cbEstado.setSelectedIndex(0);
        }
    }//GEN-LAST:event_cbReporteActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
   
        cx = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        jtEstudiante.setModel(modelo);
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Sexo");
        
        if(cbReporte.getSelectedIndex()==1){
            try{

                String query = "SELECT idEstudiante,Nombre,Apellido,sexo FROM estudiante";

                PreparedStatement ps = cx.conectar().prepareStatement(query );
                ResultSet rs = ps.executeQuery();

           

                while(rs.next()){

                    Object[] filas = new Object[rs.getMetaData().getColumnCount()];
                    for(int i = 0; i<rs.getMetaData().getColumnCount();i++){
                        filas[i] = rs.getObject(i+1);
                    }
                    modelo.addRow(filas);

                }


            }catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(cbReporte.getSelectedIndex()==2){
            int estado = cbEstado.getSelectedIndex();
            try{

                String query = "SELECT idEstudiante,Nombre,Apellido,sexo FROM estudiante where idestado = "+estado;

                PreparedStatement ps = cx.conectar().prepareStatement(query );
                ResultSet rs = ps.executeQuery();

                //ResultSetMetaData rsMd = rs.getMetaData();

                while(rs.next()){

                    Object[] filas = new Object[rs.getMetaData().getColumnCount()];
                    for(int i = 0; i<rs.getMetaData().getColumnCount();i++){
                        filas[i] = rs.getObject(i+1);
                    }
                    modelo.addRow(filas);

                }


            }catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }

            
        }else{
            JOptionPane.showMessageDialog(this, "¡Error, Debe seleccionar un reporte!");
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEstudiante;
    private javax.swing.JLabel lblEstado;
    // End of variables declaration//GEN-END:variables
}
