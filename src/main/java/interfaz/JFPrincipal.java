/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import static controlador.Principal.VETERINARIA;
import controlador.Veterinaria;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import modelo.HoraMedica;


/**
 *
 * @author Casa
 */
public class JFPrincipal extends javax.swing.JFrame {
    
    //creacion tabla para listar Horas medicas del dia.
    //blah blah
    DefaultTableModel modeloListarHora = new DefaultTableModel();
    private ArrayList<HoraMedica> listaHoras= new ArrayList<HoraMedica>();
    private HoraMedica h;
    
    /**
     * Creates new form JFVentanaGeneral
     */
    public JFPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        String titulos[] = {"RUT CLIENTE","MASCOTA","RUT VETERINARIO","HORA","SALA"};
        modeloListarHora.setColumnIdentifiers(titulos);
        this.JTListarHoras.setModel(modeloListarHora);
        this.listaHoras = VETERINARIA.getHoraMedica();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTListarHoras = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBagregarHoraMedica = new javax.swing.JButton();
        jBeliminarHoraMedica = new javax.swing.JButton();
        jBbuscarHoraMedica = new javax.swing.JButton();
        jCbmes = new javax.swing.JComboBox();
        jCbdia = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jCbagno = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cAgregar = new javax.swing.JMenuItem();
        cBuscar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mBuscar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mvAgregar = new javax.swing.JMenuItem();
        mvBuscar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vetcomm 1.0");

        jDesktopPane1.setName("VETCOMM 1.0"); // NOI18N
        jDesktopPane1.setOpaque(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JTListarHoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Rut Cliente", "Mascota", "Rut Veterinario", "Hora", "Sala"
            }
        ));
        jScrollPane1.setViewportView(JTListarHoras);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Consultas.");

        jBagregarHoraMedica.setText("Agregar");
        jBagregarHoraMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarHoraMedicaActionPerformed(evt);
            }
        });

        jBeliminarHoraMedica.setText("Eliminar");
        jBeliminarHoraMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarHoraMedicaActionPerformed(evt);
            }
        });

        jBbuscarHoraMedica.setText("Buscar");
        jBbuscarHoraMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarHoraMedicaActionPerformed(evt);
            }
        });

        jCbmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jCbdia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel2.setText("Fecha (MM/DD/AAAA):");

        jCbagno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014", "2015" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(jBagregarHoraMedica)
                .addGap(131, 131, 131)
                .addComponent(jBeliminarHoraMedica)
                .addGap(207, 207, 207))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCbmes, 0, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jCbdia, 0, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCbagno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBbuscarHoraMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBbuscarHoraMedica)
                    .addComponent(jCbmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jCbagno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregarHoraMedica)
                    .addComponent(jBeliminarHoraMedica))
                .addGap(61, 61, 61))
        );

        jPanel1.setBounds(0, 0, 710, 410);
        jDesktopPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Cliente");

        cAgregar.setText("Agregar");
        cAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAgregarActionPerformed(evt);
            }
        });
        jMenu1.add(cAgregar);

        cBuscar.setText("Buscar");
        cBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBuscarActionPerformed(evt);
            }
        });
        jMenu1.add(cBuscar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mascota");

        mBuscar.setText("Buscar");
        mBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBuscarActionPerformed(evt);
            }
        });
        jMenu2.add(mBuscar);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Medico Veterinario");

        mvAgregar.setText("Agregar");
        mvAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mvAgregarActionPerformed(evt);
            }
        });
        jMenu4.add(mvAgregar);

        mvBuscar.setText("Buscar");
        mvBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mvBuscarActionPerformed(evt);
            }
        });
        jMenu4.add(mvBuscar);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //abre la internal frame que agrega al cliente  
    private void cAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAgregarActionPerformed
        // TODO add your handling code here:
        JIFCAgregar agregarC=new JIFCAgregar();
        jDesktopPane1.add(agregarC);
        agregarC.setVisible(true);
        
        
    }//GEN-LAST:event_cAgregarActionPerformed

    //abre la internal frame que busca al cliente
    private void cBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBuscarActionPerformed
        // TODO add your handling code here:
        JIFCBuscar buscarC=new JIFCBuscar();
        jDesktopPane1.add(buscarC);
        buscarC.setVisible(true);
                      
    }//GEN-LAST:event_cBuscarActionPerformed

    //abre la internal frame que busca al cliente
    private void mBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBuscarActionPerformed
        // TODO add your handling code here:
        JIFMBuscar buscarM=new JIFMBuscar();
        jDesktopPane1.add(buscarM);
        buscarM.setVisible(true);
        
    }//GEN-LAST:event_mBuscarActionPerformed

    //abre la internal frame que agrega al medico veterinario
    private void mvAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mvAgregarActionPerformed
        // TODO add your handling code here:
        JIFMvAgregar agregarMv=new JIFMvAgregar();
        jDesktopPane1.add(agregarMv);
        agregarMv.setVisible(true);
        
    }//GEN-LAST:event_mvAgregarActionPerformed

    //abre la internal frame que busca al medico veterinario
    private void mvBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mvBuscarActionPerformed
        // TODO add your handling code here:
        JIFMvBuscar buscarMv=new JIFMvBuscar();
        jDesktopPane1.add(buscarMv);
        buscarMv.setVisible(true);
    }//GEN-LAST:event_mvBuscarActionPerformed
    
    
   //abre el frame que agrega la hora medica
        private void jBagregarHoraMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarHoraMedicaActionPerformed
        // TODO add your handling code here:
            JFAgregarHoraMedica agregarHora = new JFAgregarHoraMedica();
            agregarHora.setVisible(true);
    }//GEN-LAST:event_jBagregarHoraMedicaActionPerformed

    //boton que busca la hora medica mediante la fecha. 
    //Mostrando las horas medicas del dia escogido. 
    private void jBbuscarHoraMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarHoraMedicaActionPerformed
        // TODO add your handling code here:
        
        String fecha = jCbmes.getSelectedItem().toString()+"-" + jCbdia.getSelectedItem().toString()+"-" + jCbagno.getSelectedItem().toString();
        modeloListarHora.setRowCount(0);
        
        
        String datos[]=new String [5];
        for (int cont=0;cont<listaHoras.size();cont++ ){
            if (listaHoras.get(cont).getFecha().equals(fecha)){
                
                datos[0]=listaHoras.get(cont).getRutCliente();
                datos[1]=listaHoras.get(cont).getNombreMascota();
                datos[2]=listaHoras.get(cont).getRutVeterinario();
                datos[3]=listaHoras.get(cont).getHora();
                datos[4]=listaHoras.get(cont).getSala();
                
                modeloListarHora.addRow(datos); 
            }           
        }
        

    }//GEN-LAST:event_jBbuscarHoraMedicaActionPerformed

    
   //Boton que elimina una hora medica elegida en la tabla.   
    private void jBeliminarHoraMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarHoraMedicaActionPerformed
        // TODO add your handling code here:
        int pos=JTListarHoras.getSelectedRow();
        h=listaHoras.get(pos);
        if(h!=null){
            VETERINARIA.eliminarHoraMedica(h);
            modeloListarHora.removeRow(pos);
        }
        
    }//GEN-LAST:event_jBeliminarHoraMedicaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTListarHoras;
    private javax.swing.JMenuItem cAgregar;
    private javax.swing.JMenuItem cBuscar;
    private javax.swing.JButton jBagregarHoraMedica;
    private javax.swing.JButton jBbuscarHoraMedica;
    private javax.swing.JButton jBeliminarHoraMedica;
    private javax.swing.JComboBox jCbagno;
    private javax.swing.JComboBox jCbdia;
    private javax.swing.JComboBox jCbmes;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mBuscar;
    private javax.swing.JMenuItem mvAgregar;
    private javax.swing.JMenuItem mvBuscar;
    // End of variables declaration//GEN-END:variables
}
