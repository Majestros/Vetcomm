/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFAgregarHoraMedica.java
 *
 * Created on 11-12-2012, 03:38:46 PM
 */
package interfaz;

import static controlador.Principal.VETERINARIA;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.HoraMedica;
import modelo.Mascota;
import modelo.MedicoVeterinario;

/**
 *
 * @author Kal-El
 */
public class JFAgregarHoraMedica extends javax.swing.JFrame {

    private HoraMedica h = new HoraMedica();
    ArrayList<Mascota> mascotasCliente = new ArrayList<Mascota>();
   

    /** Creates new form JFAgregarHoraMedica */
    public JFAgregarHoraMedica() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarListaClientes();
        llenarListaMedicoVeterinario();

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
        jCbmes = new javax.swing.JComboBox();
        jCbdia = new javax.swing.JComboBox();
        jCbHora = new javax.swing.JComboBox();
        jCbMinuto = new javax.swing.JComboBox();
        jCbclientes = new javax.swing.JComboBox();
        jCbmascota = new javax.swing.JComboBox();
        jCbmedicoVeterinario = new javax.swing.JComboBox();
        jCbsala = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jCbagno = new javax.swing.JComboBox();
        jBagregarHoraMedica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Hora Medica");
        setMinimumSize(new java.awt.Dimension(300, 400));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Hora Medica", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel1.setText("Cliente: ");

        jLabel2.setText("Mascota: ");

        jLabel3.setText("Veterinario: ");

        jLabel4.setText("Fecha (M/D/AAAA): ");

        jLabel5.setText("Hora (HH:MM): ");

        jCbmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jCbdia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jCbHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jCbMinuto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "20", "40" }));

        jCbclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbclientesActionPerformed(evt);
            }
        });

        jCbsala.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06" }));

        jLabel6.setText("Sala:");

        jCbagno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014", "2015" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCbsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCbHora, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCbmes, javax.swing.GroupLayout.Alignment.LEADING, 0, 62, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCbMinuto, 0, 66, Short.MAX_VALUE)
                                .addComponent(jCbdia, 0, 66, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(jCbagno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCbmascota, javax.swing.GroupLayout.Alignment.LEADING, 0, 259, Short.MAX_VALUE)
                                .addComponent(jCbclientes, javax.swing.GroupLayout.Alignment.LEADING, 0, 259, Short.MAX_VALUE)
                                .addComponent(jCbmedicoVeterinario, javax.swing.GroupLayout.Alignment.LEADING, 0, 259, Short.MAX_VALUE))
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCbclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jCbmedicoVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCbmascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCbmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbagno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)))
        );

        jBagregarHoraMedica.setText("Agregar");
        jBagregarHoraMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarHoraMedicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBagregarHoraMedica)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBagregarHoraMedica)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jBagregarHoraMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarHoraMedicaActionPerformed
        // TODO add your handling code here:
        Cliente cElegido = (Cliente) jCbclientes.getSelectedItem();
        h.setRutCliente(cElegido.getRut());
        
        Mascota m = (Mascota) jCbmascota.getSelectedItem();
        h.setNombreMascota(m.getNombre());

        MedicoVeterinario v = (MedicoVeterinario) jCbmedicoVeterinario.getSelectedItem();
        h.setRutVeterinario(v.getRut());
        
        String fecha = jCbmes.getSelectedItem().toString() + jCbdia.getSelectedItem().toString() + jCbagno.getSelectedItem().toString();
        h.setFecha(fecha);
        
        String hora = jCbHora.getSelectedItem().toString() + " : " + jCbMinuto.getSelectedItem().toString();
        h.setHora(hora);

        String sala = jCbsala.getSelectedItem().toString();
        h.setSala(sala);

        boolean s= VETERINARIA.agregarHora(obtenerDatosHoraMedica());
        if (s) {
            JOptionPane.showMessageDialog(rootPane, "Hora Medica agregada!");
            this.dispose();
        }
    }//GEN-LAST:event_jBagregarHoraMedicaActionPerformed

    public HoraMedica obtenerDatosHoraMedica() {
        return h;
    }

    
    private void jCbclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbclientesActionPerformed
        // TODO add your handling code here:
        
         
        Cliente cElegido = (Cliente) jCbclientes.getSelectedItem();
        h.setRutCliente(cElegido.getRut());

        //Dependiendo del cliente que se elija se van a mostrar las mascotas que posea.  
        if (cElegido != null) {

            VETERINARIA.llenarMascotasDeCliente(cElegido);
            mascotasCliente = cElegido.getMascota();

            llenarListaMascotas();
        }
    }//GEN-LAST:event_jCbclientesActionPerformed

    //Llena la lista del cliente elegido 
    private void llenarListaClientes() {

        for (Cliente c : VETERINARIA.getClientes()) {
            jCbclientes.addItem(c);
            llenarListaMascotas();

        }
    }

    //Llena la lista de mascota 
    private void llenarListaMascotas() {
        jCbmascota.removeAllItems();
        for (Mascota mascota : mascotasCliente) {
            jCbmascota.addItem(mascota);
        }

    }

    //Llena la lista del medico veterinario 
    private void llenarListaMedicoVeterinario() {
        for (MedicoVeterinario v : VETERINARIA.getMedicos()) {
            jCbmedicoVeterinario.addItem(v);

        }
    }

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
            java.util.logging.Logger.getLogger(JFAgregarHoraMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAgregarHoraMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAgregarHoraMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAgregarHoraMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFAgregarHoraMedica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregarHoraMedica;
    private javax.swing.JComboBox jCbHora;
    private javax.swing.JComboBox jCbMinuto;
    private javax.swing.JComboBox jCbagno;
    private javax.swing.JComboBox jCbclientes;
    private javax.swing.JComboBox jCbdia;
    private javax.swing.JComboBox jCbmascota;
    private javax.swing.JComboBox jCbmedicoVeterinario;
    private javax.swing.JComboBox jCbmes;
    private javax.swing.JComboBox jCbsala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
