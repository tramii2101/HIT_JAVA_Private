package Oto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so luong o to: ");
            n = sc.nextInt();
        } while (n < 2);

        Oto[] oto = new Oto[n];
        for (int i = 0; i < n; i++) {
            oto[i] = new Oto();
            oto[i].input();
        }

        System.out.println("====================HIEN THI DANH SACH O TO===================");
        System.out.printf("%-15s %-15s %-15s %-15s %-10s %-18s %n", "Chu so huu", "Ten xe", "Hang", "Gia", "Nam su dung", "Gia tri hien tai");
        for (int i = 0; i < n; i++)
            oto[i].output();
        System.out.println("====================DANH SACH OTO THEO GIA TRI HIEN TAI====================");
        sort(oto, n);
        System.out.println("====================DANH SACH OTO HET GIA TRI=======================");
        ds(oto, n);
    }

    public static void sort(Oto[] x, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (x[i].getGiaTriHienTai() > x[j].getGiaTriHienTai()) {
                    Oto temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
        System.out.printf("%-15s %-15s %-15s %-15s %-10s %-15s %n", "Chu so huu", "Ten xe", "Hang", "Gia", "Nam su dung", "Gia tri hien tai");
        for (int i = 0; i < n; i++)
            x[i].output();
    }

    public static void ds(Oto[] x, int n) {
        System.out.printf("%-15s %-15s %-15s %-15s %-10s %-15s %n", "Chu so huu", "Ten xe", "Hang", "Gia", "Nam su dung", "Gia tri hien tai");
        for (int i = 0; i < n; i++)
            if (x[i].getGiaTriHienTai() <= 0)
                x[i].output();
    }
}
