package Sach;

import java.util.Arrays;

public class Thuvien {
    private TTsach[] danhsachsach;

    public Thuvien() {
        danhsachsach = new TTsach[10];
    }

    public Thuvien(TTsach[] danhsachsach) {
        this.danhsachsach = danhsachsach;
    }

    public TTsach[] getDanhsachsach() {
        return danhsachsach;
    }

    public void setDanhsachsach(TTsach[] danhsachsach) {
        this.danhsachsach = danhsachsach;
    }

    public void hienthidanhsachsach() {
        for(TTsach ttsach : Thuvien.this.getDanhsachsach()) {
            if(ttsach != null) {
                System.out.println(ttsach);
            }
        }
    }

    public void themsach(TTsach ttsach) {
        for(int i = 0; i < Thuvien.this.getDanhsachsach().length; i++) {
            if(danhsachsach[i] == null) {
                danhsachsach[i] = ttsach;
                return;
            }
        }
        System.out.println("Sach da duoc them.");
    }

    public void suattsach(TTsach ttsach) {
        for(TTsach id : Thuvien.this.getDanhsachsach()) {
            if(id != null && id.getId().equals(ttsach.getId())) {

            }
        }
    }

    @Override
    public String toString() {
        return "Thuvien{" +
                "danhsachsach=" + Arrays.toString(danhsachsach) +
                '}';
    }
}
