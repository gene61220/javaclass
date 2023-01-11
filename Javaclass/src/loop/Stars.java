package loop;

public class Stars {

	public static void main(String[] args) {
		/*
		 * int p=5; for(int i=1;i<=p;i++) {for(int j=1;j<=i;j++)System.out.print("*");
		 * System.out.print("\n"); } 以上為樣式1
		 */
		/*
		 * int p = 5; for (int i = p; i >= 1; i--) { for (int j = i; j >= 1; j--)
		 * System.out.print("*"); System.out.print("\n"); }
		 */
		int p = 5;
		for(int rc=1;rc<=p;rc++) {
				for (int i = rc; i < p; i++) {
			System.out.print("x");}
		for (int j = 1; j <= ((2 * rc) - 1); j++) {
			System.out.print("*");}
		System.out.print("\n");		
				
		}}}
