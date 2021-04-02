/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import controller.Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author conghau
 */
public class LoadData {
    
    public static void loadTableChuyenBay() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.CHUYENBAY");
        try {
            while (rs.next()) {
                ChuyenBay chuyenBay = new ChuyenBay(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getDate(5),
                    rs.getTime(6),
                    rs.getString(7),
                    rs.getInt(8));
                Controller.arrayListChuyenBay.add(chuyenBay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void loadTableGhe() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.GHE");
        try {
            while (rs.next()) {
                Ghe ghe = new Ghe(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getByte(4));
                Controller.arrayListGhe.add(ghe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void loadTableHoaDon() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.HOADON");
        try {
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getDate(3),
                    rs.getByte(4),
                    rs.getInt(5));
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
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7));
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
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4),
                    rs.getInt(5));
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
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5));
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
                    rs.getString(1),
                    rs.getString(2));
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
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3));
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
                Ve ve = new Ve(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4),
                    rs.getShort(5),
                    rs.getByte(6),
                    rs.getByte(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13));
                Controller.arrayListVe.add(ve);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LoadData() {
        loadTableChuyenBay();
        loadTableGhe();
        loadTableHoaDon();
        loadTableKhachHang();
        loadTableMayBay();
        loadTableNhanVien();
        loadTableSanBay();
        loadTableTaiKhoan();
        loadTableVe();
    }
    
    
}
