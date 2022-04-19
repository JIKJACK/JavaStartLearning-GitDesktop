package chap4.miniProjectA;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class GasolineCalculationGUI extends javax.swing.JFrame {

    static final double PTT[] = {36.50, 33.24, 41.54, 29.34};
    static final double BCP[] = {37.74, 35.24, 42.64, 28.99};
    static final double SHELL[] = {37.34, 35.04, 41.84, 28.20};
    static final double ESSO[] = {37.03, 35.34, 41.55, 29.10};

    public GasolineCalculationGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGasStation = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdbPTT = new javax.swing.JRadioButton();
        rdbBCP = new javax.swing.JRadioButton();
        rdbShell = new javax.swing.JRadioButton();
        rdbEsso = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbxCar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxGas = new javax.swing.JComboBox<>();
        btnPrintReceipt = new javax.swing.JButton();
        btnPrintTaxInvoice = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarResult = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gasoline Calculation GUI");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("เติมนํ้ามัน");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("เลือกปั๊ม");

        btnGroupGasStation.add(rdbPTT);
        rdbPTT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbPTT.setText("ปตท");

        btnGroupGasStation.add(rdbBCP);
        rdbBCP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbBCP.setText("บางจาก");

        btnGroupGasStation.add(rdbShell);
        rdbShell.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbShell.setText("เชลล์");

        btnGroupGasStation.add(rdbEsso);
        rdbEsso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbEsso.setText("เอสโซ่");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ประเภทรถ");

        cbxCar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxCar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Pickup" }));
        cbxCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ประเภทนํ้ามัน");

        cbxGas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxGas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasohol 95", "Gasohol 91", "Benzin 91" }));

        btnPrintReceipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPrintReceipt.setText("พิมพ์ใบกำกับภาษี");
        btnPrintReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReceiptActionPerformed(evt);
            }
        });

        btnPrintTaxInvoice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPrintTaxInvoice.setText("พิมพ์ใบเสร็จรับเงิน");
        btnPrintTaxInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintTaxInvoiceActionPerformed(evt);
            }
        });

        tarResult.setEditable(false);
        tarResult.setColumns(20);
        tarResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tarResult.setRows(5);
        tarResult.setText("โปรแกรมนี้สร้างโดย\nธนากร นกเขียว\n644295024");
        tarResult.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(tarResult);

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("จำนวนเงิน");

        txtAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("บาท");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnPrintReceipt)
                                    .addGap(40, 40, 40)
                                    .addComponent(btnPrintTaxInvoice)
                                    .addGap(30, 30, 30)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbPTT)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbBCP)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbShell)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbEsso))
                                    .addComponent(cbxCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxGas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdbPTT)
                    .addComponent(rdbBCP)
                    .addComponent(rdbShell)
                    .addComponent(rdbEsso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxGas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrintReceipt)
                    .addComponent(btnPrintTaxInvoice))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "ต้องการปิด?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPrintReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintReceiptActionPerformed
        int brand = 0, petroType = 0;
        double amount = 0.0, litre = 0.0;

        brand = checkIn(); //รับปั้มน้ำมัน

        petroType = getPetro(); //รับประเภทน้ำมัน
        amount = getAmount(); //รับเงิน

        printReceipt(brand, petroType, amount);
        
        if (brand == 0) {
            JOptionPane.showMessageDialog(rootPane, "โปรดเลือกปั๊มน้ำมัน");
            tarResult.setText("");
        }
    }//GEN-LAST:event_btnPrintReceiptActionPerformed

    private void cbxCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCarActionPerformed
        String CarTypeS = (String) cbxCar.getSelectedItem();

        if (CarTypeS.equals("Pickup")) {
            cbxGas.removeItem("Gasohol 95");
            cbxGas.removeItem("Gasohol 91");
            cbxGas.removeItem("Benzin 91");
            cbxGas.removeItem("Diesel");
            cbxGas.addItem("Diesel");
            cbxGas.setSelectedItem("Diesel");
        }
        if (CarTypeS.equals("Sedan")) {
            cbxGas.removeItem("Gasohol 95");
            cbxGas.removeItem("Gasohol 91");
            cbxGas.removeItem("Benzin 91");
            cbxGas.removeItem("Diesel");
            cbxGas.addItem("Gasohol 95");
            cbxGas.addItem("Gasohol 91");
            cbxGas.addItem("Benzin 91");
        }

    }//GEN-LAST:event_cbxCarActionPerformed

    private void btnPrintTaxInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintTaxInvoiceActionPerformed
        int brand = 0, petroType = 0;
        double amount = 0.0, litre = 0.0;

        brand = checkIn(); //รับปั้มน้ำมัน
        petroType = getPetro(); //รับประเภทน้ำมัน
        amount = getAmount(); //รับเงิน

        printTaxInvoice(brand, petroType, amount);
        
        if (brand == 0) {
            JOptionPane.showMessageDialog(rootPane, "โปรดเลือกปั๊มน้ำมัน");
            tarResult.setText("");
        }
    }//GEN-LAST:event_btnPrintTaxInvoiceActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtAmount.setText("");
        tarResult.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAmountKeyTyped

    public int checkIn() {
        int brand = 0;
        if (rdbPTT.isSelected()) {
            brand = 1;
        } else if (rdbBCP.isSelected()) {
            brand = 2;
        } else if (rdbShell.isSelected()) {
            brand = 3;
        } else if (rdbEsso.isSelected()) {
            brand = 4;
        }
        return brand;
    }

    public int getPetro() {
        String petroTypeS = "";
        int petroType = 0;

        petroTypeS = (String) cbxGas.getSelectedItem();

        if (petroTypeS.equals("Gasohol 95")) {
            petroType = 1;
        } else if (petroTypeS.equals("Gasohol 91")) {
            petroType = 2;
        } else if (petroTypeS.equals("Benzin 91")) {
            petroType = 3;
        } else if (petroTypeS.equals("Diesel")) {
            petroType = 4;
        }

        return petroType;
    }

    public double getAmount() {
        String amountS = "";
        double amount = 0.0;

        amountS = txtAmount.getText();
        amount = Integer.valueOf(amountS);

        return amount;
    }

    public void printReceipt(int brand, int petroType, double amount) {

        double litre = 0.0;
        double price = getPrice(brand, petroType);
        litre = amount / price;

        String display = "";

        display = display + "--------------------------------------------\n";
        switch (brand) {
            case 1:
                display = display + "                     PTT Gas Station";
                break;
            case 2:
                display = display + "                     BCP Gas Station";
                break;
            case 3:
                display = display + "                     Shell Gas Station";
                break;
            case 4:
                display = display + "                     Esso Gas Station";
                break;
        }//end switch

        display = display + "\n                             Receipt\n";
        display = display + "--------------------------------------------\n";
        display = display + "  HDS         " + String.format("%.1f", litre) + " Litre           " + amount + " Baht\n";
        display = display + "--------------------------------------------";

        tarResult.setText(display);

    }//end printReceipt

    public void printTaxInvoice(int brand, int petroType, double amount) {
        double litre = 0.0;
        double price = getPrice(brand, petroType);
        litre = amount / price;

        String display = "";

        display = display + "--------------------------------------------\n";
        switch (brand) {
            case 1:
                display = display + "                    PTT Gas Station";
                break;
            case 2:
                display = display + "                    BCP Gas Station";
                break;
            case 3:
                display = display + "                   Shell Gas Station";
                break;
            case 4:
                display = display + "                    Esso Gas Station";
                break;
        }//end switch

        display = display + "\n                       Tax Invoice\n";
        display = display + "--------------------------------------------\n";
        display = display + "  HDS         " + String.format("%.1f", litre) + " Litre     " + amount + " Baht\n";
        display = display + "  Amount : " + String.format("%.0f\n", (amount - (amount / 1.07) * 0.07));
        display = display + "  VAT 7% : " + String.format("%.0f\n", ((amount / 1.07) * 0.07));
        display = display + "  Total Amount : " + String.format("%.2f\n", amount);
        display = display + "--------------------------------------------";

        tarResult.setText(display);

    }//end printTaxInvoice

    public double getPrice(int brand, int petroType) {
        double price = 0.0;
        petroType--;

        switch (brand) {
            case 1:
                price = PTT[petroType];
                break;
            case 2:
                price = BCP[petroType];
                break;
            case 3:
                price = SHELL[petroType];
                break;
            case 4:
                price = ESSO[petroType];
                break;
        }
        return price;
    }//end getPrice

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
            java.util.logging.Logger.getLogger(GasolineCalculationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GasolineCalculationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GasolineCalculationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GasolineCalculationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GasolineCalculationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGroupGasStation;
    private javax.swing.JButton btnPrintReceipt;
    private javax.swing.JButton btnPrintTaxInvoice;
    private javax.swing.JComboBox<String> cbxCar;
    private javax.swing.JComboBox<String> cbxGas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbBCP;
    private javax.swing.JRadioButton rdbEsso;
    private javax.swing.JRadioButton rdbPTT;
    private javax.swing.JRadioButton rdbShell;
    private javax.swing.JTextArea tarResult;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
