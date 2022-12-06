package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<HocSinh> listHS = new ArrayList<>();

        do {
            System.out.println("MENU\n" +
                    "1. Thêm học sinh mới. \n" +
                    "2. Xuat ra thong tin cac hoc sinh\n" +
                    "3. Hiển thị các học sinh 20 tuổi. \n" +
                    "4. Cho biết số lượng các học sinh có tuổi là 23 và quê ở DN\n" +
                    "5. Sắp xếp sinh viên tăng dần theo quê quán. \n" +
                    "6. Kết thúc chưong trình\n");

            System.out.println("Nhap lua chon: ");
            byte choose = sc.nextByte();
            switch(choose) {
                case 1:
                    add(listHS);
                    break;
                case 2:
                    System.out.println("========================HIEN THI DANH SACH HS=====================");
                    show(listHS);
                    break;
                case 3:
                    System.out.println("========================HIEN THI DANH SACH HS 20 TUOI=====================");
                    showHS(listHS);
                    break;
                case 4:
                    System.out.println("So luong hs co tuoi la 20 va que o DN la: " + countHS(listHS) );
                    break;
                case 5:
                    System.out.println("========================HIEN THI DANH SACH HS DA SAP XEP THEO QUE QUAN=====================");
                    sortHS(listHS);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Khong co lua chon nay!");
                    break;
            }
        }while(true);
    }

    public static void add(ArrayList<HocSinh> listHS) {
        HocSinh hs = new HocSinh();
        hs.input();
        listHS.add(hs);
    }

    public static void show(ArrayList<HocSinh> listHS) {
        System.out.printf("%-20s%-15s%-15s%-10s%-15s%n", "Ho ten", "Tuoi", "Que quan", "Ma lop", "Ten lop");
        for (HocSinh i : listHS)
            i.output();
    }

    public static void showHS(ArrayList<HocSinh> listHS) {
        System.out.printf("%-20s%-15s%-15s%-10s%-15s%n", "Ho ten", "Tuoi", "Que quan", "Ma lop", "Ten lop");
        for (HocSinh i : listHS)
            if (i.getTuoi() == 20)
                i.output();
    }

    public static int countHS(ArrayList<HocSinh> listHS) {
        int cnt = 0;
        for (HocSinh i : listHS)
            if ((i.getTuoi() == 23) && (i.getQueQuan().equals("DN")))
                cnt++;
        return cnt;
    }

    public static void sortHS(ArrayList<HocSinh> listHS) {
        for (int i = 0; i < listHS.size() - 1; i++)
            for (int j = i + 1; j < listHS.size(); j++)
                if (listHS.get(i).getQueQuan().compareTo(listHS.get(j).getQueQuan()) > 0) {
                    HocSinh temp = listHS.get(i);
                    listHS.set(i, listHS.get(j));
                    listHS.set(j, temp);
                }
        show(listHS);
    }
}
