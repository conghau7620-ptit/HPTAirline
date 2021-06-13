package model;

/**
 *
 * @author conghau
 */
public class SanBay {

    private String maSanBay;
    private String tenSanBay;

    public SanBay() {
    }

    public SanBay(String maSanBay, String tenSanBay) {
        this.maSanBay = maSanBay;
        this.tenSanBay = tenSanBay;
    }

    public String getMaSanBay() {
        return maSanBay;
    }

    public String getTenSanBay() {
        return tenSanBay;
    }

    public void setMaSanBay(String maSanBay) {
        this.maSanBay = maSanBay;
    }

    public void setTenSanBay(String tenSanBay) {
        this.tenSanBay = tenSanBay;
    }

}
