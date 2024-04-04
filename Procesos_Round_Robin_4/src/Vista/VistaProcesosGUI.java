
package Vista;

public class VistaProcesosGUI extends javax.swing.JFrame {
    
    
    public VistaProcesosGUI() {
        initComponents();
    }        
           
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlb_quantum = new javax.swing.JLabel();
        jlb_rafaga = new javax.swing.JLabel();
        jtf_quantum = new javax.swing.JTextField();
        jtf_rafaga = new javax.swing.JTextField();
        jbtn_agregar = new javax.swing.JButton();
        jbtn_iniciar = new javax.swing.JButton();
        jbl_lista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_procesos = new javax.swing.JTable();
        jbl_proceso = new javax.swing.JLabel();
        jpb_proceso = new javax.swing.JProgressBar();
        jtf_numero = new javax.swing.JTextField();
        jtf_porcentaje = new javax.swing.JTextField();
        jbl_historial = new javax.swing.JLabel();
        jbl_cantidad = new javax.swing.JLabel();
        jbl_tiempo = new javax.swing.JLabel();
        jtf_cantidad = new javax.swing.JTextField();
        jtf_tiempo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_historial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlb_quantum.setText("Quantum: ");

        jlb_rafaga.setText("Rafaga: ");

        jtf_quantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_quantumActionPerformed(evt);
            }
        });

        jtf_rafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_rafagaActionPerformed(evt);
            }
        });

        jbtn_agregar.setText("AGREGAR");

        jbtn_iniciar.setText("INICIAR");

        jbl_lista.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbl_lista.setText(" Lista de Procesos");

        jt_procesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "# Proceso", "Rafaga", "Quantum", "Residuo  de rafaga", "Estado"
            }
        ));
        jt_procesos.setToolTipText("");
        jScrollPane1.setViewportView(jt_procesos);

        jbl_proceso.setText("Proceso");

        jtf_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_numeroActionPerformed(evt);
            }
        });

        jtf_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_porcentajeActionPerformed(evt);
            }
        });

        jbl_historial.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbl_historial.setText("Historial de Procesos");

        jbl_cantidad.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbl_cantidad.setText("Cantidad de Procesos: ");

        jbl_tiempo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbl_tiempo.setText("Tiempo de Procesos: ");

        jtf_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cantidadActionPerformed(evt);
            }
        });

        jtf_tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tiempoActionPerformed(evt);
            }
        });

        jt_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "# Proceso", "Rafaga", "Quantum", "Tiempo real", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jt_historial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jlb_quantum)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_quantum, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jlb_rafaga)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtf_rafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jbl_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpb_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jbl_historial))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbl_cantidad)
                                            .addComponent(jbl_tiempo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(jbl_proceso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb_quantum)
                            .addComponent(jtf_quantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb_rafaga)
                            .addComponent(jtf_rafaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbl_lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbl_historial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbl_proceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jpb_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_quantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_quantumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_quantumActionPerformed

    private void jtf_rafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_rafagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_rafagaActionPerformed

    private void jtf_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_numeroActionPerformed

    private void jtf_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_porcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_porcentajeActionPerformed

    private void jtf_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_cantidadActionPerformed

    private void jtf_tiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tiempoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaProcesosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProcesosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProcesosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProcesosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProcesosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel jbl_cantidad;
    public javax.swing.JLabel jbl_historial;
    public javax.swing.JLabel jbl_lista;
    public javax.swing.JLabel jbl_proceso;
    public javax.swing.JLabel jbl_tiempo;
    public javax.swing.JButton jbtn_agregar;
    public javax.swing.JButton jbtn_iniciar;
    public javax.swing.JLabel jlb_quantum;
    public javax.swing.JLabel jlb_rafaga;
    public javax.swing.JProgressBar jpb_proceso;
    public javax.swing.JTable jt_historial;
    public javax.swing.JTable jt_procesos;
    public javax.swing.JTextField jtf_cantidad;
    public javax.swing.JTextField jtf_numero;
    public javax.swing.JTextField jtf_porcentaje;
    public javax.swing.JTextField jtf_quantum;
    public javax.swing.JTextField jtf_rafaga;
    public javax.swing.JTextField jtf_tiempo;
    // End of variables declaration//GEN-END:variables



}
