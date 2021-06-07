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
import model.Ghe;
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
    public static boolean updateDiemTichLuyKhachHang(String sdtKhachHang, int diemTichLuy) {
        String sqlCommand = "update dbo.KHACHHANG set DiemTichLuy=?"
                + " where SoDienThoaiKhachHang=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, diemTichLuy);
            ps.setString(2, sdtKhachHang);

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
        System.out.println("Sửa nhân viên thất bại");
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
    

    public static boolean updateGhe(String maGhe, byte trangThaiGhe){
        byte trong = trangThaiGhe;
        String sqlCommand = "update dbo.GHE set Trong=?"

                + " where MaGhe=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setByte(1,trong);
            ps.setString(2,maGhe);
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sua ghe that bai");
        return false;
    }
    
    public static boolean updateHoaDon(String maHoaDon, int tongTien){
         String sqlCommand = "update dbo.HOADON set TongTien=?"
                + " where MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1,tongTien);
            ps.setString(2,maHoaDon);
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sua ghe that bai");
        return false;
    }
    public static boolean updateHoaDon(String maHoaDon, byte trangThaiThanhToan){
        
         String sqlCommand = "update dbo.HOADON set TrangThaiThanhToan=?"
                + " where MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, trangThaiThanhToan);
            ps.setString(2,maHoaDon);
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sua ghe that bai");
        return false;
    }
    
    public static boolean deleteVe(String maVe, String maHoaDon){
         String sqlCommand = "delete from dbo.VE where MaVe=? and MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand); 
            ps.setString(1, maVe);
            ps.setString(2, maHoaDon);
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xoa ve that bai");
        return false;
    }
    
    public static boolean deleteHoaDon(String maHoaDon) {
        String sqlCommand = "delete from dbo.HOADON where MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maHoaDon);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xoa hóa đơn that bai");
        return false;
    }
    
        public static boolean deleteNhanVien(String sdtNhanVien) {
        String sqlCommand = "delete from dbo.NHANVIEN where SoDienThoaiNhanVien=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, sdtNhanVien);
            if(ps.executeUpdate() > 0){
                System.out.println("Xóa nhân viên thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa nhân viên thất bại");
        return false;
    }
}
