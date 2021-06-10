/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.LoadData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChuyenBay;
import model.DuongBay;

/**
 *
 * @author tuanbuiquoc
 */
public class GiaoDienQuanLyDuongBay extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienQuanLyDuongBay
     */
    DefaultTableModel dtmDuongBay;
    String maDuongBay="";
    String maSanBay1="";
    String maSanBay2="";
    public GiaoDienQuanLyDuongBay() {
        initComponents();
        this.dtmDuongBay = (DefaultTableModel) jTable_DuongBay.getModel();
        dtmDuongBay.setColumnIdentifiers(new Object[]{"MaDuongBay", "SanBay1", "SanBay2", "KhoangCach"});
        hienThongTin();
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
        jTable_DuongBay = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton_ThemDuongBay = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField_TimKiem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton_XoaDuongBay = new javax.swing.JButton();
        jButton_QuayLai = new javax.swing.JButton();
        jButton_SuaDuongBay = new javax.swing.JButton();

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

        jTable_DuongBay.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTable_DuongBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_DuongBay.setRowHeight(25);
        jTable_DuongBay.setRowMargin(2);
        jTable_DuongBay.setSelectionBackground(new java.awt.Color(255, 77, 77));
        jTable_DuongBay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DuongBayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_DuongBay);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Danh Sách Đường Bay");

        jButton_ThemDuongBay.setBackground(new java.awt.Color(255, 121, 63));
        jButton_ThemDuongBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThemDuongBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThemDuongBay.setText("Thêm Đường Bay");
        jButton_ThemDuongBay.setBorderPainted(false);
        jButton_ThemDuongBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemDuongBayActionPerformed(evt);
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
        jLabel10.setText("| Tìm kiếm theo mã sân bay");

        jButton_XoaDuongBay.setBackground(new java.awt.Color(255, 77, 77));
        jButton_XoaDuongBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_XoaDuongBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_XoaDuongBay.setText("Xóa Đường Bay");
        jButton_XoaDuongBay.setBorderPainted(false);
        jButton_XoaDuongBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaDuongBayActionPerformed(evt);
            }
        });

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

        jButton_SuaDuongBay.setBackground(new java.awt.Color(60, 60, 153));
        jButton_SuaDuongBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_SuaDuongBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SuaDuongBay.setText("Sửa Đường Bay");
        jButton_SuaDuongBay.setBorderPainted(false);
        jButton_SuaDuongBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuaDuongBayActionPerformed(evt);
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
                        .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ThemDuongBay)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SuaDuongBay, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_XoaDuongBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(jButton_ThemDuongBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_XoaDuongBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SuaDuongBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTable_DuongBayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DuongBayMouseClicked
        // TODO add your handling code here:
        int row = jTable_DuongBay.getSelectedRow();
        this.maDuongBay = (String) jTable_DuongBay.getValueAt(row, 0);
        this.maSanBay1 = (String) jTable_DuongBay.getValueAt(row, 1);
        this.maSanBay2 = (String) jTable_DuongBay.getValueAt(row, 2);
    }//GEN-LAST:event_jTable_DuongBayMouseClicked

    private void jButton_ThemDuongBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemDuongBayActionPerformed
        // TODO add your handling code here:
        new GiaoDienThemDuongBay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_ThemDuongBayActionPerformed

    private void jTextField_TimKiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_TimKiemFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TimKiemFocusGained

    private void jTextField_TimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_TimKiemFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TimKiemFocusLost

    private void jTextField_TimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TimKiemKeyReleased
        // TODO add your handling code here:
        if (jTextField_TimKiem.getText().length() >= 4) {
//            evt.consume();
            jTextField_TimKiem.setText(jTextField_TimKiem.getText().substring(0, jTextField_TimKiem.getText().length() - 1));
        } else {
            dtmDuongBay.setRowCount(0);
            new LoadData();
            int length = jTextField_TimKiem.getText().length();
            for (DuongBay db : controller.Controller.arrayListDuongBay) {
                if (jTextField_TimKiem.getText().equalsIgnoreCase(db.getMaSanBay1().substring(0, length))
                        ||jTextField_TimKiem.getText().equalsIgnoreCase(db.getMaSanBay2().substring(0, length))) {
                    dtmDuongBay.addRow(new Object[]{
                        db.getMaDuongBay(), db.getMaSanBay1(), db.getMaSanBay2(), db.getKhoangCach()
                    });
                }
            }
            if (jTextField_TimKiem.getText().isEmpty()) {
                hienThongTin();
            }
        }
    }//GEN-LAST:event_jTextField_TimKiemKeyReleased

    private void jTextField_TimKiemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TimKiemKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TimKiemKeyTyped

    private void jButton_XoaDuongBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaDuongBayActionPerformed
        // TODO add your handling code here:
        int row = jTable_DuongBay.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(rootPane, "Chọn đường bay muốn xóa");
        }else{
            if(kiemTraSuaXoaDuongBay()){
                if(connection.UpdateData.deleteDuongBay(this.maDuongBay)){
                    JOptionPane.showMessageDialog(rootPane, "Xóa đường bay thành công");
                    hienThongTin();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Xóa đường bay thất bại");
                }
            }
        }
    }//GEN-LAST:event_jButton_XoaDuongBayActionPerformed

    private void jButton_QuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QuayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoDienQuanLy().setVisible(true);
    }//GEN-LAST:event_jButton_QuayLaiActionPerformed

    private void jButton_SuaDuongBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuaDuongBayActionPerformed
        // TODO add your handling code here:
        int row = jTable_DuongBay.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(rootPane, "Chọn đường bay muốn sửa");
        }else{
            if(kiemTraSuaXoaDuongBay()){
                new GiaoDienSuaDuongBay(this.maDuongBay).setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton_SuaDuongBayActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed
    
    public void hienThongTin(){
        new LoadData(); 
        dtmDuongBay.setRowCount(0);
        for(DuongBay db : controller.Controller.arrayListDuongBay){
            dtmDuongBay.addRow(new Object[]{db.getMaDuongBay(), db.getMaSanBay1(),db.getMaSanBay2(),db.getKhoangCach()});
        }
    }
    public boolean kiemTraSuaXoaDuongBay(){
        new LoadData();
        for(ChuyenBay cb : controller.Controller.arrayListChuyenBay){
            if(cb.getMaSanBayDi().equalsIgnoreCase(maSanBay1)
                    &&cb.getMaSanBayDen().equalsIgnoreCase(maSanBay2)){
                JOptionPane.showMessageDialog(rootPane, "Đường bay đã được sử dụng trong chuyến bay.");
                return false;
            }
            if(cb.getMaSanBayDi().equalsIgnoreCase(maSanBay2)
                    &&cb.getMaSanBayDen().equalsIgnoreCase(maSanBay1)){
                JOptionPane.showMessageDialog(rootPane, "Đường bay đã được sử dụng trong chuyến bay.");
                return false;
            }
        }
        
        return true;
    }
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
            java.util.logging.Logger.getLogger(GiaoDienQuanLyDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyDuongBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienQuanLyDuongBay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_QuayLai;
    private javax.swing.JButton jButton_SuaDuongBay;
    private javax.swing.JButton jButton_ThemDuongBay;
    private javax.swing.JButton jButton_XoaDuongBay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable_DuongBay;
    private javax.swing.JTextField jTextField_TimKiem;
    // End of variables declaration//GEN-END:variables
}
