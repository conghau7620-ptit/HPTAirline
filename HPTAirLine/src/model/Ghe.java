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
public class Ghe {
    private String maGhe;
    private String maChuyenBay;
    private String loaiGhe;
    private byte trong;

    public Ghe() {
    }

    public Ghe(String maGhe, String maChuyenBay, String loaiGhe, byte trong) {
        this.maGhe = maGhe;
        this.maChuyenBay = maChuyenBay;
        this.loaiGhe = loaiGhe;
        this.trong = trong;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public String getLoaiGhe() {
        return loaiGhe;
    }

    public byte getTrong() {
        return trong;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setLoaiGhe(String loaiGhe) {
        this.loaiGhe = loaiGhe;
    }

    public void setTrong(byte trong) {
        this.trong = trong;
    }
    
    
}


