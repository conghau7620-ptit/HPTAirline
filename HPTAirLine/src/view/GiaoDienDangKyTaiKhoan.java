/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.InsertData;
import connection.LoadData;
import controller.Controller;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import model.KhachHang;
import model.TaiKhoan;

/*
*
 *
 * @author conghau
 */

public class GiaoDienDangKyTaiKhoan extends javax.swing.JFrame
                implements KeyListener{
    
    /**
     * Creates new form GiaoDienDangKyTaiKhoan
     */
    public GiaoDienDangKyTaiKhoan() {
        initComponents();
        new LoadData();
        jTextField_TaiKhoan.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                jLabel_ThongBao.setText("");
                jLabel_TaiKhoan.setForeground(Color.white);
                for (TaiKhoan tk : Controller.arrayListTaiKhoan) {
                    if(tk.getTenDangNhap().equals(jTextField_TaiKhoan.getText())) {
                        jLabel_ThongBao.setText("*Tai khoan da ton tai");
                        jLabel_TaiKhoan.setForeground(Color.red);
                        break;
                    }
                }
            }
        });
                
        jTextField_CMND.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                 String cmnd = jTextField_CMND.getText();
                 jLabel_ThongBao.setText("");
                 jLabel_CMND.setForeground(Color.white);
                 jTextField_CMND.setForeground(Color.black);
                 for (int i=0; i<cmnd.length(); i++) {
                     if (cmnd.charAt(i)<'0' || cmnd.charAt(i)>'9') {
                         jLabel_ThongBao.setText("*CMND phải nhập số");
                         jLabel_CMND.setForeground(Color.red);
                         jTextField_CMND.setForeground(Color.red);
                         break;
                     }
                 }
            }
        });
        
        jTextField_SoDienThoai.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                 String cmnd = jTextField_SoDienThoai.getText();
                 jLabel_ThongBao.setText("");
                 jLabel_SoDienThoai.setForeground(Color.white);
                 jTextField_SoDienThoai.setForeground(Color.black);
                 for (int i=0; i<cmnd.length(); i++) {
                     if (cmnd.charAt(i)<'0' || cmnd.charAt(i)>'9') {
                         jLabel_ThongBao.setText("*Số điện thoại phải nhập số");
                         jLabel_SoDienThoai.setForeground(Color.red);
                         jTextField_SoDienThoai.setForeground(Color.red);
                         break;
                     }
                 }
            }
        }); 
        
        jTextField_xacNhanMatKhau.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (!jTextField_MatKhau.getText().equals(jTextField_xacNhanMatKhau.getText())) {
                    jLabel_ThongBao.setText("*Mật khẩu không trùng khớp");
                    jLabel_XacNhanMatKhau.setForeground(Color.red);
                }
                else {
                    jLabel_ThongBao.setText("");
                    jLabel_XacNhanMatKhau.setForeground(Color.white);
                }
            }
        });
        
        jTextField_TaiKhoan.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                for (TaiKhoan tk : Controller.arrayListTaiKhoan) {
                    if (tk.getTenDangNhap().equals(jTextField_TaiKhoan.getText())) {
                        jLabel_ThongBao.setText("*Tài khoản đã được sử dụng");
                        jLabel_TaiKhoan.setForeground(Color.red);
                        break;
                    }
                    else {
                        jLabel_ThongBao.setText("");
                        jLabel_TaiKhoan.setForeground(Color.WHITE);
                    }
                }
            }
        });
        
        jTextField_SoDienThoai.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                for (KhachHang kh: Controller.arrayListKhachHang) {
                    if (kh.getSdtKhachHang().equals(jTextField_SoDienThoai.getText())) {
                        jLabel_ThongBao.setText("*Số điện thoại đã được sử dụng");
                        jLabel_SoDienThoai.setForeground(Color.red);
                        break;
                    }
                    else {
                        jLabel_ThongBao.setText("");
                        jLabel_SoDienThoai.setForeground(Color.WHITE);
                    }
                }
            }
        });
        
        jButton_DangKy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jLabel_ThongBao.getText().isEmpty()) {
                    TaiKhoan tk = new TaiKhoan(
                                    jTextField_TaiKhoan.getText(),
                                    jTextField_MatKhau.getText(),
                                    "Khach hang",
                                    jTextField_SoDienThoai.getText());
                    Controller.arrayListTaiKhoan.add(tk);
                    InsertData.insertTaiKhoan(tk);
                    
                    KhachHang kh = new KhachHang(
                                    jTextField_SoDienThoai.getText(),
                                    jTextField_TenKhachHang.getText(),
                                    jTextField_Email.getText(),
                                    jTextField_DiaChi.getText(),
                                    jTextField_TaiKhoan.getText(),
                                    jTextField_CMND.getText(),
                                    0);
                    Controller.arrayListKhachHang.add(kh);
                    InsertData.insertKhachHang(kh);
          
                    
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
        jlabel_DangKy = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_TenKhachHang = new javax.swing.JLabel();
        jTextField_TenKhachHang = new javax.swing.JTextField();
        jLabel_TaiKhoan = new javax.swing.JLabel();
        jTextField_TaiKhoan = new javax.swing.JTextField();
        jLabel_MatKhau = new javax.swing.JLabel();
        jTextField_MatKhau = new javax.swing.JTextField();
        jLabel_XacNhanMatKhau = new javax.swing.JLabel();
        jTextField_xacNhanMatKhau = new javax.swing.JTextField();
        jLabel_CMND = new javax.swing.JLabel();
        jTextField_CMND = new javax.swing.JTextField();
        jLabel_SoDienThoai = new javax.swing.JLabel();
        jTextField_SoDienThoai = new javax.swing.JTextField();
        jLabel_DiaChi = new javax.swing.JLabel();
        jTextField_DiaChi = new javax.swing.JTextField();
        jLabel_Email = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jButton_DangKy = new javax.swing.JButton();
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
                .addContainerGap(409, Short.MAX_VALUE))
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

        jlabel_DangKy.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlabel_DangKy.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_DangKy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_DangKy.setText("Đăng Ký Tài Khoản");
        jlabel_DangKy.setToolTipText("");

        jLabel_TenKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_TenKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenKhachHang.setText("Tên Khách Hàng");

        jLabel_TaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_TaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TaiKhoan.setText("Tài Khoản");

        jLabel_MatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_MatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MatKhau.setText("Mật Khẩu");

        jLabel_XacNhanMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_XacNhanMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_XacNhanMatKhau.setText("Xác Nhận Mật Khẩu");

        jLabel_CMND.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_CMND.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CMND.setText("CMND");

        jLabel_SoDienThoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_SoDienThoai.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SoDienThoai.setText("Số điện thoại");

        jLabel_DiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DiaChi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DiaChi.setText("Địa Chỉ");

        jLabel_Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("Email");

        jButton_DangKy.setText("ĐĂNG KÝ");

        jLabel_ThongBao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_ThongBao.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_TenKhachHang)
                            .addComponent(jTextField_TenKhachHang)
                            .addComponent(jLabel_TaiKhoan)
                            .addComponent(jTextField_TaiKhoan)
                            .addComponent(jLabel_MatKhau)
                            .addComponent(jTextField_MatKhau)
                            .addComponent(jLabel_XacNhanMatKhau)
                            .addComponent(jTextField_xacNhanMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Email)
                            .addComponent(jLabel_DiaChi)
                            .addComponent(jLabel_SoDienThoai)
                            .addComponent(jTextField_CMND)
                            .addComponent(jLabel_CMND)
                            .addComponent(jTextField_SoDienThoai)
                            .addComponent(jTextField_DiaChi)
                            .addComponent(jTextField_Email))))
                .addGap(95, 95, 95))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel_DangKy)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButton_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField_CMND, jTextField_MatKhau, jTextField_TaiKhoan, jTextField_TenKhachHang, jTextField_xacNhanMatKhau});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_DangKy)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TenKhachHang)
                    .addComponent(jLabel_CMND))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_TenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TaiKhoan)
                    .addComponent(jLabel_SoDienThoai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_MatKhau)
                    .addComponent(jLabel_DiaChi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_XacNhanMatKhau)
                    .addComponent(jLabel_Email))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_xacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButton_DangKy)
                .addGap(18, 18, 18)
                .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField_CMND, jTextField_TenKhachHang});

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
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GiaoDienDangKyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangKyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangKyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangKyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienDangKyTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DangKy;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_CMND;
    private javax.swing.JLabel jLabel_DiaChi;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_MatKhau;
    private javax.swing.JLabel jLabel_SoDienThoai;
    private javax.swing.JLabel jLabel_TaiKhoan;
    private javax.swing.JLabel jLabel_TenKhachHang;
    private javax.swing.JLabel jLabel_ThongBao;
    private javax.swing.JLabel jLabel_XacNhanMatKhau;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_CMND;
    private javax.swing.JTextField jTextField_DiaChi;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_MatKhau;
    private javax.swing.JTextField jTextField_SoDienThoai;
    private javax.swing.JTextField jTextField_TaiKhoan;
    private javax.swing.JTextField jTextField_TenKhachHang;
    private javax.swing.JTextField jTextField_xacNhanMatKhau;
    private javax.swing.JLabel jlabel_DangKy;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
