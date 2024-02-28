/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_quanlysothu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bird extends Animal {

    private String loaiChim;
    private int kichThuocCanh;
    private boolean khaNangBay;
    private boolean khaNangHot;

    public Bird() {
    }
    
    
    
    public Bird(String loaiChim, int kichThuocCanh, boolean khaNangBay, boolean khaNangHot) {
        this.loaiChim = loaiChim;
        this.kichThuocCanh = kichThuocCanh;
        this.khaNangBay = khaNangBay;
        this.khaNangHot = khaNangHot;
    }

    public Bird(String loaiChim, int kichThuocCanh, boolean khaNangBay, boolean khaNangHot, String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        super(maDongVat, tenDongVat, gioiTinh, kichThuoc, canNang, mauSac, thucAn, tuoi);
        this.loaiChim = loaiChim;
        this.kichThuocCanh = kichThuocCanh;
        this.khaNangBay = khaNangBay;
        this.khaNangHot = khaNangHot;
    }

    

    public String getLoaiChim() {
        return loaiChim;
    }

    public void setLoaiChim(String loaiChim) {
        this.loaiChim = loaiChim;
    }

    public int getKichThuocCanh() {
        return kichThuocCanh;
    }

    public void setKichThuocCanh(int kichThuocCanh) {
        this.kichThuocCanh = kichThuocCanh;
    }

    public boolean isKhaNangBay() {
        return khaNangBay;
    }

    public void setKhaNangBay(boolean khaNangBay) {
        this.khaNangBay = khaNangBay;
    }

    public boolean isKhaNangHot() {
        return khaNangHot;
    }

    public void setKhaNangHot(boolean khaNangHot) {
        this.khaNangHot = khaNangHot;
    }

    
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loai chim: "+this.loaiChim+"\nKich thuoc canh: "+this.kichThuocCanh);
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap(); 
        System.out.print("Nhap loai chim: ");
        this.loaiChim = sc.nextLine();
        System.out.print("Nhap kich thuoc canh: ");
        this.kichThuocCanh = Integer.parseInt(sc.nextLine());        
    }
    
}
