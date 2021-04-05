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
public class NhanVien {
    private String sdtNhanVien;
    private String tenNhanVien;
    private String diaChi;
    private String tenDangNhap;
    private String cmnd;

    public NhanVien() {
    }

    public NhanVien(String sdtNhanVien, String tenNhanVien, String diaChi, String tenDangNhap, String cmnd) {
        this.sdtNhanVien = sdtNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.diaChi = diaChi;
        this.tenDangNhap = tenDangNhap;
        this.cmnd = cmnd;
    }

    public String getSdtNhanVien() {
        return sdtNhanVien;
    }
    
    public String getTenNhanVien() {
        return tenNhanVien;
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

    public void setSdtNhanVien(String sdtNhanVien) {
        this.sdtNhanVien = sdtNhanVien;
    }

    

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
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
