/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kalkulatorbosok;

/**
 *
 * @author aryas
 */
public class KalkuBagus extends javax.swing.JFrame {
    String angka;
    double jumlah, bil1, bil2;
    int pilih;

    /**
     * Creates new form KalkuBosok
     */
    public KalkuBagus() {
        initComponents();
        angka = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hapus = new javax.swing.JButton();
        angka7 = new javax.swing.JButton();
        angka4 = new javax.swing.JButton();
        angka1 = new javax.swing.JButton();
        btnTitik = new javax.swing.JButton();
        angka8 = new javax.swing.JButton();
        angka5 = new javax.swing.JButton();
        angka2 = new javax.swing.JButton();
        btnHasil = new javax.swing.JButton();
        angka9 = new javax.swing.JButton();
        angka6 = new javax.swing.JButton();
        angka3 = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnModulus = new javax.swing.JButton();
        TampilTeks = new javax.swing.JTextField();
        angka0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator Bagus");

        // Define a square dimension for the buttons
        java.awt.Dimension buttonDimension = new java.awt.Dimension(60, 60);

        hapus.setText("C");
        hapus.setPreferredSize(buttonDimension);
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        angka7.setText("7");
        angka7.setPreferredSize(buttonDimension);
        angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka7ActionPerformed(evt);
            }
        });

        angka4.setText("4");
        angka4.setPreferredSize(buttonDimension);
        angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka4ActionPerformed(evt);
            }
        });

        angka1.setText("1");
        angka1.setPreferredSize(buttonDimension);
        angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka1ActionPerformed(evt);
            }
        });

        btnTitik.setText(".");
        btnTitik.setPreferredSize(buttonDimension);
        btnTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitikActionPerformed(evt);
            }
        });

        angka8.setText("8");
        angka8.setPreferredSize(buttonDimension);
        angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka8ActionPerformed(evt);
            }
        });

        angka5.setText("5");
        angka5.setPreferredSize(buttonDimension);
        angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka5ActionPerformed(evt);
            }
        });

        angka2.setText("2");
        angka2.setPreferredSize(buttonDimension);
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });

        btnHasil.setText("=");
        btnHasil.setPreferredSize(buttonDimension);
        btnHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHasilActionPerformed(evt);
            }
        });

        angka9.setText("9");
        angka9.setPreferredSize(buttonDimension);
        angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka9ActionPerformed(evt);
            }
        });

        angka6.setText("6");
        angka6.setPreferredSize(buttonDimension);
        angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka6ActionPerformed(evt);
            }
        });

        angka3.setText("3");
        angka3.setPreferredSize(buttonDimension);
        angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka3ActionPerformed(evt);
            }
        });

        btnBagi.setText("/");
        btnBagi.setPreferredSize(buttonDimension);
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnKali.setText("X");
        btnKali.setPreferredSize(buttonDimension);
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnKurang.setText("-");
        btnKurang.setPreferredSize(buttonDimension);
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnTambah.setText("+");
        btnTambah.setPreferredSize(buttonDimension);
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnModulus.setText("%");
        btnModulus.setPreferredSize(buttonDimension);
        btnModulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModulusActionPerformed(evt);
            }
        });

        TampilTeks.setEditable(false);
        TampilTeks.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TampilTeks.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        angka0.setText("0");
        angka0.setPreferredSize(buttonDimension);
        angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TampilTeks)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModulus, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.width, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {angka0, angka1, angka2, angka3, angka4, angka5, angka6, angka7, angka8, angka9, btnBagi, btnHasil, btnKali, btnKurang, btnModulus, btnTambah, btnTitik, hapus});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TampilTeks, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModulus, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, buttonDimension.height, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {angka0, angka1, angka2, angka3, angka4, angka5, angka6, angka7, angka8, angka9, btnBagi, btnHasil, btnKali, btnKurang, btnModulus, btnTambah, btnTitik, hapus});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        TampilTeks.setText("");
        bil1=0.0;
        bil2=0.0;
        jumlah=0.0;
        angka="";
    }//GEN-LAST:event_hapusActionPerformed

    private void angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka1ActionPerformed
        angka += "1";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_angka1ActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
        angka += "2";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_angka2ActionPerformed

    private void angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka3ActionPerformed
        angka += "3";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_angka3ActionPerformed

    private void angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka4ActionPerformed
        angka += "4";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_angka4ActionPerformed

    private void angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka5ActionPerformed
        angka += "5";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_angka5ActionPerformed

    private void angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka6ActionPerformed
        angka += "6";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_angka6ActionPerformed

    private void angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka7ActionPerformed
        angka += "7";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_angka7ActionPerformed

    private void angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka8ActionPerformed
        angka += "8";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_angka8ActionPerformed

    private void angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka9ActionPerformed
        angka += "9";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_angka9ActionPerformed

    private void angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka0ActionPerformed
        angka += "0";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_angka0ActionPerformed

    private void btnTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitikActionPerformed
        angka += ".";
        TampilTeks.setText(angka);
    }//GEN-LAST:event_btnTitikActionPerformed

    private void btnHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHasilActionPerformed
        switch(pilih){
            case 1:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 + bil2;
                angka = Double.toString(jumlah);
                TampilTeks.setText(angka);
                break;
            case 2:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 - bil2;
                angka = Double.toString(jumlah);
                TampilTeks.setText(angka);
                break;
            case 3:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 * bil2;
                angka = Double.toString(jumlah);
                TampilTeks.setText(angka);
                break;
            case 4:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 / bil2;
                angka = Double.toString(jumlah);
                TampilTeks.setText(angka);
                break;
            case 5:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 % bil2;
                angka = Double.toString(jumlah);
                TampilTeks.setText(angka);
                break;
        }
    }//GEN-LAST:event_btnHasilActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        bil1 = Double.parseDouble(angka);
        TampilTeks.setText("+");
        angka = "";
        pilih = 1;
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        bil1 = Double.parseDouble(angka);
        TampilTeks.setText("-");
        angka = "";
        pilih = 2;
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        bil1 = Double.parseDouble(angka);
        TampilTeks.setText("*");
        angka = "";
        pilih = 3;
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        bil1 = Double.parseDouble(angka);
        TampilTeks.setText("/");
        angka = "";
        pilih = 4;
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnModulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModulusActionPerformed
        bil1 = Double.parseDouble(angka);
        TampilTeks.setText("%");
        angka = "";
        pilih = 5;
    }//GEN-LAST:event_btnModulusActionPerformed

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
            java.util.logging.Logger.getLogger(KalkuBagus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkuBagus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkuBagus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkuBagus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkuBagus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TampilTeks;
    private javax.swing.JButton angka0;
    private javax.swing.JButton angka1;
    private javax.swing.JButton angka2;
    private javax.swing.JButton angka3;
    private javax.swing.JButton angka4;
    private javax.swing.JButton angka5;
    private javax.swing.JButton angka6;
    private javax.swing.JButton angka7;
    private javax.swing.JButton angka8;
    private javax.swing.JButton angka9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnHasil;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnModulus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTitik;
    private javax.swing.JButton hapus;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
