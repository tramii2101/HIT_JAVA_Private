package BTVN_3;

import java.util.Scanner;

public class Bai4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap so phan tu: ");
			n = sc.nextInt();
		} while (n < 1);
		int[] a = new int[n];
		input(a, n);
		output(a, n);
	}

//	nhap mang a
	public static void input(int[] a, int n) {
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
	}

//	ktra 1 so ngto	
	public static boolean primeNum(int x) {
		if (x < 2)
			return false;
		if (x == 2 || x == 3)
			return true;
		else {
			for (int i = 2; i * i <= x; i++)
				if (x % i == 0)
					return false;
			return true;
		}
	}

//	ktra cac chu so 
	public static boolean check(int x) {
		while (x > 0) {
			if (!primeNum(x % 10))
				return false;
			x /= 10;
		}
		return true;
	}

	public static void output(int[] a, int n) {
		int cnt = 0;
		for (int i = 0; i < n; i++)
			if (primeNum(a[i]))
				if (check(a[i])) {
					System.out.print(a[i] + " ");
					cnt++;
				}
		if (cnt == 0)
			System.out.println("NO");
	}

}
