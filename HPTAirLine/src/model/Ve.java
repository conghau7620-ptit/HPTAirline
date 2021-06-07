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
public class Ve {
    private String maVe;
//    private String sdtKhachHang;
    private String maChuyenBay;
    private int gia;
    private short kyGui;
//    private byte trangThaiDoi;
//    private byte trangThaiVe;
    private String cmndNguoiBay;
    private String tenNguoiBay;
//    private String emailNguoiBay;
//    private String sdtNguoiBay;
    private String maHoaDon;
    private String maGhe;

    public Ve() {
    }
 // test 
    public Ve (String maVe, String sdtKhachHang, String maChuyenBay, String cmndNguoibay, String tenNguoiBay,String emailNguoiBay, String sdtNguoiBay, String maGhe){
        
        this.maVe = maVe;
//        this.sdtKhachHang= sdtKhachHang;
        this.maChuyenBay = maChuyenBay;
        
        this.cmndNguoiBay = cmndNguoibay;
        this.tenNguoiBay = tenNguoiBay;
//        this.emailNguoiBay = emailNguoiBay;
//        this.sdtNguoiBay = sdtNguoiBay;
        this.maGhe = maGhe;
        
    }
    public Ve(String maVe, String maChuyenBay, int gia, short kyGui, String cmndNguoiBay, String tenNguoiBay, String maHoaDon, String maGhe) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        
        this.gia = gia;
        this.kyGui = kyGui;
        this.cmndNguoiBay = cmndNguoiBay;
        this.tenNguoiBay = tenNguoiBay;
        this.maHoaDon = maHoaDon;
        this.maGhe = maGhe;
    }
   

    public String getMaVe() {
        return maVe;
    }

//    public String getSdtKhachHang() {
//        return sdtKhachHang;
//    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public int getGia() {
        return gia;
    }

    public short getKyGui() {
        return kyGui;
    }

//    public byte getTrangThaiDoi() {
//        return trangThaiDoi;
//    }

//    public byte getTrangThaiVe() {
//        return trangThaiVe;
//    }

    public String getCmndNguoiBay() {
        return cmndNguoiBay;
    }

    public String getTenNguoiBay() {
        return tenNguoiBay;
    }

//    public String getEmailNguoiBay() {
//        return emailNguoiBay;
//    }

//    public String getSdtNguoiBay() {
//        return sdtNguoiBay;
//    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

//    public void setSdtKhachHang(String sdtKhachHang) {
//        this.sdtKhachHang = sdtKhachHang;
//    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setKyGui(short kyGui) {
        this.kyGui = kyGui;
    }

//    public void setTrangThaiDoi(byte trangThaiDoi) {
//        this.trangThaiDoi = trangThaiDoi;
//    }
//
//    public void setTrangThaiVe(byte trangThaiVe) {
//        this.trangThaiVe = trangThaiVe;
//    }

    public void setCmndNguoiBay(String cmndNguoiBay) {
        this.cmndNguoiBay = cmndNguoiBay;
    }

    public void setTenNguoiBay(String tenNguoiBay) {
        this.tenNguoiBay = tenNguoiBay;
    }

//    public void setEmailNguoiBay(String emailNguoiBay) {
//        this.emailNguoiBay = emailNguoiBay;
//    }
//
//    public void setSdtNguoiBay(String sdtNguoiBay) {
//        this.sdtNguoiBay = sdtNguoiBay;
//    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }
    
    
}
