/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Kalkulator extends javax.swing.JInternalFrame {

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
        initComponents();
    }

    double num1,num2,result;
    String opr;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Satu = new javax.swing.JButton();
        Empat = new javax.swing.JButton();
        Tujuh = new javax.swing.JButton();
        Nol = new javax.swing.JButton();
        Dua = new javax.swing.JButton();
        Lima = new javax.swing.JButton();
        Delapan = new javax.swing.JButton();
        Tiga = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        Sembilan = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        DEL = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        samadengan = new javax.swing.JButton();
        monitor = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Kalkulator");

        Satu.setBackground(new java.awt.Color(0, 0, 0));
        Satu.setForeground(new java.awt.Color(255, 255, 255));
        Satu.setText("1");
        Satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatuActionPerformed(evt);
            }
        });

        Empat.setBackground(new java.awt.Color(0, 0, 0));
        Empat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Empat.setForeground(new java.awt.Color(255, 255, 255));
        Empat.setText("4");
        Empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpatActionPerformed(evt);
            }
        });

        Tujuh.setBackground(new java.awt.Color(0, 0, 0));
        Tujuh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tujuh.setForeground(new java.awt.Color(255, 255, 255));
        Tujuh.setText("7");
        Tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TujuhActionPerformed(evt);
            }
        });

        Nol.setBackground(new java.awt.Color(0, 0, 0));
        Nol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nol.setForeground(new java.awt.Color(255, 255, 255));
        Nol.setText("0");
        Nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NolActionPerformed(evt);
            }
        });

        Dua.setBackground(new java.awt.Color(0, 0, 0));
        Dua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dua.setForeground(new java.awt.Color(255, 255, 255));
        Dua.setText("2");
        Dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuaActionPerformed(evt);
            }
        });

        Lima.setBackground(new java.awt.Color(0, 0, 0));
        Lima.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lima.setForeground(new java.awt.Color(255, 255, 255));
        Lima.setText("5");
        Lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimaActionPerformed(evt);
            }
        });

        Delapan.setBackground(new java.awt.Color(0, 0, 0));
        Delapan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Delapan.setForeground(new java.awt.Color(255, 255, 255));
        Delapan.setText("8");
        Delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelapanActionPerformed(evt);
            }
        });

        Tiga.setBackground(new java.awt.Color(0, 0, 0));
        Tiga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tiga.setForeground(new java.awt.Color(255, 255, 255));
        Tiga.setText("3");
        Tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TigaActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(0, 0, 0));
        b6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        Sembilan.setBackground(new java.awt.Color(0, 0, 0));
        Sembilan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sembilan.setForeground(new java.awt.Color(255, 255, 255));
        Sembilan.setText("9");
        Sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SembilanActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(0, 0, 0));
        sin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sin.setForeground(new java.awt.Color(255, 255, 255));
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cos.setBackground(new java.awt.Color(0, 0, 0));
        cos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cos.setForeground(new java.awt.Color(255, 255, 255));
        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        DEL.setBackground(new java.awt.Color(0, 0, 0));
        DEL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DEL.setForeground(new java.awt.Color(255, 255, 255));
        DEL.setText("DEL");
        DEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELActionPerformed(evt);
            }
        });

        AC.setBackground(new java.awt.Color(0, 0, 0));
        AC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AC.setForeground(new java.awt.Color(255, 255, 255));
        AC.setText("AC");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });

        kali.setBackground(new java.awt.Color(0, 0, 0));
        kali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kali.setForeground(new java.awt.Color(255, 255, 255));
        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        bagi.setBackground(new java.awt.Color(0, 0, 0));
        bagi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bagi.setForeground(new java.awt.Color(255, 255, 255));
        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        tambah.setBackground(new java.awt.Color(0, 0, 0));
        tambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        kurang.setBackground(new java.awt.Color(0, 0, 0));
        kurang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kurang.setForeground(new java.awt.Color(255, 255, 255));
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(0, 0, 0));
        tan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tan.setForeground(new java.awt.Color(255, 255, 255));
        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        samadengan.setBackground(new java.awt.Color(0, 0, 0));
        samadengan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        samadengan.setForeground(new java.awt.Color(255, 255, 255));
        samadengan.setText("=");
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });

        monitor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        monitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delapan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Empat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lima, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Nol, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(monitor)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Satu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dua, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DEL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(monitor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Satu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dua, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Empat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lima, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delapan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nol, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatuActionPerformed
        monitor.setText(monitor.getText() + "1");
    }//GEN-LAST:event_SatuActionPerformed

    private void EmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpatActionPerformed
        monitor.setText(monitor.getText() + "4");
    }//GEN-LAST:event_EmpatActionPerformed

    private void TujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TujuhActionPerformed
        monitor.setText(monitor.getText() + "7");
    }//GEN-LAST:event_TujuhActionPerformed

    private void NolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NolActionPerformed
        monitor.setText(monitor.getText() + "0");
    }//GEN-LAST:event_NolActionPerformed

    private void DuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuaActionPerformed
        monitor.setText(monitor.getText() + "2");
    }//GEN-LAST:event_DuaActionPerformed

    private void LimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimaActionPerformed
        monitor.setText(monitor.getText() + "5");
    }//GEN-LAST:event_LimaActionPerformed

    private void DelapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelapanActionPerformed
        monitor.setText(monitor.getText() + "8");
    }//GEN-LAST:event_DelapanActionPerformed

    private void TigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TigaActionPerformed
        monitor.setText(monitor.getText() + "3");
    }//GEN-LAST:event_TigaActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        monitor.setText(monitor.getText() + "6");
    }//GEN-LAST:event_b6ActionPerformed

    private void SembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SembilanActionPerformed
        monitor.setText(monitor.getText() + "9");
    }//GEN-LAST:event_SembilanActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        double value = Double.parseDouble(monitor.getText());
        double r = Math.sin(Math.toRadians(value));
        monitor.setText(String.valueOf(r));
    }//GEN-LAST:event_sinActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        double value = Double.parseDouble(monitor.getText());
        double r = Math.cos(Math.toRadians(value));
        monitor.setText(String.valueOf(r));
    }//GEN-LAST:event_cosActionPerformed

    private void DELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELActionPerformed
        String backSpace = null;

        if(monitor.getText().length() > 0)
        {
            StringBuilder s = new StringBuilder(monitor.getText());
            s.deleteCharAt(monitor.getText().length()- 1);
            backSpace = s.toString();
            monitor.setText(backSpace);
        }
    }//GEN-LAST:event_DELActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        monitor.setText("");
    }//GEN-LAST:event_ACActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        num1 = Double.parseDouble(monitor.getText());
        monitor.setText("");
        opr = "*";
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        num1 = Double.parseDouble(monitor.getText());
        monitor.setText("");
        opr = "/";
    }//GEN-LAST:event_bagiActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        num1 = Double.parseDouble(monitor.getText());
        monitor.setText("");
        opr = "+";
    }//GEN-LAST:event_tambahActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        num1 = Double.parseDouble(monitor.getText());
        monitor.setText("");
        opr = "-";
    }//GEN-LAST:event_kurangActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        double value = Double.parseDouble(monitor.getText());

        if (value % 180 == 90) {
            monitor.setText("Undefined");
        }
        else
        {
            double r = Math.tan(Math.toRadians(value));
            monitor.setText(String.valueOf(r));
        }
    }//GEN-LAST:event_tanActionPerformed

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganActionPerformed
        num2 = Double.parseDouble(monitor.getText());
        switch (opr) {
            case "+":
            result = num1 + num2;
            monitor.setText(Double.toString(result));
            break;
            case "-":
            result = num1 - num2;
            monitor.setText(Double.toString(result));
            break;
            case "*":
            result = num1 * num2;
            monitor.setText(Double.toString(result));
            break;
            case "/":
            result = num1 / num2;
            monitor.setText(Double.toString(result));
            break;
            case "x^y":
            double r = Math.pow(num1, num2);
            monitor.setText(String.valueOf(r));
            break;
            default:
            break;
        }
    }//GEN-LAST:event_samadenganActionPerformed

    private void monitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monitorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JButton DEL;
    private javax.swing.JButton Delapan;
    private javax.swing.JButton Dua;
    private javax.swing.JButton Empat;
    private javax.swing.JButton Lima;
    private javax.swing.JButton Nol;
    private javax.swing.JButton Satu;
    private javax.swing.JButton Sembilan;
    private javax.swing.JButton Tiga;
    private javax.swing.JButton Tujuh;
    private javax.swing.JButton b6;
    private javax.swing.JButton bagi;
    private javax.swing.JButton cos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JTextField monitor;
    private javax.swing.JButton samadengan;
    private javax.swing.JButton sin;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tan;
    // End of variables declaration//GEN-END:variables
}
