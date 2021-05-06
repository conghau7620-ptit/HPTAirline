/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.LoadData;
import connection.UpdateData;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.NhanVien;
import model.TaiKhoan;

/**
 *
 * @author t0168
 */

//Tạm hoàn thành giao diện thông tin nhân viên, và xử lý sửa thông tin, đổi mật khẩu, chưa kiểm tra  input

public class GiaoDienThongTinNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form ThongTinNhanVien
     */
    String tenNhanVien;
    String phanQuyen;
    public GiaoDienThongTinNhanVien() {
        initComponents();
        //// Phần thông tin cơ bản , đăng xuất
        new LoadData();
        for (NhanVien nv : controller.Controller.arrayListNhanVien) {
            if (nv.getSdtNhanVien().equals(controller.Controller.tk.getSdt())) {
                this.tenNhanVien = nv.getTenNhanVien();
                this.phanQuyen = controller.Controller.tk.getLoaiTaiKhoan();
                jTextField_TenNhanVien.setText(nv.getTenNhanVien());
                jTextField_TenDangNhap.setText(nv.getTenDangNhap());
                jTextField_SoDienThoai.setText(nv.getSdtNhanVien());
                jTextField_CMND.setText(nv.getCmnd());
                jTextField_DiaChi.setText(nv.getDiaChi());
            }
        }
                this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Bạn có chắc muốn thoát chương trình không?","Xác nhận",
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

        jPanel2 = new javax.swing.JPanel();
        jButton_XacNhanSuaThongTin = new javax.swing.JButton();
        jLabel_ThongTinNhanVien = new javax.swing.JLabel();
        jButton_ThoatGiaoDienThongTinNhanVien = new javax.swing.JButton();
        jLabel_TenNhanVien = new javax.swing.JLabel();
        jTextField_TenNhanVien = new javax.swing.JTextField();
        jLabel_SoDienThoai = new javax.swing.JLabel();
        jTextField_SoDienThoai = new javax.swing.JTextField();
        jLabel_CMND = new javax.swing.JLabel();
        jTextField_CMND = new javax.swing.JTextField();
        jLabel_DiaChi = new javax.swing.JLabel();
        jTextField_DiaChi = new javax.swing.JTextField();
        jLabel_TenDangNhap = new javax.swing.JLabel();
        jTextField_TenDangNhap = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_DoiMatKhau = new javax.swing.JButton();
        jLabel_MatKhau = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_IconMayBay = new javax.swing.JLabel();
        jLabel_HPT = new javax.swing.JLabel();
        jLabel_AirLines = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(89, 98, 117));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton_XacNhanSuaThongTin.setBackground(new java.awt.Color(255, 77, 77));
        jButton_XacNhanSuaThongTin.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_XacNhanSuaThongTin.setForeground(new java.awt.Color(255, 255, 255));
        jButton_XacNhanSuaThongTin.setText("Sửa thông tin");
        jButton_XacNhanSuaThongTin.setBorderPainted(false);
        jButton_XacNhanSuaThongTin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton_XacNhanSuaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XacNhanSuaThongTinActionPerformed(evt);
            }
        });

        jLabel_ThongTinNhanVien.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel_ThongTinNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ThongTinNhanVien.setText("Thông tin nhân viên");

        jButton_ThoatGiaoDienThongTinNhanVien.setBackground(new java.awt.Color(0, 102, 102));
        jButton_ThoatGiaoDienThongTinNhanVien.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThoatGiaoDienThongTinNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThoatGiaoDienThongTinNhanVien.setText("Quay lại");
        jButton_ThoatGiaoDienThongTinNhanVien.setBorderPainted(false);
        jButton_ThoatGiaoDienThongTinNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_ThoatGiaoDienThongTinNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThoatGiaoDienThongTinNhanVienActionPerformed(evt);
            }
        });

        jLabel_TenNhanVien.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_TenNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenNhanVien.setText("Tên nhân viên");

        jTextField_TenNhanVien.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel_SoDienThoai.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_SoDienThoai.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SoDienThoai.setText("Số điện thoại");

        jTextField_SoDienThoai.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_SoDienThoai.setEnabled(false);

        jLabel_CMND.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_CMND.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CMND.setText("CMND");

        jTextField_CMND.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel_DiaChi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_DiaChi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DiaChi.setText("Địa chỉ");

        jTextField_DiaChi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel_TenDangNhap.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_TenDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenDangNhap.setText("Tên đăng nhập");

        jTextField_TenDangNhap.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_TenDangNhap.setEnabled(false);

        jButton_DoiMatKhau.setBackground(new java.awt.Color(0, 153, 153));
        jButton_DoiMatKhau.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton_DoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DoiMatKhau.setText("Đổi mật khẩu");
        jButton_DoiMatKhau.setBorderPainted(false);
        jButton_DoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DoiMatKhauActionPerformed(evt);
            }
        });

        jLabel_MatKhau.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_MatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MatKhau.setText("Mật khẩu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_TenNhanVien)
                            .addComponent(jTextField_TenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_DoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_MatKhau)))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_TenDangNhap)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_TenDangNhap, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton_ThoatGiaoDienThongTinNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                .addComponent(jLabel_SoDienThoai, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_SoDienThoai, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_DiaChi)
                            .addComponent(jLabel_CMND)
                            .addComponent(jButton_XacNhanSuaThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jTextField_DiaChi)
                            .addComponent(jTextField_CMND)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 229, Short.MAX_VALUE)
                        .addComponent(jLabel_ThongTinNhanVien)
                        .addGap(249, 249, 249)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ThongTinNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_TenNhanVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_TenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_MatKhau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_DoiMatKhau)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_CMND)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_TenDangNhap)
                        .addGap(11, 11, 11)
                        .addComponent(jTextField_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_SoDienThoai)
                    .addComponent(jLabel_DiaChi))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ThoatGiaoDienThongTinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_XacNhanSuaThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

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
                .addContainerGap(360, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_XacNhanSuaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XacNhanSuaThongTinActionPerformed
        // TODO add your handling code here:
        int luaChon = JOptionPane.showConfirmDialog(this, "Xác nhân sửa thông tin cho nhân viên " + this.tenNhanVien, "Xác nhận sửa", JOptionPane.YES_NO_OPTION);

        if (luaChon == JOptionPane.YES_OPTION) {
            //gọi hàm sửa thông tin
            NhanVien nhanVien = new NhanVien(jTextField_SoDienThoai.getText(), jTextField_TenNhanVien.getText()
                , jTextField_DiaChi.getText(), jTextField_TenDangNhap.getText(), jTextField_CMND.getText());

            if (connection.UpdateData.updateNhanVien(nhanVien) == true) {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
            }
            else{
                JOptionPane.showMessageDialog(this, "Sửa không thành công");
            }

        }
    }//GEN-LAST:event_jButton_XacNhanSuaThongTinActionPerformed

    private void jButton_ThoatGiaoDienThongTinNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatGiaoDienThongTinNhanVienActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_ThoatGiaoDienThongTinNhanVienActionPerformed

    private void jButton_DoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DoiMatKhauActionPerformed
        // TODO add your handling code here:
//        String matKhauCu = JOptionPane.showInputDialog(rootPane, "Nhập mật khẩu cũ");
//        if(matKhauCu.equals(controller.Controller.tk.getMatKhau())){
//            String matKhaiMoi = JOptionPane.showInputDialog(rootPane, "Nhập mật khẩu mới");
//            TaiKhoan taiKhoan = new TaiKhoan(controller.Controller.tk.getTenDangNhap(), matKhaiMoi
//                , controller.Controller.tk.getLoaiTaiKhoan(), controller.Controller.tk.getSdt());
//            if(UpdateData.updateTaiKhoan(taiKhoan)==true){
//                JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thành công");
//            }
//            else{
//                JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thất bại");
//            }
//        }
//        else{
//            JOptionPane.showMessageDialog(rootPane, "Mật khẩu cũ không khớp");
//        }
        JTextField matKhauMoi = new JTextField();
        JTextField matKhauCu = new JPasswordField();
        Object[] message = {
            "Mật khẩu cũ:", matKhauCu,
            "Mật khẩu mới:", matKhauMoi
        };

        int luaChon = JOptionPane.showConfirmDialog(null, message, "Thay đổi mật khẩu", JOptionPane.OK_CANCEL_OPTION);
        if (luaChon == JOptionPane.OK_OPTION) {
            if (matKhauCu.getText().equals(controller.Controller.tk.getMatKhau())) {
                String matKhauMoi_String = matKhauMoi.getText();
                TaiKhoan taiKhoan = new TaiKhoan(controller.Controller.tk.getTenDangNhap(), matKhauMoi_String,
                        controller.Controller.tk.getLoaiTaiKhoan(), controller.Controller.tk.getSdt());
                if (UpdateData.updateTaiKhoan(taiKhoan) == true) {
                    JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thành công");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thất bại");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Mật khẩu cũ không khớp");
            }
        }
    }//GEN-LAST:event_jButton_DoiMatKhauActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienThongTinNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DoiMatKhau;
    private javax.swing.JButton jButton_ThoatGiaoDienThongTinNhanVien;
    private javax.swing.JButton jButton_XacNhanSuaThongTin;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_CMND;
    private javax.swing.JLabel jLabel_DiaChi;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_MatKhau;
    private javax.swing.JLabel jLabel_SoDienThoai;
    private javax.swing.JLabel jLabel_TenDangNhap;
    private javax.swing.JLabel jLabel_TenNhanVien;
    private javax.swing.JLabel jLabel_ThongTinNhanVien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_CMND;
    private javax.swing.JTextField jTextField_DiaChi;
    private javax.swing.JTextField jTextField_SoDienThoai;
    private javax.swing.JTextField jTextField_TenDangNhap;
    private javax.swing.JTextField jTextField_TenNhanVien;
    // End of variables declaration//GEN-END:variables
}
