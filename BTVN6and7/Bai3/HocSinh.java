package Bai3;

import java.util.Scanner;

public class HocSinh {
    static private Scanner sc = new Scanner(System.in);
    private String hoTen;
    private byte tuoi;
    private String queQuan;

    private Lop lop = new Lop();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(byte tuoi) {
        this.tuoi = tuoi;
    }
    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void input() {
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextByte();
        sc.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan = sc.nextLine();
        lop.input();
    }
    public void output() {
        System.out.printf("%-20s%-15d%-16s", hoTen, tuoi, queQuan);
        lop.output();
    }


}
