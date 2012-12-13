/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFCMostrar.java
 *
 * Created on 06-12-2012, 05:02:06 PM
 */
package interfaz;
import static controlador.Principal.VETERINARIA;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Mascota;

/**
 *
 * @author Kal-El
 */
public class JFCMostrar extends javax.swing.JFrame {
    private Cliente c;
    ArrayList<Mascota> mascotasCliente = new ArrayList<Mascota>();
    /** Creates new form JFCMostrar */
    public JFCMostrar(Cliente c) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.c=c;
        
        DefaultListModel dlm = new DefaultListModel();        
        
        if (c!=null){
            jLnombre.setText(c.getNombre());
            jLrut.setText(c.getRut());
            jLdireccion.setText(c.getDireccion());
            jLtelefono.setText(String.valueOf(c.getTelefono()));
            jLemail.setText(c.getEmail());
            
            //TODO: llenar el JList
            mascotasCliente=c.getMascota();
            llenarLista();
           
        }
        
        jTeditarNombre.setVisible(false);
        jTeditarDireccion.setVisible(false);
        jTeditarTelefono.setVisible(false);
        jTeditarEmail.setVisible(false);
        
        jBguardarCambios.setVisible(false);
    }
    
    public void llenarLista(){
        DefaultListModel modeloLista = new DefaultListModel();
        
        for (Mascota mascota : mascotasCliente) {
            modeloLista.addElement(mascota);
        }
        jListMascotas.setModel(modeloLista);
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
        jLrut = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLdireccion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLtelefono = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLemail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMascotas = new javax.swing.JList();
        jBactualizar = new javax.swing.JButton();
        jBmostrarMascota = new javax.swing.JButton();
        jBagregarMascota = new javax.swing.JButton();
        jBeliminarMascota = new javax.swing.JButton();
        jTeditarNombre = new javax.swing.JTextField();
        jTeditarDireccion = new javax.swing.JTextField();
        jTeditarTelefono = new javax.swing.JTextField();
        jTeditarEmail = new javax.swing.JTextField();
        jBguardarCambios = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBeliminarCliente = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jLabel1.setText("Rut");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 40, 14);

        jLrut.setText(".");
        jPanel1.add(jLrut);
        jLrut.setBounds(90, 20, 230, 14);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 90, 14);

        jLnombre.setText(".");
        jPanel1.add(jLnombre);
        jLnombre.setBounds(90, 50, 220, 10);

        jLabel3.setText("Dirección");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 90, 14);

        jLdireccion.setText(".");
        jPanel1.add(jLdireccion);
        jLdireccion.setBounds(90, 80, 220, 10);

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 100, 14);

        jLtelefono.setText(".");
        jPanel1.add(jLtelefono);
        jLtelefono.setBounds(90, 110, 220, 10);

        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 140, 90, 14);

        jLemail.setText(".");
        jPanel1.add(jLemail);
        jLemail.setBounds(90, 140, 220, 10);

        jLabel7.setText("Mascotas Registradas");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 170, 130, 14);

        jListMascotas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListMascotas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 180, 130);

        jBactualizar.setText("Actualizar");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jBactualizar);
        jBactualizar.setBounds(220, 200, 170, 23);

        jBmostrarMascota.setText("Mostrar Mascota");
        jBmostrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmostrarMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(jBmostrarMascota);
        jBmostrarMascota.setBounds(220, 230, 170, 23);

        jBagregarMascota.setText("Agregar Mascota");
        jBagregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(jBagregarMascota);
        jBagregarMascota.setBounds(220, 270, 170, 23);

        jBeliminarMascota.setText("Eliminar Mascota");
        jBeliminarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(jBeliminarMascota);
        jBeliminarMascota.setBounds(220, 300, 170, 23);
        jPanel1.add(jTeditarNombre);
        jTeditarNombre.setBounds(100, 40, 210, 20);
        jPanel1.add(jTeditarDireccion);
        jTeditarDireccion.setBounds(100, 70, 270, 20);
        jPanel1.add(jTeditarTelefono);
        jTeditarTelefono.setBounds(100, 100, 270, 20);
        jPanel1.add(jTeditarEmail);
        jTeditarEmail.setBounds(100, 130, 270, 20);

        jBguardarCambios.setText("Guardar Cambios ");
        jBguardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(jBguardarCambios);
        jBguardarCambios.setBounds(220, 160, 150, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 20, 400, 350);

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir);
        jBsalir.setBounds(320, 380, 100, 23);

        jBeliminarCliente.setText("Eliminar Cliente ");
        jBeliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jBeliminarCliente);
        jBeliminarCliente.setBounds(200, 380, 107, 23);

        jBeditar.setText("Editar ");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });
        getContentPane().add(jBeditar);
        jBeditar.setBounds(80, 380, 100, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBagregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarMascotaActionPerformed
        // TODO add your handling code here:
         new JFMAgregar(c.getRut()).setVisible(true);
 //      es lo mismo        
 //            JIFMAgregar agregarMascota = new JIFMAgregar();
//            agregarMascota.setVisible(true);
         
   
         
    }//GEN-LAST:event_jBagregarMascotaActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void actualizar(){
    VETERINARIA.llenarMascotasDeCliente(c);
        mascotasCliente=c.getMascota();
        llenarLista();
    }
    private void jBeliminarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarMascotaActionPerformed
        // TODO add your handling code here:
        Mascota mascotaAEliminar = (Mascota) jListMascotas.getSelectedValue();
        if (mascotaAEliminar != null ){
            VETERINARIA.eliminarMascota(mascotaAEliminar);
        actualizar();
        }
    }//GEN-LAST:event_jBeliminarMascotaActionPerformed

    private void jBmostrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmostrarMascotaActionPerformed
        // TODO add your handling code here:
         Mascota mascota = (Mascota) jListMascotas.getSelectedValue();
        if (mascota!=null){
            JFMMostrar.main(mascota);
        }else {
            JOptionPane.showMessageDialog(null, "No se a elegido mascota.");
        }
        
        
    }//GEN-LAST:event_jBmostrarMascotaActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBeliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarClienteActionPerformed
        // TODO add your handling code here:
        VETERINARIA.eliminarCliente(c);
        VETERINARIA.eliminarMascotasDeCliente(c.getMascota());
        //falta eliminar todas las mascotas del cliente
        this.setVisible(false);
        JOptionPane.showMessageDialog(rootPane, "Cliente Eliminado!");
    }//GEN-LAST:event_jBeliminarClienteActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        // TODO add your handling code here:
        jBguardarCambios.setVisible(true);
        
        jBactualizar.setEnabled(false);
        jBagregarMascota.setEnabled(false);
        jBeliminarCliente.setEnabled(false);
        jBeliminarMascota.setEnabled(false);
        jBmostrarMascota.setEnabled(false);
        
        jLnombre.setVisible(false);
        jTeditarNombre.setVisible(true);
        jTeditarNombre.setText(c.getNombre());
        
        
        jLdireccion.setVisible(false);
        jTeditarDireccion.setVisible(true);
        jTeditarDireccion.setText(c.getDireccion());
        
        
        jLtelefono.setVisible(false);
        jTeditarTelefono.setVisible(true);
        jTeditarTelefono.setText(String.valueOf(c.getTelefono()));
        
        
        jLemail.setVisible(false);
        jTeditarEmail.setVisible(true);
        jTeditarEmail.setText(c.getEmail());
        
        
              
        
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBguardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarCambiosActionPerformed
        // TODO add your handling code here:
        c.setNombre(jTeditarNombre.getText());
        c.setDireccion(jTeditarDireccion.getText());
        c.setTelefono(Integer.parseInt(jTeditarTelefono.getText()));
        c.setEmail(jTeditarEmail.getText());
        
        VETERINARIA.editarCliente(c);
    }//GEN-LAST:event_jBguardarCambiosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void run(final Cliente c) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFCMostrar(c).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBagregarMascota;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBeliminarCliente;
    private javax.swing.JButton jBeliminarMascota;
    private javax.swing.JButton jBguardarCambios;
    private javax.swing.JButton jBmostrarMascota;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLdireccion;
    private javax.swing.JLabel jLemail;
    private javax.swing.JList jListMascotas;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLrut;
    private javax.swing.JLabel jLtelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTeditarDireccion;
    private javax.swing.JTextField jTeditarEmail;
    private javax.swing.JTextField jTeditarNombre;
    private javax.swing.JTextField jTeditarTelefono;
    // End of variables declaration//GEN-END:variables
}
