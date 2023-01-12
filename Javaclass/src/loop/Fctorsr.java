package loop;
import java.util.Scanner;
public class Fctorsr {
	static int factorial(int a) {
		int b = 1;
		for (int i = 1; i <= a; i++)
			b *= i ;
		return b;
	}
	public static void main(String[] args) {
		System.out.print("請輸入欲算之階層值:");
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		scanner.close();
		System.out.print("階層值為: " + factorial(k));
	}
}
