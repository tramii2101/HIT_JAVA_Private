package BTVN_3;

import java.util.Scanner;

public class Bai3 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap so phan tu: ");
			n = sc.nextInt();
		} while (n < 2);
		int []a = new int[n];
		
		input(a, n);
		System.out.println("Do dai chuoi dai nhat: " + arr(a, n));
	}
	
	
	public static void input(int[] a, int n) {
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
	}
	
	public static int arr(int []a, int n) {
		int cnt = 1, cmp = 1;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] <= a[i+1]) {
				cnt++;
				if (cmp < cnt) cmp = cnt;
			}
			else cnt = 1;
		}
		
		return cmp;
	}
}

