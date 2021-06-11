/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.LoadData;
import controller.Controller;
import java.awt.Color;
import java.sql.Date;
import java.sql.Time;
import model.ChuyenBay;
import model.DuongBay;
import model.MayBay;
import model.SanBay;

/**
 *
 * @author tuanbuiquoc
 */
public class GiaoDienSuaChuyenBay extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienSuaChuyenBay
     */
    
    ChuyenBay chuyenBay = null;
    String maCB = null;
    public GiaoDienSuaChuyenBay(String maChuyenBay) {
        initComponents();
        new LoadData();
        loadChuyenBayDuocChon(maChuyenBay);
        maCB = maChuyenBay;
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
        jPanel5 = new javax.swing.JPanel();
        jComboBox_SanBayDi = new javax.swing.JComboBox<>();
        jComboBox_SanBayDen = new javax.swing.JComboBox<>();
        jLabel_SanBayDi = new javax.swing.JLabel();
        jLabel_SanBayDen = new javax.swing.JLabel();
        jLabel_NgayDi = new javax.swing.JLabel();
        jLabel_NgayVe = new javax.swing.JLabel();
        jLabel_IconNgayDi = new javax.swing.JLabel();
        jDateChooser_NgayDi = new com.toedter.calendar.JDateChooser();
        jComboBox_GioDi = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_GiayDi = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_PhutDi = new javax.swing.JComboBox<>();
        jLabel_MayBay = new javax.swing.JLabel();
        jComboBox_MayBay = new javax.swing.JComboBox<>();
        jLabel_ThemChuyenBay = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_GhiChu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_GhiChu = new javax.swing.JTextArea();
        jButton_QuayLai = new javax.swing.JButton();
        jButton_SuaChuyenBay = new javax.swing.JButton();
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

        jPanel5.setBackground(new java.awt.Color(89, 98, 117));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jComboBox_SanBayDi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jComboBox_SanBayDen.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel_SanBayDi.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_SanBayDi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SanBayDi.setText("Sân bay đi");

        jLabel_SanBayDen.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_SanBayDen.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SanBayDen.setText("Sân bay đến");

        jLabel_NgayDi.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_NgayDi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NgayDi.setText("Ngày bay");

        jLabel_NgayVe.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_NgayVe.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NgayVe.setText("Giờ bay");

        jLabel_IconNgayDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_airplane_take_off_30px.png"))); // NOI18N

        jDateChooser_NgayDi.setDateFormatString("dd/MM/yyyy");
        jDateChooser_NgayDi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jDateChooser_NgayDi.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_NgayDiPropertyChange(evt);
            }
        });

        jComboBox_GioDi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel1.setText(":");

        jComboBox_GiayDi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00" }));
        jComboBox_GiayDi.setEnabled(false);

        jLabel2.setText(":");

        jComboBox_PhutDi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "10", "20", "30", "40", "50", " " }));

        jLabel_MayBay.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_MayBay.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MayBay.setText("Máy bay");

        jComboBox_MayBay.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel_ThemChuyenBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel_ThemChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ThemChuyenBay.setText("Sửa Chuyến Bay");

        jLabel_GhiChu.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_GhiChu.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_GhiChu.setText("Ghi chú");

        jTextArea_GhiChu.setColumns(20);
        jTextArea_GhiChu.setRows(5);
        jScrollPane1.setViewportView(jTextArea_GhiChu);

        jButton_QuayLai.setBackground(new java.awt.Color(0, 102, 102));
        jButton_QuayLai.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_QuayLai.setForeground(new java.awt.Color(255, 255, 255));
        jButton_QuayLai.setText("Quay Lại");
        jButton_QuayLai.setBorderPainted(false);
        jButton_QuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QuayLaiActionPerformed(evt);
            }
        });

        jButton_SuaChuyenBay.setBackground(new java.awt.Color(255, 77, 77));
        jButton_SuaChuyenBay.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_SuaChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SuaChuyenBay.setText("Sửa Chuyến Bay");
        jButton_SuaChuyenBay.setBorderPainted(false);
        jButton_SuaChuyenBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuaChuyenBayActionPerformed(evt);
            }
        });

        jLabel_ThongBao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_ThongBao.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_ThemChuyenBay)
                .addGap(270, 270, 270))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel_SanBayDi)
                                        .addGap(251, 251, 251))
                                    .addComponent(jComboBox_SanBayDi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox_MayBay, javax.swing.GroupLayout.Alignment.LEADING, 0, 321, Short.MAX_VALUE)
                                    .addComponent(jLabel_MayBay, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_SanBayDen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel_SanBayDen)
                                        .addGap(238, 238, 238))
                                    .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_GhiChu)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel_NgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel_IconNgayDi))
                                            .addComponent(jDateChooser_NgayDi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_NgayVe, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jComboBox_GioDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox_PhutDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox_GiayDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton_SuaChuyenBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_ThemChuyenBay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel_MayBay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_MayBay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_SanBayDi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_SanBayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_SanBayDen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_SanBayDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_ThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel_NgayVe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox_GioDi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox_PhutDi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox_GiayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_IconNgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel_NgayDi)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser_NgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_GhiChu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_QuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SuaChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadChuyenBayDuocChon(String maChuyenBay) {
        for (MayBay mb: Controller.arrayListMayBay) {
            jComboBox_MayBay.addItem(mb.getMaMayBay());
        }
        
        for (SanBay sb: Controller.arrayListSanBay) {
            jComboBox_SanBayDi.addItem(sb.getMaSanBay());
            jComboBox_SanBayDen.addItem(sb.getMaSanBay());
        }
        for (ChuyenBay cb : Controller.arrayListChuyenBay) {
            if (cb.getMaChuyenBay().equals(maChuyenBay)) {
                chuyenBay = cb;
                break;
            }
        }
        jComboBox_MayBay.setSelectedItem(chuyenBay.getMaMayBay());
        jComboBox_SanBayDi.setSelectedItem(chuyenBay.getMaSanBayDi());
        jComboBox_SanBayDen.setSelectedItem(chuyenBay.getMaSanBayDen());
        jDateChooser_NgayDi.setDate(new java.util.Date(chuyenBay.getNgayBay().getTime()));
        jComboBox_GioDi.setSelectedItem(Integer.toString(chuyenBay.getGioBay().getHours()));
        jComboBox_PhutDi.setSelectedItem(Integer.toString(chuyenBay.getGioBay().getMinutes()));
        jTextArea_GhiChu.setText(chuyenBay.getGhiChu());
        
    }
    private void jDateChooser_NgayDiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_NgayDiPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser_NgayDiPropertyChange

    private void jButton_QuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QuayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoDienQuanLyChuyenBay().setVisible(true);
    }//GEN-LAST:event_jButton_QuayLaiActionPerformed

    private void jButton_SuaChuyenBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuaChuyenBayActionPerformed
        String maSB1= jComboBox_SanBayDi.getSelectedItem().toString().trim();
        String maSB2= jComboBox_SanBayDen.getSelectedItem().toString().trim();
        
        if (maSB1.equals(maSB2)) {
            jLabel_ThongBao.setText("*Sân bay đi bị trùng vs sân bay đến");
            jLabel_SanBayDi.setForeground(Color.yellow);
            jLabel_SanBayDen.setForeground(Color.yellow);
            return;
        }
        else {
            jLabel_ThongBao.setText("");
            jLabel_SanBayDi.setForeground(Color.white);
            jLabel_SanBayDen.setForeground(Color.white);
        }
        if (!maSB1.equals(maSB2)){
            for (DuongBay db: Controller.arrayListDuongBay) {
                if ((db.getMaSanBay1().equals(maSB1) && db.getMaSanBay2().equals(maSB2))
                        || (db.getMaSanBay1().equals(maSB2) && db.getMaSanBay2().equals(maSB1))) {
                    
                    Time time = new Time(
                        Integer.parseInt(jComboBox_GioDi.getSelectedItem().toString()),
                        Integer.parseInt(jComboBox_PhutDi.getSelectedItem().toString()),
                        Integer.parseInt(jComboBox_GiayDi.getSelectedItem().toString()));
                    Date date = new java.sql.Date(jDateChooser_NgayDi.getDate().getTime());
                    ChuyenBay cb = new ChuyenBay(
                        chuyenBay.getMaChuyenBay(),
                        jComboBox_MayBay.getSelectedItem().toString(),
                        jComboBox_SanBayDi.getSelectedItem().toString(),
                        jComboBox_SanBayDen.getSelectedItem().toString(),
                        date,
                        time,
                        jTextArea_GhiChu.getText(),
                        db.getKhoangCach());
                    for (ChuyenBay cb1 : Controller.arrayListChuyenBay) {
                        if (cb1.getMaChuyenBay().equals(maCB)) {
                            chuyenBay = cb1;
                             break;
                        }
                    }
                    Controller.arrayListChuyenBay.set(
                            Controller.arrayListChuyenBay.indexOf(chuyenBay), cb);
                    connection.UpdateData.updateChuyenBay(cb);
                    jLabel_ThongBao.setText("Sửa chuyến bay thành công");
                    return;
                }
                else {
                    System.out.println(maSB1 + " - " + maSB2);
                    System.out.println(db.getMaSanBay1() + " - " + db.getMaSanBay2());
                }   
            }
            jLabel_ThongBao.setText("Chưa có đường bay giữa 2 sân bay trên");
        }
    }//GEN-LAST:event_jButton_SuaChuyenBayActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienSuaChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienSuaChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienSuaChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienSuaChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_QuayLai;
    private javax.swing.JButton jButton_SuaChuyenBay;
    private javax.swing.JComboBox<String> jComboBox_GiayDi;
    private javax.swing.JComboBox<String> jComboBox_GioDi;
    private javax.swing.JComboBox<String> jComboBox_MayBay;
    private javax.swing.JComboBox<String> jComboBox_PhutDi;
    private javax.swing.JComboBox<String> jComboBox_SanBayDen;
    private javax.swing.JComboBox<String> jComboBox_SanBayDi;
    private com.toedter.calendar.JDateChooser jDateChooser_NgayDi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_GhiChu;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_IconNgayDi;
    private javax.swing.JLabel jLabel_MayBay;
    private javax.swing.JLabel jLabel_NgayDi;
    private javax.swing.JLabel jLabel_NgayVe;
    private javax.swing.JLabel jLabel_SanBayDen;
    private javax.swing.JLabel jLabel_SanBayDi;
    private javax.swing.JLabel jLabel_ThemChuyenBay;
    private javax.swing.JLabel jLabel_ThongBao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea_GhiChu;
    // End of variables declaration//GEN-END:variables
}
