package Bai3;


import java.util.Scanner;

public class Lop {
    static Scanner sc = new Scanner(System.in);
    private String maLop;
    private String tenLop;


    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void input() {
        System.out.println("Nhap ma lop: ");
        maLop = sc.nextLine();
        System.out.println("Nhap ten lop: ");
        tenLop = sc.nextLine();
    }

    public void output() {
        System.out.printf("%-11s%-16s%n", maLop, tenLop);
    }
}
