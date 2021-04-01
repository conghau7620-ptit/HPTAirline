/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connection.LoadData;
import java.util.ArrayList;
import model.ChuyenBay;
import model.Ghe;
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
    public static ArrayList<Ghe> arrayListGhe = new ArrayList<Ghe>();
    public static ArrayList<HoaDon> arrayListHoaDon = new ArrayList<HoaDon>();
    public static ArrayList<KhachHang> arrayListKhachHang = new ArrayList<KhachHang>();
    public static ArrayList<MayBay> arrayListMayBay = new ArrayList<MayBay>();
    public static ArrayList<NhanVien> arrayListNhanVien = new ArrayList<NhanVien>();
    public static ArrayList<SanBay> arrayListSanBay = new ArrayList<SanBay>();
    public static ArrayList<TaiKhoan> arrayListTaiKhoan = new ArrayList<TaiKhoan>();
    public static ArrayList<Ve> arrayListVe = new ArrayList<Ve>();
    
    public static void main(String[] args) {
        new LoadData();
    }
}
