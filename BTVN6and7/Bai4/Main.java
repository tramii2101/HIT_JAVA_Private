package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<CBGV> list = new ArrayList<>();
        do {
            System.out.println("Nhap lua chon: ");
            byte choose = sc.nextByte();
            sc.nextLine();
            switch (choose) {
                case 1:
                    add(list);
                    break;

                case 2:
                    show(list);
                    break;

                case 3:
                    delete(list);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Khong co lua chon nay!");
                    break;
            }

        } while (true);
    }

    public static void add(ArrayList<CBGV> list) {
        CBGV cbgv = new CBGV();
        cbgv.input();
        list.add(cbgv);
    }

    public static void delete(ArrayList<CBGV> list) {
        System.out.println("Nhap ma gv ");
        String str = sc.nextLine();
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getMagv().equals(str))
                list.remove(i);
    }

    public static void show(ArrayList<CBGV> list) {
        System.out.printf("%-10s%-15s%-10s%-15s%-15s%-15s%-15s%-15s%n", "Ma GV", "Ho ten", "Tuoi", "Que quan", "Luong cung", "Luong thuong", "Luong phat", "Luong thuc");
        for (CBGV i : list)
            i.output();
    }
}