package loop;
public class chiyinshu {
	public static void main(String[] args) {
		int x = 31;
		for (int i = 1; i <= x; i++) {
			int p = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					p++;
			}
			if (p == 2) {
				System.out.print(i + ", ");
			}
		}
	}
}
