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
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import model.NhanVien;
import model.TaiKhoan;

/*
*
 *
 * @author tuanbuiquoc
 */
public class GiaoDienThemNhanVien extends javax.swing.JFrame
        implements KeyListener {

    /**
     * Creates new form GiaoDienDangKyTaiKhoan
     */
    public GiaoDienThemNhanVien() {
        initComponents();
        new LoadData();
        jTextField_TaiKhoan.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                jLabel_ThongBao.setText("");
                jLabel_TaiKhoan.setForeground(Color.white);
                for (TaiKhoan tk : Controller.arrayListTaiKhoan) {
                    if (tk.getTenDangNhap().equals(jTextField_TaiKhoan.getText())) {
                        jLabel_ThongBao.setText("*Tài khoản đã tồn tại");
                        jLabel_TaiKhoan.setForeground(Color.yellow);
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
                for (int i = 0; i < cmnd.length(); i++) {
                    if (cmnd.charAt(i) < '0' || cmnd.charAt(i) > '9') {
                        jLabel_ThongBao.setText("*CMND phải nhập số");
                        jLabel_CMND.setForeground(Color.yellow);
                        break;
                    }
                }
            }
        });

        jTextField_SoDienThoai.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String sdt = jTextField_SoDienThoai.getText();
                jLabel_ThongBao.setText("");
                jLabel_SoDienThoai.setForeground(Color.white);

                if (sdt.length() != 10) {
                    jLabel_ThongBao.setText("*Số điện thoại 10 số");
                    jLabel_SoDienThoai.setForeground(Color.yellow);
                }
                for (int i = 0; i < sdt.length(); i++) {
                    if (sdt.charAt(i) < '0' || sdt.charAt(i) > '9') {
                        jLabel_ThongBao.setText("*Số điện thoại phải nhập số");
                        jLabel_SoDienThoai.setForeground(Color.yellow);
                        break;
                    }
                }
                for (NhanVien nv : Controller.arrayListNhanVien) {
                    if (nv.getSdtNhanVien().equals(jTextField_SoDienThoai.getText())) {
                        jLabel_ThongBao.setText("*Số điện thoại đã được sử dụng");
                        jLabel_SoDienThoai.setForeground(Color.yellow);
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
                    jLabel_XacNhanMatKhau.setForeground(Color.yellow);
                } else {
                    jLabel_ThongBao.setText("");
                    jLabel_XacNhanMatKhau.setForeground(Color.white);
                }
            }
        });

        jTextField_TaiKhoan.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                for (TaiKhoan tk : Controller.arrayListTaiKhoan) {
                    if (tk.getTenDangNhap().equals(jTextField_TaiKhoan.getText())) {
                        jLabel_ThongBao.setText("*Tài khoản đã được sử dụng");
                        jLabel_TaiKhoan.setForeground(Color.yellow);
                        break;
                    } else {
                        jLabel_ThongBao.setText("");
                        jLabel_TaiKhoan.setForeground(Color.WHITE);
                    }
                }
            }
        });

        jTextField_SoDienThoai.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Bạn có chắc muốn thoát chương trình không?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                } else {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
            }
        });
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        jButton_QuayLai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_ThemNhanVien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        jTextField_TenNhanVien = new javax.swing.JTextField();
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
        jButton_ThemNhanVien = new javax.swing.JButton();
        jLabel_ThongBao = new javax.swing.JLabel();
        jButton_QuayLai = new javax.swing.JButton();
        jComboBox_LoaiTaiKhoan = new javax.swing.JComboBox<>();
        jLabel_XacNhanMatKhau1 = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(89, 98, 117));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jlabel_DangKy.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jlabel_DangKy.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_DangKy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_DangKy.setText("Thêm nhân viên");
        jlabel_DangKy.setToolTipText("");

        jLabel_TenKhachHang.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_TenKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenKhachHang.setText("Tên Nhân Viên");

        jTextField_TenNhanVien.setPreferredSize(new java.awt.Dimension(7, 22));

        jLabel_TaiKhoan.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_TaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TaiKhoan.setText("Tài Khoản");

        jTextField_TaiKhoan.setPreferredSize(new java.awt.Dimension(7, 22));

        jLabel_MatKhau.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_MatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MatKhau.setText("Mật Khẩu");

        jTextField_MatKhau.setPreferredSize(new java.awt.Dimension(7, 22));

        jLabel_XacNhanMatKhau.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_XacNhanMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_XacNhanMatKhau.setText("Xác Nhận Mật Khẩu");

        jTextField_xacNhanMatKhau.setPreferredSize(new java.awt.Dimension(7, 22));

        jLabel_CMND.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_CMND.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CMND.setText("CMND");

        jTextField_CMND.setPreferredSize(new java.awt.Dimension(7, 22));

        jLabel_SoDienThoai.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_SoDienThoai.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SoDienThoai.setText("Số điện thoại");

        jTextField_SoDienThoai.setPreferredSize(new java.awt.Dimension(7, 22));
        jTextField_SoDienThoai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SoDienThoaiKeyReleased(evt);
            }
        });

        jLabel_DiaChi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_DiaChi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DiaChi.setText("Địa Chỉ");

        jTextField_DiaChi.setPreferredSize(new java.awt.Dimension(7, 22));

        jButton_ThemNhanVien.setBackground(new java.awt.Color(255, 77, 77));
        jButton_ThemNhanVien.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThemNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThemNhanVien.setText("Thêm Nhân Viên");
        jButton_ThemNhanVien.setBorderPainted(false);
        jButton_ThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemNhanVienActionPerformed(evt);
            }
        });

        jLabel_ThongBao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_ThongBao.setForeground(java.awt.Color.yellow);

        jButton_QuayLai.setBackground(new java.awt.Color(0, 102, 102));
        jButton_QuayLai.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_QuayLai.setForeground(new java.awt.Color(255, 255, 255));
        jButton_QuayLai.setText("Quay lại");
        jButton_QuayLai.setBorderPainted(false);
        jButton_QuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QuayLaiActionPerformed(evt);
            }
        });

        jComboBox_LoaiTaiKhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NhanVien", "QuanLy" }));
        jComboBox_LoaiTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_LoaiTaiKhoanActionPerformed(evt);
            }
        });

        jLabel_XacNhanMatKhau1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_XacNhanMatKhau1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_XacNhanMatKhau1.setText("Loại Tài Khoản");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlabel_DangKy)
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel_XacNhanMatKhau)
                                        .addGap(215, 215, 215))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel_TenKhachHang)
                                                .addComponent(jTextField_TenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel_TaiKhoan)
                                                .addComponent(jTextField_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel_MatKhau)
                                                .addComponent(jTextField_MatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jTextField_xacNhanMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                        .addGap(90, 90, 90)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_XacNhanMatKhau1)
                                    .addComponent(jLabel_DiaChi)
                                    .addComponent(jLabel_SoDienThoai)
                                    .addComponent(jTextField_CMND, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_CMND)
                                    .addComponent(jTextField_SoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_DiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox_LoaiTaiKhoan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(340, 340, 340))
                            .addComponent(jButton_ThemNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField_CMND, jTextField_MatKhau, jTextField_TaiKhoan, jTextField_TenNhanVien, jTextField_xacNhanMatKhau});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_DangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TenKhachHang)
                    .addComponent(jLabel_CMND))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_TenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jTextField_CMND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TaiKhoan)
                    .addComponent(jLabel_SoDienThoai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jTextField_SoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_MatKhau)
                    .addComponent(jLabel_DiaChi))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_XacNhanMatKhau)
                    .addComponent(jLabel_XacNhanMatKhau1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_xacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_LoaiTaiKhoan))
                .addGap(18, 18, 18)
                .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ThemNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_QuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QuayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoDienQuanLyNhanVien().setVisible(true);
    }//GEN-LAST:event_jButton_QuayLaiActionPerformed

    private void jButton_ThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemNhanVienActionPerformed
        // TODO add your handling code here:
        if (jTextField_CMND.getText().isEmpty() || jTextField_DiaChi.getText().isEmpty() || jTextField_MatKhau.getText().isEmpty()
                || jTextField_SoDienThoai.getText().isEmpty() || jTextField_TaiKhoan.getText().isEmpty() || jTextField_TenNhanVien.getText().isEmpty()
                || jTextField_xacNhanMatKhau.getText().isEmpty()) {
            jLabel_ThongBao.setText("*Không bỏ trống thông tin.");
        } else {
            jLabel_ThongBao.setText("");
        }
        if (jLabel_ThongBao.getText().isEmpty()) {
            TaiKhoan tk = new TaiKhoan(
                    jTextField_TaiKhoan.getText(),
                    jTextField_MatKhau.getText(),
                    jComboBox_LoaiTaiKhoan.getSelectedItem().toString(),
                    jTextField_SoDienThoai.getText());
            Controller.arrayListTaiKhoan.add(tk);

            NhanVien nv = new NhanVien(
                    jTextField_SoDienThoai.getText(),
                    jTextField_TenNhanVien.getText(),
                    jTextField_DiaChi.getText(),
                    jTextField_TaiKhoan.getText(),
                    jTextField_CMND.getText()
            );
            Controller.arrayListNhanVien.add(nv);
            InsertData.insertTaiKhoan(tk);
            if (InsertData.insertNhanVien(nv)) {
                JOptionPane.showMessageDialog(rootPane, "Thêm nhân viên thành công");
                this.dispose();
                new GiaoDienQuanLyNhanVien().setVisible(true);
            }      
        }
    }//GEN-LAST:event_jButton_ThemNhanVienActionPerformed

    private void jTextField_SoDienThoaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SoDienThoaiKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_SoDienThoaiKeyReleased

    private void jComboBox_LoaiTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_LoaiTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_LoaiTaiKhoanActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienThemNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_QuayLai;
    private javax.swing.JButton jButton_ThemNhanVien;
    private javax.swing.JComboBox<String> jComboBox_LoaiTaiKhoan;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_CMND;
    private javax.swing.JLabel jLabel_DiaChi;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_MatKhau;
    private javax.swing.JLabel jLabel_SoDienThoai;
    private javax.swing.JLabel jLabel_TaiKhoan;
    private javax.swing.JLabel jLabel_TenKhachHang;
    private javax.swing.JLabel jLabel_ThongBao;
    private javax.swing.JLabel jLabel_XacNhanMatKhau;
    private javax.swing.JLabel jLabel_XacNhanMatKhau1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_CMND;
    private javax.swing.JTextField jTextField_DiaChi;
    private javax.swing.JTextField jTextField_MatKhau;
    private javax.swing.JTextField jTextField_SoDienThoai;
    private javax.swing.JTextField jTextField_TaiKhoan;
    private javax.swing.JTextField jTextField_TenNhanVien;
    private javax.swing.JTextField jTextField_xacNhanMatKhau;
    private javax.swing.JLabel jlabel_DangKy;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
