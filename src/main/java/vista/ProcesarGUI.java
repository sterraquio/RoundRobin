
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Proceso;

/**
 *
 * @author camilotr
 */
public class ProcesarGUI extends javax.swing.JFrame {
    
    private Proceso procesitoModelo;
    
    /**
     * Creates new form ProcesarGUI
     */
    public ProcesarGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollbar1 = new java.awt.Scrollbar();
        jlb_nombreP = new javax.swing.JLabel();
        jbl_ragafaCPU = new javax.swing.JLabel();
        jtf_nombreP = new javax.swing.JTextField();
        jbt_agregar = new javax.swing.JButton();
        jbt_iniciar = new javax.swing.JButton();
        jbl_lisProcesos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_lisProcesos = new javax.swing.JTable();
        jbl_proProceso = new javax.swing.JLabel();
        jbl_porcentaje = new javax.swing.JLabel();
        jbl_progreso = new javax.swing.JLabel();
        jtf_proProceso = new javax.swing.JTextField();
        jtf_porcentaje = new javax.swing.JTextField();
        jBarraProgreso = new javax.swing.JProgressBar();
        jbt_salirPrograma = new javax.swing.JButton();
        jSeleccionRafaga = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Round Robin");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);

        jlb_nombreP.setText("Nombre del proceso");

        jbl_ragafaCPU.setText("Rafaga del CPU ");

        jtf_nombreP.setBackground(new java.awt.Color(225, 225, 237));
        jtf_nombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombrePActionPerformed(evt);
            }
        });

        jbt_agregar.setBackground(new java.awt.Color(251, 245, 245));
        jbt_agregar.setForeground(new java.awt.Color(0, 0, 153));
        jbt_agregar.setText("Agregar");
        jbt_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbt_agregarMousePressed(evt);
            }
        });
        jbt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_agregarActionPerformed(evt);
            }
        });

        jbt_iniciar.setBackground(new java.awt.Color(251, 245, 245));
        jbt_iniciar.setForeground(new java.awt.Color(153, 0, 0));
        jbt_iniciar.setText("Iniciar");
        jbt_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_iniciarActionPerformed(evt);
            }
        });

        jbl_lisProcesos.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        jbl_lisProcesos.setForeground(new java.awt.Color(0, 0, 153));
        jbl_lisProcesos.setText("Lista De Procesos");

        jtb_lisProcesos.setBackground(new java.awt.Color(255, 245, 243));
        jtb_lisProcesos.setForeground(new java.awt.Color(51, 0, 51));
        jtb_lisProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "#Proceso", "Nombre", "Rafaga", "Quantum", "Residuo rafaga", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtb_lisProcesos.setEnabled(false);
        jScrollPane1.setViewportView(jtb_lisProcesos);
        if (jtb_lisProcesos.getColumnModel().getColumnCount() > 0) {
            jtb_lisProcesos.getColumnModel().getColumn(0).setResizable(false);
            jtb_lisProcesos.getColumnModel().getColumn(1).setResizable(false);
            jtb_lisProcesos.getColumnModel().getColumn(2).setResizable(false);
            jtb_lisProcesos.getColumnModel().getColumn(3).setResizable(false);
            jtb_lisProcesos.getColumnModel().getColumn(4).setResizable(false);
            jtb_lisProcesos.getColumnModel().getColumn(5).setResizable(false);
        }

        jbl_proProceso.setText("Proceso");

        jbl_porcentaje.setText("Porcentaje");

        jbl_progreso.setText("Progreso");

        jtf_proProceso.setEditable(false);
        jtf_proProceso.setBackground(new java.awt.Color(255, 204, 204));
        jtf_proProceso.setEnabled(false);

        jtf_porcentaje.setEditable(false);
        jtf_porcentaje.setBackground(new java.awt.Color(255, 204, 204));
        jtf_porcentaje.setEnabled(false);

        jBarraProgreso.setForeground(new java.awt.Color(0, 255, 0));
        jBarraProgreso.setEnabled(false);

        jbt_salirPrograma.setBackground(new java.awt.Color(255, 204, 204));
        jbt_salirPrograma.setForeground(new java.awt.Color(255, 0, 0));
        jbt_salirPrograma.setText("Salir del programa");
        jbt_salirPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_salirProgramaActionPerformed(evt);
            }
        });

        jSeleccionRafaga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Rafaga 1", "Rafaga 2","Rafaga 3","Rafaga 4","Rafaga 5","Rafaga 6","Rafaga 7","Rafaga 8","Rafaga 9","Rafaga 10", "Rafaga 11", "Rafaga 12",}));
        jSeleccionRafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSeleccionRafagaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbl_ragafaCPU)
                    .addComponent(jlb_nombreP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_nombreP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeleccionRafaga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jbt_agregar)
                        .addGap(99, 99, 99)
                        .addComponent(jbt_iniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jbl_lisProcesos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_proProceso)
                        .addGap(50, 50, 50)
                        .addComponent(jbl_porcentaje)
                        .addGap(69, 69, 69)
                        .addComponent(jbl_progreso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jbt_salirPrograma))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf_proProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jtf_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBarraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nombreP)
                    .addComponent(jtf_nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl_ragafaCPU)
                    .addComponent(jSeleccionRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_agregar)
                    .addComponent(jbt_iniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbl_lisProcesos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl_proProceso)
                    .addComponent(jbl_porcentaje)
                    .addComponent(jbl_progreso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBarraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_proProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jbt_salirPrograma)
                .addGap(258, 258, 258))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_nombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombrePActionPerformed

    private void jbt_agregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt_agregarMousePressed
        // TODO add your handling code here:
        jtf_nombreP.setText("");
    }//GEN-LAST:event_jbt_agregarMousePressed

    private void jbt_salirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_salirProgramaActionPerformed
        // TODO add your handling code here:
        jbt_salirPrograma.addActionListener((ActionEvent e) -> {
            // Cerrar la ventana al hacer clic en el botón
            dispose();
        });
    }//GEN-LAST:event_jbt_salirProgramaActionPerformed

    private void jbt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_agregarActionPerformed

    private void jbt_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_iniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_iniciarActionPerformed

    private void jSeleccionRafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSeleccionRafagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSeleccionRafagaActionPerformed

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
            java.util.logging.Logger.getLogger(ProcesarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcesarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcesarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcesarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcesarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar jBarraProgreso;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> jSeleccionRafaga;
    private javax.swing.JLabel jbl_lisProcesos;
    private javax.swing.JLabel jbl_porcentaje;
    private javax.swing.JLabel jbl_proProceso;
    private javax.swing.JLabel jbl_progreso;
    private javax.swing.JLabel jbl_ragafaCPU;
    public javax.swing.JButton jbt_agregar;
    public javax.swing.JButton jbt_iniciar;
    private javax.swing.JButton jbt_salirPrograma;
    private javax.swing.JLabel jlb_nombreP;
    public javax.swing.JTable jtb_lisProcesos;
    public javax.swing.JTextField jtf_nombreP;
    public javax.swing.JTextField jtf_porcentaje;
    public javax.swing.JTextField jtf_proProceso;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration//GEN-END:variables
}
