import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.print("Nhap n: ");
			n = sc.nextInt();
		} while (n <= 0);

		int a = n;
		int dem = 0;
		while (a != 0) {
			a /= 10;
			dem++;
		}

		int cnt = 0;
		for (int i = dem - 1; i >= 0; i--) {
			a = (int) (n / (Math.pow(10, i)));
			if (check(a)) {
				System.out.print(a + " ");
				cnt++;
			}
			n %= (Math.pow(10, i));
		}

		if (cnt == 0)
			System.out.println("No");

	}

	public static boolean check(int x) {
//		int i = (int) Math.sqrt(x);
//		if (i * i == x)
//			return true;
		if ((x == 0) || (x == 1) || (x == 4) || (x == 9))
			return true;
		else
			return false;
	}
}
