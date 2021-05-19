/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.LoadData;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.KhachHang;
import model.NhanVien;

/**
 *
 * @author conghau
 */
public class GiaoDienNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienNhanVien
     */
    public GiaoDienNhanVien() {
        initComponents();
        setVisible(true);
        thongTinTaiKhoan();
        
        jButton_BanVe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GiaoDienTimChuyenBay();
            }
        });
        
        jButton_ThanhToan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GiaoDienThanhToanHoaDon();
            }
        });
        
    }
    
    private void thongTinTaiKhoan() {
        //// Phần thông tin cơ bản , đăng xuất
        jLabel_XemThongTinTaiKhoan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel_DangXuat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        new LoadData();
        for (NhanVien nv : controller.Controller.arrayListNhanVien) {
            if (nv.getSdtNhanVien().equals(controller.Controller.tk.getSdt())
                    && (controller.Controller.tk.getLoaiTaiKhoan().equals("NhanVien"))) {
                jLabel_PhanQuyen.setText("nhân viên");

                jLabel_TenNguoiDung.setText(nv.getTenNhanVien());
            }
            if (nv.getSdtNhanVien().equals(controller.Controller.tk.getSdt())
                    && (controller.Controller.tk.getLoaiTaiKhoan().equals("QuanLy"))) {
                jLabel_PhanQuyen.setText("quản lý");

                jLabel_TenNguoiDung.setText(nv.getTenNhanVien());
            }
        }
        for (KhachHang kh : controller.Controller.arrayListKhachHang) {
            if (kh.getSdtKhachHang().equals(controller.Controller.tk.getSdt())) {
                jLabel_PhanQuyen.setText("khách hàng");
                jLabel_TenNguoiDung.setText(kh.getTenKhachHang());
            }
        }
        ////
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
        jButton_ThanhToan = new javax.swing.JButton();
        jButton_BanVe = new javax.swing.JButton();
        jPanel_TaiKhoan = new javax.swing.JPanel();
        jLabel_XinChao = new javax.swing.JLabel();
        jLabel_PhanQuyen = new javax.swing.JLabel();
        jLabel_TenNguoiDung = new javax.swing.JLabel();
        jLabel_XemThongTinTaiKhoan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_DangXuat = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(89, 98, 117));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton_ThanhToan.setText("Thanh Toán Hóa Đơn");

        jButton_BanVe.setText("Bán Vé Trực Tiếp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jButton_ThanhToan)
                .addGap(144, 144, 144)
                .addComponent(jButton_BanVe)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_BanVe, jButton_ThanhToan});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ThanhToan)
                    .addComponent(jButton_BanVe))
                .addGap(145, 145, 145))
        );

        jPanel_TaiKhoan.setBackground(new java.awt.Color(48, 57, 82));

        jLabel_XinChao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_XinChao.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_XinChao.setText("Xin chào,");

        jLabel_PhanQuyen.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_PhanQuyen.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PhanQuyen.setText("Đối tượng");

        jLabel_TenNguoiDung.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_TenNguoiDung.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenNguoiDung.setText("Tên đối tượng");

        jLabel_XemThongTinTaiKhoan.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_XemThongTinTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_XemThongTinTaiKhoan.setText("<HTML><u>Xem thông tin tài khoản</u></HTML>");
        jLabel_XemThongTinTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_XemThongTinTaiKhoanMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("|");

        jLabel_DangXuat.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_DangXuat.setForeground(new java.awt.Color(255, 77, 77));
        jLabel_DangXuat.setText("<HTML><u>Đăng xuất</u></HTML>");
        jLabel_DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_DangXuatMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TaiKhoanLayout = new javax.swing.GroupLayout(jPanel_TaiKhoan);
        jPanel_TaiKhoan.setLayout(jPanel_TaiKhoanLayout);
        jPanel_TaiKhoanLayout.setHorizontalGroup(
            jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel_XemThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_XinChao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_PhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_TenNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_TaiKhoanLayout.setVerticalGroup(
            jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TenNguoiDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_XinChao)
                        .addComponent(jLabel_PhanQuyen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_XemThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addComponent(jPanel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_HPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_AirLines, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel_IconMayBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel_TaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_XemThongTinTaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_XemThongTinTaiKhoanMousePressed
        // TODO add your handling code here:
        if (jLabel_PhanQuyen.getText().equals("nhân viên")) {
            new GiaoDienThongTinNhanVien().setVisible(true);
        }
        if (jLabel_PhanQuyen.getText().equals("quản lý")) {
            new GiaoDienThongTinNhanVien().setVisible(true);
        }
        if (jLabel_PhanQuyen.getText().equals("khách hàng")) {
            new GiaoDienThongTinKhachHang().setVisible(true);
        }
    }//GEN-LAST:event_jLabel_XemThongTinTaiKhoanMousePressed

    private void jLabel_DangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DangXuatMousePressed
        // TODO add your handling code here:
        dispose();
        new GiaoDienDangNhap().setVisible(true);
    }//GEN-LAST:event_jLabel_DangXuatMousePressed

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
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BanVe;
    private javax.swing.JButton jButton_ThanhToan;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_DangXuat;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_PhanQuyen;
    private javax.swing.JLabel jLabel_TenNguoiDung;
    private javax.swing.JLabel jLabel_XemThongTinTaiKhoan;
    private javax.swing.JLabel jLabel_XinChao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_TaiKhoan;
    // End of variables declaration//GEN-END:variables
}
