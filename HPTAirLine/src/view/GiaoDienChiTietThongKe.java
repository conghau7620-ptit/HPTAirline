/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.LoadData;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.HoaDon;

/**
 *
 * @author tuanbuiquoc
 */
public class GiaoDienChiTietThongKe extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienChiTietThongKe
     */
    private String ngayCanXem = "";
    DefaultTableModel dtmHoaDon = null;
    private String sdtKhachHang = ""; 
    private String sdtNhanVien = "";

    public GiaoDienChiTietThongKe(String ngayCanXem) {
        initComponents();
        this.ngayCanXem = ngayCanXem;
        this.dtmHoaDon = (DefaultTableModel) jTable_HoaDon.getModel();
        this.dtmHoaDon.setColumnIdentifiers(new Object[]{
            "MaHoaDon", "SDTKhachHang", "NgayXuatHoaDon", "TrangThaiThanhToan", "TongTien", "SDTNhanVien"
        });
        xemHoaDon();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_HoaDon = new javax.swing.JTable();
        jLabel_HoaDon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_ThoatGiaoDienXemLichSu = new javax.swing.JButton();
        jCheckBox_TimHoaDonDaThanhToan = new javax.swing.JCheckBox();
        jTextField_TimTheoSDTKhachHang = new javax.swing.JTextField();
        jTextField_TimTheoSDTNhanVien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
                .addContainerGap(398, Short.MAX_VALUE))
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

        jPanel2.setBackground(new java.awt.Color(89, 98, 117));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

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
        jScrollPane1.setViewportView(jTable_HoaDon);

        jLabel_HoaDon.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel_HoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_HoaDon.setText("Hóa đơn");

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

        jCheckBox_TimHoaDonDaThanhToan.setBackground(new java.awt.Color(89, 98, 117));
        jCheckBox_TimHoaDonDaThanhToan.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jCheckBox_TimHoaDonDaThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox_TimHoaDonDaThanhToan.setText("Hóa đơn đã thanh toán");
        jCheckBox_TimHoaDonDaThanhToan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_TimHoaDonDaThanhToanItemStateChanged(evt);
            }
        });

        jTextField_TimTheoSDTKhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TimTheoSDTKhachHangKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TimTheoSDTKhachHangKeyTyped(evt);
            }
        });

        jTextField_TimTheoSDTNhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TimTheoSDTNhanVienKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TimTheoSDTNhanVienKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tìm theo SĐT Khách Hàng");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tìm theo SĐT Nhân Viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_HoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox_TimHoaDonDaThanhToan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_ThoatGiaoDienXemLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_TimTheoSDTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_TimTheoSDTNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_HoaDon)
                    .addComponent(jCheckBox_TimHoaDonDaThanhToan))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_TimTheoSDTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_TimTheoSDTNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_ThoatGiaoDienXemLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField_TimTheoSDTKhachHang, jTextField_TimTheoSDTNhanVien});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ThoatGiaoDienXemLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatGiaoDienXemLichSuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_ThoatGiaoDienXemLichSuActionPerformed

    private void jCheckBox_TimHoaDonDaThanhToanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_TimHoaDonDaThanhToanItemStateChanged
        // TODO add your handling code here:
        if (jCheckBox_TimHoaDonDaThanhToan.isSelected()) {
            xemHoaDonDaThanhToan();
        } else {
            xemHoaDon();
        }

    }//GEN-LAST:event_jCheckBox_TimHoaDonDaThanhToanItemStateChanged

    private void jTextField_TimTheoSDTKhachHangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TimTheoSDTKhachHangKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_TimTheoSDTKhachHangKeyTyped

    private void jTextField_TimTheoSDTNhanVienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TimTheoSDTNhanVienKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_TimTheoSDTNhanVienKeyTyped

    private void jTextField_TimTheoSDTKhachHangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TimTheoSDTKhachHangKeyReleased
        // TODO add your handling code here:
        this.sdtKhachHang = jTextField_TimTheoSDTKhachHang.getText();
        if (jTextField_TimTheoSDTKhachHang.getText().length() >= 11) {
//            evt.consume();
            jTextField_TimTheoSDTKhachHang.setText(this.sdtKhachHang.substring(0, this.sdtKhachHang.length() - 1));
            this.sdtKhachHang = jTextField_TimTheoSDTKhachHang.getText();
            System.out.println(sdtKhachHang);
        } else {
            if (jCheckBox_TimHoaDonDaThanhToan.isSelected()) {
                xemHoaDonDaThanhToan();
            } else {
                xemHoaDon();
            }
        }

    }//GEN-LAST:event_jTextField_TimTheoSDTKhachHangKeyReleased

    private void jTextField_TimTheoSDTNhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TimTheoSDTNhanVienKeyReleased
        // TODO add your handling code here:
        this.sdtNhanVien = jTextField_TimTheoSDTNhanVien.getText();
        if (jTextField_TimTheoSDTNhanVien.getText().length() >= 11) {
//            evt.consume();
            jTextField_TimTheoSDTNhanVien.setText(this.sdtNhanVien.substring(0, this.sdtNhanVien.length() - 1));
            this.sdtNhanVien = jTextField_TimTheoSDTKhachHang.getText();
            System.out.println(sdtNhanVien);
        } else {
            if (jCheckBox_TimHoaDonDaThanhToan.isSelected()) {
                xemHoaDonDaThanhToan();
            } else {
                xemHoaDon();
            }
        }
    }//GEN-LAST:event_jTextField_TimTheoSDTNhanVienKeyReleased
    private void xemHoaDonDaThanhToan() {
        new LoadData();
        dtmHoaDon.setRowCount(0);
        int length = this.ngayCanXem.length();
        for (HoaDon hd : controller.Controller.arrayListHoaDon) {
            String ngayXuatHoaDon = new SimpleDateFormat("yyyy-MM-dd").format(hd.getNgayXuatHoaDon());
            if (ngayXuatHoaDon.substring(0, length).equals(this.ngayCanXem) && hd.getTrangThaiThanhToan() == 1
                    && hd.getSdtKhachHang().substring(0, this.sdtKhachHang.length()).equals(this.sdtKhachHang)
                    && hd.getSdtNhanVien().substring(0, this.sdtNhanVien.length()).equals(this.sdtNhanVien)) {
                dtmHoaDon.addRow(new Object[]{
                    hd.getMaHoaDon(), hd.getSdtKhachHang(), new SimpleDateFormat("dd/MM/yyyy").format(hd.getNgayXuatHoaDon()), hd.getTrangThaiThanhToan(),
                    hd.getTongTien(), hd.getSdtNhanVien()
                });
            }
        }
    }

    private void xemHoaDon() {
        new LoadData();
        dtmHoaDon.setRowCount(0);
        int length = this.ngayCanXem.length();
        for (HoaDon hd : controller.Controller.arrayListHoaDon) {
            String ngayXuatHoaDon = new SimpleDateFormat("yyyy-MM-dd").format(hd.getNgayXuatHoaDon());
            if (ngayXuatHoaDon.substring(0, length).equals(this.ngayCanXem)
                    && hd.getSdtKhachHang().substring(0, this.sdtKhachHang.length()).equals(this.sdtKhachHang)
                    && hd.getSdtNhanVien().substring(0, this.sdtNhanVien.length()).equals(this.sdtNhanVien)) {
                dtmHoaDon.addRow(new Object[]{
                    hd.getMaHoaDon(), hd.getSdtKhachHang(), new SimpleDateFormat("dd/MM/yyyy").format(hd.getNgayXuatHoaDon()), hd.getTrangThaiThanhToan(),
                    hd.getTongTien(), hd.getSdtNhanVien()
                });
            }
        }
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
            java.util.logging.Logger.getLogger(GiaoDienChiTietThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChiTietThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChiTietThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChiTietThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChiTietThongKe("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ThoatGiaoDienXemLichSu;
    private javax.swing.JCheckBox jCheckBox_TimHoaDonDaThanhToan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_HoaDon;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_HoaDon;
    private javax.swing.JTextField jTextField_TimTheoSDTKhachHang;
    private javax.swing.JTextField jTextField_TimTheoSDTNhanVien;
    // End of variables declaration//GEN-END:variables
}
