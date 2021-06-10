/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.InsertData;
import connection.LoadData;
import controller.Controller;
import model.DuongBay;
import model.SanBay;

/**
 *
 * @author conghau
 */
public class GiaoDienThemDuongBay extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienThemDuongBay
     */
    public GiaoDienThemDuongBay() {
        initComponents();
        new LoadData();
        input();
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
        jPanel6 = new javax.swing.JPanel();
        jComboBox_SanBay1 = new javax.swing.JComboBox<>();
        jComboBox_SanBay2 = new javax.swing.JComboBox<>();
        jLabel_SanBayDi1 = new javax.swing.JLabel();
        jLabel_SanBayDen1 = new javax.swing.JLabel();
        jTextField_KhoangCach = new javax.swing.JTextField();
        jLabel_KhoangCach = new javax.swing.JLabel();
        jLabel_ThemChuyenBay = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_QuayLai = new javax.swing.JButton();
        jButton_ThemDuongBay = new javax.swing.JButton();
        jLabel_ThongBao = new javax.swing.JLabel();

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

        jPanel6.setBackground(new java.awt.Color(89, 98, 117));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jComboBox_SanBay1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jComboBox_SanBay2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel_SanBayDi1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_SanBayDi1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SanBayDi1.setText("Sân bay 1");

        jLabel_SanBayDen1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_SanBayDen1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SanBayDen1.setText("Sân bay 2");

        jLabel_KhoangCach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_KhoangCach.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_KhoangCach.setText("Khoảng cách");

        jLabel_ThemChuyenBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel_ThemChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ThemChuyenBay.setText("Thêm Đường Bay");

        jButton_QuayLai.setBackground(new java.awt.Color(0, 102, 102));
        jButton_QuayLai.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_QuayLai.setForeground(new java.awt.Color(255, 255, 255));
        jButton_QuayLai.setText("Quay Lại");
        jButton_QuayLai.setBorderPainted(false);
        jButton_QuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QuayLaiActionPerformed(evt);
            }
        });

        jButton_ThemDuongBay.setBackground(new java.awt.Color(255, 77, 77));
        jButton_ThemDuongBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThemDuongBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThemDuongBay.setText("Thêm Đường Bay");
        jButton_ThemDuongBay.setBorderPainted(false);
        jButton_ThemDuongBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemDuongBayActionPerformed(evt);
            }
        });

        jLabel_ThongBao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_ThongBao.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel_ThemChuyenBay)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_KhoangCach, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox_SanBay2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_SanBay1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_KhoangCach)
                                    .addComponent(jLabel_SanBayDen1)
                                    .addComponent(jLabel_SanBayDi1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_ThemDuongBay)))))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_QuayLai, jButton_ThemDuongBay});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_ThemChuyenBay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_SanBayDi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox_SanBay1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_SanBayDen1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox_SanBay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTextField_KhoangCach, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_KhoangCach))
                .addGap(18, 18, 18)
                .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ThemDuongBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_HPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_AirLines, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_IconMayBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void input() {
        for (SanBay sb: Controller.arrayListSanBay) {
            jComboBox_SanBay1.addItem(sb.getMaSanBay().toString());
            jComboBox_SanBay2.addItem(sb.getMaSanBay().toString());
        }
        jComboBox_SanBay2.setSelectedItem(Controller.arrayListSanBay.get(1).getMaSanBay().toString());
    }
    
    private void jButton_QuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QuayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoDienQuanLyDuongBay().setVisible(true);
    }//GEN-LAST:event_jButton_QuayLaiActionPerformed

    private void jButton_ThemDuongBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemDuongBayActionPerformed
        String maSB1 = jComboBox_SanBay1.getSelectedItem().toString();
        String maSB2 = jComboBox_SanBay2.getSelectedItem().toString();
        if (maSB1.equals(maSB2)) {
            jLabel_ThongBao.setText("2 mã sân bay bị trùng nhau");
            return;
        }
        if (jTextField_KhoangCach.getText().isEmpty()) {
            jLabel_ThongBao.setText("Khoảng cách chưa được điền");
            return;
        }
        for (DuongBay db: Controller.arrayListDuongBay) {
            if ((db.getMaSanBay1().equals(maSB1) && db.getMaSanBay2().equals(maSB2))
                    || (db.getMaSanBay1().equals(maSB2) && db.getMaSanBay2().equals(maSB1))) {
                jLabel_ThongBao.setText("Đường bay đã tồn tại trong danh sách");
                return;
            }
        }
        int tmp = Integer.parseInt(Controller.arrayListDuongBay.get(
            Controller.arrayListDuongBay.size()-1).getMaDuongBay().substring(2))+1;
        String maDuongBay = "DB";
        if (tmp<=9) {
            maDuongBay = maDuongBay + "0" + tmp;
        }
        else {
            maDuongBay += tmp;
        }
        
        DuongBay duongBay = new DuongBay(
            maDuongBay,
            maSB1,
            maSB2,
            Integer.parseInt(jTextField_KhoangCach.getText()));
        Controller.arrayListDuongBay.add(duongBay);
        InsertData.insertDuongBay(duongBay);
        
        jLabel_ThongBao.setText("Thêm đường bay thành công.");
    }//GEN-LAST:event_jButton_ThemDuongBayActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienThemDuongBay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_QuayLai;
    private javax.swing.JButton jButton_ThemDuongBay;
    private javax.swing.JComboBox<String> jComboBox_SanBay1;
    private javax.swing.JComboBox<String> jComboBox_SanBay2;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_KhoangCach;
    private javax.swing.JLabel jLabel_SanBayDen1;
    private javax.swing.JLabel jLabel_SanBayDi1;
    private javax.swing.JLabel jLabel_ThemChuyenBay;
    private javax.swing.JLabel jLabel_ThongBao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_KhoangCach;
    // End of variables declaration//GEN-END:variables
}
