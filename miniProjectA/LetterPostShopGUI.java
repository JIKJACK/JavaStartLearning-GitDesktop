package chap4.miniProjectA;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class LetterPostShopGUI extends javax.swing.JFrame {

    public LetterPostShopGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGType = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdbNoraml = new javax.swing.JRadioButton();
        rdbRegister = new javax.swing.JRadioButton();
        rdbEMS = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtWei = new javax.swing.JTextField();
        btnCal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarRe = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LetterPostShopGUI");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("ส่งจดหมาย");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ประเภทจดหมาย");

        btnGType.add(rdbNoraml);
        rdbNoraml.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbNoraml.setText("ธรรมดา");

        btnGType.add(rdbRegister);
        rdbRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbRegister.setText("ลงทะเบียน");

        btnGType.add(rdbEMS);
        rdbEMS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbEMS.setText("EMS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("นํ้าหนักจดหมาย (g)");

        txtWei.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtWei.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWeiKeyTyped(evt);
            }
        });

        btnCal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCal.setText("คำนวนราคา");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });

        tarRe.setColumns(20);
        tarRe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tarRe.setRows(5);
        tarRe.setText("โปรแกรมนี้สร้างโดย\nธนากร นกเขียว\n644295024");
        jScrollPane1.setViewportView(tarRe);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtWei, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(rdbNoraml)
                                .addGap(18, 18, 18)
                                .addComponent(rdbRegister)
                                .addGap(18, 18, 18)
                                .addComponent(rdbEMS))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdbNoraml)
                    .addComponent(rdbRegister)
                    .addComponent(rdbEMS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtWei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tarRe.setText("");
        txtWei.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "ต้องการปิด?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        int weight = 0, baht = 0, set = 0;

        if (rdbNoraml.isSelected()) {
            set = 1;
        } else if (rdbRegister.isSelected()) {
            set = 1;
        } else if (rdbEMS.isSelected()) {
            set = 1;
        } else {
            JOptionPane.showMessageDialog(rootPane, "โปรดเลือกประเภท");
        }

        String Sweight = "";
        Sweight = txtWei.getText();

        if (Sweight.length() > 0) {
            weight = Integer.valueOf(Sweight);
            if (rdbNoraml.isSelected()) {
                baht = noramlLetter(weight);
                tarRe.setText("Normal Letter Service Price : " + baht + " baht");
            } else if (rdbRegister.isSelected()) {
                baht = noramlLetter(weight);
                tarRe.setText("Register Letter Service Price : " + (baht + 13) + " baht");
            } else if (rdbEMS.isSelected()) {
                baht = emsLetter(weight);
                tarRe.setText("EMS Letter Service Price : " + baht + " baht");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "โปรดใส่น้ำหนัก");
        }
    }//GEN-LAST:event_btnCalActionPerformed

    private void txtWeiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeiKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtWeiKeyTyped

    public int noramlLetter(int weight) {
        int baht;
        if ((weight > 1000) && (weight <= 2000)) {
            baht = 45;
        } else if ((weight > 500) && (weight <= 1000)) {
            baht = 25;
        } else if ((weight > 250) && (weight <= 500)) {
            baht = 15;
        } else if ((weight > 100) && (weight <= 250)) {
            baht = 9;
        } else if ((weight > 20) && (weight <= 100)) {
            baht = 5;
        } else {
            baht = 3;
        }
        return baht;
    }

    public int emsLetter(int wei) {
        int baht = 0;

        if ((wei > 1000) && (wei <= 2000)) {
            baht = 77;
        } else if ((wei > 500) && (wei <= 1000)) {
            baht = 62;
        } else if ((wei > 250) && (wei <= 500)) {
            baht = 47;
        } else if ((wei > 100) && (wei <= 250)) {
            baht = 37;
        } else if ((wei > 20) && (wei <= 100)) {
            baht = 32;
        } else {
            baht = 27;
        }

        return baht;

    }

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
            java.util.logging.Logger.getLogger(LetterPostShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LetterPostShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LetterPostShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LetterPostShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LetterPostShopGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbEMS;
    private javax.swing.JRadioButton rdbNoraml;
    private javax.swing.JRadioButton rdbRegister;
    private javax.swing.JTextArea tarRe;
    private javax.swing.JTextField txtWei;
    // End of variables declaration//GEN-END:variables
}
