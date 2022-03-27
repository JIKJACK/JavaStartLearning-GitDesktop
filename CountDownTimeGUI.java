package chap4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CountDownTimeGUI extends javax.swing.JFrame {

    int min = 0, sec = 0, hr = 0, min1, sec1, hr1;
    Timer timer;
    boolean isStop = false;

    public CountDownTimeGUI() {
        initComponents();
        for (int i = 0; i < 60; i++) {
            if (i < 10) {
                cbxMin.addItem("0" + i);
            } else {
                cbxMin.addItem("" + i);
            }
        }
        for (int i = 0; i < 60; i++) {
            if (i < 10) {
                cbxSec.addItem("0" + i);
            } else {
                cbxSec.addItem("" + i);
            }
        }
        for (int i = 0; i < 24; i++) {
            if (i < 10) {
                cbxHr.addItem("0" + i);
            } else {
                cbxHr.addItem("" + i);
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSec = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxMin = new javax.swing.JComboBox<>();
        cbxSec = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblHr = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxHr = new javax.swing.JComboBox<>();
        btnMinAdd10 = new javax.swing.JButton();
        btnMinAdd15 = new javax.swing.JButton();
        btnMinAdd30 = new javax.swing.JButton();
        btnEsc = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Count Down Timer By JIKJACK");
        setBackground(new java.awt.Color(255, 255, 255));

        lblMin.setBackground(new java.awt.Color(0, 204, 204));
        lblMin.setFont(new java.awt.Font("Kanit", 1, 75)); // NOI18N
        lblMin.setForeground(new java.awt.Color(0, 204, 204));
        lblMin.setText("00");

        jLabel2.setFont(new java.awt.Font("Kanit", 1, 24)); // NOI18N
        jLabel2.setText("Count Down Timer By JIKJACK");

        lblSec.setFont(new java.awt.Font("Kanit", 1, 75)); // NOI18N
        lblSec.setForeground(new java.awt.Color(0, 204, 204));
        lblSec.setText("00");

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Kanit", 1, 75)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText(":");

        btnStart.setBackground(new java.awt.Color(102, 255, 0));
        btnStart.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        btnStart.setText("เริ่ม");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setBackground(new java.awt.Color(204, 0, 255));
        btnStop.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        btnStop.setText("หยุด");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel5.setText("วินาที");

        jLabel6.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel6.setText("นาที");

        cbxMin.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        cbxMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMinActionPerformed(evt);
            }
        });

        cbxSec.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        cbxSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSecActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chap4/loading_icon.gif"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(0, 204, 204));
        jLabel8.setFont(new java.awt.Font("Kanit", 1, 75)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText(":");

        lblHr.setBackground(new java.awt.Color(0, 204, 204));
        lblHr.setFont(new java.awt.Font("Kanit", 1, 75)); // NOI18N
        lblHr.setForeground(new java.awt.Color(0, 204, 204));
        lblHr.setText("00");

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel9.setText("ชั่วโมง");

        cbxHr.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        cbxHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHrActionPerformed(evt);
            }
        });

        btnMinAdd10.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        btnMinAdd10.setText("10 นาที");
        btnMinAdd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinAdd10ActionPerformed(evt);
            }
        });

        btnMinAdd15.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        btnMinAdd15.setText("15 นาที");
        btnMinAdd15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinAdd15ActionPerformed(evt);
            }
        });

        btnMinAdd30.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        btnMinAdd30.setText("30 นาที");
        btnMinAdd30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinAdd30ActionPerformed(evt);
            }
        });

        btnEsc.setBackground(new java.awt.Color(255, 51, 51));
        btnEsc.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        btnEsc.setText("ออก");
        btnEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 0));
        btnReset.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        btnReset.setText("ล้างค่า");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxHr, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHr)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(lblMin)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxMin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxSec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMinAdd10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinAdd15, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinAdd30, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSec)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnStart)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnStop)
                            .addComponent(btnEsc))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSec, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(lblHr, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cbxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbxHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart)
                    .addComponent(btnStop))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinAdd10)
                    .addComponent(btnMinAdd15)
                    .addComponent(btnMinAdd30)
                    .addComponent(btnEsc)
                    .addComponent(btnReset))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

        btnStart.setEnabled(false);
        btnMinAdd10.setEnabled(false);
        btnMinAdd15.setEnabled(false);
        btnMinAdd30.setEnabled(false);
        cbxHr.setEnabled(false);
        cbxMin.setEnabled(false);
        cbxSec.setEnabled(false);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                btnStart.setEnabled(false);

                if (isStop) {
                    min = min1;
                    sec = sec1;
                    hr = hr1;
                    isStop = false;
                }

                if (sec < 1) {
                    sec = 60;
                    min--;
                }

                if (min < 0) {
                    min = 59;
                    hr--;
                }

                if (hr < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Time Out!");
                    hr = 0;
                    min = 0;
                    sec = 0;
                    timer.stop();
                    btnStart.setEnabled(true);
                } else {
                    sec--;
                }

                if (sec < 10) {
                    lblSec.setText("0" + sec);
                } else {
                    lblSec.setText("" + sec);
                }

                if (min < 10) {
                    lblMin.setText("0" + min);
                } else {
                    lblMin.setText("" + min);
                }

                if (hr < 10) {
                    lblHr.setText("0" + hr);
                } else {
                    lblHr.setText("" + hr);
                }

            }
        });
        timer.start();
    }//GEN-LAST:event_btnStartActionPerformed

    private void cbxSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSecActionPerformed

        lblSec.setText("" + cbxSec.getSelectedItem());
        sec = Integer.parseInt(lblSec.getText());
    }//GEN-LAST:event_cbxSecActionPerformed

    private void cbxMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMinActionPerformed

        lblMin.setText("" + cbxMin.getSelectedItem());
        min = Integer.parseInt(lblMin.getText());
    }//GEN-LAST:event_cbxMinActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        min1 = min;
        sec1 = sec;
        hr1 = hr;
        isStop = true;
        timer.stop();
        btnStart.setEnabled(true);

    }//GEN-LAST:event_btnStopActionPerformed

    private void cbxHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHrActionPerformed

        lblHr.setText("" + cbxHr.getSelectedItem());
        hr = Integer.parseInt(lblHr.getText());
    }//GEN-LAST:event_cbxHrActionPerformed

    private void btnMinAdd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinAdd10ActionPerformed
        // TODO add your handling code here:
        min = 10;
        lblMin.setText("" + min);
    }//GEN-LAST:event_btnMinAdd10ActionPerformed

    private void btnMinAdd15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinAdd15ActionPerformed
        // TODO add your handling code here:
        min = 15;
        lblMin.setText("" + min);
    }//GEN-LAST:event_btnMinAdd15ActionPerformed

    private void btnMinAdd30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinAdd30ActionPerformed
        // TODO add your handling code here:
        min = 30;
        lblMin.setText("" + min);
    }//GEN-LAST:event_btnMinAdd30ActionPerformed

    private void btnEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(rootPane, "You want to Close?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnEscActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        hr = 0;
        hr1 = 0;
        min = 0;
        min1 = 0;
        sec = 0;
        sec1 = 0;
        lblHr.setText("0" + hr);
        lblMin.setText("0" + min);
        lblSec.setText("0" + sec);
        btnMinAdd10.setEnabled(true);
        btnMinAdd15.setEnabled(true);
        btnMinAdd30.setEnabled(true);
        cbxHr.setEnabled(true);
        cbxMin.setEnabled(true);
        cbxSec.setEnabled(true);
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CountDownTimeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CountDownTimeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CountDownTimeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CountDownTimeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CountDownTimeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEsc;
    private javax.swing.JButton btnMinAdd10;
    private javax.swing.JButton btnMinAdd15;
    private javax.swing.JButton btnMinAdd30;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JComboBox<String> cbxHr;
    private javax.swing.JComboBox<String> cbxMin;
    private javax.swing.JComboBox<String> cbxSec;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblHr;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSec;
    // End of variables declaration//GEN-END:variables
}
