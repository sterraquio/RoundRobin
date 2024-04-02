
package vista;

import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaProcesosGUI extends javax.swing.JFrame {
    //atributos
    int Contador;
    int NProceso;
    int Rafaga = 0;
    int Quantum = 0;
    int ResiduoRafaga = 0;
    int TiempoProceso = 0;
    int ValorBarra;
    int CantidadProcesos;
    
    //Constructor
    public VistaProcesosGUI() {
        initComponents();
        
    }

   public void Ingresar() {

        DefaultTableModel modelo = (DefaultTableModel) jt_procesos.getModel();

        Contador++;
        Object[] miTabla = new Object[5];
        miTabla[0] = Contador;
        miTabla[1] = jtf_rafaga.getText();
        miTabla[2] = jtf_quantum.getText();
        miTabla[3] = jtf_rafaga.getText();
        miTabla[4] = "Listo";
        modelo.addRow(miTabla);
        jt_procesos.setModel(modelo);
        jtf_rafaga.setText(null);
        jtf_rafaga.grabFocus();


    }
    
    
    public class Hilo implements Runnable {

        @Override
        public void run() {
           int estado = 1;
           int i = 0;

        while (estado != 0) {
            while (i < Contador) {
                Cargar(i);
                if (ResiduoRafaga != 0 && ResiduoRafaga < Quantum) {
                    for (int c = 1; c <= Quantum; c++) {
                        jt_procesos.setValueAt(String.valueOf(ResiduoRafaga), i, 3);
                        TiempoProceso++;
                        Dormir();

                    }
                    jt_procesos.setValueAt("Espera", i, 4);
                    if (ResiduoRafaga == 0) {
                        jt_procesos.setValueAt("Terminado", i, 4);
                        Pintar();
                        Informe(i);
                        Borrar(i);
                        jpb_proceso.setValue(0);

                    }

                } else {
                    if (ResiduoRafaga > 0 && Quantum != 0) {
                        while (ResiduoRafaga > 0) {
                            jt_procesos.setValueAt("Procesando", i, 4);
                            ResiduoRafaga--;
                            Barra(Rafaga, ResiduoRafaga);
                            Pintar();
                            jt_procesos.setValueAt(String.valueOf(ResiduoRafaga), i, 3);
                            TiempoProceso++;
                            Dormir();

                        }
                        jt_procesos.setValueAt("Espera", i, 4);
                        if (ResiduoRafaga == 0 && Quantum != 0) {
                            jt_procesos.setValueAt("Terminado", i, 4);
                            Pintar();
                            Informe(i);
                            Borrar(i);
                            jpb_proceso.setValue(0);

                        }

                    } else {
                        if (ResiduoRafaga == 0 && Quantum != 0) {
                            jt_procesos.setValueAt("Terminado", i, 4);
                            Pintar();
                            Informe(i);
                            Borrar(i);
                            jpb_proceso.setValue(0);

                        }
                    }
                }
                jtf_numero.setText(String.valueOf(""));
                jtf_porcentaje.setText(String.valueOf(""));
                i++;
            }
            i = 0;
            jtf_numero.setText(String.valueOf(""));
            jtf_porcentaje.setText(String.valueOf(""));
        } 
            
        }
    }
          

    public void Cargar(int i) {

        NProceso = (int) jt_procesos.getValueAt(i, 0);
        Rafaga = parseInt((String) (jt_procesos.getValueAt(i, 1)));
        Quantum = parseInt((String) (jt_procesos.getValueAt(i, 2)));
        ResiduoRafaga = parseInt((String) (jt_procesos.getValueAt(i, 3)));
        if (NProceso > 0) {
            jtf_numero.setText(String.valueOf(NProceso));

        }
    }

    //método barra de progreso
    public void Barra(int rafaga, int residuo) {
        int Rafaga = rafaga;
        int valor = 100 / rafaga;
        int porcentaje = 100 - (valor * residuo);
        ValorBarra = porcentaje;
        jtf_porcentaje.setText(String.valueOf(ValorBarra + "%"));

    }

    //Rellana la barra de progreso
    public void Pintar() {
        jpb_proceso.setValue(ValorBarra);
        jpb_proceso.repaint();
    }

    public void Borrar(int c) {
        jt_procesos.setValueAt(0, c, 0);
        jt_procesos.setValueAt("0", c, 1);
        jt_procesos.setValueAt("0", c, 2);
        jt_procesos.setValueAt("0", c, 3);
        jt_procesos.setValueAt("*****", c, 4);
    }

    //???????
    public void Dormir() {
        try {
            Thread.sleep(700);
        } catch (InterruptedException ex) {
            Logger.getLogger(VistaProcesosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Informe(int c) {
        DefaultTableModel modelo2 = (DefaultTableModel) jt_historial.getModel();

        Object[] miTabla = new Object[5];
        miTabla[0] = c + 1;
        miTabla[1] = Rafaga;
        miTabla[2] = Quantum;
        miTabla[3] = TiempoProceso + " Segundos";
        miTabla[4] = "Terminado";
        modelo2.addRow(miTabla);
        jt_historial.setModel(modelo2);

        CantidadProcesos++;
        jtf_cantidad.setText(String.valueOf(CantidadProcesos + " Terminados"));
        jtf_tiempo.setText(String.valueOf(TiempoProceso + " Segundos"));

    }

    public void Iniciar() {
        jlb_quantum.setVisible(false);
        jlb_rafaga.setVisible(false);
        jtf_quantum.setVisible(false);
        jtf_rafaga.setVisible(false);
        jbtn_agregar.setVisible(false);
        jbtn_iniciar.setVisible(false);

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
        jtf_tiempo1 = new javax.swing.JTextField();
        jbl_tiempo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

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
        jbtn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_agregarActionPerformed(evt);
            }
        });

        jbtn_iniciar.setText("INICIAR");
        jbtn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_iniciarActionPerformed(evt);
            }
        });

        jbl_lista.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbl_lista.setText(" Lista de Procesos");

        jt_procesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Proceso", "Rafaga", "Quantum", "Residuo  de rafaga", "Estado"
            }
        ));
        jt_procesos.setToolTipText("");
        jt_procesos.setEnabled(false);
        jScrollPane1.setViewportView(jt_procesos);

        jbl_proceso.setText("Proceso");

        jtf_numero.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jtf_numero.setEnabled(false);
        jtf_numero.setSelectionColor(new java.awt.Color(255, 51, 51));
        jtf_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_numeroActionPerformed(evt);
            }
        });

        jtf_porcentaje.setDisabledTextColor(new java.awt.Color(51, 51, 255));
        jtf_porcentaje.setEnabled(false);
        jtf_porcentaje.setSelectionColor(new java.awt.Color(255, 51, 51));
        jtf_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_porcentajeActionPerformed(evt);
            }
        });

        jbl_historial.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbl_historial.setText("Historial de Procesos");

        jbl_cantidad.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jbl_cantidad.setText("Cantidad de Procesos: ");

        jbl_tiempo.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jbl_tiempo.setText("Tiempo total Procesos: ");

        jtf_cantidad.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jtf_cantidad.setEnabled(false);
        jtf_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cantidadActionPerformed(evt);
            }
        });

        jtf_tiempo.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jtf_tiempo.setEnabled(false);
        jtf_tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tiempoActionPerformed(evt);
            }
        });

        jt_historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Proceso", "Rafaga", "Quantum", "Tiempo ejecución", "Estado","T. espera"
            }
        ));
        jt_historial.setEnabled(false);
        jScrollPane2.setViewportView(jt_historial);

        jtf_tiempo1.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jtf_tiempo1.setEnabled(false);
        jtf_tiempo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tiempo1ActionPerformed(evt);
            }
        });

        jbl_tiempo1.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jbl_tiempo1.setText("Tiempo Promedio");

        jLabel1.setText("Tiempo total de espera");

        jLabel2.setText("Tiempo promedio espera");

        jTextField1.setEnabled(false);

        jTextField2.setEnabled(false);

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
                                .addComponent(jtf_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpb_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jbl_historial))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbl_cantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbl_tiempo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbl_tiempo1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtf_tiempo1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                            .addComponent(jtf_tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                            .addComponent(jtf_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField1)))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addGap(205, 205, 205))))
                    .addComponent(jbl_proceso))
                .addContainerGap())
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbl_tiempo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtf_tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbl_lista)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbl_historial)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbl_tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
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

    private void jbtn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_agregarActionPerformed
        if ((Integer.parseInt(jtf_rafaga.getText())) <= 100) {
            Ingresar();
            jtf_quantum.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(null, "Las rafagas no pueden ser mayores de 100 ");
            jtf_rafaga.setText(null);
            jtf_rafaga.grabFocus();
        }
    }//GEN-LAST:event_jbtn_agregarActionPerformed

    private void jbtn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_iniciarActionPerformed
         new Thread(new Hilo()).start();
        Iniciar();
    }//GEN-LAST:event_jbtn_iniciarActionPerformed

    private void jtf_tiempo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tiempo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tiempo1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JLabel jbl_cantidad;
    public javax.swing.JLabel jbl_historial;
    public javax.swing.JLabel jbl_lista;
    public javax.swing.JLabel jbl_proceso;
    public javax.swing.JLabel jbl_tiempo;
    public javax.swing.JLabel jbl_tiempo1;
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
    public javax.swing.JTextField jtf_tiempo1;
    // End of variables declaration//GEN-END:variables



}
