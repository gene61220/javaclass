package loop;

import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String pw="5588";
		System.out.print("請輸入密碼\n");
		int i = 0;
		while(i<3) {
		//	Scanner scanner = new Scanner(System.in);
		//	String pw1=  Scanner.next;
		//	if()}
			String pw1= scanner.next();
			if(pw1!=pw)if(i!=2) {i++;}else System.out.print("滾");
	}
		scanner.close();
}}
