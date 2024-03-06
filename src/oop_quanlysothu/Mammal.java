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
public class Mammal extends Animal{
    private String thuocLoai;
    private int soLuongDe;

    public Mammal() {
    }

    public Mammal(String thuocLoai, int soLuongDe) {
        this.thuocLoai = thuocLoai;
        this.soLuongDe = soLuongDe;
    }

    public Mammal(String thuocLoai, int soLuongDe, String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        super(maDongVat, tenDongVat, gioiTinh, kichThuoc, canNang, mauSac, thucAn, tuoi);
        this.thuocLoai = thuocLoai;
        this.soLuongDe = soLuongDe;
    }



    public String getThuocLoai() {
        return thuocLoai;
    }

    public void setThuocLoai(String thuocLoai) {
        this.thuocLoai = thuocLoai;
    }

    public int getSoLuongDe() {
        return soLuongDe;
    }

    public void setSoLuongDe(int soLuongDe) {
        this.soLuongDe = soLuongDe;
    }
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap loai: ");
        this.thuocLoai = sc.nextLine();
        System.out.print("So luong de trong 1 lua: ");
        this.soLuongDe = Integer.parseInt(sc.nextLine());
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.print("Loai: "+this.thuocLoai + "\n" 
                + "So luong de trong lua: " + this.soLuongDe + "\n"
        + "Tuoi sinh san: "+this.tuoiSinhSan()+"\n");
    }
    
    public String tuoiSinhSan(){
         
       if(this.getTuoi() >= 2 || this.getTuoi() <= 15){
           return "Dang trong do tuoi sinh san";
       }else{
           return "Khong trong do tuoi sinh san"; 
       }
    }
    
}
