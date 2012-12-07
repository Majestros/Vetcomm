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
        this.c=c;
        
        DefaultListModel dlm = new DefaultListModel();
        
        
        if (c!=null){
            nombre.setText(c.getNombre());
            rut.setText(c.getRut());
            direccion.setText(c.getDireccion());
            telefono.setText(c.getNombre());
            email.setText(c.getEmail());
            
            //TODO: llenar el JList
            mascotasCliente=c.getMascota();
            llenarLista();

            
            
        }
    }
    
    public void llenarLista(){
        DefaultListModel modeloLista = new DefaultListModel();
        
        for (Mascota mascota : mascotasCliente) {
            modeloLista.addElement(mascota);
        }
        jList1.setModel(modeloLista);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rut = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminarMascota = new javax.swing.JButton();
        mostrarMascota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(null);

        jLabel1.setText("Rut");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 46, 80, 14);

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 78, 90, 14);

        jLabel3.setText("Dirección");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 103, 90, 14);

        rut.setText(".");
        getContentPane().add(rut);
        rut.setBounds(139, 44, 230, 14);

        direccion.setText(".");
        getContentPane().add(direccion);
        direccion.setBounds(142, 103, 220, 10);

        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 128, 100, 14);

        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 153, 90, 14);

        telefono.setText(".");
        getContentPane().add(telefono);
        telefono.setBounds(142, 128, 220, 10);

        email.setText(".");
        getContentPane().add(email);
        email.setBounds(142, 153, 220, 10);

        nombre.setText(".");
        getContentPane().add(nombre);
        nombre.setBounds(142, 78, 220, 10);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 232, 180, 130);

        jLabel7.setText("Mascotas Registradas");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 200, 130, 14);

        jButton1.setText("Agregar Mascota");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(273, 370, 120, 23);

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar);
        actualizar.setBounds(210, 240, 140, 23);

        eliminarMascota.setText("Eliminar Mascota");
        eliminarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarMascota);
        eliminarMascota.setBounds(130, 370, 120, 23);

        mostrarMascota.setText("Mostrar Mascota");
        mostrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarMascota);
        mostrarMascota.setBounds(210, 280, 140, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         new JFMAgregar(c.getRut()).setVisible(true);
 //      es lo mismo        
 //            JIFMAgregar agregarMascota = new JIFMAgregar();
//            agregarMascota.setVisible(true);
         
   
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_actualizarActionPerformed

    private void actualizar(){
    VETERINARIA.llenarMascotasDeCliente(c);
        mascotasCliente=c.getMascota();
        llenarLista();
    }
    private void eliminarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMascotaActionPerformed
        // TODO add your handling code here:
        Mascota mascotaAEliminar = (Mascota) jList1.getSelectedValue();
        if (mascotaAEliminar != null ){
            VETERINARIA.eliminarMascota(mascotaAEliminar);
        actualizar();
        }
    }//GEN-LAST:event_eliminarMascotaActionPerformed

    private void mostrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMascotaActionPerformed
        // TODO add your handling code here:
         Mascota mascota = (Mascota) jList1.getSelectedValue();
        if (mascota!=null){
            JFMMostrar.main(mascota);
        }else {
            JOptionPane.showMessageDialog(null,"No se a elegido mascota.");
        }
        
        
    }//GEN-LAST:event_mostrarMascotaActionPerformed

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
    private javax.swing.JButton actualizar;
    private javax.swing.JLabel direccion;
    private javax.swing.JButton eliminarMascota;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarMascota;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel rut;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
