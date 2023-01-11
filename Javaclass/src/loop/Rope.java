package loop;

public class Rope {
	public static void main(String[] args) {
		int ropelong = 3000;
		double cutln = ropelong;
		int days = 0;
		while (cutln > 5) {
			cutln = cutln / 2;
			days++;
		}
		System.out.println(days + "天後剩餘長度為" + cutln);
	}
}
