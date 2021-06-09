/*
    tạm hoàn thành mua dưới quyền khách hàng và nhân viên
    có xử lý điểm tích lũy
    có thêm khách hàng nếu khách hàng chưa tồn tại trong csdl
    Truyền vào 1 arraylist đối tượng vé trong đó mã hóa đơn, mã chuyến bay, mã ghế và thông tin người 
                bay đã được set dữ liệu sẵn
 */
package view;

import connection.DataConnection;
import connection.InsertData;
import connection.LoadData;
import connection.UpdateData;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.ChuyenBay;
import model.Ghe;
import model.HoaDon;
import model.KhachHang;
import model.NhanVien;
import model.TaiKhoan;
import model.Ve;

/**
 *
 * @author tuanbuiquoc
 */
public class GiaoDienHoaDonMotChieu extends javax.swing.JFrame {

    DefaultTableModel dtmVe;
    DefaultTableModel dtmChuyenBay;
    private Date ngayHienTai;
    public static int phanTramGiaThuongGia = 2;
    private int giaCoBan = 0;
    private int soVePhoThong = 0;
    private int soVeThuongGia = 0;
    private int tongTien;

    private String maHoaDon;
    private String maChuyenBayDi;
    private ArrayList<Ve> danhSachVe;
//public GiaoDienHoaDonMotChieu(){
//    
//}
//    public GiaoDienHoaDonMotChieu(ArrayList<Ve> danhSachVeDi) {
        public GiaoDienHoaDonMotChieu(){
        initComponents();
        this.danhSachVe = GiaoDienChonGhe.dsVeDi;
        this.phanTramGiaThuongGia = connection.LoadData.phanTramThuongGia;

        this.maChuyenBayDi = danhSachVe.get(0).getMaChuyenBay().trim();
        this.maHoaDon = this.danhSachVe.get(0).getMaHoaDon();
        dtmVe = (DefaultTableModel) jTable_VeDaChon.getModel();
        dtmVe.setColumnIdentifiers(new Object[]{
            "MaVe", "MaChuyenBay", "Gia", "KyGui",
            "CMNDNguoiBay", "TenNguoiBay","NgaySinh", "MaHoaDon", "MaGhe"
        });

        dtmChuyenBay = (DefaultTableModel) jTable_ChuyenBayDaChon.getModel();
        dtmChuyenBay.setColumnIdentifiers(new Object[]{
            "MaChuyenBay", "MaMayBay", "MaSanBayDi", "MaSanBayDen", "NgayBay", "GioBay", "GhiChu",
            "KhoangCach"
        });

        String date = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        try {
            ngayHienTai = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(GiaoDienTimChuyenBay.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDateChooser_NgayXuatHoaDon.setDate(ngayHienTai);
        jDateChooser_NgayXuatHoaDon.setEnabled(false);
        thongTinTaiKhoan();

        


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

//        String sql = "select * from HOADON";
//                connection.DataConnection.createStatement();
//               
//                int soHoaDon =1;
//                try {
//            PreparedStatement ps = DataConnection.connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            
//            while(rs.next()){
//                soHoaDon++; 
//            }
//                    System.out.println(soHoaDon);
//        } catch (Exception e) {
//        }
//                System.out.println("HD"+soHoaDon);
//                                 //
//                                 soHoaDon++;
//                 String maHoaDon = "";
//                 if(soHoaDon <= 9) maHoaDon= "HD0"+ (soHoaDon);
//                 else maHoaDon = "HD" + (soHoaDon);
//        
        for(Ve ve: this.danhSachVe){
           
            String maGhe = ve.getMaGhe().substring(0,1).toUpperCase() + ve.getMaGhe().substring(1);
            ve.setMaGhe(ve.getMaChuyenBay()+"-"+maGhe);
          //  ve.setMaHoaDon(maHoaDon);
            System.out.println("ma ve: "+ve.getMaVe());
            System.out.println("ma hd: "+ve.getMaHoaDon());
            System.out.println("ma ghe: "+ve.getMaGhe());
            System.out.println("ma cb: "+ve.getMaChuyenBay());
        }
        
        hienThongTin();



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
        jPanel_TaiKhoan = new javax.swing.JPanel();
        jLabel_XinChao = new javax.swing.JLabel();
        jLabel_PhanQuyen = new javax.swing.JLabel();
        jLabel_TenNguoiDung = new javax.swing.JLabel();
        jLabel_XemThongTinTaiKhoan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_DangXuat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_SoDienThoaiKhachHang = new javax.swing.JLabel();
        jTextField_SoDienThoaiKhachHang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ChuyenBayDaChon = new javax.swing.JTable();
        jLabel_ChuyenBayDaChon = new javax.swing.JLabel();
        jLabel_PhoThong = new javax.swing.JLabel();
        jTextField_SLVePhoThong = new javax.swing.JTextField();
        jLabel_ThuongGia = new javax.swing.JLabel();
        jTextField_SLVeThuongGia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_GiaVePhoThong = new javax.swing.JTextField();
        jTextField_GiaVeThuongGia = new javax.swing.JTextField();
        jLabel_NgayXuatHoaDon = new javax.swing.JLabel();
        jDateChooser_NgayXuatHoaDon = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_TongTien = new javax.swing.JTextField();
        jLabel_TongTien = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_VeDaChon = new javax.swing.JTable();
        jLabel_VeDaChon = new javax.swing.JLabel();
        jButton_HoanTatHoaDon = new javax.swing.JButton();
        jButton_ThoatGiaoDienHoaDon = new javax.swing.JButton();
        jLabel_SoDienThoaiNhanVien = new javax.swing.JLabel();
        jTextField_SoDienThoaiNhanVien = new javax.swing.JTextField();
        jLabel_DiemTichLuy = new javax.swing.JLabel();
        jTextField_DiemTichLuy = new javax.swing.JTextField();
        jLabel_ThuongGia1 = new javax.swing.JLabel();
        jLabel_DauChamHoi = new javax.swing.JLabel();
        jLabel_BaoLoi = new javax.swing.JLabel();
        jComboBox_SuDungDiemTichLuy = new javax.swing.JComboBox<>();
        jLabel_BaoLoi2 = new javax.swing.JLabel();
        jCheckBox_TrangThaiThanhToan = new javax.swing.JCheckBox();
        jLabel_ChuyenBayDaChon1 = new javax.swing.JLabel();

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

        jPanel_TaiKhoan.setBackground(new java.awt.Color(48, 57, 82));

        jLabel_XinChao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_XinChao.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_XinChao.setText("Xin chào,");

        jLabel_PhanQuyen.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_PhanQuyen.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PhanQuyen.setText("Đối tượng");

        jLabel_TenNguoiDung.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_TenNguoiDung.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TenNguoiDung.setText("Tên đối tượng");

        jLabel_XemThongTinTaiKhoan.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_XemThongTinTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_XemThongTinTaiKhoan.setText("<HTML><u>Xem thông tin tài khoản</u></HTML>");
        jLabel_XemThongTinTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_XemThongTinTaiKhoanMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("|");

        jLabel_DangXuat.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_DangXuat.setForeground(new java.awt.Color(255, 77, 77));
        jLabel_DangXuat.setText("<HTML><u>Đăng xuất</u></HTML>");
        jLabel_DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_DangXuatMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TaiKhoanLayout = new javax.swing.GroupLayout(jPanel_TaiKhoan);
        jPanel_TaiKhoan.setLayout(jPanel_TaiKhoanLayout);
        jPanel_TaiKhoanLayout.setHorizontalGroup(
            jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel_XemThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_XinChao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_PhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_TenNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_TaiKhoanLayout.setVerticalGroup(
            jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TenNguoiDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_XinChao)
                        .addComponent(jLabel_PhanQuyen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_XemThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_HPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_AirLines, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel_IconMayBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(89, 98, 117));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel_SoDienThoaiKhachHang.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_SoDienThoaiKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SoDienThoaiKhachHang.setText("Số Điện Thoại KH");

        jTextField_SoDienThoaiKhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SoDienThoaiKhachHangKeyReleased(evt);
            }
        });

        jTable_ChuyenBayDaChon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_ChuyenBayDaChon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_ChuyenBayDaChon.setGridColor(new java.awt.Color(0, 0, 0));
        jTable_ChuyenBayDaChon.setRowHeight(30);
        jTable_ChuyenBayDaChon.setSelectionBackground(new java.awt.Color(255, 77, 77));
        jTable_ChuyenBayDaChon.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable_ChuyenBayDaChon);
        jTable_ChuyenBayDaChon.getAccessibleContext().setAccessibleName("");

        jLabel_ChuyenBayDaChon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_ChuyenBayDaChon.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ChuyenBayDaChon.setText("Chuyến bay đã chọn");

        jLabel_PhoThong.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_PhoThong.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PhoThong.setText("Phổ thông");

        jTextField_SLVePhoThong.setEnabled(false);

        jLabel_ThuongGia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_ThuongGia.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ThuongGia.setText("Thương gia");

        jTextField_SLVeThuongGia.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("x");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("x");

        jTextField_GiaVePhoThong.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_GiaVePhoThong.setEnabled(false);

        jTextField_GiaVeThuongGia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_GiaVeThuongGia.setEnabled(false);

        jLabel_NgayXuatHoaDon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_NgayXuatHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NgayXuatHoaDon.setText("Ngày xuất hóa đơn");

        jDateChooser_NgayXuatHoaDon.setDateFormatString("dd/MM/yyyy");

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("+");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("=");

        jTextField_TongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_TongTien.setEnabled(false);

        jLabel_TongTien.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_TongTien.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TongTien.setText("Tổng tiền");

        jTable_VeDaChon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_VeDaChon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_VeDaChon.setGridColor(new java.awt.Color(0, 0, 0));
        jTable_VeDaChon.setRowHeight(30);
        jTable_VeDaChon.setSelectionBackground(new java.awt.Color(255, 77, 77));
        jTable_VeDaChon.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable_VeDaChon);

        jLabel_VeDaChon.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_VeDaChon.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_VeDaChon.setText("Vé đã chọn");

        jButton_HoanTatHoaDon.setBackground(new java.awt.Color(255, 77, 77));
        jButton_HoanTatHoaDon.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_HoanTatHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jButton_HoanTatHoaDon.setText("Hoàn Tất");
        jButton_HoanTatHoaDon.setBorderPainted(false);
        jButton_HoanTatHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton_HoanTatHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HoanTatHoaDonActionPerformed(evt);
            }
        });

        jButton_ThoatGiaoDienHoaDon.setBackground(new java.awt.Color(0, 102, 102));
        jButton_ThoatGiaoDienHoaDon.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jButton_ThoatGiaoDienHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThoatGiaoDienHoaDon.setText("Quay Lại");
        jButton_ThoatGiaoDienHoaDon.setBorderPainted(false);
        jButton_ThoatGiaoDienHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_ThoatGiaoDienHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThoatGiaoDienHoaDonActionPerformed(evt);
            }
        });

        jLabel_SoDienThoaiNhanVien.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_SoDienThoaiNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SoDienThoaiNhanVien.setText("Số Điện Thoại NV");

        jTextField_SoDienThoaiNhanVien.setEnabled(false);

        jLabel_DiemTichLuy.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_DiemTichLuy.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DiemTichLuy.setText("Điểm tích lũy");

        jTextField_DiemTichLuy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_DiemTichLuy.setText("0");
        jTextField_DiemTichLuy.setEnabled(false);

        jLabel_ThuongGia1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_ThuongGia1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ThuongGia1.setText("Dùng điểm tích lũy");

        jLabel_DauChamHoi.setBackground(new java.awt.Color(255, 153, 153));
        jLabel_DauChamHoi.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_DauChamHoi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DauChamHoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_DauChamHoi.setText("?");
        jLabel_DauChamHoi.setToolTipText("Mỗi 100 điểm tương ứng với 10%");

        jComboBox_SuDungDiemTichLuy.setMaximumRowCount(6);
        jComboBox_SuDungDiemTichLuy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "100", "200", "300", "400", "500", "600", "700", "800", "900", "1000" }));
        jComboBox_SuDungDiemTichLuy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_SuDungDiemTichLuyItemStateChanged(evt);
            }
        });

        jLabel_BaoLoi2.setForeground(new java.awt.Color(255, 0, 51));

        jCheckBox_TrangThaiThanhToan.setBackground(new java.awt.Color(89, 98, 117));
        jCheckBox_TrangThaiThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox_TrangThaiThanhToan.setText("Đã thanh toán");

        jLabel_ChuyenBayDaChon1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel_ChuyenBayDaChon1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel_ChuyenBayDaChon1.setText("*Hóa đơn sẽ bị xóa nếu không thanh toán trước 2 tiếng trước giờ bay");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_VeDaChon)
                                .addGap(584, 584, 584))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox_TrangThaiThanhToan))
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_BaoLoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel_SoDienThoaiNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jTextField_SoDienThoaiNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_BaoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton_ThoatGiaoDienHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(jButton_HoanTatHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel_DiemTichLuy, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel_NgayXuatHoaDon)
                                                        .addComponent(jLabel_SoDienThoaiKhachHang))
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jDateChooser_NgayXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addGap(19, 19, 19)
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField_DiemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField_SoDienThoaiKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                            .addGap(38, 38, 38)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addComponent(jLabel_PhoThong)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jTextField_SLVePhoThong, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                            .addComponent(jLabel_ThuongGia)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jTextField_SLVeThuongGia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel_ThuongGia1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel_DauChamHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(24, 24, 24)))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextField_GiaVePhoThong, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jComboBox_SuDungDiemTichLuy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextField_GiaVeThuongGia, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(319, 319, 319)
                                            .addComponent(jLabel_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_ChuyenBayDaChon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_ChuyenBayDaChon1)))
                        .addContainerGap())))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField_SLVePhoThong, jTextField_SLVeThuongGia});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ChuyenBayDaChon)
                    .addComponent(jLabel_ChuyenBayDaChon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_VeDaChon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_NgayXuatHoaDon)
                                    .addComponent(jDateChooser_NgayXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_SoDienThoaiKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_SoDienThoaiKhachHang)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_PhoThong)
                                    .addComponent(jTextField_SLVePhoThong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_ThuongGia)
                                    .addComponent(jTextField_SLVeThuongGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_DiemTichLuy)
                            .addComponent(jTextField_DiemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ThuongGia1)
                            .addComponent(jLabel_DauChamHoi)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField_GiaVePhoThong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_GiaVeThuongGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_SuDungDiemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TongTien)
                    .addComponent(jTextField_SoDienThoaiNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_SoDienThoaiNhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_TrangThaiThanhToan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_BaoLoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_BaoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_HoanTatHoaDon)
                    .addComponent(jButton_ThoatGiaoDienHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_HoanTatHoaDon, jButton_ThoatGiaoDienHoaDon});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel_BaoLoi, jLabel_BaoLoi2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void thongTinTaiKhoan() {
        //// Phần thông tin cơ bản
        jLabel_XemThongTinTaiKhoan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel_DangXuat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        new LoadData();
        for (NhanVien nv : controller.Controller.arrayListNhanVien) {
            if (nv.getSdtNhanVien().equals(controller.Controller.tk.getSdt())
                    && (controller.Controller.tk.getLoaiTaiKhoan().equals("NhanVien"))) {
                jLabel_PhanQuyen.setText("nhân viên");
                jLabel_TenNguoiDung.setText(nv.getTenNhanVien());
                jTextField_SoDienThoaiNhanVien.setText(nv.getSdtNhanVien());
                jTextField_SoDienThoaiNhanVien.setEnabled(false);
            }
            if (nv.getSdtNhanVien().equals(controller.Controller.tk.getSdt())
                    && (controller.Controller.tk.getLoaiTaiKhoan().equals("QuanLy"))) {
                jLabel_PhanQuyen.setText("quản lý");
                jLabel_TenNguoiDung.setText(nv.getTenNhanVien());
            }
        }
        for (KhachHang kh : controller.Controller.arrayListKhachHang) {
            if (kh.getSdtKhachHang().equals(controller.Controller.tk.getSdt())) {
                jLabel_PhanQuyen.setText("khách hàng");
                jLabel_TenNguoiDung.setText(kh.getTenKhachHang());
                jTextField_SoDienThoaiKhachHang.setText(kh.getSdtKhachHang());
                jTextField_SoDienThoaiKhachHang.setEnabled(false);
                jTextField_SoDienThoaiNhanVien.setVisible(false);
                jLabel_SoDienThoaiNhanVien.setVisible(false);
                jTextField_DiemTichLuy.setText(kh.getDiemTichLuy() + "");

                jCheckBox_TrangThaiThanhToan.setEnabled(false);
            }
        }
    }


    private void jButton_ThoatGiaoDienHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatGiaoDienHoaDonActionPerformed
        // TODO add your handling code here:

          for (int i = 0 ; i < GiaoDienChonGhe.dsVeDi.size(); i++){
              String maGhe = GiaoDienChonGhe.dsVeDi.get(i).getMaGhe().substring(5);
              maGhe = maGhe.substring(0,1).toLowerCase() + maGhe.substring(1);
              GiaoDienChonGhe.dsVeDi.get(i).setMaGhe(maGhe);
          }
          
        new GiaoDienChonGhe().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_ThoatGiaoDienHoaDonActionPerformed
    private boolean baoLoi() {
        new LoadData();
        String sdt = jTextField_SoDienThoaiKhachHang.getText();
        for (int i = 0; i < sdt.length(); i++) {
            if (sdt.charAt(i) < '0' || sdt.charAt(i) > '9') {
                jLabel_BaoLoi2.setForeground(Color.red);
                jTextField_SoDienThoaiKhachHang.setForeground(Color.red);
                jLabel_BaoLoi2.setText("*Vui lòng nhập số");
                return false;
            } else {
                jLabel_BaoLoi2.setForeground(Color.black);
                jTextField_SoDienThoaiKhachHang.setForeground(Color.black);
                jLabel_BaoLoi2.setText("");
            }
        }
        if (jTextField_SoDienThoaiKhachHang.getText().isEmpty()) {
            jLabel_BaoLoi.setText("*Không có sđt khách hàng");
            return false;
        } else {
            jLabel_BaoLoi.setText("");
        }
        return true;
    }
    private void jButton_HoanTatHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HoanTatHoaDonActionPerformed
        // TODO add your handling code here:
        if (baoLoi()==false) {

        } else {
            new LoadData();
            boolean sdtTonTai = false;
            for (TaiKhoan tk : controller.Controller.arrayListTaiKhoan) {
                if (tk.getSdt().equals(jTextField_SoDienThoaiKhachHang.getText())) {
                    sdtTonTai = true;
                    break;
                }
            }
            if (sdtTonTai == false) {
                int luaChon = JOptionPane.showConfirmDialog(this, "Khách hàng không tồn tại, tạo khách hàng mới?",
                        "Khách hàng không tồn tại", JOptionPane.YES_NO_OPTION);
                if (luaChon == JOptionPane.YES_OPTION) {
                    new GiaoDienDangKyTaiKhoan().setVisible(true);
                }
            } else {
                if (kiemTraSuDungDiemTichLuy() == true) {
                    int diemTichLuy = Integer.parseInt(jTextField_DiemTichLuy.getText());
                    int diemTichLuySuDung = Integer.parseInt(jComboBox_SuDungDiemTichLuy.getSelectedItem().toString());
                    int luaChon = JOptionPane.showConfirmDialog(this, "Sau khi hoàn tất hóa đơn điểm tích lũy sẽ là: "
                            + (diemTichLuy - diemTichLuySuDung + this.soVePhoThong * 5 + this.soVeThuongGia * 10), null, JOptionPane.YES_NO_OPTION);
                    if (luaChon == JOptionPane.YES_OPTION) {
                        //gọi hàm sửa thông tin
                        HoaDon hoaDon = new HoaDon();
                        hoaDon.setMaHoaDon(this.maHoaDon);
                        hoaDon.setSdtKhachHang(jTextField_SoDienThoaiKhachHang.getText());
                        String date = new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser_NgayXuatHoaDon.getDate());
                        System.out.println(date);
                        java.util.Date ngayDeParse = null;
                        try {
                            ngayDeParse = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                        } catch (ParseException ex) {
                            Logger.getLogger(GiaoDienHoaDonMotChieu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        java.sql.Date ngayXuatHoaDon = new java.sql.Date(ngayDeParse.getTime());
                        try {
                            hoaDon.setNgayXuatHoaDon(ngayXuatHoaDon);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        if (jCheckBox_TrangThaiThanhToan.isSelected()) {
                            hoaDon.setTrangThaiThanhToan((byte) 1);
                        } else {
                            hoaDon.setTrangThaiThanhToan((byte) 0);
                        }

                        hoaDon.setTongTien(Integer.parseInt(jTextField_TongTien.getText()));
                        hoaDon.setSdtNhanVien(jTextField_SoDienThoaiNhanVien.getText());

                        for (Ve ve : this.danhSachVe) {
                            ve.setMaHoaDon(hoaDon.getMaHoaDon());
//                            ve.setSdtKhachHang(jTextField_SoDienThoaiKhachHang.getText());
                        }
                        if (InsertData.insertHoaDon(hoaDon) == true) {
                            System.out.println("Thêm hóa đơn thành công");
                            if (InsertData.insertVe(danhSachVe) == true) {
                                System.out.println("Thêm danh sách vé thành công");

                                for(Ve v: this.danhSachVe){
                                    if(UpdateData.updateGhe(v.getMaGhe(), (byte) 0)){
                                        System.out.println("Cap nhat ghe "+v.getMaGhe());
                                    }
                                }

                                if (UpdateData.updateDiemTichLuyKhachHang(jTextField_SoDienThoaiKhachHang.getText(), diemTichLuy - diemTichLuySuDung + this.soVePhoThong * 5 + this.soVeThuongGia * 10) == true) {
                                    System.out.println("Cập nhật điểm tích lũy thành công");
                                    this.dispose();
                                    new GiaoDienTimChuyenBay().setVisible(true);
                                }
                            }

                            GiaoDienChonGhe.dsVeDi.removeAll(GiaoDienChonGhe.dsVeDi);//remove để khi tạo hóa đơn khác không bị lặp mã hóa đơn

                        } else {
                            System.out.println("Thêm hóa đơn thất bại");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể hoàn tất hóa đơn");
                }
            }
        }
    }//GEN-LAST:event_jButton_HoanTatHoaDonActionPerformed

    private void jLabel_XemThongTinTaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_XemThongTinTaiKhoanMousePressed
        // TODO add your handling code here:
        if (jLabel_PhanQuyen.getText().equals("nhân viên")) {
            new GiaoDienThongTinNhanVien().setVisible(true);
        }
        if (jLabel_PhanQuyen.getText().equals("quản lý")) {
            new GiaoDienThongTinNhanVien().setVisible(true);
        }
        if (jLabel_PhanQuyen.getText().equals("khách hàng")) {
            new GiaoDienThongTinKhachHang().setVisible(true);
        }
    }//GEN-LAST:event_jLabel_XemThongTinTaiKhoanMousePressed

    private void jLabel_DangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DangXuatMousePressed
        // TODO add your handling code here:
        dispose();
        new GiaoDienDangNhap().setVisible(true);
    }//GEN-LAST:event_jLabel_DangXuatMousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jComboBox_SuDungDiemTichLuyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_SuDungDiemTichLuyItemStateChanged
        // TODO add your handling code here:
        kiemTraSuDungDiemTichLuy();
    }//GEN-LAST:event_jComboBox_SuDungDiemTichLuyItemStateChanged

    private void jTextField_SoDienThoaiKhachHangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SoDienThoaiKhachHangKeyReleased
        // TODO add your handling code here:
        new LoadData();
        String sdt = jTextField_SoDienThoaiKhachHang.getText();
        for (int i = 0; i < sdt.length(); i++) {
            if (sdt.charAt(i) < '0' || sdt.charAt(i) > '9') {
                jLabel_BaoLoi2.setForeground(Color.red);
                jTextField_SoDienThoaiKhachHang.setForeground(Color.red);
                jLabel_BaoLoi2.setText("*Vui lòng nhập số");
            } else {
                jLabel_BaoLoi2.setForeground(Color.black);
                jTextField_SoDienThoaiKhachHang.setForeground(Color.black);
                jLabel_BaoLoi2.setText("");
            }
        }
        for (KhachHang kh : controller.Controller.arrayListKhachHang) {
            if (kh.getSdtKhachHang().equals(jTextField_SoDienThoaiKhachHang.getText())) {
                for (Ve ve : this.danhSachVe) {
//                    ve.setSdtKhachHang(jTextField_SoDienThoaiKhachHang.getText());
                }
                jTextField_DiemTichLuy.setText(kh.getDiemTichLuy() + "");
                break; // thêm vào để khi tìm được k chạy lần lặp tiếp theo
            } else {
                jTextField_DiemTichLuy.setText("0");
            }
        }
        hienThongTin();
    }//GEN-LAST:event_jTextField_SoDienThoaiKhachHangKeyReleased
    private boolean kiemTraSuDungDiemTichLuy() {
        int diemTichLuy = Integer.parseInt(jTextField_DiemTichLuy.getText());
        int diemTichLuySuDung = Integer.parseInt(jComboBox_SuDungDiemTichLuy.getSelectedItem().toString());
        boolean ktra = true;
        if (diemTichLuy < diemTichLuySuDung) {
            jLabel_BaoLoi.setForeground(Color.red);
            jComboBox_SuDungDiemTichLuy.setForeground(Color.red);
            jLabel_BaoLoi.setText("Không đủ điểm tích lũy");
            ktra = false;
        } else {
            jLabel_BaoLoi.setForeground(Color.black);
            jComboBox_SuDungDiemTichLuy.setForeground(Color.black);
            jLabel_BaoLoi.setText("");
            jTextField_TongTien.setText("" + (this.tongTien - this.tongTien * diemTichLuySuDung / 1000));
            ktra = true;
        }
        return ktra;
    }

    private void hienThongTin() {
        new LoadData();
        int index = 0;
        dtmChuyenBay.setRowCount(0);
        dtmVe.setRowCount(0);
        this.soVePhoThong = 0;
        this.soVeThuongGia = 0;
        for (ChuyenBay cb : controller.Controller.arrayListChuyenBay) {

            if (cb.getMaChuyenBay().equals(this.maChuyenBayDi.trim())) {

                dtmChuyenBay.addRow(new Object[]{
                    cb.getMaChuyenBay(), cb.getMaMayBay(), cb.getMaSanBayDi(), cb.getMaSanBayDen(), new SimpleDateFormat("dd/MM/yyyy").format(cb.getNgayBay()),
                    cb.getGioBay(), cb.getGhiChu(), cb.getKhoangCach()
                });
                index = controller.Controller.arrayListChuyenBay.indexOf(cb);
                this.giaCoBan = cb.getKhoangCach() * 500;
            }
        }
        for (Ve v : this.danhSachVe) {
//            v.setSdtKhachHang(jTextField_SoDienThoaiKhachHang.getText());
            for (Ghe g : controller.Controller.arrayListChuyenBay.get(index).getArrayListGhe()) {
                if (v.getMaGhe().equalsIgnoreCase(g.getMaGhe())) {
                    if (g.getLoaiGhe().equalsIgnoreCase("PhoThong")) {
                        this.soVePhoThong++;
                        v.setGia(this.giaCoBan);
                    }
                    if (g.getLoaiGhe().equalsIgnoreCase("ThuongGia")) {
                        this.soVeThuongGia++;
                        v.setGia(giaCoBan * phanTramGiaThuongGia);
                    }
                }
            }
            if (v.getNgaySinh() != null) {
                dtmVe.addRow(new Object[]{
                    v.getMaVe(), v.getMaChuyenBay(), v.getGia(), v.getKyGui(),
                    v.getCmndNguoiBay(), v.getTenNguoiBay(), new SimpleDateFormat("dd/MM/yyyy").format(v.getNgaySinh()),
                    v.getMaHoaDon(), v.getMaGhe()
                });
            } else {
                dtmVe.addRow(new Object[]{
                    v.getMaVe(), v.getMaChuyenBay(), v.getGia(), v.getKyGui(),
                    v.getCmndNguoiBay(), v.getTenNguoiBay(), "",
                    v.getMaHoaDon(), v.getMaGhe()
                });
            }
        }
//        //
//        for(KhachHang kh : controller.Controller.arrayListKhachHang){
//            if(jTextField_SoDienThoaiKhachHang.getText().equalsIgnoreCase(kh.getSdtKhachHang())){
//                jTextField_DiemTichLuy.setText(kh.getDiemTichLuy()+"");
//            }
//        }
//        //
        jTextField_SLVePhoThong.setText("" + soVePhoThong);
        jTextField_SLVeThuongGia.setText("" + soVeThuongGia);
        jTextField_GiaVePhoThong.setText("" + giaCoBan);
        jTextField_GiaVeThuongGia.setText("" + giaCoBan * phanTramGiaThuongGia);

        this.tongTien = soVePhoThong * giaCoBan + soVeThuongGia * giaCoBan * phanTramGiaThuongGia;

        jTextField_TongTien.setText("" + tongTien);
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
            java.util.logging.Logger.getLogger(GiaoDienHoaDonMotChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienHoaDonMotChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienHoaDonMotChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienHoaDonMotChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                ArrayList<Ve> danhSachVe = new ArrayList<>();
//                String maChuyenBayDi = "CB01";
//                String maHoaDon = "HD01";
//
//                Ve v1 = new Ve();
//                v1.setKyGui((short) 20);
//                v1.setMaVe("V01");
//                v1.setCmndNguoiBay("CMNDNgu");
//                v1.setMaChuyenBay("CB01");
//                v1.setMaHoaDon(maHoaDon);
//                v1.setMaGhe("A01-CB01");
////                v1.setEmailNguoiBay("emai1");
////                v1.setTrangThaiDoi((byte) 0);
////                v1.setTrangThaiVe((byte) 0);
////                v1.setSdtKhachHang("");
//                v1.setGia(0);
//                v1.setTenNguoiBay("ten n");
////                v1.setSdtNguoiBay("123");
//
//                Ve v2 = new Ve();
//                v2.setKyGui((short) 20);
//                v2.setMaVe("V02");
//                v2.setCmndNguoiBay("CMNDNgu");
//                v2.setMaChuyenBay("CB01");
//                v2.setMaHoaDon(maHoaDon);
//                v2.setMaGhe("A02-CB01");
////                v2.setEmailNguoiBay("emailNo");
////                v2.setTrangThaiDoi((byte) 0);
////                v2.setTrangThaiVe((byte) 0);
////                v2.setSdtKhachHang("");
//                v2.setGia(0);
//                v2.setTenNguoiBay("ten ngu2");
////                v2.setSdtNguoiBay("223");
//
//                danhSachVe.add(v1);
//                danhSachVe.add(v2);
//
//                for (Ve v : danhSachVe) {
//                    System.out.println(v.toString());
//                }
             //   new GiaoDienHoaDonMotChieu(danhSachVe).setVisible(true);
               new GiaoDienHoaDonMotChieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_HoanTatHoaDon;
    private javax.swing.JButton jButton_ThoatGiaoDienHoaDon;
    private javax.swing.JCheckBox jCheckBox_TrangThaiThanhToan;
    private javax.swing.JComboBox<String> jComboBox_SuDungDiemTichLuy;
    private com.toedter.calendar.JDateChooser jDateChooser_NgayXuatHoaDon;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_AirLines;
    private javax.swing.JLabel jLabel_BaoLoi;
    private javax.swing.JLabel jLabel_BaoLoi2;
    private javax.swing.JLabel jLabel_ChuyenBayDaChon;
    private javax.swing.JLabel jLabel_ChuyenBayDaChon1;
    private javax.swing.JLabel jLabel_DangXuat;
    private javax.swing.JLabel jLabel_DauChamHoi;
    private javax.swing.JLabel jLabel_DiemTichLuy;
    private javax.swing.JLabel jLabel_HPT;
    private javax.swing.JLabel jLabel_IconMayBay;
    private javax.swing.JLabel jLabel_NgayXuatHoaDon;
    private javax.swing.JLabel jLabel_PhanQuyen;
    private javax.swing.JLabel jLabel_PhoThong;
    private javax.swing.JLabel jLabel_SoDienThoaiKhachHang;
    private javax.swing.JLabel jLabel_SoDienThoaiNhanVien;
    private javax.swing.JLabel jLabel_TenNguoiDung;
    private javax.swing.JLabel jLabel_ThuongGia;
    private javax.swing.JLabel jLabel_ThuongGia1;
    private javax.swing.JLabel jLabel_TongTien;
    private javax.swing.JLabel jLabel_VeDaChon;
    private javax.swing.JLabel jLabel_XemThongTinTaiKhoan;
    private javax.swing.JLabel jLabel_XinChao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_TaiKhoan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable_ChuyenBayDaChon;
    private javax.swing.JTable jTable_VeDaChon;
    private javax.swing.JTextField jTextField_DiemTichLuy;
    private javax.swing.JTextField jTextField_GiaVePhoThong;
    private javax.swing.JTextField jTextField_GiaVeThuongGia;
    private javax.swing.JTextField jTextField_SLVePhoThong;
    private javax.swing.JTextField jTextField_SLVeThuongGia;
    private javax.swing.JTextField jTextField_SoDienThoaiKhachHang;
    private javax.swing.JTextField jTextField_SoDienThoaiNhanVien;
    private javax.swing.JTextField jTextField_TongTien;
    // End of variables declaration//GEN-END:variables
}
