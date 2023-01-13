package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int dong = 0, mo = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') mo++;
            if (str.charAt(i) == ')') dong++;
        }

        System.out.println(Math.abs(mo - dong));
    }

}
