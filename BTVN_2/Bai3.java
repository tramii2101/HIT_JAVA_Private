
public class Bai3 {
	public static void main(String[] args) {
////		gia su moi loai trau deu co so luong lon hon 0
//		int cnt = 0;
//		for (int i = 1; i < 20; i++)
//			for (int j = 1; j < 33; j++)
//				for (int k = 1; k <= 98; k++)
//					if ((i + j + k == 100) && (15 * i + 9 * j + k == 300)) {
//						cnt++;
//						System.out.println("TH" + cnt);
//						System.out.println(" Trau dung: " + i);
//						System.out.println(" Trau nam: " + j);
//						System.out.println(" Trau gia: " + k);
//						break;
//					}
//		if (cnt == 0)
//			System.out.println("Khong co TH nao");
		
		for (int i = 1; i < 20; i++)
			for (int j = 1; j < 33; j++)
				if ((i * 15 + j * 9 + (100 - i - j) == 300)) System.out.println(i + " " + j + " " + (100 - i - j));
		
	}
}
