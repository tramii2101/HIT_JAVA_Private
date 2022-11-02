package BTVN_3;

import java.util.Scanner;

public class Bai1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a;
		int n;
		do {
			System.out.print("Nhap so phan tu: ");
			n = sc.nextInt();
		} while (n < 2);
		a = new int[n];

		input(a, n);
		sort(a, n);

		for (int i = 0; i < n; i++) {
			System.out.println(a[i] + ":" + count(a, n, a[i]));
			i += count(a, n, a[i]) - 1;
		}
	}

	public static void input(int[] a, int n) {
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
	}

	public static void sort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
	}

	public static int count(int[] a, int n, int x) {
		int cnt = 0;
		for (int i = 0; i < n; i++)
			if (a[i] == x)
				cnt++;
		return cnt;
	}

}
