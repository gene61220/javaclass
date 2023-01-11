package loop;

public class Interest {

	public static void main(String[] args) {
		double i = 100000;
		double j = 100000;
		int year = 0;
		while (i >= j) {
			i += 10000;
			j *= 1.05;
			year++;
		}
		System.out.print(year);
	}

}
