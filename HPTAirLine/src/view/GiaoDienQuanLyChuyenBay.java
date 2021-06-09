/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.LoadData;
import java.awt.Color;
import model.KhachHang;

/**
 *
 * @author tuanbuiquoc
 */
public class GiaoDienQuanLyChuyenBay extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienQuanLyChuyenBay
     */
    public GiaoDienQuanLyChuyenBay() {
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_ChuyenBay = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton_ThemChuyenBay = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_TimKiem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton_XoaChuyenBay = new javax.swing.JButton();
        jButton_QuayLai2 = new javax.swing.JButton();
        jButton_SuaChuyenBay = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(89, 98, 117));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jTable_ChuyenBay.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTable_ChuyenBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_ChuyenBay.setRowHeight(25);
        jTable_ChuyenBay.setRowMargin(2);
        jTable_ChuyenBay.setSelectionBackground(new java.awt.Color(255, 77, 77));
        jTable_ChuyenBay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ChuyenBayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_ChuyenBay);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Danh Sách Chuyến Bay");

        jButton_ThemChuyenBay.setBackground(new java.awt.Color(255, 121, 63));
        jButton_ThemChuyenBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThemChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThemChuyenBay.setText("Thêm Chuyến Bay");
        jButton_ThemChuyenBay.setBorderPainted(false);
        jButton_ThemChuyenBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemChuyenBayActionPerformed(evt);
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

        jButton_XoaChuyenBay.setBackground(new java.awt.Color(255, 77, 77));
        jButton_XoaChuyenBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_XoaChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_XoaChuyenBay.setText("Xóa Chuyến Bay");
        jButton_XoaChuyenBay.setBorderPainted(false);
        jButton_XoaChuyenBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaChuyenBayActionPerformed(evt);
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

        jButton_SuaChuyenBay.setBackground(new java.awt.Color(60, 60, 153));
        jButton_SuaChuyenBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_SuaChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SuaChuyenBay.setText("Sửa Chuyến Bay");
        jButton_SuaChuyenBay.setBorderPainted(false);
        jButton_SuaChuyenBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuaChuyenBayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_QuayLai2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ThemChuyenBay)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SuaChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_XoaChuyenBay, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ThemChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_XoaChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_QuayLai2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SuaChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_ChuyenBayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ChuyenBayMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable_ChuyenBayMouseClicked

    private void jButton_ThemChuyenBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemChuyenBayActionPerformed
        // TODO add your handling code here:
        this.dispose();

        new GiaoDienQuanLy().setVisible(true);
    }//GEN-LAST:event_jButton_ThemChuyenBayActionPerformed

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

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton_XoaChuyenBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaChuyenBayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_XoaChuyenBayActionPerformed

    private void jButton_QuayLai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QuayLai2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_QuayLai2ActionPerformed

    private void jButton_SuaChuyenBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuaChuyenBayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SuaChuyenBayActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienQuanLyChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienQuanLyChuyenBay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_QuayLai2;
    private javax.swing.JButton jButton_SuaChuyenBay;
    private javax.swing.JButton jButton_ThemChuyenBay;
    private javax.swing.JButton jButton_XoaChuyenBay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable_ChuyenBay;
    private javax.swing.JTextField jTextField_TimKiem;
    // End of variables declaration//GEN-END:variables
}