package model;

/**
 *
 * @author conghau
 */
public class KhachHang {

    private String sdtKhachHang;
    private String tenKhachHang;
    private String email;
    private String diaChi;
    private String tenDangNhap;
    private String cmnd;
    private int diemTichLuy;

    public KhachHang() {
    }

    public KhachHang(String sdtKhachHang, String tenKhachHang, String email,
            String diaChi, String tenDangNhap, String cmnd, int diemTichLuy) {
        this.sdtKhachHang = sdtKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.email = email;
        this.diaChi = diaChi;
        this.tenDangNhap = tenDangNhap;
        this.cmnd = cmnd;
        this.diemTichLuy = diemTichLuy;
    }

    public String getSdtKhachHang() {
        return sdtKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getEmail() {
        return email;
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

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setSdtKhachHang(String sdtKhachHang) {
        this.sdtKhachHang = sdtKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

}
