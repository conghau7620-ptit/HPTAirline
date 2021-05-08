/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.LoadData;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HoaDon;
import model.KhachHang;
import model.Ve;

/**
 *
 * @author t0168
 */
public class GiaoDienLichSuHoaDon extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienHoaDonDaDat
     */
    DefaultTableModel dtmHoaDon = null;
    DefaultTableModel dtmVe = null;

    public GiaoDienLichSuHoaDon() {
        initComponents();

        dtmHoaDon = (DefaultTableModel) jTable_HoaDon.getModel();
        dtmHoaDon.setColumnIdentifiers(new Object[]{
            "MaHoaDon", "SDTKhachHang", "NgayXuatHoaDon", "TrangThaiThanhToan", "TongTien", "SDTNhanVien"
        });
        dtmHoaDon.setRowCount(0);

        new LoadData();

        for (KhachHang kh : controller.Controller.arrayListKhachHang) {
            if (kh.getSdtKhachHang().equals(controller.Controller.tk.getSdt())) {
                for (HoaDon hd : controller.Controller.arrayListHoaDon) {
                    if(hd.getSdtKhachHang().equals(kh.getSdtKhachHang()))
                    dtmHoaDon.addRow(new Object[]{
                        hd.getMaHoaDon(), hd.getSdtKhachHang(), new SimpleDateFormat("dd/MM/yyyy").format(hd.getNgayXuatHoaDon()), hd.getTrangThaiThanhToan(),
                         hd.getTongTien(), hd.getSdtNhanVien()
                    });

                }
                break;
            }
        }

        dtmVe = (DefaultTableModel) jTable_VeDaChon.getModel();
        dtmVe.setColumnIdentifiers(new Object[]{
            "MaVe", "SDTKhachHang", "MaChuyenBay", "Gia", "KyGui", "TrangThaiDoi", "TrangThaiVe",
            "CMNDNguoiBay", "TenNguoiBay", "EmailNguoiBay", "SDTNguoiBay", "MaHoaDon", "MaGhe"
        });

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Bạn có chắc muốn thoát chương trình không?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
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
        jLabel_BaoLoi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_HoaDon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_ThoatGiaoDienXemLichSu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel_BaoLoi1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_VeDaChon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_SuaVe = new javax.swing.JButton();
        jButton_XacNhanThayDoi1 = new javax.swing.JButton();
        jButton_XoaVe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(700, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_HPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_AirLines, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_IconMayBay, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        jPanel2.setBackground(new java.awt.Color(89, 98, 117));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel_BaoLoi.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel_BaoLoi.setForeground(new java.awt.Color(255, 0, 0));

        jTable_HoaDon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_HoaDon.setRowHeight(30);
        jTable_HoaDon.setSelectionBackground(new java.awt.Color(255, 77, 77));
        jTable_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_HoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_HoaDon);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hóa đơn");

        jButton_ThoatGiaoDienXemLichSu.setBackground(new java.awt.Color(0, 102, 102));
        jButton_ThoatGiaoDienXemLichSu.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThoatGiaoDienXemLichSu.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThoatGiaoDienXemLichSu.setText("Quay lại");
        jButton_ThoatGiaoDienXemLichSu.setBorderPainted(false);
        jButton_ThoatGiaoDienXemLichSu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_ThoatGiaoDienXemLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThoatGiaoDienXemLichSuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_ThoatGiaoDienXemLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_BaoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_BaoLoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addComponent(jButton_ThoatGiaoDienXemLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 480, 430));

        jPanel3.setBackground(new java.awt.Color(89, 98, 117));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel_BaoLoi1.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel_BaoLoi1.setForeground(new java.awt.Color(255, 0, 0));

        jTable_VeDaChon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_VeDaChon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_VeDaChon.setRowHeight(30);
        jTable_VeDaChon.setSelectionBackground(new java.awt.Color(255, 77, 77));
        jScrollPane2.setViewportView(jTable_VeDaChon);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vé đã chọn");

        jButton_SuaVe.setBackground(new java.awt.Color(0, 51, 51));
        jButton_SuaVe.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_SuaVe.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SuaVe.setText("Sửa vé");
        jButton_SuaVe.setBorderPainted(false);
        jButton_SuaVe.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton_SuaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuaVeActionPerformed(evt);
            }
        });

        jButton_XacNhanThayDoi1.setBackground(new java.awt.Color(255, 77, 77));
        jButton_XacNhanThayDoi1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_XacNhanThayDoi1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_XacNhanThayDoi1.setText("Xác nhận thay đổi");
        jButton_XacNhanThayDoi1.setBorderPainted(false);
        jButton_XacNhanThayDoi1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton_XacNhanThayDoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XacNhanThayDoi1ActionPerformed(evt);
            }
        });

        jButton_XoaVe.setBackground(new java.awt.Color(0, 51, 51));
        jButton_XoaVe.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_XoaVe.setForeground(new java.awt.Color(255, 255, 255));
        jButton_XoaVe.setText("Xóa vé");
        jButton_XoaVe.setBorderPainted(false);
        jButton_XoaVe.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton_XoaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaVeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton_XoaVe)
                        .addGap(79, 79, 79)
                        .addComponent(jButton_SuaVe)
                        .addGap(87, 87, 87)
                        .addComponent(jButton_XacNhanThayDoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_BaoLoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jSeparator2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_BaoLoi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_SuaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_XacNhanThayDoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_XoaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 540, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hienThongTinVaoBang() {

    }

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void jButton_ThoatGiaoDienXemLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatGiaoDienXemLichSuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_ThoatGiaoDienXemLichSuActionPerformed

    private void jButton_SuaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuaVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SuaVeActionPerformed

    private void jButton_XacNhanThayDoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XacNhanThayDoi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_XacNhanThayDoi1ActionPerformed

    private void jButton_XoaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaVeActionPerformed
        // TODO add your handling code here:
        int row = jTable_VeDaChon.getSelectedRow();
        if (row == -1) {

        } else {

        }
    }//GEN-LAST:event_jButton_XoaVeActionPerformed

    private void jTable_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_HoaDonMouseClicked
        // TODO add your handling code here:
        int row = jTable_HoaDon.getSelectedRow();
        if (row == -1) {

        } else {
            String maHoaDon = (String) jTable_HoaDon.getValueAt(row, 0);

            controller.Controller.arrayListVe.removeAll(controller.Controller.arrayListVe);
            new LoadData();
            dtmVe.setRowCount(0);
            ArrayList<Ve> listVe = new ArrayList<>();
            for(Ve v: controller.Controller.arrayListVe){
                if(v.getMaHoaDon().equals(maHoaDon)){                    
                    dtmVe.addRow(new Object[]{
                    v.getMaVe(), v.getSdtKhachHang(), v.getMaChuyenBay(), v.getGia(), v.getKyGui(), v.getTrangThaiDoi(),
                    v.getTrangThaiVe(), v.getCmndNguoiBay(), v.getTenNguoiBay(), v.getEmailNguoiBay(), v.getSdtNguoiBay(),
                    v.getMaHoaDon(), v.getMaGhe()
                    }); 
                }
            }


//            for (Ve v : controller.Controller.arrayListVe) {
//                System.out.println(v.toString());
//                    dtmVe.addRow(new Object[]{
//                    v.getMaVe(), v.getSdtKhachHang(), v.getMaChuyenBay(), v.getGia(), v.getKyGui(), v.getTrangThaiDoi(),
//                    v.getTrangThaiVe(), v.getCmndNguoiBay(), v.getTenNguoiBay(), v.getEmailNguoiBay(), v.getSdtNguoiBay(),
//                    v.getMaHoaDon(), v.getMaGhe()
//                    });           
//            }
        }
    }//GEN-LAST:event_jTable_HoaDonMouseClicked

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
            java.util.logging.Logger.getLogger(GiaoDienLichSuHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienLichSuHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienLichSuHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienLichSuHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienLichSuHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SuaVe;
    private javax.swing.JButton jButton_ThoatGiaoDienXemLichSu;
    private javax.swing.JButton jButton_XacNhanThayDoi1;
    private javax.swing.JButton jButton_XoaVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_BaoLoi;
    private javax.swing.JLabel jLabel_BaoLoi1;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable_HoaDon;
    private javax.swing.JTable jTable_VeDaChon;
    // End of variables declaration//GEN-END:variables
}
