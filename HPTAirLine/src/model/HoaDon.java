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
    private String sdtKhachHang;
    private Date ngayXuatHoaDon;
    private Byte trangThaiThanhToan;
    private int tongTien;
    private String sdtNhanVien;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String sdtKhachHang, Date ngayXuatHoaDon, 
                    Byte trangThaiThanhToan, int tongTien, String sdtNhanVien) {
        this.maHoaDon = maHoaDon;
        this.sdtKhachHang = sdtKhachHang;
        this.ngayXuatHoaDon = ngayXuatHoaDon;
        this.trangThaiThanhToan = trangThaiThanhToan;
        this.tongTien = tongTien;
        this.sdtNhanVien = sdtNhanVien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getSdtKhachHang() {
        return sdtKhachHang;
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

    public String getSdtNhanVien() {
        return sdtNhanVien;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setSdtKhachHang(String sdtKhachHang) {
        this.sdtKhachHang = sdtKhachHang;
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

    public void setSdtNhanVien(String sdtNhanVien) {
        this.sdtNhanVien = sdtNhanVien;
    }
    
    
}
