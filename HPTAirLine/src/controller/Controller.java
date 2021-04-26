/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connection.DataConnection;
import connection.LoadData;
import static connection.LoadData.loadTableGhe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChuyenBay;
import model.HoaDon;
import model.KhachHang;
import model.MayBay;
import model.NhanVien;
import model.SanBay;
import model.TaiKhoan;
import model.Ve;

/**
 *
 * @author conghau
 */
public class Controller {

    public static ArrayList<ChuyenBay> arrayListChuyenBay = new ArrayList<ChuyenBay>();
    public static ArrayList<HoaDon> arrayListHoaDon = new ArrayList<HoaDon>();
    public static ArrayList<KhachHang> arrayListKhachHang = new ArrayList<KhachHang>();
    public static ArrayList<MayBay> arrayListMayBay = new ArrayList<MayBay>();
    public static ArrayList<NhanVien> arrayListNhanVien = new ArrayList<NhanVien>();
    public static ArrayList<SanBay> arrayListSanBay = new ArrayList<SanBay>();
    public static ArrayList<TaiKhoan> arrayListTaiKhoan = new ArrayList<TaiKhoan>();
    public static ArrayList<Ve> arrayListVe = new ArrayList<Ve>();
    //them list ket qua tim kiem
    public static ArrayList<ChuyenBay> arrayListKetQuaTimKiemChuyenBay = new ArrayList<ChuyenBay>();
    //
    public static TaiKhoan tk = new TaiKhoan();
    //
    public static void loadKetQuaTheoNgay(String maSanBayDi, String maSanBayDen, String ngayDi) {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.CHUYENBAY where MaSanBayDi like '%" + maSanBayDi + "%' and "
                + "MaSanBayDen like '%" + maSanBayDen + "%' and  NgayBay like '%" + ngayDi + "%'");

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
                chuyenBay.setArrayListGhe(loadTableGhe(chuyenBay.getMaChuyenBay().trim()));
                Controller.arrayListKetQuaTimKiemChuyenBay.add(chuyenBay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        new LoadData();
    }
}
