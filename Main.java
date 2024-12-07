import MENU.*;
import Sach.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thuvien thuvien = new Thuvien();

        TTsach ttsach1 = new TTsach("HK025", "Song cho", "Le Duy Vu", "NSX Cau tieu");
        TTsach ttsach2 = new TTsach("JK578", "Song nhu cho", "Le Duy Vu", "NSX Cau tieu");
        TTsach ttsach3 = new TTsach("TH874", "Ngu nhu bo", "Le Duy Vu", "NSX Cau tieu");

        thuvien.themsach(ttsach1);
        thuvien.themsach(ttsach2);
        thuvien.themsach(ttsach3);

        Scanner sc = new Scanner(System.in);
        quanlythuvien quanlythuvien = new quanlythuvien(thuvien, sc);
        quanlythuvien.hienthimenu();
    }
}
