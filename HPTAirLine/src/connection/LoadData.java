/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import controller.Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author conghau
 */
public class LoadData {

    public static int phanTramThuongGia = 2;

    public static void loadTableChuyenBay() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.CHUYENBAY");
        try {
            while (rs.next()) {
                ChuyenBay chuyenBay = new ChuyenBay(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getString(4).trim(),
                        rs.getDate(5),
                        rs.getTime(6),
                        rs.getString(7),
                        rs.getInt(8));
                chuyenBay.setArrayListGhe(loadTableGhe(chuyenBay.getMaChuyenBay().trim()));

//                for (Ghe g: chuyenBay.getArrayListGhe()) {
//                    System.out.print(g.getMaGhe() + " ");
//                }
//                System.out.println("");
                Controller.arrayListChuyenBay.add(chuyenBay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Ghe> loadTableGhe(String maChuyenBay) {
        ArrayList<Ghe> arrayListGhe = new ArrayList<Ghe>();
        ResultSet rs = DataConnection.retrieveData("select * from dbo.GHE where MaChuyenBay like '%" + maChuyenBay + " %'");
        try {
            while (rs.next()) {
                Ghe ghe = new Ghe(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getByte(4));
                arrayListGhe.add(ghe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayListGhe;
    }

    public static void loadTableHoaDon() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.HOADON");
        try {
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getDate(3),
                        rs.getByte(4),
                        rs.getInt(5),
                        rs.getString(6).trim());
                Controller.arrayListHoaDon.add(hoaDon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableKhachHang() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.KHACHHANG");
        try {
            while (rs.next()) {
                KhachHang khachHang = new KhachHang(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5).trim(),
                        rs.getString(6).trim(),
                        rs.getInt(7));
                Controller.arrayListKhachHang.add(khachHang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableMayBay() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.MAYBAY");
        try {
            while (rs.next()) {
                MayBay mayBay = new MayBay(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim());
//                    rs.getInt(4),
//                    rs.getInt(5));
                Controller.arrayListMayBay.add(mayBay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableNhanVien() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.NHANVIEN");
        try {
            while (rs.next()) {
                NhanVien nhanVien = new NhanVien(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getString(4).trim(),
                        rs.getString(5).trim());
                Controller.arrayListNhanVien.add(nhanVien);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableSanBay() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.SANBAY");
        try {
            while (rs.next()) {
                SanBay sanBay = new SanBay(
                        rs.getString(1).trim(),
                        rs.getString(2).trim());
                Controller.arrayListSanBay.add(sanBay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableTaiKhoan() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.TAIKHOAN");
        try {
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getString(4).trim());
                Controller.arrayListTaiKhoan.add(taiKhoan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableVe() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.VE");
        try {
            while (rs.next()) {
//                short a = rs.getShort(4);
                Ve ve = new Ve(
                        //                    rs.getString(1).trim(),
                        //                    rs.getString(2).trim(),
                        //                    rs.getString(3).trim(),
                        //                    rs.getInt(4),
                        //                    rs.getShort(5),
                        //                    rs.getByte(6),
                        //                    rs.getByte(7),
                        //                    rs.getString(8).trim(),
                        //                    rs.getString(9).trim(),
                        //                    rs.getString(10).trim(),
                        //                    rs.getString(11).trim(),
                        //                    rs.getString(12).trim(),
                        //                    rs.getString(13).trim());
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        //                    rs.getString(3).trim(),
                        rs.getInt(3),
                        rs.getShort(4),
                        //                    rs.getByte(6),
                        //                    rs.getByte(7),
                        //                    rs.getString(8).trim(),
                        //                    rs.getString(9).trim(),
                        rs.getString(5).trim(),
                        rs.getString(6).trim(),
                        rs.getDate(7),
                        rs.getString(8).trim(),
                        rs.getString(9).trim());
//                    ve.setKyGui(a);
                Controller.arrayListVe.add(ve);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean xoaCacHoaDonChuaThanhToanCuaChuyenBay() {
        for (ChuyenBay cb : controller.Controller.arrayListChuyenBay) {
            ArrayList<String> listMaHoaDonCuaChuyenBay = new ArrayList();

            System.out.println(cb.getMaChuyenBay());

            if (checkDenThoiGianXoaHayChua(cb.getMaChuyenBay())) {
                for (Ve v : controller.Controller.arrayListVe) {
                    if (v.getMaChuyenBay().equalsIgnoreCase(cb.getMaChuyenBay())) {
                        if (listMaHoaDonCuaChuyenBay.contains(v.getMaHoaDon())) {

                        } else {
                            listMaHoaDonCuaChuyenBay.add(v.getMaHoaDon());
                        }
                    }
                }
                for (String maHoaDon : listMaHoaDonCuaChuyenBay) {
                    System.out.println(maHoaDon);
                    xoaHoaDonKemVeVaTraDiemChoKhachHang(maHoaDon);
                }
            }

        }
        return true;
    }

    public static boolean xoaHoaDonKemVeVaTraDiemChoKhachHang(String maHoaDon) {
        String sdtKhachHang = "";
        int tongTienThucTe = 0;
        for (HoaDon hd : controller.Controller.arrayListHoaDon) {
            if (hd.getMaHoaDon().equalsIgnoreCase(maHoaDon)) {
                sdtKhachHang = hd.getSdtKhachHang();
                tongTienThucTe = hd.getTongTien();
            }
        }

//            String maVe = (String) jTable_VeDaChon.getValueAt(row, 0);\
        String maVe = "";
//            String maGhe = (String) jTable_VeDaChon.getValueAt(row, 12);
//            String hangGheCuaVeDaChon = "";
        int giaCoBan = 0;
        int soVePhoThong = 0;
        int soVeThuongGia = 0;
        int index = -1;

        byte trangThaiThanhToan = 0;
        // xem hoa don da thanh toan hay chua
        for (HoaDon hd : controller.Controller.arrayListHoaDon) {
            if (hd.getMaHoaDon().equals(maHoaDon)) {
                trangThaiThanhToan = hd.getTrangThaiThanhToan();
            }
        }

        if (trangThaiThanhToan == 1) {
            System.out.println("*Hóa đơn đã thanh toán, không thể xóa");
        } else {

            //lấy mã vé trong hóa đơn từ đó lấy ra mã chuyến bay
            for (Ve v : controller.Controller.arrayListVe) {
                if (v.getMaHoaDon().equalsIgnoreCase(maHoaDon)) {
                    maVe = v.getMaVe();
                }
            }

            // tính giá cơ bản
            for (Ve v : controller.Controller.arrayListVe) {
                if (maVe.equals(v.getMaVe()) && v.getMaHoaDon().equals(maHoaDon)) {
                    for (ChuyenBay cb : controller.Controller.arrayListChuyenBay) {
                        if (v.getMaChuyenBay().equals(cb.getMaChuyenBay())) {
                            index = controller.Controller.arrayListChuyenBay.indexOf(cb);
                            giaCoBan = cb.getKhoangCach() * 500;
                            break;
                        }
                    }
                }
            }
            System.out.println(index);
            //
            // tìm số ghế phổ thông, thương gia trong hóa đơn đã chọn
            for (Ve v : controller.Controller.arrayListVe) {
                if (v.getMaHoaDon().equals(maHoaDon)) {
                    for (Ghe g : controller.Controller.arrayListChuyenBay.get(index).getArrayListGhe()) {
                        if (v.getMaGhe().equals(g.getMaGhe())) {
                            if (g.getLoaiGhe().equals("PhoThong")) {
                                soVePhoThong++;
                            }
                            if (g.getLoaiGhe().equals("ThuongGia")) {
                                soVeThuongGia++;
                            }
                        }
                    }
                }
            }
            //
            //từ các bước trên suy ra được điểm đã dùng, giá gốc, giá sau khi dùng,...
//                System.out.println("hạng ghế của vé đã chọn:" + hangGheCuaVeDaChon);
            System.out.println("PhoThong " + soVePhoThong + "ThuongGia " + soVeThuongGia);

            System.out.println("tong tien thuc te: " + tongTienThucTe);
            int tongTienGoc = soVePhoThong * giaCoBan + soVeThuongGia * giaCoBan * phanTramThuongGia;
            System.out.println("tong tien goc: " + tongTienGoc);
            int diemTichLuyKhachDaDung = (tongTienGoc * 1000 - tongTienThucTe * 1000) / tongTienGoc;
            System.out.println("diem da dung: " + diemTichLuyKhachDaDung);
            int diemTichLuyHienTaiCuaKhachHang = 0;
            // lấy điểm tích lũy hiện tại của khách hàng
            for (KhachHang kh : controller.Controller.arrayListKhachHang) {
                if (sdtKhachHang.equals(kh.getSdtKhachHang())) {
                    diemTichLuyHienTaiCuaKhachHang = kh.getDiemTichLuy();
                    break;
                }
            }

            System.out.println("diem còn lại của khách " + diemTichLuyHienTaiCuaKhachHang);
            int diemTichLuySauXoa = 0;

            diemTichLuySauXoa = diemTichLuyHienTaiCuaKhachHang - soVePhoThong * 5 - soVeThuongGia * 10 + diemTichLuyKhachDaDung;
            System.out.println("Điểm tích lũy sau khi xóa hóa đơn: " + diemTichLuySauXoa);

            // cập nhật trạng thái ghế
            for (Ve v : controller.Controller.arrayListVe) {
                if (v.getMaHoaDon().equals(maHoaDon)) {
                    for (Ghe g : controller.Controller.arrayListChuyenBay.get(index).getArrayListGhe()) {
                        if (v.getMaGhe().equals(g.getMaGhe())) {
                            connection.UpdateData.updateGhe(v.getMaGhe(), (byte) 1); // cập nhật các ghế có trong hóa đơn thành trống
                        }
                    }
                    connection.UpdateData.deleteVe(v.getMaVe(), maHoaDon); // xóa các vé có trong hóa đơn

                }

            }

//                    connection.UpdateData.deleteHoaDon(maHoaDon); // xóa hóa đơn
//
//                    connection.UpdateData.updateDiemTichLuyKhachHang(sdtKhachHang, diemTichLuySauXoa);// cập nhật lại điểm cho khách
            if (connection.UpdateData.deleteHoaDon(maHoaDon)) {
                if (connection.UpdateData.updateDiemTichLuyKhachHang(sdtKhachHang, diemTichLuySauXoa)) {
                    System.err.println("Xóa hóa đơn thành công");
                }
            }
        }
        return true;
    }

    public static boolean checkDenThoiGianXoaHayChua(String maChuyenBay) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateChuyenBay = new Date();
        Date dateNow = Calendar.getInstance().getTime();
        for (ChuyenBay cb : Controller.arrayListChuyenBay) {
            if (cb.getMaChuyenBay().equalsIgnoreCase(maChuyenBay)) {
                String d = cb.getNgayBay().toString() + " " + cb.getGioBay().toString();
                try {
                    dateChuyenBay = dateFormat.parse(d);
                } catch (ParseException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println(" Date may bay " + dateFormat.format(dateChuyenBay));
        System.out.println(" Date hien tai " + dateFormat.format(dateNow));
        // Convert Date to Calendar
        Calendar c = Calendar.getInstance();
        c.setTime(dateChuyenBay);
//        c.add(Calendar.YEAR, 2);
//        c.add(Calendar.MONTH, 1);
//        c.add(Calendar.DATE, -10);
        c.add(Calendar.HOUR, -2);
//        c.add(Calendar.MINUTE, 30);
//        c.add(Calendar.SECOND, 50);

        // đổi lại
        Date ngayGioSeBiXoa = c.getTime();

        System.out.println("Ngay cac hoa don chua thanh toan bi xoa  " + dateFormat.format(ngayGioSeBiXoa));

        if (dateNow.after(ngayGioSeBiXoa)) {
            System.out.println("Bi Xoa");
            return true;
        }
        System.out.println("Chua Xoa");

        return false;
    }

    //
    public LoadData() {
        controller.Controller.arrayListChuyenBay.removeAll(controller.Controller.arrayListChuyenBay);
        controller.Controller.arrayListHoaDon.removeAll(controller.Controller.arrayListHoaDon);
        controller.Controller.arrayListKhachHang.removeAll(controller.Controller.arrayListKhachHang);
        controller.Controller.arrayListMayBay.removeAll(controller.Controller.arrayListMayBay);
        controller.Controller.arrayListNhanVien.removeAll(controller.Controller.arrayListNhanVien);
        controller.Controller.arrayListSanBay.removeAll(controller.Controller.arrayListSanBay);
        controller.Controller.arrayListTaiKhoan.removeAll(controller.Controller.arrayListTaiKhoan);
        controller.Controller.arrayListVe.removeAll(controller.Controller.arrayListVe);
        loadTableChuyenBay();
        loadTableHoaDon();
        loadTableKhachHang();
        loadTableMayBay();
        loadTableNhanVien();
        loadTableSanBay();
        loadTableTaiKhoan();
        loadTableVe();
        xoaCacHoaDonChuaThanhToanCuaChuyenBay();
    }

}
