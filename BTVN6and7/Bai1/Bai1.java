package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        String str = "";
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            str = sc.nextLine();
            list.add(str);
        }

        System.out.println("Nhap chuoi: ");
        String str2 = sc.nextLine();
        for (int i = 0; i < n; i++)
            if (list.get(i).contains(str2))
                System.out.print(list.get(i) + " ");
    }
}
