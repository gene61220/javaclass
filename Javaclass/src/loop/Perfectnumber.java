package loop;

public class Perfectnumber {

	public static void main(String[] args) {
		int x = 1000;
		
		for (int z = 2; z <= x; z++) {
			int y = 0;
			for (int i = 1; i <= z; i++) {
				if (z % i == 0) {
					// System.out.print(i);
					if (z != i)
						y += i;
					// System.out.print(", ");
				}
				if (i == z && y == z)
					System.out.print(z+", ");
			}
		}
	}
}
