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
public class Amphibians extends Animal{
    private String thuocLoai;
    private String moiTruongSong;

    public Amphibians() {
    }
    
    

    public Amphibians(String thuocLoai, String moiTruongSong) {
        this.thuocLoai = thuocLoai;
        this.moiTruongSong = moiTruongSong;
    }

    public Amphibians(String thuocLoai, String moiTruongSong, String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        super(maDongVat, tenDongVat, gioiTinh, kichThuoc, canNang, mauSac, thucAn, tuoi);
        this.thuocLoai = thuocLoai;
        this.moiTruongSong = moiTruongSong;
    }

    public String getThuocLoai() {
        return thuocLoai;
    }

    public void setThuocLoai(String thuocLoai) {
        this.thuocLoai = thuocLoai;
    }

    public String getMoiTruongSong() {
        return moiTruongSong;
    }

    public void setMoiTruongSong(String moiTruongSong) {
        this.moiTruongSong = moiTruongSong;
    }
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap loai: ");
        thuocLoai = sc.nextLine();
        System.out.print("Nhap moi truong song: ");
        moiTruongSong = sc.nextLine();
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Loai: "+thuocLoai+""
                + "\nMoi truong song: "+moiTruongSong);
    }
}
