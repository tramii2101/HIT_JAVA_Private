package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList <ThiSinh> list = new ArrayList<>();
        do {
            System.out.println("1. Thêm mới thí sinh.\n" +
                    "2. Hiển thị thông tin của thí sinh và khối thi của thí sinh.\n" +
                    "3. Tìm kiếm theo số báo danh. \n" +
                    "4. Thoát khỏi chương trình\n");
            byte choose = sc.nextByte();
            switch (choose) {
                case 1:
                    System.out.println("=========================THEM SINH VIEN==========================");
                    add(list);
                    break;
                case 2:
                    System.out.println("==========================DANH SACH SINH VIEN======================");
                    show(list);
                    break;
                case 3:
                    System.out.println("==========================TIM KIEM THEO SO BAO DANH=====================");
                    find(list);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Khong co lua chon nay!");
                    break;
            }
        } while(true);
    }

    public static void title(){
        System.out.printf("%-10s %-10s %-15s %-10s %-10s %-10s %-10s %-10s %n", "SBD", "Ho ten", "Dia chi", "Muc UT", "Khoi", "Mon 1", "Mon 2", "Mon 3");
    }
    public static void add(ArrayList<ThiSinh> list){
        System.out.println("Nhap thong tin thi sinh: ");
        ThiSinh ts = new ThiSinh();
        ts.input();
        list.add(ts);
    }

    public static void show(ArrayList<ThiSinh> list){
        title();
        for (ThiSinh i : list)
            i.output();
    }

    public static void find(ArrayList<ThiSinh> list){
        System.out.println("Nhap sbd can tim: ");
        String str = sc.nextLine();
        title();
        for (ThiSinh i : list)
            if (i.getSbd().equals(str))
                i.output();
    }
}
