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
import model.TaiKhoan;

/**
 *
 * @author conghau
 */
public class InsertData {
    public static void insertTaiKhoan (TaiKhoan taiKhoan) {
        String sqlCommand = "insert into dbo.TAIKHOAN values(?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1,taiKhoan.getTenDangNhap());
            ps.setString(2,taiKhoan.getMatKhau());
            ps.setString(3,taiKhoan.getLoaiTaiKhoan());
            ps.setString(4,taiKhoan.getSdt());
            ps.executeUpdate();
            
            System.out.println("thanh cong");
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void insertKhachHang (KhachHang khachHang) {
        String sqlCommand = "insert into dbo.KHACHHANG values(?,?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1,khachHang.getSdtKhachHang());
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
}
