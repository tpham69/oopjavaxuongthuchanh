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
public class Fish extends Animal{
    private String loaiCa;
    private double tocDoBoi;

    public Fish() {
    }
    
    

    public Fish(String loaiCa, double tocDoBoi) {
        this.loaiCa = loaiCa;
        this.tocDoBoi = tocDoBoi;
    }

    public Fish(String loaiCa, double tocDoBoi, String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        super(maDongVat, tenDongVat, gioiTinh, kichThuoc, canNang, mauSac, thucAn, tuoi);
        this.loaiCa = loaiCa;
        this.tocDoBoi = tocDoBoi;
    }

    public String getLoaiCa() {
        return loaiCa;
    }

    public void setLoaiCa(String loaiCa) {
        this.loaiCa = loaiCa;
    }

    public double getTocDoBoi() {
        return tocDoBoi;
    }

    public void setTocDoBoi(double tocDoBoi) {
        this.tocDoBoi = tocDoBoi;
    }
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap loai: ");
        loaiCa = sc.nextLine();
        System.out.print("Nhap toc do boi: ");
        tocDoBoi = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Loai ca: "+loaiCa+"\n"
                + "Toc do boi: "+tocDoBoi);
    }
}
