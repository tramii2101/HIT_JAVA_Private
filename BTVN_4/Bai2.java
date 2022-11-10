package BTVN_4;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String temp = "";
        int max = 0, cnt = 0;
        for (int i = 0; i < str2.length(); i++){
            for (int j = i; j < str2.length() + 1; j++){
                temp = str2.substring(i, j);
                if (str1.contains(temp) && max < temp.length()) max = temp.length();
            }
        }

        System.out.println(max);
    }
}