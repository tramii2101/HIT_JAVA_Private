package NhanVien;

import java.util.Scanner;

public class NhanVien {
    private static int count = 0;
    private int id;
    private String hoten;
    private String kieuNV;
    private int songaylam;
    private int namvaolam;
    private int phucap;

    NhanVien() {
        count++;
        id = count;
    }


    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap kieu nhan vien: ");
        kieuNV = sc.nextLine();
        System.out.println("Nhap so ngay lam: ");
        songaylam = sc.nextInt();
        System.out.println("Nhap nam vao lam: ");
        namvaolam = sc.nextInt();
        sc.nextLine();
    }

    public int getPhucap() {
        return 100000 + (2022 - namvaolam) * 200000;
    }

    public long getLuong() {
        if (kieuNV == "NV san xuat") return 350000 * songaylam;
        else return 400000 * songaylam;
    }

    public long getTongtien() {
        return getLuong() + getPhucap();
    }

    public void output() {
        System.out.printf("%-5d %-15s %-15s %-15d %-10d %-15d %-15d %-15d %n", id, hoten, kieuNV, songaylam, namvaolam, getLuong(), getPhucap(), getTongtien());
    }

}
