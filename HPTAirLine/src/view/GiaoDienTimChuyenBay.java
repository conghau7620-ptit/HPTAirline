/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author t0168
 */
public class GiaoDienTimChuyenBay extends javax.swing.JFrame {

    /**
     * Creates new form FlightSearchForm
     */
    public GiaoDienTimChuyenBay() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel_IconMayBay = new javax.swing.JLabel();
        jLabel_HPT = new javax.swing.JLabel();
        jLabel_AirLines = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton_MotChieu = new javax.swing.JRadioButton();
        jRadioButton_KhuHoi = new javax.swing.JRadioButton();
        jComboBox_SanBayDi = new javax.swing.JComboBox<>();
        jSanBayDen = new javax.swing.JComboBox<>();
        jLabel_SanBayDi = new javax.swing.JLabel();
        jLabel_SanBayDen = new javax.swing.JLabel();
        jLabel_NgayDi = new javax.swing.JLabel();
        jLabel_NgayVe = new javax.swing.JLabel();
        jLabel_IconNgayDi = new javax.swing.JLabel();
        jLabel_IconNgayVe = new javax.swing.JLabel();
        jButton_TimChuyenBay = new javax.swing.JButton();
        jLabel_HuongDanDatCho = new javax.swing.JLabel();
        jLabel_NguoiLon = new javax.swing.JLabel();
        jLabel_TreEm = new javax.swing.JLabel();
        jLabel_EmBe = new javax.swing.JLabel();
        jComboBox_SLNguoiLon = new javax.swing.JComboBox<>();
        jComboBox_SLTreEm = new javax.swing.JComboBox<>();
        jComboBox_SLEmBe = new javax.swing.JComboBox<>();
        jDateChooser_NgayDi = new com.toedter.calendar.JDateChooser();
        jDateChooser_NgayVe = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
                .addContainerGap(240, Short.MAX_VALUE))
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        jPanel2.setBackground(new java.awt.Color(89, 98, 117));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jRadioButton_MotChieu.setBackground(new java.awt.Color(89, 98, 117));
        buttonGroup1.add(jRadioButton_MotChieu);
        jRadioButton_MotChieu.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jRadioButton_MotChieu.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_MotChieu.setText("Một chiều");

        jRadioButton_KhuHoi.setBackground(new java.awt.Color(89, 98, 117));
        buttonGroup1.add(jRadioButton_KhuHoi);
        jRadioButton_KhuHoi.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jRadioButton_KhuHoi.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_KhuHoi.setText("Khứ hồi");
        jRadioButton_KhuHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_KhuHoiActionPerformed(evt);
            }
        });

        jComboBox_SanBayDi.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N

        jSanBayDen.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N

        jLabel_SanBayDi.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_SanBayDi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SanBayDi.setText("Sân bay đi");

        jLabel_SanBayDen.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_SanBayDen.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SanBayDen.setText("Sân bay đến");

        jLabel_NgayDi.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_NgayDi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NgayDi.setText("Ngày đi");

        jLabel_NgayVe.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel_NgayVe.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NgayVe.setText("Ngày về");

        jLabel_IconNgayDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_airplane_take_off_30px.png"))); // NOI18N

        jLabel_IconNgayVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_airplane_landing_26px_1.png"))); // NOI18N
        jLabel_IconNgayVe.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jButton_TimChuyenBay.setBackground(new java.awt.Color(255, 77, 77));
        jButton_TimChuyenBay.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton_TimChuyenBay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_TimChuyenBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_search_32px_1.png"))); // NOI18N
        jButton_TimChuyenBay.setText("TÌM CHUYẾN BAY");
        jButton_TimChuyenBay.setBorderPainted(false);

        jLabel_HuongDanDatCho.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_HuongDanDatCho.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_HuongDanDatCho.setText("*Hướng dẫn đặt chỗ");

        jLabel_NguoiLon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_NguoiLon.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NguoiLon.setText("Người lớn (>=12t)");

        jLabel_TreEm.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_TreEm.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TreEm.setText("Trẻ em (2-11t)");

        jLabel_EmBe.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_EmBe.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_EmBe.setText("Em bé  (<2t)");

        jComboBox_SLNguoiLon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jComboBox_SLTreEm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jComboBox_SLEmBe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jDateChooser_NgayDi.setDateFormatString("dd/MM/yyyy");

        jDateChooser_NgayVe.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton_TimChuyenBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jRadioButton_MotChieu)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton_KhuHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel_SanBayDi)
                                .addComponent(jLabel_SanBayDen)
                                .addComponent(jComboBox_SanBayDi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSanBayDen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel_NgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel_IconNgayDi))
                                        .addComponent(jDateChooser_NgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel_NgayVe, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel_IconNgayVe))
                                        .addComponent(jDateChooser_NgayVe, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_NguoiLon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_TreEm, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel_EmBe))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox_SLTreEm, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_SLNguoiLon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox_SLEmBe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel_HuongDanDatCho))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_MotChieu)
                    .addComponent(jRadioButton_KhuHoi))
                .addGap(11, 11, 11)
                .addComponent(jLabel_SanBayDi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_SanBayDi)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_NguoiLon)
                        .addComponent(jComboBox_SLNguoiLon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jLabel_SanBayDen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSanBayDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_TreEm)
                        .addComponent(jComboBox_SLTreEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_NgayVe)
                    .addComponent(jLabel_NgayDi)
                    .addComponent(jLabel_IconNgayVe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_IconNgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_EmBe)
                        .addComponent(jComboBox_SLEmBe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser_NgayVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_NgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton_TimChuyenBay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_HuongDanDatCho)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox_SanBayDi, jSanBayDen});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel_IconNgayDi, jLabel_IconNgayVe});

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 560, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_KhuHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_KhuHoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_KhuHoiActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienTimChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTimChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTimChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienTimChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienTimChuyenBay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_TimChuyenBay;
    private javax.swing.JComboBox<String> jComboBox_SLEmBe;
    private javax.swing.JComboBox<String> jComboBox_SLNguoiLon;
    private javax.swing.JComboBox<String> jComboBox_SLTreEm;
    private javax.swing.JComboBox<String> jComboBox_SanBayDi;
    private com.toedter.calendar.JDateChooser jDateChooser_NgayDi;
    private com.toedter.calendar.JDateChooser jDateChooser_NgayVe;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_EmBe;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_HuongDanDatCho;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_IconNgayDi;
    private javax.swing.JLabel jLabel_IconNgayVe;
    private javax.swing.JLabel jLabel_NgayDi;
    private javax.swing.JLabel jLabel_NgayVe;
    private javax.swing.JLabel jLabel_NguoiLon;
    private javax.swing.JLabel jLabel_SanBayDen;
    private javax.swing.JLabel jLabel_SanBayDi;
    private javax.swing.JLabel jLabel_TreEm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_KhuHoi;
    private javax.swing.JRadioButton jRadioButton_MotChieu;
    private javax.swing.JComboBox<String> jSanBayDen;
    // End of variables declaration//GEN-END:variables
}
