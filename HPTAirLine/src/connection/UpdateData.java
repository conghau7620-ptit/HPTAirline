/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KhachHang;
import model.NhanVien;
import model.TaiKhoan;

/**
 *
 * @author t0168
 */
public class UpdateData {

    public static boolean updateKhachHang(KhachHang khachHang) {
        String sqlCommand = "update dbo.KHACHHANG set TenKhachHang=?, Email=?, DiaChi=?, CMND=?, DiemTichLuy=?"
                + " where SoDienThoaiKhachHang=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
//            ps.setString(1,khachHang.getSdtKhachHang());
            ps.setString(1, khachHang.getTenKhachHang());
            ps.setString(2, khachHang.getEmail());
            ps.setString(3, khachHang.getDiaChi());
//            ps.setString(5, khachHang.getTenDangNhap());
            ps.setString(4, khachHang.getCmnd());
            ps.setInt(5, khachHang.getDiemTichLuy());
            ps.setString(6, khachHang.getSdtKhachHang());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sua khach hang that bai");
        return false;
    }

    public static boolean updateNhanVien(NhanVien nhanVien) {
        String sqlCommand = "update dbo.NHANVIEN set TenNhanVien=?, DiaChi=?, CMND=?"
                + " where SoDienThoaiNhanVien=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, nhanVien.getTenNhanVien());
            ps.setString(2, nhanVien.getDiaChi());
            ps.setString(3, nhanVien.getCmnd());
            ps.setString(4, nhanVien.getSdtNhanVien());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sua nhan vine that bai");
        return false;
    }
    // đổi mật khẩu
    public static boolean updateTaiKhoan (TaiKhoan taiKhoan) {
        String sqlCommand = "update dbo.TAIKHOAN set MatKhau=?"
                + " where TenDangNhap=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1,taiKhoan.getMatKhau());
            ps.setString(2,taiKhoan.getTenDangNhap());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sua mk that bai");
        return false;
    }
}
