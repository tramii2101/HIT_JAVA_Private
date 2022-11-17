package NV;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<NV> nv = new ArrayList<NV>();
        int n;
        do {
            System.out.println("Nhap so nhan vien: ");
            n = sc.nextInt();
        } while (n < 3);
        for (int i = 0; i < n; i++)
            add(nv);

        int choose;
        do {
            System.out.println("1. Them nhan vien");
            System.out.println("2. Hien thi thong tin nhan vien");
            System.out.println("3. Hien thi top 3 nhan vien cham chi nhat theo gio lam viec");
            System.out.println("4. Tim kiem theo ho ten");
            System.out.println("5. Thoat khoi chuong trinh");
            System.out.println("Nhap lua chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    add(nv);
                    break;
                case 2:
                    System.out.println("==============================HIEN THI DANH SACH NHAN VIEN=======================");
                    output(nv);
                    break;
                case 3:
                    System.out.println("==========================TOP 3 NHAN VIEN CHAM CHI NHAT========================");
                    sort(nv);
                    System.out.printf("%-15s%-8s%-12s%-15s%-15s%-15s%-15s%-15s%n", "Ho ten", "Tuoi", "Gioi tinh", "Dia chi", "So gio lam", "Luong theo gio", "Luong", "Thue");
                    for (int i = 0; i < 3; i++)
                        nv.get(i).output();
                    break;
                case 4:
                    sc.nextLine();
                    findByName(nv);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Khong co lua chon nay");
                    break;
            }
        } while (true);
    }

    public static void add(ArrayList<NV> nv) {
        NV x = new NV();
        x.input();
        nv.add(x);
    }

    public static void output(ArrayList<NV> nv) {
        System.out.printf("%-15s%-8s%-12s%-15s%-15s%-15s%-15s%-15s%n", "Ho ten", "Tuoi", "Gioi tinh", "Dia chi", "So gio lam", "Luong theo gio", "Luong", "Thue");
        for (int i = 0; i < nv.size(); i++)
            nv.get(i).output();
    }

    public static void sort(ArrayList<NV> nv) {
        for (int i = 0; i < nv.size() - 1; i++)
            for (int j = i + 1; j < nv.size(); j++)
                if (nv.get(i).getHoursWorked() < nv.get(j).getHoursWorked()) {
                    NV temp = nv.get(i);
                    nv.set(i, nv.get(j));
                    nv.set(j, temp);
                }
    }

    public static void findByName(ArrayList<NV> nv) {
        System.out.println("Nhap ten can tim: ");
        String Name = sc.nextLine();
        int count = 0;
        System.out.printf("%-15s%-8s%-12s%-15s%-15s%-15s%-15s%-15s%n", "Ho ten", "Tuoi", "Gioi tinh", "Dia chi", "So gio lam", "Luong theo gio", "Luong", "Thue");
        for (int i = 0; i < nv.size(); i++)
            if (nv.get(i).getName().compareTo(Name) == 0)
                nv.get(i).output();
            else count++;
        if (count == nv.size())
            System.out.println("Khong co nhan vien nay!");
    }
}
