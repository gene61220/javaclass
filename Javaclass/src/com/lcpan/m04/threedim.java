package com.lcpan.m04;

public class threedim {
	public static void main(String[] args) {
		int sum = 0;
		int[][][] arr = { 
				{ { 2, 1, 2 }, { 2, 1, 2 } },
				{ { 2, 1, 2 }, { 2, 1, 2 } }, 
				{ { 2, 1, 2 }, { 2, 1, 2 } },
				{ { 2, 1, 2 }, { 2, 1, 2 } },
				// 此為 4 * 2 * 3
		};

		//
		for (int i = 0; i < arr.length; i++) {//layer
			for (int j = 0; j < arr[i].length; j++) { //row
				for (int k = 0; k < arr[i][j].length; k++) {   //column//
					sum += arr[i][j][k];
				}
			}
		}

		System.out.println("sum = " + sum);
	}
}
