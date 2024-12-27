/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author asus
 */
public class Pembayaran extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pembayaran
     */
    public Pembayaran() {
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

        jLabel1 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        totalBelanja = new javax.swing.JTextField();
        metodebayar = new javax.swing.JComboBox<>();
        tombolgo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sisasaldo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Pembayaran");

        jLabel1.setText("Saldo / Cash / Limit");

        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Belanja");

        totalBelanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBelanjaActionPerformed(evt);
            }
        });

        metodebayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash / Tunai", "Kartu Kredit", "Kartu Debit", "Qris", "E-Wallet", "ShopeePay", "Gopay" }));
        metodebayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodebayarActionPerformed(evt);
            }
        });

        tombolgo.setText("Go");
        tombolgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolgoActionPerformed(evt);
            }
        });

        jLabel3.setText("Sisa Saldo / Cash / Limit");

        sisasaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sisasaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(metodebayar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(tombolgo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(saldo)
                        .addComponent(totalBelanja, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sisasaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalBelanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metodebayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolgo))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sisasaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoActionPerformed

    private void totalBelanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBelanjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBelanjaActionPerformed

    private void metodebayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodebayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metodebayarActionPerformed

    private void tombolgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolgoActionPerformed
        // TODO add your handling code here:
        double saldoValue = Double.parseDouble(saldo.getText());
        double totalBelanjaValue = Double.parseDouble(totalBelanja.getText());
        double sisaSaldoValue = saldoValue - totalBelanjaValue;

        if (sisaSaldoValue < 0) {
            JOptionPane.showMessageDialog(this, "Saldo tidak cukup untuk melakukan transaksi.");
            sisasaldo.setText("0");
        } else {
            sisasaldo.setText(String.valueOf(sisaSaldoValue));
        }
    }//GEN-LAST:event_tombolgoActionPerformed

    private void sisasaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisasaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sisasaldoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> metodebayar;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextField sisasaldo;
    private javax.swing.JButton tombolgo;
    private javax.swing.JTextField totalBelanja;
    // End of variables declaration//GEN-END:variables
}
