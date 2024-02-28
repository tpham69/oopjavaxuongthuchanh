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
public class Reptile extends Animal {

    private String thuocLoai;
    private String loaiVay;
    private int kichThuocVay;

    public Reptile() {
    }
    
    

    public Reptile(String thuocLoai, String loaiVay, int kichThuocVay) {
        this.thuocLoai = thuocLoai;
        this.loaiVay = loaiVay;
        this.kichThuocVay = kichThuocVay;
    }

    public Reptile(String thuocLoai, String loaiVay, int kichThuocVay, String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        super(maDongVat, tenDongVat, gioiTinh, kichThuoc, canNang, mauSac, thucAn, tuoi);
        this.thuocLoai = thuocLoai;
        this.loaiVay = loaiVay;
        this.kichThuocVay = kichThuocVay;
    }

    public String getThuocLoai() {
        return thuocLoai;
    }

    public void setThuocLoai(String thuocLoai) {
        this.thuocLoai = thuocLoai;
    }

    public String getLoaiVay() {
        return loaiVay;
    }

    public void setLoaiVay(String loaiVay) {
        this.loaiVay = loaiVay;
    }

    public int getKichThuocVay() {
        return kichThuocVay;
    }

    public void setKichThuocVay(int kichThuocVay) {
        this.kichThuocVay = kichThuocVay;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap loai: ");
        thuocLoai = sc.nextLine();
        System.out.print("Nhap loai vay: ");
        loaiVay = sc.nextLine();
        System.out.print("Kich thuoc vay: ");
        kichThuocVay = Integer.parseInt(sc.nextLine());
    }

    public void xuat() {
        super.xuat();
        System.out.println("Loai bo sat: " + thuocLoai + "\n"
                + "Loai vay: " + loaiVay + "\n"
                + "Kich thuoc vay: "+kichThuocVay);
    }
}
