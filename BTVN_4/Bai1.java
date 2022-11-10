package BTVN_4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi str: ");
        String str = sc.nextLine();

        str = str.replaceAll(" ", "").toLowerCase();    //xoa dau cach, chuyen cac chu hoa ve chu thuong

        while (!str.isEmpty()) {
            int cnt = 1;
            char ch = str.charAt(0);
            String temp = str.substring(1);

            while (temp.contains(String.valueOf(ch))) {
                cnt++;
                temp = removeCharAt(temp, temp.indexOf(ch));
            }

            str = temp;
            System.out.println(ch + " : " + cnt);
        }

    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}