package Bai4;

import java.util.Scanner;

public class CBGV extends Nguoi{
    private static Scanner sc = new Scanner(System.in);
    private String magv;
    private int luongcung;
    private int luongthuong;
    private int luongphat;

    public CBGV() {
    }

    public CBGV(String magv, String hoten, byte tuoi, String quequan, String magv1, int luongcung, int luongthuong, int luongphat) {
        super(magv, hoten, tuoi, quequan);
        this.magv = magv1;
        this.luongcung = luongcung;
        this.luongthuong = luongthuong;
        this.luongphat = luongphat;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }

    public int getLuongthuong() {
        return luongthuong;
    }

    public void setLuongthuong(int luongthuong) {
        this.luongthuong = luongthuong;
    }

    public int getLuongphat() {
        return luongphat;
    }

    public void setLuongphat(int luongphat) {
        this.luongphat = luongphat;
    }

    public int getLuongThuc(){
        return luongcung + luongthuong - luongphat;
    }
    public void input() {
        //sc.nextLine();
        System.out.println("Nhap ma gv: ");
        setMagv(sc.nextLine());
        super.input();
        System.out.println("Nhap luong cung: ");
        setLuongcung(sc.nextInt());
        System.out.println("Nhap luong thuong: ");
        setLuongthuong(sc.nextInt());
        System.out.println("Nhap luong phat: ");
        setLuongphat(sc.nextInt());
        sc.nextLine();
    }

    public void output(){
        System.out.printf("%-10s", magv);
        super.output();
        System.out.printf("%-15s%-15s%-15s%-15s%n", luongcung, luongthuong, luongphat, getLuongThuc());
    }
}
