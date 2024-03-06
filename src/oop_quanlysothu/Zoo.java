/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_quanlysothu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Zoo {

    ArrayList<Animal> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        int choice;
        do {
            System.out.print("Moi chon loai de nhap thong tin: \n1.Amphibians \n2.Bird \n3.Fish \n4.Mammal \n5.Reptile \n6.Thoat\n");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Animal amphibians = new Amphibians();
                    amphibians.nhap();
                    list.add(amphibians);
                    break;
                case 2:
                    Animal bird = new Bird();
                    bird.nhap();
                    list.add(bird);
                    break;
                case 3:
                    Animal fish = new Fish();
                    fish.nhap();
                    list.add(fish);
                    break;
                case 4:
                    Animal mammal = new Mammal();
                    mammal.nhap();
                    list.add(mammal);
                    break;
                case 5:
                    Animal reptile = new Reptile();
                    reptile.nhap();
                    list.add(reptile);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Chon sai! chon lai!");
            }
        } while (choice != 6);
    }

    public void xuat() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            int count = 1;
            for (Animal i : list) {
                System.out.printf("+------ Dong vat %d -------+\n", count);
                i.xuat();
                System.out.println("");
                count++;
            }
        }
    }

    public void suaDongVat() {
        System.out.print("Nhap ma dong vat: ");
        String maCanSua = sc.nextLine();
        for (Animal i : list) {
            if (maCanSua.equalsIgnoreCase(i.getMaDongVat())) {
                int choice;
                do {
                    System.out.print("Moi chon loai de nhap thong tin: \n1.Amphibians \n2.Bird \n3.Fish \n4.Mammal \n5.Reptile \n6.Thoat\n");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            Animal amphibians = new Amphibians();
                            amphibians.nhap();
                            list.set(list.indexOf(i), amphibians);
                            System.out.println("Da sua hoan tat!");
                            break;
                        case 2:
                            Animal bird = new Bird();
                            bird.nhap();
                            list.set(list.indexOf(i), bird);
                            System.out.println("Da sua hoan tat!");
                            break;
                        case 3:
                            Animal fish = new Fish();
                            fish.nhap();
                            list.set(list.indexOf(i), fish);
                            System.out.println("Da sua hoan tat!");
                            break;
                        case 4:
                            Animal mammal = new Mammal();
                            mammal.nhap();
                            list.set(list.indexOf(i), mammal);
                            System.out.println("Da sua hoan tat!");
                            break;
                        case 5:
                            Animal reptile = new Reptile();
                            reptile.nhap();
                            list.set(list.indexOf(i), reptile);
                            System.out.println("Da sua hoan tat!");
                            break;
                        case 6:
                            
                            break;
                        default:
                            System.out.println("Chon sai! chon lai!");
                    }
                } while (choice!=6);

            }
        }

    }

    public void xoaDongVat() {
        System.out.print("Nhap ma dong vat: ");
        String maCanXoa = sc.nextLine();

        for (Animal i : list) {
            if (maCanXoa.equalsIgnoreCase(i.getMaDongVat())) {
                list.remove(i);
                System.out.println("Xoa thanh cong!");
                break;
            } else {
                System.out.println("Xoa KHONG thanh cong!");
                break;
            }
        }
    }

    public void timKiem() {
        System.out.print("Nhap ma dong vat: ");
        String maCanXoa = sc.nextLine();

        for (Animal i : list) {
            if (maCanXoa.equalsIgnoreCase(i.getMaDongVat())) {
                i.xuat();
                break;
            }
        }
    }

    public void timKhoangCanNang() {
        ArrayList<Animal> listDVTheoCanNang = new ArrayList<>();
        System.out.print("Nhap can nang bat dau: ");
        int bd = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap can nang ket thuc: ");
        int kt = Integer.parseInt(sc.nextLine());
        
        

        for (Animal i : list) {
            if (bd <= i.getCanNang() && kt >= i.getCanNang()) {
                listDVTheoCanNang.add(i);
            }
        }
        
        int count = 1;
        for (Animal i : listDVTheoCanNang) {
            System.out.printf("+------ Dong vat %d -------+\n", count);
            i.xuat();
            System.out.println();
            count++;
        }
    }

    public void sapXepTheoTen() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            Collections.sort(list, (dv1, dv2) -> (int) (dv1.getTenDongVat().compareTo(dv2.getTenDongVat())));
            System.out.println("Da sap xep xong!");
        }
    }

    public void sapXepTheoKichThuoc() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            Collections.sort(list, (dv1, dv2) -> (int) (dv1.getKichThuoc() - dv2.getKichThuoc()));
            System.out.println("Da sap xep xong!");
        }
    }

    public void sapXepTheoCanNang() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            Collections.sort(list, (dv1, dv2) -> (int) (dv1.getCanNang() - dv2.getCanNang()));
            System.out.println("Da sap xep xong!");
        }
    }

    public void phanLoaiDV() {
        ArrayList<Animal> listDuc = new ArrayList<>();
        ArrayList<Animal> listCai = new ArrayList<>();

        for (Animal i : list) {
            if (i.getGioiTinh().equalsIgnoreCase("Cai")) {
                listCai.add(i);
            } else if (i.getGioiTinh().equalsIgnoreCase("Duc")) {
                listDuc.add(i);
            }
        }

        if (listDuc.isEmpty()) {
            System.out.println("Danh sach Duc trong!");
        } else {
            System.out.println("+---------- Danh sach Cai ------------+ ");
            for (Animal i : listCai) {
                i.xuat();
            }
        }

        if (listDuc.isEmpty()) {
            System.out.println("Danh sach Duc trong!");
        } else {
            System.out.println("+---------- Danh sach Duc ------------+ ");
            for (Animal i : listDuc) {
                i.xuat();
            }
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("+---------------- Menu ---------------------+");
            System.out.println("+ 1. Nhap DV                                +");
            System.out.println("+ 2. Xuat DS DV                             +");
            System.out.println("+ 3. Sua DV theo ma                         +");
            System.out.println("+ 4. Xoa DV theo ma                         +");
            System.out.println("+ 5. Tim DV theo ma                         +");
            System.out.println("+ 6. Tim DV theo khoang can nang            +");
            System.out.println("+ 7. Sap xep DV theo ten                    +");
            System.out.println("+ 8. Sap xep DV theo kich thuoc             +");
            System.out.println("+ 9. Sap xep DV theo can nang               +");
            System.out.println("+ 10. Phan loai dong vat theo Duc - Cai     +");
            System.out.println("+ 0. Thoat!                                 +");
            System.out.println("+-------------------------------------------+");
            System.out.print("Chon chuc nang: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    suaDongVat();
                    break;
                case 4:
                    xoaDongVat();
                    break;
                case 5:
                    timKiem();
                    break;
                case 6:
                    timKhoangCanNang();
                    break;
                case 7:
                    sapXepTheoTen();
                    break;
                case 8:
                    sapXepTheoKichThuoc();  
                    break;
                case 9:
                    sapXepTheoCanNang();
                    break;
                case 10:
                    phanLoaiDV();
                    break;
                case 0:
                    System.out.println("Chuong trinh dang thoat!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chon sai! chon lai chuc nang!");
            }
        } while (choice != 0);
    }
}
