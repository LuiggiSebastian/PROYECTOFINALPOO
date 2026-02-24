
package modelo.interfaces;

import modelo.gestion.GestionPartido;
import modelo.gestion.GestionElecciones;
import modelo.interfaces.*;

public class FrmPrincipal extends javax.swing.JFrame {

    private GestionPartido gestionPartidos = new GestionPartido();
    private GestionElecciones gestionElecciones = new GestionElecciones();

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName());

    public FrmPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnElecciones = new javax.swing.JButton();
        btnPartidos = new javax.swing.JButton();
        btnMesas = new javax.swing.JButton();
        btnCandidatos = new javax.swing.JButton();
        btnActas = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gestion Electoral");

        btnElecciones.setText("Gestionar Elecciones");
        btnElecciones.addActionListener(this::btnEleccionesActionPerformed);

        btnPartidos.setText("Gestionar Partidos");
        btnPartidos.addActionListener(this::btnPartidosActionPerformed);

        btnMesas.setText("Gestionar Mesas");
        btnMesas.addActionListener(this::btnMesasActionPerformed);

        btnCandidatos.setText("Gestionar Candidatos");
        btnCandidatos.addActionListener(this::btnCandidatosActionPerformed);

        btnActas.setText("Gestionar Actas");
        btnActas.addActionListener(this::btnActasActionPerformed);

        btnInformes.setText("Generar Informes");
        btnInformes.addActionListener(this::btnInformesActionPerformed);

        jButton7.setText("Salir");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPartidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCandidatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElecciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMesas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElecciones)
                    .addComponent(btnActas))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPartidos)
                    .addComponent(btnMesas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCandidatos)
                    .addComponent(btnInformes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEleccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleccionesActionPerformed
        // TODO add your handling code here:
        FrmGestionElecciones f = new FrmGestionElecciones();
        f.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_btnEleccionesActionPerformed

    private void btnCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatosActionPerformed
        // TODO add your handling code here:
        
        FrmGestionCandidatos f = new FrmGestionCandidatos();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCandidatosActionPerformed

    private void btnPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidosActionPerformed
        // TODO add your handling code here:
        FrmGestionPartidos f = new FrmGestionPartidos();
    f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPartidosActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
        // TODO add your handling code here:
        FrmInforme f = new FrmInforme();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInformesActionPerformed

    private void btnActasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActasActionPerformed
        // TODO add your handling code here:
        FrmGestionActas f = new FrmGestionActas();
        f.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnActasActionPerformed

    private void btnMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasActionPerformed
        // TODO add your handling code here:
        FrmMesas f = new FrmMesas();
        f.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_btnMesasActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActas;
    private javax.swing.JButton btnCandidatos;
    private javax.swing.JButton btnElecciones;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnMesas;
    private javax.swing.JButton btnPartidos;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
