
public class function {

	public static void main(String[] args) {
		int a = 1;
		int b = -4;
		int c = 3;
		int d = 0;
		double e = 0;
		d = (b * b) - (4 * a * c);
		e = Math.sqrt(d);
		if (d > 0) {
			System.out.print("X有兩個正實數解 ");
			System.out.print((-b + e) / (2 * a));
			System.out.print(" 、 ");
			System.out.print((-b - e) / (2 * a));}
		 else {
			if (d == 0)
				{System.out.println((-b + e) / 2 * a);}
			else {
				if (d < 0)
					{System.out.print("沒有實數解");}
			}

		}
	}

}
