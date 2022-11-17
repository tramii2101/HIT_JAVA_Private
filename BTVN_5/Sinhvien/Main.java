package Sinhvien;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVien();
            sv[i].input();
        }

        do {
            System.out.println("1. Sap xep danh sach theo diem");
            System.out.println("2. Tim kiem theo ten");
            System.out.println("3. Sap xep danh sach theo ten");
            System.out.println("4. Thoat khoi chuong trinh");
            System.out.println("Nhap lua chon");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("===================HIEN THI DANH SACH SINH VIEN THEO DIEM=============");
                    sxtheodiem(sv, n);
                    output(sv, n);
                    break;
                case 2:
                    System.out.println("===================TIM SINH VIEN===============");
                    timsv(sv, n);
                    break;
                case 3:
                    System.out.println("===================DS SINH VIEN THEO TEN==============");
                    sxtheoten(sv, n);
                    output(sv, n);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Khong co lua chon nay!");
                    break;
            }
        } while (true);
    }

    public static void output(SinhVien[] sv, int n) {
        System.out.printf("%-6s %-15s %-15s %-15s %-6s %n", "MSV", "Ho ten", "Dia chi", "SDT", "Diem");
        for (int i = 0; i < n; i++)
            System.out.println(sv[i]);
        ;
    }

    public static void sxtheodiem(SinhVien[] sv, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (sv[i].getDiem() > sv[j].getDiem()) {
                    SinhVien temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
    }

    public static void timsv(SinhVien[] sv, int n) {
        System.out.println("Nhap ten can tim kiem: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.printf("%-6s %-15s %-15s %-15s %-6s %n", "MSV", "Ho ten", "Dia chi", "SDT", "Diem");
        int count = 0;
        for (int i = 0; i < n; i++)
            if (sv[i].getTen().compareTo(name) == 0)
                System.out.println(sv[i]);
            else count++;
        if (count == n) System.out.println("Khong co sinh vien nay!");
    }

    public static String Name(String s) {
        String str = "";
        for (int i = s.length() - 1; i > 0; i--)
            if (s.charAt(i) == ' ') str = s.substring(i + 1);
        return str;
    }

    public static void sxtheoten(SinhVien[] sv, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Name(sv[i].getTen()).compareTo(Name(sv[j].getTen())) > 0) {
                    SinhVien temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
    }
}
