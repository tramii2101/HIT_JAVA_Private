package BTVN_4;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();

        boolean check = false;
        int sum = 0, cnt = 0;

        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
                check = true;
                cnt++;
            }
        }

        if (check == true) {
            System.out.println(check);
            System.out.printf("%.3f", (float) sum / cnt);
        }
        else System.out.println(check);
    }

}
