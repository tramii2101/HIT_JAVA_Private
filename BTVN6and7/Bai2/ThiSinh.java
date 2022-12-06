package Bai2;

import java.util.Scanner;

public class ThiSinh {
    static Scanner sc = new Scanner(System.in);
    private String sbd;
    private String hoten;
    private String diachi;
    private char khoi;
    private int mucUT;
    char kh;

    KhoiThi k = new KhoiThi();

    public ThiSinh(String sbd, String hoten, String diachi, int mucUT) {
        this.sbd = sbd;
        this.hoten = hoten;
        this.diachi = diachi;
        this.mucUT = mucUT;
    }

    public ThiSinh(){}

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getMucUT() {
        return mucUT;
    }

    public void setMucUT(int mucUT) {
        this.mucUT = mucUT;
    }

    public char getKh() {
        return kh;
    }

    public void setKh(char kh) {
        this.kh = kh;
    }

    public void input() {
        System.out.println("Nhap sbd: ");
        sbd = sc.nextLine();
        System.out.println("Nhap ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
        System.out.println("Nhap muc uu tien: ");
        mucUT = sc.nextInt();
        sc.nextLine();
        do{
            System.out.println("Nhap khoi thi: ");
            kh = sc.next().charAt(0);
        }while (kh != 'A' && kh != 'B' && kh != 'C');
        k.input();
    }

    public void output(){
        System.out.printf("%-10s %-10s %-15s %-10d %-10s", sbd, hoten, diachi, mucUT, khoi);
        k.output();
    }

}

