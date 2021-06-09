/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import controller.Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public static void loadTableDuongBay(){
        ResultSet rs = DataConnection.retrieveData("select * from dbo.DUONGBAY");
        try {
            while (rs.next()) {
                DuongBay duongBay = new DuongBay(
                    rs.getString(1).trim(),
                    rs.getString(2).trim(),
                    rs.getString(3).trim(),
                    rs.getInt(4));

                Controller.arrayListDuongBay.add(duongBay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Ghe> loadTableGhe(String maChuyenBay){ 
        ArrayList<Ghe> arrayListGhe = new ArrayList<Ghe>();
        ResultSet rs = DataConnection.retrieveData("select * from dbo.GHE where MaChuyenBay like '%"+ maChuyenBay +" %'");
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
                    rs.getString(3).trim(),
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
                    rs.getString(7).trim(),
                    rs.getString(8).trim());
//                    ve.setKyGui(a);
                Controller.arrayListVe.add(ve);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        controller.Controller.arrayListDuongBay.removeAll(controller.Controller.arrayListDuongBay);
        loadTableChuyenBay();
        loadTableHoaDon();
        loadTableKhachHang();
        loadTableMayBay();
        loadTableNhanVien();
        loadTableSanBay();
        loadTableTaiKhoan();
        loadTableVe();
        loadTableDuongBay();
    }
    
    
}
