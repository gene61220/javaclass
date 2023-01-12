
package com.lcpan.m01;
import java.util.Scanner;
public class Rain {

	public static void main(String[] args) {
		int[][][] rain = { { { 18, 68, 24 }, { 62, 42, 71 }, { 22, 83, 47 }, { 62, 55, 78 } }, // 1
				{ { 62, 23, 17 }, { 52, 18, 62 }, { 42, 44, 68 }, { 54, 42, 83 } }, // 2
				{ { 72, 14, 14 }, { 62, 36, 82 }, { 72, 63, 18 }, { 92, 23, 66 } }, // 3
				{ { 15, 63, 15 }, { 32, 15, 69 }, { 62, 65, 64 }, { 73, 66, 82 } }, // 4
				{ { 13, 83, 13 }, { 72, 43, 42 }, { 52, 48, 56 }, { 42, 51, 74 } } // 5
		};
Scanner scanner = new Scanner(System.in);
System.out.println("Please input \n<all>\t\tfor all month avg, \n<season> \tfor season, \n <month>\tfor month avg rain\nvvv input here--------------------------");
String name= scanner.next();
switch(name) {
case ("all") : 
 break;
case ("season") :
	break;
case("month") :
	break;
default: System.out.print("input error");
}
scanner.close();
System.out.println("\nend");
	}

}
