/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author conghau
 */
public class HoaDon {
    private String maHoaDon;
    private String maKhachHang;
    private Date ngayXuatHoaDon;
    private Byte trangThaiThanhToan;
    private int tongTien;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maKhachHang, Date ngayXuatHoaDon, Byte trangThaiThanhToan, int tongTien) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.ngayXuatHoaDon = ngayXuatHoaDon;
        this.trangThaiThanhToan = trangThaiThanhToan;
        this.tongTien = tongTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public Date getNgayXuatHoaDon() {
        return ngayXuatHoaDon;
    }

    public Byte getTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setNgayXuatHoaDon(Date ngayXuatHoaDon) {
        this.ngayXuatHoaDon = ngayXuatHoaDon;
    }

    public void setTrangThaiThanhToan(Byte trangThaiThanhToan) {
        this.trangThaiThanhToan = trangThaiThanhToan;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
