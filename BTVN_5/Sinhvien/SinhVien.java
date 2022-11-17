package Sinhvien;

import java.util.Scanner;

public class SinhVien {
    private static int count = 0;
    private int msv;
    private String ten;
    private String diachi;
    private String sdt;
    private float diem;

    public SinhVien() {
        count++;
        msv = count;
    }

    public SinhVien(String ten, String diachi, String sdt, float diem) {
        count++;
        this.msv = count;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.diem = diem;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap ten sv: ");
            ten = sc.nextLine();
        } while (!ten.contains(" "));
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
        do {
            System.out.println("Nhap so dien thoai: ");
            sdt = sc.nextLine();
        } while (sdt.length() != 7 || sdt.matches(".*[^0-9].*"));
        do {
            System.out.println("Nhap diem: ");
            diem = sc.nextFloat();
        } while (diem < 0 || diem > 10);

    }

    public void output() {
        System.out.printf("%-6d %-15s %-15s %-15s %-6f %n", msv, ten, diachi, sdt, diem);
    }

    @Override
    public String toString() {
        return String.format("%-6d %-15s %-15s %-15s %-6f", msv, ten, diachi, sdt, diem);
    }
}
