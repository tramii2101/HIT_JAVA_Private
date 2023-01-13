package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Honey> listHoney = new ArrayList<>();
        byte choose;
        do {
            System.out.println("1. Add Honey: cho phép người dùng thêm một đối tượng Honey vào danh sách Honeys (Các đối tượng không đc trùng id).(0.5đ)\n" +
                    "2. Show all Honeys: Hiển thị tất cả Honey theo dạng bảng. (1đ)\n" +
                    "3. Delete Honey by id: Cho phép xóa 1 Honey theo id. (0.5đ)\n" +
                    "4. Edit Honey by id: Cho phép chọn và sửa lại một trong các thuộc tính sau: name, age, phone, status của Honey theo honey id (2đ)\n" +
                    "5. Add Favorite by honey id: Cho phép người dùng thêm một sở thích của một Honey theo honey id. (1đ)\n" +
                    "6. Sort Honey by name: Cho phép sắp xếp danh sách Honey theo tên giảm dần theo bảng chữ cái. (1.5đ)\n" +
                    "7. Exit\n");
            System.out.println("Nhap lua chon: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    add(listHoney);
                    break;
                case 2:
                    showAllHoneys(listHoney);
                    break;
                case 3:
                    delete(listHoney);
                    break;
                case 4:
                    edit(listHoney);
                    break;
                case 5:
                    break;
                case 6:
                    sort(listHoney);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Khong co lua chon nay!");
                    break;
            }
        } while (true);
    }

    public static void add(ArrayList <Honey> listHoney) {
        Honey honey = new Honey();
        honey.input();
        listHoney.add(honey);
    }

    public static void showAllHoneys(ArrayList <Honey> listHoney) {
        System.out.printf("%-20s%-10d%-10s%-12s%-6s%-15s\n", "Ten", "Tuoi", "Gioi tinh", "SDT", "ID", "Trang thai");
        for (Honey i : listHoney)
            i.output();
    }

    public static void delete(ArrayList <Honey> listHoney) {
        int delId;
        System.out.println("Nhap id can xoa: ");
        delId = sc.nextInt();
        for (int i = 0; i < listHoney.size(); i++)
            if (listHoney.get(i).getId() == delId) listHoney.remove(listHoney.get(i));
    }

    public static void edit(ArrayList <Honey> listHoney) {
        int choseId;
        System.out.println("Nhap id: ");
        choseId = sc.nextInt();

        for (int i = 0; i < listHoney.size(); i++) {
            if (listHoney.get(i).getId() == choseId) {
                System.out.println("1. Sua ten");
                System.out.println("2. Sua tuoi");
                System.out.println("3. Sua SDT");
                System.out.println("4. Sua status");
                System.out.println("Nhap lua chon: ");

            }
        }
    }

    public static void sort(ArrayList<Honey> listHoney) {
        for (int i = 0; i < listHoney.size() - 1; i++)
            for (int j = 0; j < listHoney.size(); j++)
                if (listHoney.get(i).getName().compareTo(listHoney.get(j).getName()) > 0)
                {
                    Honey temp = listHoney.get(i);
                    listHoney.set(i, listHoney.get(j));
                    listHoney.set(j, temp);
                }
    }

}
