/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFMMostrar.java
 *
 * Created on 07-12-2012, 01:39:00 PM
 */
package interfaz;

import static controlador.Principal.VETERINARIA;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.FichaMedica;
import modelo.Mascota;

/**
 *
 * @author Kal-El
 */
public class JFMMostrar extends javax.swing.JFrame {
    
    private Mascota m;
    ArrayList<FichaMedica> historial = new ArrayList<FichaMedica>();

    /** Creates new form JFMMostrar */
    public JFMMostrar(Mascota m) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.m = m;
       

        if (m != null) {
            jLid.setText(m.getId());
            jLnombre.setText(m.getNombre());
            jLraza.setText(m.getRaza());

            if (m.getGenero() == false) {
                jLgenero.setText("Hembra");
            } else {
                jLgenero.setText("Macho");
            }

            //llenar el jList
            historial = m.getHistorial();
            
            llenarLista();
            
            
            jTeditarRaza.setVisible(false);
            jCbeditarGenero.setVisible(false);
            jBguardarCambios.setVisible(false);
        }
    }

    //para llenar la lista, faltan los metodos de agregar y de actualizar arrayList
    public void llenarLista() {
        DefaultListModel modeloLista = new DefaultListModel();

        for (FichaMedica ficha : historial) {
            modeloLista.addElement(ficha);
        }
        jListHistorial.setModel(modeloLista);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLraza = new javax.swing.JLabel();
        jLgenero = new javax.swing.JLabel();
        jBagregarHistorial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListHistorial = new javax.swing.JList();
        jBactualizar = new javax.swing.JButton();
        jTeditarRaza = new javax.swing.JTextField();
        jCbeditarGenero = new javax.swing.JComboBox();
        jBguardarCambios = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBeliminarMascota = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jLabel1.setText("Id:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(47, 39, 52, 14);

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 70, 52, 14);

        jLabel3.setText("Raza:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 100, 52, 14);

        jLabel4.setText("Genero:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 130, 39, 14);

        jLabel5.setText("Historial:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 160, 363, 14);

        jLid.setText(".");
        jPanel1.add(jLid);
        jLid.setBounds(150, 40, 179, 14);

        jLnombre.setText(".");
        jPanel1.add(jLnombre);
        jLnombre.setBounds(150, 70, 179, 14);

        jLraza.setText(".");
        jPanel1.add(jLraza);
        jLraza.setBounds(150, 100, 190, 20);

        jLgenero.setText(".");
        jPanel1.add(jLgenero);
        jLgenero.setBounds(150, 130, 179, 14);

        jBagregarHistorial.setText("Agregar Historial");
        jBagregarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(jBagregarHistorial);
        jBagregarHistorial.setBounds(250, 230, 156, 23);

        jListHistorial.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListHistorial);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 190, 179, 130);

        jBactualizar.setText("Actualizar");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jBactualizar);
        jBactualizar.setBounds(250, 200, 156, 23);
        jPanel1.add(jTeditarRaza);
        jTeditarRaza.setBounds(160, 100, 190, 25);

        jCbeditarGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Macho", "Hembra" }));
        jPanel1.add(jCbeditarGenero);
        jCbeditarGenero.setBounds(160, 130, 140, 20);

        jBguardarCambios.setText("Guardar Cambios");
        jBguardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(jBguardarCambios);
        jBguardarCambios.setBounds(250, 290, 160, 23);

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBeliminarMascota.setText("Eliminar");
        jBeliminarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarMascotaActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jBeliminarMascota)
                .addGap(33, 33, 33)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBeliminarMascota)
                    .addComponent(jBeditar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBagregarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarHistorialActionPerformed
        // TODO add your handling code here:
        new JFFichaMedAgregar(m).setVisible(true);
    }//GEN-LAST:event_jBagregarHistorialActionPerformed

    private void jBeliminarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarMascotaActionPerformed
        // TODO add your handling code here:
        VETERINARIA.eliminarMascota(m);
        JOptionPane.showMessageDialog(null, "Mascota eliminada.");
        this.setVisible(false);
    }//GEN-LAST:event_jBeliminarMascotaActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        // TODO add your handling code here:
        jBguardarCambios.setVisible(true);
        
        jBactualizar.setEnabled(false);
        jBagregarHistorial.setEnabled(false);
        jBeliminarMascota.setEnabled(false);
        
       
        jLraza.setVisible(false);
        jTeditarRaza.setVisible(true);
        jTeditarRaza.setText(m.getRaza());
        
        
        jLgenero.setVisible(false);
        jCbeditarGenero.setVisible(true);
        
        
                
        
        
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBguardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarCambiosActionPerformed
        // TODO add your handling code here:
        
        m.setRaza(jTeditarRaza.getText());
        String genero = jCbeditarGenero.getSelectedItem().toString();
        
        if(genero.equals("Hembra")){
            m.setGenero(false);
        }else{
            m.setGenero(true);
        }
        
        VETERINARIA.editarMascota(m);
    }//GEN-LAST:event_jBguardarCambiosActionPerformed
    private void actualizar() {
//        VETERINARIA.llenarFichaMedicasDeMascota(m);
//        historial=m.getHistorial();
//        llenarLista();
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final Mascota m) {
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
            java.util.logging.Logger.getLogger(JFMMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFMMostrar(m).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBagregarHistorial;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBeliminarMascota;
    private javax.swing.JButton jBguardarCambios;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox jCbeditarGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLgenero;
    private javax.swing.JLabel jLid;
    private javax.swing.JList jListHistorial;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLraza;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTeditarRaza;
    // End of variables declaration//GEN-END:variables
}
