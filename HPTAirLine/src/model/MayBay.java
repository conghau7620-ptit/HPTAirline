package model;

/**
 *
 * @author conghau
 */
public class MayBay {

    private String maMayBay;
    private String tenMayBay;
    private String hangBay;

    public MayBay() {
    }

    public MayBay(String maMayBay, String tenMayBay, String hangBay) {
        this.maMayBay = maMayBay;
        this.tenMayBay = tenMayBay;
        this.hangBay = hangBay;
    }

    public String getMaMayBay() {
        return maMayBay;
    }

    public String getTenMayBay() {
        return tenMayBay;
    }

    public String getHangBay() {
        return hangBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public void setTenMayBay(String tenMayBay) {
        this.tenMayBay = tenMayBay;
    }

    public void setHangBay(String hangBay) {
        this.hangBay = hangBay;
    }

}
