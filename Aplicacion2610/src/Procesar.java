
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.time.Duration;
import java.time.Instant;
import javax.swing.Timer;

public class Procesar extends javax.swing.JFrame {

    private double resultProceso = 0;
    private double resultEspera = 0;
    int Contador;//Contador del total de procesos que se van ingresando
    int NProceso;//Carga el número de procesos ejecutándose
    int Rafaga = 0;//Carga la ráfaga en ejecución
    int Quantum = 0;//Carga el quantum en ejecución
    int ResiduoRafaga = 0;//Carga el residuo en ejecución
    int TiempoProceso = 0;//Carga el tiempo que se dura procesando
    int ValorBarra;//Carga el progreso de la Barra
    int CantidadProcesos;//Número de procesos terminados
    int tiempoLlegada = 0;
    int tiempoEspera = 0;
    //Instant tiempoRealInicio;
    Timer tiempo;
    int minutos = 0, segundos = -1;

    /**
     * Creates new form Procesar
     */
    public Procesar() {
        initComponents();
        jTIngreso.setBackground(Color.BLACK);
        jTIngreso.setForeground(Color.WHITE);
        jTFinal.setBackground(Color.yellow);
        //jTFinal.setBackground(Color.red);
        jTFCapturaQuantum.grabFocus();

        tiempo = new Timer(1200, (ActionEvent e) -> {
            iniciarConteo();
        });

    }

    private int iniciarConteo() {
        segundos++;

        if (segundos == 120) {
            segundos = 0;
            minutos++;

        }
        if (minutos == 60) {
            minutos = 0;

        }

        return segundos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTIngreso = new javax.swing.JTable();
        jTFCapturaQuantum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFCapturaRafaga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPBEstado = new javax.swing.JProgressBar();
        jBIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLNumeroProceso = new javax.swing.JTextField();
        jLPorcentajeProceso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLCantidadProcesos = new javax.swing.JTextField();
        jLCantidadTiempo = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTFinal = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jb_cerrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtf_timeProEspera = new javax.swing.JTextField();
        jtf_timeProSistema = new javax.swing.JTextField();
        jbl_tiempoLlegada = new javax.swing.JLabel();
        jTFCapturaLlegada = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setUndecorated(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Quantum");

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jTIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orde llegada", "Rafaga", "Quantum", "ResiduoRafaga", "Estado", "Tiempo llegada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTIngreso.setEnabled(false);
        jScrollPane3.setViewportView(jTIngreso);
        if (jTIngreso.getColumnModel().getColumnCount() > 0) {
            jTIngreso.getColumnModel().getColumn(0).setResizable(false);
            jTIngreso.getColumnModel().getColumn(1).setResizable(false);
            jTIngreso.getColumnModel().getColumn(2).setResizable(false);
            jTIngreso.getColumnModel().getColumn(3).setResizable(false);
            jTIngreso.getColumnModel().getColumn(4).setResizable(false);
            jTIngreso.getColumnModel().getColumn(5).setResizable(false);
        }

        jTFCapturaQuantum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTFCapturaQuantum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapturaQuantumActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Rafaga");

        jTFCapturaRafaga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTFCapturaRafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapturaRafagaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("        LISTA DE PROCESOS");

        jPBEstado.setBackground(java.awt.SystemColor.textHighlight);
        jPBEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPBEstado.setForeground(new java.awt.Color(204, 204, 255));
        jPBEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 255)));

        jBIniciar.setText("Iniciar");
        jBIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("        HISTORICO PROCESOS");

        jLNumeroProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLNumeroProceso.setDisabledTextColor(java.awt.Color.black);
        jLNumeroProceso.setEnabled(false);
        jLNumeroProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLNumeroProcesoActionPerformed(evt);
            }
        });

        jLPorcentajeProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLPorcentajeProceso.setDisabledTextColor(java.awt.Color.black);
        jLPorcentajeProceso.setEnabled(false);
        jLPorcentajeProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLPorcentajeProcesoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CANTIDAD PROCESO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("TIEMPO TOTAL PROCESO");

        jLCantidadProcesos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadProcesos.setDisabledTextColor(new java.awt.Color(255, 0, 51));
        jLCantidadProcesos.setEnabled(false);
        jLCantidadProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadProcesosActionPerformed(evt);
            }
        });

        jLCantidadTiempo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCantidadTiempo.setDisabledTextColor(new java.awt.Color(255, 0, 51));
        jLCantidadTiempo.setEnabled(false);
        jLCantidadTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLCantidadTiempoActionPerformed(evt);
            }
        });

        jTFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# de orden de llegada", "Rafaga", "Quantum", "Tiempo terminación", "Estado", "Tiempo Llegada", "Tiempo espera"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTFinal.setEnabled(false);
        jScrollPane4.setViewportView(jTFinal);
        if (jTFinal.getColumnModel().getColumnCount() > 0) {
            jTFinal.getColumnModel().getColumn(0).setResizable(false);
            jTFinal.getColumnModel().getColumn(1).setResizable(false);
            jTFinal.getColumnModel().getColumn(2).setResizable(false);
            jTFinal.getColumnModel().getColumn(3).setResizable(false);
            jTFinal.getColumnModel().getColumn(4).setResizable(false);
            jTFinal.getColumnModel().getColumn(5).setResizable(false);
            jTFinal.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel7.setText("Proceso");

        jb_cerrar.setText("Cerrar");
        jb_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cerrarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel8.setText("PROMEDIO DE ESPERA");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jLabel9.setText("PROMEDIO TIEMPO TERMINACIÓN");

        jtf_timeProEspera.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jtf_timeProEspera.setEnabled(false);
        jtf_timeProEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_timeProEsperaActionPerformed(evt);
            }
        });

        jtf_timeProSistema.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        jtf_timeProSistema.setEnabled(false);
        jtf_timeProSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_timeProSistemaActionPerformed(evt);
            }
        });

        jbl_tiempoLlegada.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jbl_tiempoLlegada.setText("Tiempo de llegada");

        jTFCapturaLlegada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTFCapturaLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapturaLlegadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNumeroProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFCapturaQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbl_tiempoLlegada))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTFCapturaRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTFCapturaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBAgregar)
                                            .addComponent(jBIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(45, 45, 45)
                                        .addComponent(jb_cerrar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 344, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLCantidadProcesos)
                            .addComponent(jLCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_timeProEspera)
                            .addComponent(jtf_timeProSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBAgregar)
                    .addComponent(jLabel1)
                    .addComponent(jb_cerrar)
                    .addComponent(jbl_tiempoLlegada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCapturaRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIniciar)
                    .addComponent(jTFCapturaQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCapturaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPorcentajeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLNumeroProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_timeProEspera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCantidadTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jtf_timeProSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jb_cerrar.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        // TODO add your handling code here:
        try {
            if ((Integer.parseInt(jTFCapturaRafaga.getText())) >= 1 && (Integer.parseInt(jTFCapturaRafaga.getText())) <= 12) {
                if ((Integer.parseInt(jTFCapturaQuantum.getText())) >= 1 && (Integer.parseInt(jTFCapturaQuantum.getText())) <= 12) {

                    Ingresar();
                    jTFCapturaQuantum.setEditable(false);
                    jTFCapturaLlegada.setText(null);

                } else {
                    JOptionPane.showMessageDialog(null, "El Quamtum no pueden ser mayores de 12 y minimo 1");
                    jTFCapturaQuantum.setText(null);
                    jTFCapturaQuantum.grabFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Las Rafagas no pueden ser mayores de 12 y minimo 1");
                jTFCapturaRafaga.setText(null);
                jTFCapturaRafaga.grabFocus();
            }

            //tiempo.start();
            //tiempoLlegada = (int) obtenerTiempoRealTranscurrido();
        }catch(NumberFormatException errorA){
        JOptionPane.showMessageDialog(null, "Los recuadros deben tener valores numericos.");
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jTFCapturaRafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapturaRafagaActionPerformed
        // TODO add your handling code here:jTextField1
    }//GEN-LAST:event_jTFCapturaRafagaActionPerformed

    private void jBIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarActionPerformed

        new Thread(new Hilo()).start(); //Crea un nuevo hilo
        Iniciar();
        tiempo.stop();
    }//GEN-LAST:event_jBIniciarActionPerformed

    private void jTFCapturaQuantumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapturaQuantumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCapturaQuantumActionPerformed

    private void jLCantidadProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadProcesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadProcesosActionPerformed

    private void jLCantidadTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLCantidadTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCantidadTiempoActionPerformed

    private void jLNumeroProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLNumeroProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLNumeroProcesoActionPerformed

    private void jLPorcentajeProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLPorcentajeProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLPorcentajeProcesoActionPerformed

    private void jb_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jb_cerrarActionPerformed

    private void jtf_timeProEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_timeProEsperaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_timeProEsperaActionPerformed

    private void jtf_timeProSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_timeProSistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_timeProSistemaActionPerformed

    private void jTFCapturaLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapturaLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCapturaLlegadaActionPerformed

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
            java.util.logging.Logger.getLogger(Procesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procesar().setVisible(true);
            }
        });
    }

    private class Hilo implements Runnable {

        @Override
        public void run() {
            int estado = 1;
            int i = 0;

            while (estado != 0) {
                while (i < Contador) {
                    Cargar(i);
                    //tiempoEspera=2;
                    if (ResiduoRafaga != 0 && ResiduoRafaga > Quantum) {

                        for (int c = 1; c <= Quantum; c++) {
                            jTIngreso.setValueAt("Procesando", i, 4);
                            ResiduoRafaga--;
                            Barra(Rafaga, ResiduoRafaga);
                            Pintar();
                            jTIngreso.setValueAt(String.valueOf(ResiduoRafaga), i, 3);
                            TiempoProceso++;
                            Dormir();
                        }

                        jTIngreso.setValueAt("Espera", i, 4);
                        //tiempoEspera += 1;
                        if (ResiduoRafaga == 0) {
                            jTIngreso.setValueAt("Terminado", i, 4);
                            tiempoEspera = TiempoProceso - (Rafaga + tiempoLlegada);
                            Pintar();
                            Informe(i);
                            Borrar(i);
                            jPBEstado.setValue(0);
                        }
                    } else {
                        if (ResiduoRafaga > 0 && Quantum != 0) {
                            while (ResiduoRafaga > 0) {
                                jTIngreso.setValueAt("Procesando", i, 4);
                                ResiduoRafaga--;
                                Barra(Rafaga, ResiduoRafaga);
                                Pintar();
                                jTIngreso.setValueAt(String.valueOf(ResiduoRafaga), i, 3);
                                TiempoProceso++;
                                Dormir();
                            }
                            jTIngreso.setValueAt("Espera", i, 4);
                            //tiempoEspera += 1;
                            if (ResiduoRafaga == 0 && Quantum != 0) {
                                jTIngreso.setValueAt("Terminado", i, 4);
                                tiempoEspera = TiempoProceso - (Rafaga + tiempoLlegada);
                                Pintar();
                                Informe(i);
                                Borrar(i);
                                jPBEstado.setValue(0);
                            }
                        } else {
                            if (ResiduoRafaga == 0 && Quantum != 0) {
                                jTIngreso.setValueAt("Terminado", i, 4);
                                tiempoEspera = TiempoProceso - (Rafaga + tiempoLlegada);
                                Pintar();
                                Informe(i);
                                Borrar(i);
                                jPBEstado.setValue(0);
                            }
                        }
                    }
                    jLNumeroProceso.setText(String.valueOf(""));
                    jLPorcentajeProceso.setText(String.valueOf(""));

                    i++;
                }
                i = 0;
                jLNumeroProceso.setText(String.valueOf(""));
                jLPorcentajeProceso.setText(String.valueOf(""));

            }

        }
    }

    public void Dormir() {
        try {
            Thread.sleep(700);
        } catch (InterruptedException ex) {
            Logger.getLogger(Procesar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Cargar(int i) {
        NProceso = (int) jTIngreso.getValueAt(i, 0);
        Rafaga = parseInt((String) (jTIngreso.getValueAt(i, 1)));
        Quantum = parseInt((String) (jTIngreso.getValueAt(i, 2)));
        ResiduoRafaga = parseInt((String) (jTIngreso.getValueAt(i, 3)));
        tiempoLlegada = parseInt((String) (jTIngreso.getValueAt(i, 5)));

        if (NProceso > 0) {
            jLNumeroProceso.setText(String.valueOf(NProceso));
        }
    }

    public void Ingresar() {
        DefaultTableModel modelo1 = (DefaultTableModel) jTIngreso.getModel();

        Contador++;
        Object[] miTabla = new Object[6];
        miTabla[0] = Contador;
        miTabla[1] = jTFCapturaRafaga.getText();
        miTabla[2] = jTFCapturaQuantum.getText();
        miTabla[3] = jTFCapturaRafaga.getText();
        miTabla[4] = "Listo";
        miTabla[5] = jTFCapturaLlegada.getText();

        // Guardar el valor de miTabla[5] en una variable
        String valorMiTabla5 = (String) miTabla[5];

        modelo1.addRow(miTabla);
        jTIngreso.setModel(modelo1);
        jTFCapturaRafaga.setText(null);
        jTFCapturaRafaga.grabFocus();
    }

    public void Informe(int c) {
        DefaultTableModel modelo2 = (DefaultTableModel) jTFinal.getModel();

        Object[] miTabla = new Object[8];
        miTabla[0] = c + 1;
        miTabla[1] = Rafaga;
        miTabla[2] = Quantum;
        miTabla[3] = TiempoProceso + " Segundos";
        miTabla[4] = "Terminado";
        miTabla[5] = (String) jTIngreso.getValueAt(c, 5);
        miTabla[6] = tiempoEspera + " segundos";
        //miTabla[7] = Rafaga + segundos + "segundos";
        modelo2.addRow(miTabla);
        jTFinal.setModel(modelo2);

        CantidadProcesos++;
        jLCantidadProcesos.setText(String.valueOf(CantidadProcesos + " Terminados"));
        jLCantidadTiempo.setText(String.valueOf(TiempoProceso + " Segundos"));
        jtf_timeProEspera.setText(String.valueOf(calcularPromedioTiempoEspera(tiempoEspera, Contador)));
        jtf_timeProSistema.setText(String.valueOf(calcularPromedioTiempos(TiempoProceso, Contador)));

    }

    public void Borrar(int c) {
        jTIngreso.setValueAt(0, c, 0);
        jTIngreso.setValueAt("0", c, 1);
        jTIngreso.setValueAt("0", c, 2);
        jTIngreso.setValueAt("0", c, 3);
        jTIngreso.setValueAt("Terminado", c, 4);
        jTIngreso.setValueAt("0", c, 5);
    }

    public void Barra(int rafaga, int residuo) {
        int Rafaga = rafaga;
        int valor = 100 / rafaga;
        int porcentaje = 100 - (valor * residuo);
        ValorBarra = porcentaje;
        jLPorcentajeProceso.setText(String.valueOf(ValorBarra + "%"));
    }

    public void Pintar() {
        jPBEstado.setValue(ValorBarra);
        jPBEstado.repaint();
    }

    public void Iniciar() {
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        jTFCapturaRafaga.setVisible(false);
        jTFCapturaQuantum.setVisible(false);
        jTFCapturaLlegada.setVisible(false);
        jBAgregar.setVisible(false);
        jBIniciar.setVisible(false);
    }

    // Métodos de cálculo de tiempos
    public int calcularTiempoTerminacion(int tiempoLlegada, int tiempoProceso) {
        return tiempoLlegada + tiempoProceso;
    }

    public double calcularPromedioTiempos(int totalTiempos, int cantidadProcesos) {
        resultProceso += (double) totalTiempos / cantidadProcesos;
        return resultProceso;
    }

    public int calcularTiempoEspera(int tiempoLlegada, int tiempoTerminacion, int tiempoProceso) {
        return (tiempoTerminacion - tiempoLlegada) - tiempoProceso;
    }

    public double calcularPromedioTiempoEspera(int totalTiemposEspera, int cantidadProcesos) {
        resultEspera += (double) totalTiemposEspera / cantidadProcesos;
        return resultEspera;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBIniciar;
    private javax.swing.JTextField jLCantidadProcesos;
    private javax.swing.JTextField jLCantidadTiempo;
    private javax.swing.JTextField jLNumeroProceso;
    private javax.swing.JTextField jLPorcentajeProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jPBEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTFCapturaLlegada;
    private javax.swing.JTextField jTFCapturaQuantum;
    private javax.swing.JTextField jTFCapturaRafaga;
    private javax.swing.JTable jTFinal;
    private javax.swing.JTable jTIngreso;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jb_cerrar;
    public javax.swing.JLabel jbl_tiempoLlegada;
    public javax.swing.JTextField jtf_timeProEspera;
    private javax.swing.JTextField jtf_timeProSistema;
    // End of variables declaration//GEN-END:variables
}
