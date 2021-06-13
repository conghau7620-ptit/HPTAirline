package model;

/**
 *
 * @author conghau
 */
public class DuongBay {

    private String maDuongBay;
    private String maSanBay1;
    private String maSanBay2;
    private int khoangCach;

    public String getMaDuongBay() {
        return maDuongBay;
    }

    public String getMaSanBay1() {
        return maSanBay1;
    }

    public String getMaSanBay2() {
        return maSanBay2;
    }

    public int getKhoangCach() {
        return khoangCach;
    }

    public void setMaDuongBay(String maDuongBay) {
        this.maDuongBay = maDuongBay;
    }

    public void setMaSanBay1(String maSanBay1) {
        this.maSanBay1 = maSanBay1;
    }

    public void setMaSanBay2(String maSanBay2) {
        this.maSanBay2 = maSanBay2;
    }

    public void setKhoangCach(int khoangCach) {
        this.khoangCach = khoangCach;
    }

    public DuongBay(String maDuongBay, String maSanBay1, String maSanBay2, int khoangCach) {
        this.maDuongBay = maDuongBay;
        this.maSanBay1 = maSanBay1;
        this.maSanBay2 = maSanBay2;
        this.khoangCach = khoangCach;
    }

}
