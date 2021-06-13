package model;

import java.sql.Date;

/**
 *
 * @author conghau
 */
public class Ve {

    private String maVe;
    private String maChuyenBay;
    private int gia;
    private short kyGui;
    private String cmndNguoiBay;
    private String tenNguoiBay;
    private String maHoaDon;
    private String maGhe;
    private Date ngaySinh;

    public Ve() {
    }
    // test 

    public Ve(String maVe, String sdtKhachHang, String maChuyenBay, String cmndNguoibay, String tenNguoiBay, String emailNguoiBay, String sdtNguoiBay, String maGhe) {

        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.cmndNguoiBay = cmndNguoibay;
        this.tenNguoiBay = tenNguoiBay;
        this.maGhe = maGhe;

    }

    public Ve(String maVe, String maChuyenBay, int gia, short kyGui, String cmndNguoiBay, String tenNguoiBay, Date ngaySinh, String maHoaDon, String maGhe) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;

        this.gia = gia;
        this.kyGui = kyGui;
        this.cmndNguoiBay = cmndNguoiBay;
        this.tenNguoiBay = tenNguoiBay;
        this.ngaySinh = ngaySinh;
        this.maHoaDon = maHoaDon;
        this.maGhe = maGhe;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getMaVe() {
        return maVe;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public int getGia() {
        return gia;
    }

    public short getKyGui() {
        return kyGui;
    }

    public String getCmndNguoiBay() {
        return cmndNguoiBay;
    }

    public String getTenNguoiBay() {
        return tenNguoiBay;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setKyGui(short kyGui) {
        this.kyGui = kyGui;
    }

    public void setCmndNguoiBay(String cmndNguoiBay) {
        this.cmndNguoiBay = cmndNguoiBay;
    }

    public void setTenNguoiBay(String tenNguoiBay) {
        this.tenNguoiBay = tenNguoiBay;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

}
