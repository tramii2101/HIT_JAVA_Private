package Bai4;

import java.util.Scanner;

public class Nguoi {
    protected static Scanner sc = new Scanner(System.in);
    protected String hoten;
    protected byte tuoi;
    private String quequan;

    public Nguoi(){

    }
    public Nguoi(String magv, String hoten, byte tuoi, String quequan) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.quequan = quequan;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public byte getTuoi() {
        return tuoi;
    }

    public void setTuoi(byte tuoi) {
        this.tuoi = tuoi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    public void input(){
        System.out.println("Nhap ho ten: ");
        setHoten(sc.nextLine());
        System.out.println("Nhap tuoi ");
        setTuoi(sc.nextByte());
        sc.nextLine();
        System.out.println("Nhap que quan: ");
        setQuequan(sc.nextLine());
    }


    public void output() {
        System.out.printf("%-15s%-10d%-15s", getHoten(), getTuoi(), getQuequan());
    }
}
