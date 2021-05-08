/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.LoadData;
import controller.Controller;
import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import model.TaiKhoan;
import model.Ve;

//TẠM HOÀN THÀNH XỬ LÝ GIAO DIỆN ĐĂNG NHẬP
/**
 *
 * @author t0168
 */
public class GiaoDienDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienDangNhap
     */
    public GiaoDienDangNhap() {
        initComponents();
        jLabel_DangKy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        jLabel_TenDangNhap = new javax.swing.JLabel();
        jLabel_MatKhau = new javax.swing.JLabel();
        jTextField_TenDangNhap = new javax.swing.JTextField();
        jButton_DangNhap = new javax.swing.JButton();
        jLabel_DangKy = new javax.swing.JLabel();
        jLabel_DangNhap = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField_MatKhau = new javax.swing.JPasswordField();
        jLabel_BaoLoi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setResizable(false);
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
                .addContainerGap(20, Short.MAX_VALUE))
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(89, 98, 117));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel_TenDangNhap.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel_TenDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenDangNhap.setText("Tên đăng nhập");

        jLabel_MatKhau.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel_MatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MatKhau.setText("Mật khẩu");

        jTextField_TenDangNhap.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jButton_DangNhap.setBackground(new java.awt.Color(255, 77, 77));
        jButton_DangNhap.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton_DangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DangNhap.setText("Đăng nhập");
        jButton_DangNhap.setBorderPainted(false);
        jButton_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DangNhapActionPerformed(evt);
            }
        });

        jLabel_DangKy.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel_DangKy.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DangKy.setText("<HTML><u>Đăng ký</u></HTML>");
        jLabel_DangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_DangKyMousePressed(evt);
            }
        });

        jLabel_DangNhap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_DangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DangNhap.setText("Đăng nhập");

        jLabel_BaoLoi.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel_DangNhap))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_TenDangNhap)
                                .addComponent(jButton_DangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(jPasswordField_MatKhau)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_MatKhau)
                                        .addComponent(jLabel_TenDangNhap))
                                    .addGap(174, 174, 174)))
                            .addComponent(jLabel_BaoLoi))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel_DangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_TenDangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_MatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_BaoLoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed
    ////////////////////////
    private void testHD1Chieu(){
        // để test hóa đơn 1 chiều
                ArrayList<Ve> danhSachVe = new ArrayList<>();
                String maChuyenBayDi = "CB01";
                String maHoaDon = "HD01";

                Ve v1 = new Ve();
                v1.setKyGui((short) 20);
                v1.setMaVe("V01");
                v1.setCmndNguoiBay("CMNDNgu");
                v1.setMaChuyenBay("CB01");
                v1.setMaHoaDon(maHoaDon);
                v1.setMaGhe("A01-CB01");
                v1.setEmailNguoiBay("emai1");
                v1.setTrangThaiDoi((byte) 0);
                v1.setTrangThaiVe((byte) 0);
                v1.setSdtKhachHang("");
                v1.setGia(0);
                v1.setTenNguoiBay("ten n");
                v1.setSdtNguoiBay("123");

                Ve v2 = new Ve();
                v2.setKyGui((short) 20);
                v2.setMaVe("V02");
                v2.setCmndNguoiBay("CMNDNgu");
                v2.setMaChuyenBay("CB01");
                v2.setMaHoaDon(maHoaDon);
                v2.setMaGhe("A02-CB01");
                v2.setEmailNguoiBay("emailNo");
                v2.setTrangThaiDoi((byte) 0);
                v2.setTrangThaiVe((byte) 0);
                v2.setSdtKhachHang("");
                v2.setGia(0);
                v2.setTenNguoiBay("ten ngu2");
                v2.setSdtNguoiBay("223");

                danhSachVe.add(v1);
                danhSachVe.add(v2);

                for (Ve v : danhSachVe) {
                    System.out.println(v.toString());
                }
                new GiaoDienHoaDonMotChieu(danhSachVe).setVisible(true);
    }
    ///////
    private void testHD2Chieu(){
        ArrayList<Ve> danhSachVeDi = new ArrayList<>();
                String maChuyenBayDi = "CB01";
                String maHoaDon = "HD01";

                Ve v1 = new Ve();
                v1.setKyGui((short) 20);
                v1.setMaVe("V01");
                v1.setCmndNguoiBay("CMNDNgu");
                v1.setMaChuyenBay("CB01");
                v1.setMaHoaDon(maHoaDon);
                v1.setMaGhe("A01-CB01");
                v1.setEmailNguoiBay("emai1");
                v1.setTrangThaiDoi((byte) 0);
                v1.setTrangThaiVe((byte) 0);
                v1.setSdtKhachHang("");
                v1.setGia(0);
                v1.setTenNguoiBay("ten n");
                v1.setSdtNguoiBay("123");

                Ve v2 = new Ve();
                v2.setKyGui((short) 20);
                v2.setMaVe("V02");
                v2.setCmndNguoiBay("CMNDNgu");
                v2.setMaChuyenBay("CB01");
                v2.setMaHoaDon(maHoaDon);
                v2.setMaGhe("A02-CB01");
                v2.setEmailNguoiBay("emailNo");
                v2.setTrangThaiDoi((byte) 0);
                v2.setTrangThaiVe((byte) 0);
                v2.setSdtKhachHang("");
                v2.setGia(0);
                v2.setTenNguoiBay("ten ngu2");
                v2.setSdtNguoiBay("223");

                danhSachVeDi.add(v1);
                danhSachVeDi.add(v2);

                ArrayList<Ve> danhSachVeVe = new ArrayList<>();
                String maChuyenBayVe = "CB02";
                String maHoaDonVe = "HD02";

                Ve v3 = new Ve();
                v3.setKyGui((short) 20);
                v3.setMaVe("V03");
                v3.setCmndNguoiBay("CMNDNgu");
                v3.setMaChuyenBay(maChuyenBayVe);
                v3.setMaHoaDon(maHoaDonVe);
                v3.setMaGhe("A01-CB02");
                v3.setEmailNguoiBay("emai1");
                v3.setTrangThaiDoi((byte) 0);
                v3.setTrangThaiVe((byte) 0);
                v3.setSdtKhachHang("");
                v3.setGia(0);
                v3.setTenNguoiBay("ten n");
                v3.setSdtNguoiBay("123");

                Ve v4 = new Ve();
                v4.setKyGui((short) 20);
                v4.setMaVe("V04");
                v4.setCmndNguoiBay("CMNDNgu");
                v4.setMaChuyenBay(maChuyenBayVe);
                v4.setMaHoaDon(maHoaDonVe);
                v4.setMaGhe("A03-CB02");
                v4.setEmailNguoiBay("emailNo");
                v4.setTrangThaiDoi((byte) 0);
                v4.setTrangThaiVe((byte) 0);
                v4.setSdtKhachHang("");
                v4.setGia(0);
                v4.setTenNguoiBay("ten ngu2");
                v4.setSdtNguoiBay("223");

                danhSachVeVe.add(v3);
                danhSachVeVe.add(v4);

                new GiaoDienHoaDonHaiChieu(danhSachVeDi, danhSachVeVe).setVisible(true);
    }
    private void jButton_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DangNhapActionPerformed
        // TODO add your handling code here:
        new LoadData();
        int index = -1;
        for (TaiKhoan tk : Controller.arrayListTaiKhoan) {
            if (jTextField_TenDangNhap.getText().equals(tk.getTenDangNhap())) {
                index = Controller.arrayListTaiKhoan.indexOf(tk);
            }
        }
        if (index != -1) {
            jTextField_TenDangNhap.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
            if (jPasswordField_MatKhau.getText().equals(Controller.arrayListTaiKhoan.get(index).getMatKhau())) {
                controller.Controller.tk = Controller.arrayListTaiKhoan.get(index);
                jPasswordField_MatKhau.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
//                this.testHD1Chieu();
//                this.testHD2Chieu();
                new GiaoDienLichSuHoaDon().setVisible(true);

    
//                new GiaoDienTimChuyenBay().setVisible(true);

                this.dispose();
            } else {
                jLabel_BaoLoi.setText("*Sai mật khẩu");
                jPasswordField_MatKhau.setBorder(BorderFactory.createLineBorder(Color.red, 1));
            }
        } else {
            jLabel_BaoLoi.setText("*Tên đăng nhập không tồn tại");
            jTextField_TenDangNhap.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        }
    }//GEN-LAST:event_jButton_DangNhapActionPerformed

    private void jLabel_DangKyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DangKyMousePressed
        // TODO add your handling code here:
        new GiaoDienDangKyTaiKhoan().setVisible(true);
    }//GEN-LAST:event_jLabel_DangKyMousePressed

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
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GiaoDienDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DangNhap;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_BaoLoi;
    private javax.swing.JLabel jLabel_DangKy;
    private javax.swing.JLabel jLabel_DangNhap;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_MatKhau;
    private javax.swing.JLabel jLabel_TenDangNhap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_MatKhau;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_TenDangNhap;
    // End of variables declaration//GEN-END:variables
}
