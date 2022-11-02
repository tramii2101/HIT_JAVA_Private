import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a, b, c, d: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if ((a == b) && (c == d) && (a == c))
			System.out.println("Khong ton tai so lon thu 2");
		else {
			int max = a;
			if (max < b)
				max = b;
			if (max < c)
				max = c;
			if (max < d)
				max = d;

			int max2 = 0;
//			if (a != max)
//				max2 = a;
//			else if (b != max)
//				max2 = b;
//			else if (c != max)
//				max2 = c;
//			else if (d != max)
//				max2 = d;

			if ((max2 < a) && (a != max))
				max2 = a;
			if ((max2 < b) && (b != max))
				max2 = b;
			if ((max2 < c) && (c != max))
				max2 = c;
			if ((max2 < d) && (d != max))
				max2 = d;

			System.out.println(max2);
		}
	}
}
