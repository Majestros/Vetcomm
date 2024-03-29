/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFMvMostrar.java
 *
 * Created on 07-12-2012, 05:01:53 PM
 */
package interfaz;

import javax.swing.JOptionPane;
import static controlador.Principal.VETERINARIA;
import modelo.MedicoVeterinario;

/**
 *
 * @author Kal-El
 */
public class JFMvMostrar extends javax.swing.JFrame {
    private MedicoVeterinario v;
            
    /** Creates new form JFMvMostrar */
    public JFMvMostrar(MedicoVeterinario v) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.v=v;
        
        if (v!=null){
            jLrut.setText(v.getRut());
            jLnombre.setText(v.getNombre());
            jLespecialidad.setText(v.getEspecialidad());
        }
        
        jTeditarNombre.setVisible(false);
        jTeditarEspecialidad.setVisible(false);
        jBguardarCambios.setVisible(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLrut = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLespecialidad = new javax.swing.JLabel();
        jTeditarNombre = new javax.swing.JTextField();
        jTeditarEspecialidad = new javax.swing.JTextField();
        jBguardarCambios = new javax.swing.JButton();
        jBeliminarVeterinario = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jLabel1.setText("Rut");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(36, 54, 40, 14);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(36, 86, 58, 14);

        jLabel3.setText("Especialidad");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(36, 118, 70, 14);

        jLrut.setText(".");
        jPanel1.add(jLrut);
        jLrut.setBounds(125, 54, 155, 14);

        jLnombre.setText(".");
        jPanel1.add(jLnombre);
        jLnombre.setBounds(125, 86, 155, 14);

        jLespecialidad.setText(".");
        jPanel1.add(jLespecialidad);
        jLespecialidad.setBounds(125, 118, 155, 14);
        jPanel1.add(jTeditarNombre);
        jTeditarNombre.setBounds(140, 80, 160, 25);
        jPanel1.add(jTeditarEspecialidad);
        jTeditarEspecialidad.setBounds(140, 110, 160, 25);

        jBguardarCambios.setText("Guardar Cambios");
        jBguardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(jBguardarCambios);
        jBguardarCambios.setBounds(150, 160, 140, 23);

        jBeliminarVeterinario.setText("Eliminar");
        jBeliminarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarVeterinarioActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBeditar.setText("Editar");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBeliminarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeliminarVeterinario)
                    .addComponent(jBsalir)
                    .addComponent(jBeditar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBeliminarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarVeterinarioActionPerformed
        // TODO add your handling code here:
        VETERINARIA.eliminarMedicoVeterinario(v);
        this.setVisible(false);
        JOptionPane.showMessageDialog(rootPane, "Medico Eliminado!");
    }//GEN-LAST:event_jBeliminarVeterinarioActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        // TODO add your handling code here:
       jBguardarCambios.setVisible(true);
        
       jBeliminarVeterinario.setEnabled(false);
       
       jLnombre.setVisible(false);
       jTeditarNombre.setVisible(true);
       jTeditarNombre.setText(v.getNombre());
       
       
       jLespecialidad.setVisible(false);
       jTeditarEspecialidad.setVisible(true);
       jTeditarEspecialidad.setText(v.getEspecialidad());
       
       
       
       
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBguardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarCambiosActionPerformed
        // TODO add your handling code here:
       v.setNombre(jTeditarNombre.getText()); 
       v.setEspecialidad(jTeditarEspecialidad.getText()); 
        
       VETERINARIA.editarMedicoVeterinario(v);
       
//       jBeliminarVeterinario.setEnabled(true);      
//       jBguardarCambios.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_jBguardarCambiosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final MedicoVeterinario v) {
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
            java.util.logging.Logger.getLogger(JFMvMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMvMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMvMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMvMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFMvMostrar(v).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBeliminarVeterinario;
    private javax.swing.JButton jBguardarCambios;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLespecialidad;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLrut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTeditarEspecialidad;
    private javax.swing.JTextField jTeditarNombre;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
