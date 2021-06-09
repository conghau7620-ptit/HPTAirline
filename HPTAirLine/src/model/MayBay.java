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
public class MayBay {
    private String maMayBay;
    private String tenMayBay;
    private String hangBay;
//    private int soGhePhoThong;
//    private int soGheThuongGia;

    public MayBay() {
    }

    public MayBay(String maMayBay, String tenMayBay, String hangBay/*, int soGhePhoThong, int soGheThuongGia*/) {
        this.maMayBay = maMayBay;
        this.tenMayBay = tenMayBay;
        this.hangBay = hangBay;
//        this.soGhePhoThong = soGhePhoThong;
//        this.soGheThuongGia = soGheThuongGia;
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

//    public int getSoGhePhoThong() {
//        return soGhePhoThong;
//    }
//
//    public int getSoGheThuongGia() {
//        return soGheThuongGia;
//    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public void setTenMayBay(String tenMayBay) {
        this.tenMayBay = tenMayBay;
    }

    public void setHangBay(String hangBay) {
        this.hangBay = hangBay;
    }

//    public void setSoGhePhoThong(int soGhePhoThong) {
//        this.soGhePhoThong = soGhePhoThong;
//    }
//
//    public void setSoGheThuongGia(int soGheThuongGia) {
//        this.soGheThuongGia = soGheThuongGia;
//    }
    
    
}
