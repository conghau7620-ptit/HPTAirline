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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.Normalizer;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
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
    
    boolean checkTaiKhoan = false;
    boolean checkSDT = false;
    boolean checkCMND = false;
    boolean checkXacNhanMatKhau = false;
    
    String removeAccent(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("");
    }
    
    void thongBao(javax.swing.JLabel lb, String message) {
        lb.setForeground(Color.yellow);
        jLabel_ThongBao.setText(message);
    }
    
    void huyThongBao(javax.swing.JLabel lb) {
        lb.setForeground(Color.white);
        jLabel_ThongBao.setText("");
    }
    
    public GiaoDienDangKyTaiKhoan() {
        initComponents();
        new LoadData();
        jButton_DangKy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_QuayLai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        jTextField_TaiKhoan.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String taiKhoan = jTextField_TaiKhoan.getText();
                
                    
                for (TaiKhoan tk : Controller.arrayListTaiKhoan) {
                        if(tk.getTenDangNhap().equals(taiKhoan)) {
                              thongBao(jLabel_TaiKhoan,"*Tài khoản đã tồn tại");
                            checkTaiKhoan = false;
                            return;
                        }
                }
                   
                huyThongBao(jLabel_TaiKhoan);
                checkTaiKhoan = true;
            }
        });
                
        jTextField_CMND.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                 String cmnd = removeAccent(jTextField_CMND.getText().trim());
                 
                 for (int i=0; i<cmnd.length(); i++) {
                     if (!Character.isDigit(cmnd.charAt(i))) {
                         thongBao(jLabel_CMND, "*CMND phải nhập số");
                         checkCMND=false;
                         return;
                     }
                 }
                 
                  huyThongBao(jLabel_CMND);
                  checkCMND = true;
            }
        });
        
        jTextField_SoDienThoai.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                 String sdt = removeAccent(jTextField_SoDienThoai.getText().trim());
                 
                 for (int i=0; i<sdt.length(); i++) {
                     if (!Character.isDigit(sdt.charAt(i))) {
                         thongBao(jLabel_SoDienThoai,"*Số điện thoại phải nhập số");
                         checkSDT = false;
                         return;
                     }
                 }
                 
                 if (sdt.length()!=10) {
                     thongBao(jLabel_SoDienThoai,"*Số điện thoại không hợp lệ");
                     checkSDT = false;
                     return;
                 }
                 
                 for (KhachHang kh: Controller.arrayListKhachHang) {
                     if (kh.getSdtKhachHang().equals(sdt)) {
                         thongBao(jLabel_SoDienThoai,"*Số điện thoại đã được sử dụng");
                         checkSDT = false;
                         return;
                     }
                 }
                 
                 huyThongBao(jLabel_SoDienThoai);
                 checkSDT = true;
            }
        }); 
        
        jTextField_xacNhanMatKhau.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (!jTextField_MatKhau.getText().equals(jTextField_xacNhanMatKhau.getText())) {
                    thongBao(jLabel_XacNhanMatKhau,"*Xác nhận mật khẩu không trùng khớp với mật khẩu");
                    checkXacNhanMatKhau = false;
                    return;
                }
                
                huyThongBao(jLabel_XacNhanMatKhau);
                checkXacNhanMatKhau = true;
                
            }
        });
        
        jButton_DangKy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextField_TenKhachHang.getText().trim().isEmpty()) {
                    thongBao(jLabel_TenKhachHang,"*Tên khách hàng chưa được điền");
                    return;
                }
                else {
                    huyThongBao(jLabel_TenKhachHang);
                }
                
                if (jTextField_CMND.getText().trim().isEmpty()) {
                    thongBao(jLabel_CMND,"*CMND chưa được điền");
                    return;
               }
                else {
                    huyThongBao(jLabel_CMND);
                }
                if (!checkCMND) {
                    thongBao(jLabel_CMND,"*CMND phải nhập số");
                    return;
                }
                
                if (jTextField_TaiKhoan.getText().trim().isEmpty()) {
                    thongBao(jLabel_TaiKhoan,"*Tài khoản chưa được điền");
                    return;
                }
                else {
                    huyThongBao(jLabel_TaiKhoan);
                }
                if (!checkTaiKhoan) {
                    thongBao(jLabel_TaiKhoan,"*Tài khoản đã tồn tại");
                    return;
                }
                
                if (jTextField_SoDienThoai.getText().trim().isEmpty()) {
                    thongBao(jLabel_SoDienThoai,"*Số điện thoại chưa được điền");
                    return;
                }
                else {
                    huyThongBao(jLabel_SoDienThoai);
                }
                if (!checkSDT) {
                    String sdt = removeAccent(jTextField_SoDienThoai.getText().trim());
                 
                    for (int i=0; i<sdt.length(); i++) {
                        if (!Character.isDigit(sdt.charAt(i))) {
                            thongBao(jLabel_SoDienThoai,"*Số điện thoại phải nhập số");
                            return;
                        }
                    }
                    
                    if (sdt.length()!=10) {
                        thongBao(jLabel_SoDienThoai,"*Số điện thoại không hợp lệ");
                        return;
                    }
                 
                    thongBao(jLabel_SoDienThoai,"*Số điện thoại đã được sử dụng để đăng ký");
                    return;
                }
                
                if (jTextField_MatKhau.getText().trim().isEmpty()) {
                    thongBao(jLabel_MatKhau,"*Mật khẩu chưa được điền");
                    return;
                }
                else {
                    huyThongBao(jLabel_MatKhau);
                }
                
                if (jTextField_xacNhanMatKhau.getText().trim().isEmpty()) {
                    thongBao(jLabel_XacNhanMatKhau,"*Xác nhận mật khẩu chưa được điền");
                    return;
                }
                else {
                    huyThongBao(jLabel_XacNhanMatKhau);
                } 
                if (!checkXacNhanMatKhau) {
                    thongBao(jLabel_XacNhanMatKhau,"*Xác nhận mật khẩu không trùng khớp với mật khẩu");
                    return;
                }
                
                
                    TaiKhoan tk = new TaiKhoan(
                                    jTextField_TaiKhoan.getText(),
                                    jTextField_MatKhau.getText(),
                                    "KhachHang",
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
                    
                    JOptionPane.showMessageDialog(rootPane, "Đăng ký thành công");
                    
                    dispose();
//                    new GiaoDienDangNhap().setVisible(true);
                    
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
        jButton_QuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng ký tài khoản");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jButton_DangKy.setBackground(new java.awt.Color(255, 77, 77));
        jButton_DangKy.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton_DangKy.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DangKy.setText("ĐĂNG KÝ");
        jButton_DangKy.setBorderPainted(false);

        jLabel_ThongBao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_ThongBao.setForeground(new java.awt.Color(255, 255, 0));

        jButton_QuayLai.setBackground(new java.awt.Color(0, 102, 102));
        jButton_QuayLai.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton_QuayLai.setForeground(new java.awt.Color(255, 255, 255));
        jButton_QuayLai.setText("Quay lại");
        jButton_QuayLai.setBorderPainted(false);
        jButton_QuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlabel_DangKy)
                        .addGap(215, 215, 215))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
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
                                .addComponent(jTextField_CMND, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_CMND)
                                .addComponent(jTextField_SoDienThoai)
                                .addComponent(jTextField_DiaChi)
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField_CMND, jTextField_MatKhau, jTextField_TaiKhoan, jTextField_TenKhachHang, jTextField_xacNhanMatKhau});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlabel_DangKy)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TenKhachHang)
                    .addComponent(jLabel_CMND))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_TenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_xacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_DangKy))
                .addGap(97, 97, 97))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_DangKy, jButton_QuayLai});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField_CMND, jTextField_DiaChi, jTextField_Email, jTextField_MatKhau, jTextField_SoDienThoai, jTextField_TaiKhoan, jTextField_TenKhachHang, jTextField_xacNhanMatKhau});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_QuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QuayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
//        new GiaoDienDangNhap().setVisible(true);
    }//GEN-LAST:event_jButton_QuayLaiActionPerformed

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
                GiaoDienDangKyTaiKhoan gd = new GiaoDienDangKyTaiKhoan();
                gd.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DangKy;
    private javax.swing.JButton jButton_QuayLai;
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
