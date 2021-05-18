/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connection.DataConnection;
import connection.InsertData;
import connection.LoadData;
import static connection.LoadData.loadTableGhe;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public static boolean insertListGhe(String maCB) {
        String sqlCommand = "insert into dbo.GHE values(?,?,?,?)";
        try {
            for(int i=1;i<=15;i++){
                DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            Ghe gheA;
            if(i<=5){
                gheA = new Ghe("GA"+i+"-"+maCB,maCB,"ThuongGia",(byte)1);
            }else{
                gheA = new Ghe("GA"+i+"-"+maCB,maCB,"PhoThong",(byte)1);
            }
            
            ps.setString(1, gheA.getMaGhe());
            ps.setString(2, gheA.getMaChuyenBay());
            ps.setString(3, gheA.getLoaiGhe());
            ps.setByte(4, gheA.getTrong());
  
            ps.executeUpdate();
            }
            for(int i=1;i<=15;i++){
                DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            Ghe gheB;
            if(i<=5){
                gheB = new Ghe("GB"+i+"-"+maCB,maCB,"ThuongGia",(byte)1);
            }else{
                gheB = new Ghe("GB"+i+"-"+maCB,maCB,"PhoThong",(byte)1);
            }
            
            ps.setString(1, gheB.getMaGhe());
            ps.setString(2, gheB.getMaChuyenBay());
            ps.setString(3, gheB.getLoaiGhe());
            ps.setByte(4, gheB.getTrong());
  
            ps.executeUpdate();
            }
            for(int i=1;i<=15;i++){
                DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            Ghe gheC;
            if(i<=5){
                gheC = new Ghe("GC"+i+"-"+maCB,maCB,"ThuongGia",(byte)1);
            }else{
                gheC = new Ghe("GC"+i+"-"+maCB,maCB,"PhoThong",(byte)1);
            }
            
            ps.setString(1, gheC.getMaGhe());
            ps.setString(2, gheC.getMaChuyenBay());
            ps.setString(3, gheC.getLoaiGhe());
            ps.setByte(4, gheC.getTrong());
  
            ps.executeUpdate();
            }
            for(int i=1;i<=15;i++){
                DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            Ghe gheD;
            if(i<=5){
                gheD = new Ghe("GD"+i+"-"+maCB,maCB,"ThuongGia",(byte)1);
            }else{
                gheD = new Ghe("GD"+i+"-"+maCB,maCB,"PhoThong",(byte)1);
            }
            
            ps.setString(1, gheD.getMaGhe());
            ps.setString(2, gheD.getMaChuyenBay());
            ps.setString(3, gheD.getLoaiGhe());
            ps.setByte(4, gheD.getTrong());
  
            ps.executeUpdate();
            }
            for(int i=1;i<=15;i++){
                DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            Ghe gheE;
            if(i<=5){
                gheE = new Ghe("GE"+i+"-"+maCB,maCB,"ThuongGia",(byte)1);
            }else{
                gheE = new Ghe("GE"+i+"-"+maCB,maCB,"PhoThong",(byte)1);
            }
            
            ps.setString(1, gheE.getMaGhe());
            ps.setString(2, gheE.getMaChuyenBay());
            ps.setString(3, gheE.getLoaiGhe());
            ps.setByte(4, gheE.getTrong());
  
            ps.executeUpdate();
            }
            
            for(int i=1;i<=15;i++){
                DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            Ghe gheF;
            if(i<=5){
                gheF = new Ghe("GF"+i+"-"+maCB,maCB,"ThuongGia",(byte)1);
            }else{
                gheF = new Ghe("GF"+i+"-"+maCB,maCB,"PhoThong",(byte)1);
            }
            
            ps.setString(1, gheF.getMaGhe());
            ps.setString(2, gheF.getMaChuyenBay());
            ps.setString(3, gheF.getLoaiGhe());
            ps.setByte(4, gheF.getTrong());
  
            ps.executeUpdate();
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    public static void main(String[] args) {
        new LoadData();
        insertListGhe("CB07");
    }
}
