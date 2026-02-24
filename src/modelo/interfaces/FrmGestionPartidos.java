package modelo.interfaces;
import modelo.gestion.*;
import modelo.entidades.*;
import modelo.interfaces.*;

public class FrmGestionPartidos extends javax.swing.JFrame {
    private GestionPartido gestion = new GestionPartido();
    private GestionElecciones gestionElecciones = new GestionElecciones();
    
    

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmGestionPartidos.class.getName());

   
    
    public FrmGestionPartidos() {
    initComponents();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        nombrepartido = new javax.swing.JLabel();
        siglapartido = new javax.swing.JLabel();
        representantepartido = new javax.swing.JLabel();
        txtCodigoPartido = new javax.swing.JTextField();
        txtNombrePartido = new javax.swing.JTextField();
        txtSigla = new javax.swing.JTextField();
        txtRepresentante = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnVerLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Gestion de Partidos Politicos");

        codigo.setText("Codigo del Partido");

        nombrepartido.setText("Nombre del Partido");

        siglapartido.setText("Sigla");

        representantepartido.setText("Representante Legal");

        txtSigla.addActionListener(this::txtSiglaActionPerformed);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        btnVerLista.setText("Ver Lista");
        btnVerLista.addActionListener(this::btnVerListaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(representantepartido)
                            .addComponent(siglapartido)
                            .addComponent(nombrepartido)
                            .addComponent(codigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtCodigoPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addComponent(txtNombrePartido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(33, 33, 33)
                        .addComponent(btnModificar)
                        .addGap(36, 36, 36)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnVerLista)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(txtCodigoPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrepartido)
                    .addComponent(txtNombrePartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siglapartido)
                    .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(representantepartido)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnVerLista))
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiglaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        FrmPrincipal f = new FrmPrincipal();
        f.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigoPartido.getText();
    String nombre = txtNombrePartido.getText();
    String sigla = txtSigla.getText();
    String representante = txtRepresentante.getText();

    PartidoPolitico p = new PartidoPolitico(
            codigo,
            nombre,
            sigla,
            "SinLogo",
            representante,
            null
    );

    boolean registrado = gestion.registrarPartido(p);

    if (registrado) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Partido registrado correctamente.");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Código repetido.");
    }
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigoPartido.getText();

    boolean eliminado = gestion.eliminarPartido(codigo);

    if (eliminado) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Partido eliminado.");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
                "No se encontró el partido.");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigoPartido.getText();
    String nombre = txtNombrePartido.getText();
    String sigla = txtSigla.getText();
    String representante = txtRepresentante.getText();

    boolean modificado = gestion.modificarPartido(
            codigo,
            nombre,
            sigla,
            "SinLogo",
            representante
            
    );

    if (modificado) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Partido modificado.");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
                "No se encontró el partido.");
    }
    
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListaActionPerformed
        // TODO add your handling code here:
        String lista = gestion.listarPartidos();

    javax.swing.JOptionPane.showMessageDialog(this, lista);
    }//GEN-LAST:event_btnVerListaActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new FrmGestionPartidos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerLista;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombrepartido;
    private javax.swing.JLabel representantepartido;
    private javax.swing.JLabel siglapartido;
    private javax.swing.JTextField txtCodigoPartido;
    private javax.swing.JTextField txtNombrePartido;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
