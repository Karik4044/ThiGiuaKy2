package MENU;

import Sach.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class quanlythuvien {
    private Thuvien thuvien;
    private Scanner sc;

    public quanlythuvien(Thuvien thuvien, Scanner sc) {
        this.thuvien = thuvien;
        this.sc = sc;
    }

    public void hienthimenu() {
        int choice = -1;
        do {
            System.out.println("==MENU QUAN LY SACH==");
            System.out.println("1. Hien thi danh sach cac quyen sach.");
            System.out.println("2. Them sach vao danh sach.");
            System.out.println("3. Sua thong tin sach theo id.");
            System.out.println("4. Thoat");

            System.out.print("Chon lua chon: ");
            try {
                choice = sc.nextInt();
                sc.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        menuhienthisach();
                        break;
                    case 2:
                        menuthemsach();
                        break;
                    case 3:
                        menusuathongtin();
                        break;
                    case 4:
                        System.out.println("Tam biet!");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lua chon khong hop le!");
                sc.nextLine(); // Clear invalid input
            }
        } while (choice != 4);
    }

    private void menuhienthisach() {
        thuvien.hienthidanhsachsach();
    }

    private void menuthemsach() {
        System.out.println("Them id sach: ");
        String id = sc.nextLine();
        System.out.println("Them ten sach: ");
        String ten = sc.nextLine();
        System.out.println("Them ten tac gia: ");
        String tg = sc.nextLine();
        System.out.println("Them ten nha xb: ");
        String xb = sc.nextLine();

        TTsach ttsach = new TTsach(id, ten, tg, xb);
        thuvien.themsach(ttsach);
        System.out.println("Da them sach!");
    }

    private void menusuathongtin() {
        System.out.println("Nhap id sach muon sua: ");
        String id = sc.nextLine();

        for (TTsach tTsach : thuvien.getDanhsachsach()) {
            if (tTsach != null && tTsach.getId().equals(id)) {
                System.out.println("Nhap id moi: ");
                tTsach.setId(sc.nextLine());
                System.out.println("Nhap ten sach moi: ");
                tTsach.setTensach(sc.nextLine());
                System.out.println("Nhap ten tac gia moi: ");
                tTsach.setTentacgia(sc.nextLine());
                System.out.println("Nhap ten nha xuat ban moi: ");
                tTsach.setTensx(sc.nextLine());
                System.out.println("Thong tin sach da duoc chinh sua.");
                return;
            }
        }
        System.out.println("Khong tim thay sach voi id da nhap.");
    }
}
