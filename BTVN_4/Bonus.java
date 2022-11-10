package BTVN_4;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi so La Ma: ");
        String str = sc.nextLine();

        int sum = 0;
        int cnt;
        String temp = "IVXLCDM";
        int []val = {1, 5, 10, 50, 100, 500, 1000};
        char ch1, ch2;

        for (int i = 0; i < str.length() - 1; i++){
            ch1 = str.charAt(i);
            ch2 = str.charAt(i+1);
            if (temp.indexOf(ch1) < temp.indexOf(ch2))
                sum -= val[temp.indexOf(ch1)];
            else sum += val[temp.indexOf(ch1)];
        }

        sum += val[temp.indexOf(str.charAt(str.length()-1))];
        System.out.println(sum);
    }
}

