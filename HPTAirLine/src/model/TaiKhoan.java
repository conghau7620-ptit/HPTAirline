package model;

/**
 *
 * @author conghau
 */
public class TaiKhoan {

    private String tenDangNhap;
    private String matKhau;
    private String loaiTaiKhoan;
    private String sdt;

    public TaiKhoan(String tenDangNhap, String matKhau, String loaiTaiKhoan, String sdt) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.loaiTaiKhoan = loaiTaiKhoan;
        this.sdt = sdt;
    }

    public TaiKhoan() {
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public String getSdt() {
        return sdt;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setLoaiTaiKhoan(String loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public TaiKhoan trim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
