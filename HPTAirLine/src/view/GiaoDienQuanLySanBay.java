/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author t0168
 */
public class GiaoDienQuanLySanBay extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienQuanLySanBay
     */
    public GiaoDienQuanLySanBay() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_IconMayBay = new javax.swing.JLabel();
        jLabel_HPT = new javax.swing.JLabel();
        jLabel_AirLines = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_SanBay = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton_ThemSanBay = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_TimKiem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton_XoaSanBay = new javax.swing.JButton();
        jButton_QuayLai2 = new javax.swing.JButton();
        jButton_SuaSanBay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 57, 82));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel_IconMayBay.setForeground(new java.awt.Color(204, 255, 255));
        jLabel_IconMayBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_airplane_48px_4.png"))); // NOI18N

        jLabel_HPT.setFont(new java.awt.Font("Roboto Mono Light", 1, 48)); // NOI18N
        jLabel_HPT.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_HPT.setText("HPT");

        jLabel_AirLines.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel_AirLines.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AirLines.setText("AIRLINES™");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel_IconMayBay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_HPT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_AirLines, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_HPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_AirLines, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_IconMayBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(89, 98, 117));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jTable_SanBay.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTable_SanBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_SanBay.setRowHeight(25);
        jTable_SanBay.setRowMargin(2);
        jTable_SanBay.setSelectionBackground(new java.awt.Color(255, 77, 77));
        jTable_SanBay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SanBayMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_SanBay);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Danh Sách Sân Bay");

        jButton_ThemSanBay.setBackground(new java.awt.Color(255, 121, 63));
        jButton_ThemSanBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThemSanBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThemSanBay.setText("Thêm Sân Bay");
        jButton_ThemSanBay.setBorderPainted(false);
        jButton_ThemSanBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemSanBayActionPerformed(evt);
            }
        });

        jTextField_TimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_TimKiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_TimKiemFocusLost(evt);
            }
        });
        jTextField_TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TimKiemKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TimKiemKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("| Tìm kiếm");

        jButton_XoaSanBay.setBackground(new java.awt.Color(255, 77, 77));
        jButton_XoaSanBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_XoaSanBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_XoaSanBay.setText("Xóa Sân Bay");
        jButton_XoaSanBay.setBorderPainted(false);
        jButton_XoaSanBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaSanBayActionPerformed(evt);
            }
        });

        jButton_QuayLai2.setBackground(new java.awt.Color(0, 102, 102));
        jButton_QuayLai2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_QuayLai2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_QuayLai2.setText("Quay Lại");
        jButton_QuayLai2.setBorderPainted(false);
        jButton_QuayLai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QuayLai2ActionPerformed(evt);
            }
        });

        jButton_SuaSanBay.setBackground(new java.awt.Color(60, 60, 153));
        jButton_SuaSanBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_SuaSanBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SuaSanBay.setText("Sửa Sân Bay");
        jButton_SuaSanBay.setBorderPainted(false);
        jButton_SuaSanBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuaSanBayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton_QuayLai2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ThemSanBay)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SuaSanBay, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_XoaSanBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ThemSanBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_XoaSanBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_QuayLai2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SuaSanBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_SanBayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SanBayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_SanBayMouseClicked

    private void jButton_ThemSanBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemSanBayActionPerformed
        // TODO add your handling code here:
        this.dispose();

        new GiaoDienQuanLy().setVisible(true);
    }//GEN-LAST:event_jButton_ThemSanBayActionPerformed

    private void jTextField_TimKiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_TimKiemFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TimKiemFocusGained

    private void jTextField_TimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_TimKiemFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TimKiemFocusLost

    private void jTextField_TimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TimKiemKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TimKiemKeyReleased

    private void jTextField_TimKiemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TimKiemKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TimKiemKeyTyped

    private void jButton_XoaSanBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaSanBayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_XoaSanBayActionPerformed

    private void jButton_QuayLai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QuayLai2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_QuayLai2ActionPerformed

    private void jButton_SuaSanBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuaSanBayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SuaSanBayActionPerformed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MousePressed

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
            java.util.logging.Logger.getLogger(GiaoDienQuanLySanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLySanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLySanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLySanBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienQuanLySanBay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_QuayLai2;
    private javax.swing.JButton jButton_SuaSanBay;
    private javax.swing.JButton jButton_ThemSanBay;
    private javax.swing.JButton jButton_XoaSanBay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable_SanBay;
    private javax.swing.JTextField jTextField_TimKiem;
    // End of variables declaration//GEN-END:variables
}