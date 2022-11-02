package BTVN_3;

import java.util.Scanner;

public class Bai2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap so phan tu: ");
			n = sc.nextInt();
		} while (n < 2);
		int[] a = new int[n];

		input(a, n);
		fill(a, n);
	}

	public static void input(int[] a, int n) {
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
	}

	public static void fill(int[] a, int n) {
		int num, cnt = 0;
		for (int i = 0; i < n - 1; i++) {
			num = a[i];
			while ((a[i + 1] - num) > 1) {
				System.out.print(++num + " ");
				cnt++;
			}
		}
		if (cnt == 0)
			System.out.println("YES");

	}

}
