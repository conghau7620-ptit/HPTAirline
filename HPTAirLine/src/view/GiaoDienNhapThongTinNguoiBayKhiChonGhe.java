/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.DataConnection;
import java.awt.Color;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MY PC
 */
public class GiaoDienNhapThongTinNguoiBayKhiChonGhe extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienNhapThongTinNguoiBayKhiChonGhe
     */

    public GiaoDienNhapThongTinNguoiBayKhiChonGhe() {
        
        initComponents();
        jPanel7.setVisible(false);
    }
    
    private String maGhe = "";
    private String maChuyenBay = "";
    int soGheNguoiLon;
    int soGheTreEm;
    String luaChon = "nguoiLon";
     public GiaoDienNhapThongTinNguoiBayKhiChonGhe(  String maGhe,String maChuyenBay, int soGheNguoiLon, int soGheTreEm ) {
        initComponents(); 
    this.maGhe = maGhe;
    this.maChuyenBay= maChuyenBay;   
    this.soGheNguoiLon = soGheNguoiLon;
    this.soGheTreEm = soGheTreEm;
//    this.khuHoi = khuHoi;
     jPanel7.setVisible(false);
    //
    
    System.out.println("so tre em" + this.soGheTreEm);
    System.out.println("so nguoi lon" + this.soGheNguoiLon);
    if(this.soGheNguoiLon != 0 ){ 
      
    }
    else {
       //  jbutton_NguoiLon.setEnabled(false);
       
       //
         jTextField_TenNguoiBay.setEditable(false);
         jTextField_TenNguoiBay.setBackground(Color.lightGray);
         jTextField_CMND.setEditable(false);
         jTextField_CMND.setBackground(Color.lightGray);
         jTextField_NgaySinhNguoiLon.setEditable(false);
         jTextField_NgaySinhNguoiLon.setBackground(Color.lightGray);
       
         
     }
    if (this.soGheTreEm != 0 ){  //  biến treEm tạm thời để test code, sau khi them đầy đủ cơ sở dữ liệu sẽ đổi thành biến soGheTreEm
        jbutton_TreEm.setEnabled(true);
    }
    else jbutton_TreEm.setEnabled(false);
    
   
    }
     
     
  


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
      public int xacDinhNutDuocBam (JButton button){
       int nut = 0;
       
       if(button.getName().equals("Huy"))
       { 
        return nut = 0;
       }
       else 
        return nut = 1;
       
       
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jbutton_NguoiLon = new javax.swing.JButton();
        jbutton_TreEm = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_TenNguoiBay = new javax.swing.JTextField();
        jTextField_CMND = new javax.swing.JTextField();
        jTextField_NgaySinhNguoiLon = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_TenTreEm = new javax.swing.JTextField();
        jTextField_NgaySinhTreEm = new javax.swing.JTextField();
        jButton_Huy = new javax.swing.JButton();
        jButton_XacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(89, 98, 117));

        jPanel2.setBackground(new java.awt.Color(48, 57, 82));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Thông tin hành khách");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(89, 98, 117));
        jPanel5.setPreferredSize(new java.awt.Dimension(1172, 648));

        jPanel8.setBackground(new java.awt.Color(89, 98, 117));

        jbutton_NguoiLon.setText("Người lớn");
        jbutton_NguoiLon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_NguoiLonActionPerformed(evt);
            }
        });

        jbutton_TreEm.setText("Trẻ em");
        jbutton_TreEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_TreEmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbutton_NguoiLon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jbutton_TreEm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton_NguoiLon)
                    .addComponent(jbutton_TreEm))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(89, 98, 117));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Thông tin cá nhân của quý khách sẽ được kiểm tra vào lúc làm");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText(" thủ tục check-in, để đảm bảo an toàn cho chuyến bay. Quý ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText(" khách vui lòng kiểm tra kĩ thông tin trước khi xác nhận để tránh ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("rắc rối phát sinh khi làm thủ tục bay.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(499, 499, 499))
        );

        jPanel6.setBackground(new java.awt.Color(89, 98, 117));
        jPanel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Họ và tên:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("CMND/Hộ chiếu:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Ngày sinh: ");

        jTextField_TenNguoiBay.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTextField_CMND.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTextField_NgaySinhNguoiLon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(80, 80, 80)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField_NgaySinhNguoiLon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addComponent(jTextField_CMND, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_TenNguoiBay, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_TenNguoiBay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_NgaySinhNguoiLon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(89, 98, 117));
        jPanel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(644, 446));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Họ và tên:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Ngày sinh:");
        jLabel13.setMaximumSize(null);

        jTextField_TenTreEm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTextField_NgaySinhTreEm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField_NgaySinhTreEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NgaySinhTreEmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_NgaySinhTreEm, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addComponent(jTextField_TenTreEm, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_TenTreEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NgaySinhTreEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(327, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(528, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(76, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(254, Short.MAX_VALUE)))
        );

        jButton_Huy.setText("Hủy");
        jButton_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HuyActionPerformed(evt);
            }
        });

        jButton_XacNhan.setText("Xác nhận");
        jButton_XacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_XacNhanMouseClicked(evt);
            }
        });
        jButton_XacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(jButton_XacNhan)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Huy)
                    .addComponent(jButton_XacNhan))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jButton_Huy.setName("Huy");
        jButton_XacNhan.setName("XacNhan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton_NguoiLonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_NguoiLonActionPerformed
        // TODO add your handling code here:
        jPanel6.setVisible(true);
        luaChon = "nguoiLon";
        
    }//GEN-LAST:event_jbutton_NguoiLonActionPerformed

    private void jbutton_TreEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_TreEmActionPerformed
        // TODO add your handling code here:
        jPanel7.setVisible(true);
        jPanel6.setVisible(false);
        luaChon= "treEm";
    }//GEN-LAST:event_jbutton_TreEmActionPerformed

    private void jTextField_NgaySinhTreEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NgaySinhTreEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NgaySinhTreEmActionPerformed

    private void jButton_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HuyActionPerformed
        // TODO add your handling code here:
        
        xacDinhNutDuocBam(jButton_Huy);
//        new GiaoDienChonGhe(xacDinhNutDuocBam(jButton_Huy),ve);
        
         new GiaoDienChonGhe().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton_HuyActionPerformed

    private void jButton_XacNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_XacNhanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_XacNhanMouseClicked
private String xuLiMaVe(){
    String maVe = "V01";
    
    // fix loi dem lại ma ve, ma ve luon bat dau tu v01
    if (GiaoDienChonGhe.ve){
    for (int k = 0 ; k <= GiaoDienChonGhe.dsVeDi.size(); k++){
         //System.out.println(GiaoDienChonGhe.dsVeDi.size());
         //System.out.println(k);
        if (k <= 9){
            maVe= "V0"+(k+1);
        }
        else maVe= "V" + (k+1);
    }
    }
    else {
        for (int k = 0 ; k <= GiaoDienChonGhe.dsVeVe.size(); k++){
         //System.out.println(GiaoDienChonGhe.dsVeDi.size());
         //System.out.println(k);
        if (k <= 9){
            maVe= "V0"+(k+1);
        }
        else maVe= "V" + (k+1);
    }
    }
    
    
    return maVe;
}
    private void jButton_XacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XacNhanActionPerformed
        // TODO add your handling code here:
             
                String maVe = xuLiMaVe();
             
                String SDTkhach = "*********"; // laays tu sql

//<<<<<<< HEAD

                String maChuyenBay = GiaoDienChonGhe.maChuyenBay.trim();
                String maGhe = this.maGhe.trim();


//=======
//                String maChuyenBay = GiaoDienChonGhe.maChuyenBay;
//                String maGhe = this.maGhe;
//              
//>>>>>>> ce8654511108a8c54e9202b26cd416fa354c6a36
                // nguoi lon
                String CMND = jTextField_CMND.getText();
                String ten = jTextField_TenNguoiBay.getText();
                System.out.println("+"+ten+"+");
                String ngaySinhNguoiLon = jTextField_NgaySinhNguoiLon.getText();
                
                
                // tre em
                String tenTre = jTextField_TenTreEm.getText();
                String ngaySinhTreEm = jTextField_NgaySinhTreEm.getText();
                
                
               
                
                // lấy mã hóa đươn
                
                String sql = "select * from HOADON";
                connection.DataConnection.createStatement();
               
                int soHoaDon =1;
                try {
            PreparedStatement ps = DataConnection.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                soHoaDon++; 
            }
                    System.out.println(soHoaDon);
        } catch (Exception e) {
        }
                
                 String maHoaDon = ""; // so sanh roi lay tu sql
                 if(soHoaDon <= 9) maHoaDon= "HD0"+ soHoaDon;
                 else maHoaDon = "HD" + soHoaDon;
                 
                int gia = 0;
               short kiGui = 0;
                model.Ve ve = null;
                
                
                
                 String regexCMND = "\\d{9}";
               //  String regexEmail=  "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";// "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
                 String regexBirth = "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                
                if (ten.equals("") && tenTre.equals("")) JOptionPane.showMessageDialog(this, "Họ và tên không được bỏ trống.");
                else if (!ten.equals("") && CMND.equals("")) JOptionPane.showMessageDialog(this, "CMND/Hộ chiếu không được để trống");
                else if (!ten.equals("") && !CMND.matches(regexCMND)) JOptionPane.showMessageDialog(this, "vui lòng nhập đúng số CMND/Hộ chiếu");
                
                else if(ngaySinhNguoiLon.equals("") && ngaySinhTreEm.equals("")) JOptionPane.showMessageDialog(this, "Ngày sinh không được bỏ trống.");
                else if (!tenTre.equals("") && ngaySinhTreEm.equals("")) JOptionPane.showMessageDialog(this, "Ngày sinh không đượpc bỏ trống");
                else if (!tenTre.equals("") && !ngaySinhTreEm.matches(regexBirth)) JOptionPane.showMessageDialog(this, "vui lòng nhập đúng ngày tháng năm sinh");
                else if (!ten.equals("") && ngaySinhNguoiLon.equals("")) JOptionPane.showMessageDialog(this, "Ngày sinh không đượpc bỏ trống");
                else if (!ten.equals("") &&  !ngaySinhNguoiLon.matches(regexBirth)) JOptionPane.showMessageDialog(this, "vui lòng nhập đúng ngày tháng năm sinh");
                else {
                
                
                
               // if(ten.equals("")) { // chỗ này là khi tên ng lớn rỗng thì lấy thông tin của trẻ em
                 if (luaChon == "treEm"){
                     ve = new model.Ve();
                   ve.setMaVe(maVe);
                    ve.setMaChuyenBay(maChuyenBay);
                    ve.setMaHoaDon(maHoaDon);
                    ve.setGia(gia);
                    ve.setTenNguoiBay(tenTre);
                    ve.setMaChuyenBay(maChuyenBay);
                    ve.setMaGhe(maGhe);
                    System.out.println("tre em");
                  
                    if (!GiaoDienChonGhe.ve && !GiaoDienChonGhe.di){
                        GiaoDienChonGhe.soGheTreEmVe--;
                        
                    }
                    else if(GiaoDienChonGhe.di){
                        GiaoDienChonGhe.soGheTreEmDi--;
                        
                    }
                }
                else if (luaChon == "nguoiLon") { // ngược lại một lúc chỉ lấy thông tin của ng  lớn or trẻ em thôi chứ k lấy hết
                  // ve = new model.Ve(maVe, maChuyenBay, gia, 0, CMND, ten, maHoaDon, maGhe);
                  ve = new model.Ve(maVe, maChuyenBay, gia, kiGui, CMND, ten, maHoaDon, maGhe);
                    System.out.println("nguoi lon");
                    
                    if (!GiaoDienChonGhe.ve && !GiaoDienChonGhe.di){
                        GiaoDienChonGhe.soGheNguoiLonVe--;
                       
                    }
                    else if (GiaoDienChonGhe.di){
                        GiaoDienChonGhe.soGheNguoiLonDi--;
                        
                    }
                }
                
                    

                                   
                     
                if (!GiaoDienChonGhe.ve && !GiaoDienChonGhe.di) {
                    GiaoDienChonGhe.dsVeVe.add(ve);
                    System.out.println(" them ve vao ds ve ve");
                                   
                }
                else if (GiaoDienChonGhe.di){
                    GiaoDienChonGhe.dsVeDi.add(ve);
                    System.out.println(" them ve vao ds ve di");
                    
                }
                else {
                    System.out.println("khong nhan duoc ds ve");
                }
 //               xacDinhNutDuocBam(jButton_XacNhan);
                new GiaoDienChonGhe().setVisible(true);
                this.dispose();
                
                
                }
    }//GEN-LAST:event_jButton_XacNhanActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienNhapThongTinNguoiBayKhiChonGhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhapThongTinNguoiBayKhiChonGhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhapThongTinNguoiBayKhiChonGhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienNhapThongTinNguoiBayKhiChonGhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienNhapThongTinNguoiBayKhiChonGhe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Huy;
    private javax.swing.JButton jButton_XacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField_CMND;
    private javax.swing.JTextField jTextField_NgaySinhNguoiLon;
    private javax.swing.JTextField jTextField_NgaySinhTreEm;
    private javax.swing.JTextField jTextField_TenNguoiBay;
    private javax.swing.JTextField jTextField_TenTreEm;
    private javax.swing.JButton jbutton_NguoiLon;
    private javax.swing.JButton jbutton_TreEm;
    // End of variables declaration//GEN-END:variables
}
