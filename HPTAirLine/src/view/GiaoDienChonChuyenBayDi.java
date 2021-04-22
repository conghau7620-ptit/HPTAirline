/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.DataConnection;
import connection.LoadData;
import controller.Controller;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.ChuyenBay;
import model.Ghe;
import static view.GiaoDienTimChuyenBay.ngayHienTai;

/**
 *
 * @author t0168
 */
public class GiaoDienChonChuyenBayDi extends javax.swing.JFrame {

    /**
     * Creates new form FlightSearchResultFrame
     */
    
    //SoGhe trong trong chuyen bay deu = 0; chưa sửa
    
    ArrayList <ChuyenBay> list;
    DefaultTableModel dtm;
    String maSanBayDi;
    String maSanBayDen;
    Date ngayDi;
    Date ngayVe;
    int soGheNguoiLon;
    int soGheTreEm;
    int soGheEmBe;
    boolean khuHoi;
    public GiaoDienChonChuyenBayDi(String maSanBayDi, String maSanBayDen, 
            Date ngayDi, Date ngayVe, boolean khuHoi, int soGheNguoiLon, int soGheTreEm, int soGheEmBe) {
        
        initComponents();
         this.maSanBayDi= maSanBayDi;
         this.maSanBayDen = maSanBayDen;
         this.ngayDi = ngayDi;
         this.ngayVe = ngayVe;
         this.soGheNguoiLon = soGheNguoiLon;
         this.soGheTreEm = soGheTreEm;
         this.soGheEmBe = soGheEmBe;
         this.khuHoi = khuHoi;
         
        dtm = (DefaultTableModel) jTable_KetQuaTimKiem.getModel();
        dtm.setColumnIdentifiers(new Object[]{
            "MaChuyenBay", "MaMayBay", "MaSanBayDi", "MaSanBayDen", "NgayBay", "GioBay", "GhiChu",
             "KhoangCach"
        });
        System.out.println("soGheNguoiLon: "+this.soGheNguoiLon);
        System.out.println("soGheTreEm: "+this.soGheTreEm);
        System.out.println("soGheEmBe: "+this.soGheEmBe);
        hienKetQua();
        
     //   

        
//        String date = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
//        try {
//            ngayHienTai = new SimpleDateFormat("dd/MM/yyyy").parse(date);
//        } catch (ParseException ex) {
//            Logger.getLogger(GiaoDienTimChuyenBay.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
        jTable_KetQuaTimKiem = new javax.swing.JTable();
        jButton_XacNhanChonChuyenBay = new javax.swing.JButton();
        jLabel_ThongTinCanTimKiem = new javax.swing.JLabel();
        jButton_ThoatKetQuaTimKiemChuyenBay = new javax.swing.JButton();

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
                .addContainerGap(380, Short.MAX_VALUE))
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        jPanel2.setBackground(new java.awt.Color(89, 98, 117));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTable_KetQuaTimKiem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_KetQuaTimKiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_KetQuaTimKiem.setGridColor(new java.awt.Color(0, 0, 0));
        jTable_KetQuaTimKiem.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable_KetQuaTimKiem.setRowHeight(30);
        jTable_KetQuaTimKiem.setSelectionBackground(new java.awt.Color(255, 77, 77));
        jTable_KetQuaTimKiem.setShowVerticalLines(false);
        jTable_KetQuaTimKiem.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable_KetQuaTimKiem);

        jButton_XacNhanChonChuyenBay.setBackground(new java.awt.Color(255, 77, 77));
        jButton_XacNhanChonChuyenBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_XacNhanChonChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_XacNhanChonChuyenBay.setText("Xác nhận");
        jButton_XacNhanChonChuyenBay.setBorderPainted(false);
        jButton_XacNhanChonChuyenBay.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton_XacNhanChonChuyenBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XacNhanChonChuyenBayActionPerformed(evt);
            }
        });

        jLabel_ThongTinCanTimKiem.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_ThongTinCanTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ThongTinCanTimKiem.setText("__(Thông tin chuyến bay cần tìm)__");

        jButton_ThoatKetQuaTimKiemChuyenBay.setBackground(new java.awt.Color(0, 102, 102));
        jButton_ThoatKetQuaTimKiemChuyenBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThoatKetQuaTimKiemChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThoatKetQuaTimKiemChuyenBay.setText("Quay lại");
        jButton_ThoatKetQuaTimKiemChuyenBay.setBorderPainted(false);
        jButton_ThoatKetQuaTimKiemChuyenBay.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_ThoatKetQuaTimKiemChuyenBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThoatKetQuaTimKiemChuyenBayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_ThongTinCanTimKiem)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_ThoatKetQuaTimKiemChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_XacNhanChonChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ThongTinCanTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_XacNhanChonChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ThoatKetQuaTimKiemChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 700, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ThoatKetQuaTimKiemChuyenBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatKetQuaTimKiemChuyenBayActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_ThoatKetQuaTimKiemChuyenBayActionPerformed

    private void jButton_XacNhanChonChuyenBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XacNhanChonChuyenBayActionPerformed
        // TODO add your handling code here:
        if(this.khuHoi == true){
//            this.dispose();
            new GiaoDienChonChuyenBayVe(this.maSanBayDen, this.maSanBayDi, this.ngayVe
                    , this.soGheNguoiLon, this.soGheTreEm, this.soGheEmBe).setVisible(true);
        }
        else{
            //dang ra ph mo giao dien chon ghe
            this.dispose();
        }
    }//GEN-LAST:event_jButton_XacNhanChonChuyenBayActionPerformed

    /**
     * @param args the command line arguments
     */

    private void hienKetQua() {
        dtm.setRowCount(0);
//        LoadData.loadKetQuaTimKiemChuyenBay("VII", "SGN", "2", "3");
//        try {
//            this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi.toString());
//        } catch (ParseException ex) {
//            Logger.getLogger(TestKetQuaTimKiem.class.getName()).log(Level.SEVERE, null, ex);
//        }
//              
        String stringNgayDi = new SimpleDateFormat("yyyy-MM-dd").format(ngayDi);
//        System.out.println(stringNgayDi);
//        System.out.println(this.maSanBayDi);
//        System.out.println(this.maSanBayDen);
        
        Controller.arrayListKetQuaTimKiemChuyenBay.removeAll(Controller.arrayListKetQuaTimKiemChuyenBay);
        
        Controller.loadKetQuaTheoNgay(this.maSanBayDi, this.maSanBayDen, stringNgayDi);
        LoadData.loadTableChuyenBay();
        
        list = Controller.arrayListKetQuaTimKiemChuyenBay;
//        ArrayList<ChuyenBay> list2 = Controller.arrayListChuyenBay;
//        for(ChuyenBay x: list2){
//            int soGheTrong = 0;
//            for(Ghe g : x.getArrayListGhe()){
//                    System.out.println(g.getTrong());
//                    System.out.println(g.getMaGhe());
//            }
//        }
        ///   

        for (ChuyenBay tmp : list) {
            int soGheTrong = 0;
            for(Ghe g : tmp.getArrayListGhe()){
                if(g.getTrong()==1){
                    soGheTrong ++;
                }
            }
            if(soGheTrong >= (this.soGheNguoiLon + this.soGheTreEm + this.soGheEmBe)){
                dtm.addRow(new Object[]{
                    tmp.getMaChuyenBay(), tmp.getMaMayBay(), tmp.getMaSanBayDi(), tmp.getMaSanBayDen(), new SimpleDateFormat("dd/MM/yyyy").format(tmp.getNgayBay()),
                    tmp.getGioBay(), tmp.getGhiChu(), tmp.getKhoangCach()
                });
            }
            //
//            System.out.println("tongSoGhe "+ tongSoGhe);
//            System.out.println("soGheTrong "+ soGheTrong);
            //
        }
    }
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TestKetQuaTimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TestKetQuaTimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TestKetQuaTimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TestKetQuaTimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new TestKetQuaTimKiem("", "", ngayHienTai, ngayHienTai, true).setVisible(true);
////            }
////       });
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ThoatKetQuaTimKiemChuyenBay;
    private javax.swing.JButton jButton_XacNhanChonChuyenBay;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_ThongTinCanTimKiem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_KetQuaTimKiem;
    // End of variables declaration//GEN-END:variables
}
