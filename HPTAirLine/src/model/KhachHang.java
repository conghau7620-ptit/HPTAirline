/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author conghau
 */
public class KhachHang {
    private String maKhachHang;
    private String tenKhachHang;
    private String email;
    private String sdt;
    private String diaChi;
    private String tenDangNhap;
    private String cmnd;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String tenKhachHang, String email, String sdt, String diaChi, String tenDangNhap, String cmnd) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.tenDangNhap = tenDangNhap;
        this.cmnd = cmnd;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    
}
