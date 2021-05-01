/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HoaDon;
import model.KhachHang;
import model.TaiKhoan;
import model.Ve;

/**
 *
 * @author conghau
 */
public class InsertData {

    public static void insertTaiKhoan(TaiKhoan taiKhoan) {
        String sqlCommand = "insert into dbo.TAIKHOAN values(?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, taiKhoan.getTenDangNhap());
            ps.setString(2, taiKhoan.getMatKhau());
            ps.setString(3, taiKhoan.getLoaiTaiKhoan());
            ps.setString(4, taiKhoan.getSdt());
            ps.executeUpdate();

            System.out.println("thanh cong");
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void insertKhachHang(KhachHang khachHang) {
        String sqlCommand = "insert into dbo.KHACHHANG values(?,?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, khachHang.getSdtKhachHang());
            ps.setString(2, khachHang.getTenKhachHang());
            ps.setString(3, khachHang.getEmail());
            ps.setString(4, khachHang.getDiaChi());
            ps.setString(5, khachHang.getTenDangNhap());
            ps.setString(6, khachHang.getCmnd());
            ps.setInt(7, khachHang.getDiemTichLuy());

            ps.executeUpdate();

            System.out.println("thanh cong1");
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//    29/04, chua test
//    
    public static boolean insertHoaDon(HoaDon hoaDon) {
        String sqlCommand = "insert into dbo.HOADON values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, hoaDon.getMaHoaDon());
            ps.setString(2, hoaDon.getSdtKhachHang());
            ps.setDate(3, hoaDon.getNgayXuatHoaDon());
            ps.setByte(4, hoaDon.getTrangThaiThanhToan());
            ps.setInt(5, hoaDon.getTongTien());
            ps.setString(6, hoaDon.getSdtNhanVien());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("them hoa don that bai");
        return false;
    }

    public static boolean insertVe(ArrayList<Ve> danhSachVe) {
        String sqlCommand = "insert into dbo.VE values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            for (Ve v : danhSachVe) {
                DataConnection.createStatement();
                PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
                ps.setString(1, v.getMaVe());
                ps.setString(2, v.getSdtKhachHang());
                ps.setString(3, v.getMaChuyenBay());
                ps.setInt(4, v.getGia());
                ps.setShort(5, v.getKyGui());
                ps.setByte(6, v.getTrangThaiDoi());
                ps.setByte(7, v.getTrangThaiVe());
                ps.setString(8, v.getCmndNguoiBay());
                ps.setString(9, v.getTenNguoiBay());
                ps.setString(10, v.getEmailNguoiBay());
                ps.setString(11, v.getSdtNguoiBay());
                ps.setString(12, v.getMaHoaDon());
                ps.setString(13, v.getMaGhe());              
                if(!(ps.executeUpdate()>0)){
                    System.out.println("Khong the them danh sach ve");
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Them danh sach ve thanh cong.");
        return true;
    }
//    
//    
    
}
