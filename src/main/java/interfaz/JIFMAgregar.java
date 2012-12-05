/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JIFMAgregar.java
 *
 * Created on 05-12-2012, 03:54:28 PM
 */
package interfaz;

import controlador.Veterinaria;
import modelo.Mascota;

/**
 *
 * @author Kal-El
 */
public class JIFMAgregar extends javax.swing.JInternalFrame {

    private Veterinaria vet = Veterinaria.obtenerInstancia();
    private Mascota ma=new Mascota(); 
    /** Creates new form JIFMAgregar */
    public JIFMAgregar() {
        initComponents();
        //llenarListaCliente();
        
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
        mId = new javax.swing.JTextField();
        mNombre = new javax.swing.JTextField();
        mRaza = new javax.swing.JTextField();
        mGenero = new javax.swing.JTextField();
        agregarMascota = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Agregar Mascota");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Mascota", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel1.setText("Id:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Raza:");

        jLabel4.setText("Genero:");

        mId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIdActionPerformed(evt);
            }
        });

        mNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNombreActionPerformed(evt);
            }
        });

        mRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRazaActionPerformed(evt);
            }
        });

        mGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mGenero)
                    .addComponent(mRaza)
                    .addComponent(mNombre)
                    .addComponent(mId, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        agregarMascota.setText("Agregar");
        agregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(agregarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregarMascota)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mIdActionPerformed

    private void mNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNombreActionPerformed

    private void mRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mRazaActionPerformed

    private void mGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mGeneroActionPerformed

    private void agregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMascotaActionPerformed
        // TODO add your handling code here:
        ma.setId(mId.getText());
        ma.setNombre(mNombre.getText());
        ma.setRaza(mRaza.getText());
        ma.setGenero(Boolean.parseBoolean(mGenero.getText())); 
        
       //Cliente client = (Cliente) jComboBox1.getSelectedItem();
       // ma.setCl(client); malo arreglarlo
        
        vet.agregarMascota(obtenerDatosMascota());
    }//GEN-LAST:event_agregarMascotaActionPerformed

    public Mascota obtenerDatosMascota(){
        return this.ma;
    }

    
    
   // private void llenarListaCliente(){
    //    for (Cliente client : Veterinaria.obtenerInstancia().getClientes()) {
   //         jComboBox1.addItem(client);
   //     }
   // }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mGenero;
    private javax.swing.JTextField mId;
    private javax.swing.JTextField mNombre;
    private javax.swing.JTextField mRaza;
    // End of variables declaration//GEN-END:variables
}
