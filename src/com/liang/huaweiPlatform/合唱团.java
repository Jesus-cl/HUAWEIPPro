package com.liang.huaweiPlatform;

import java.util.Scanner;

public class ºÏ³ªÍÅ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0;
		while (sc.hasNext()) {
			String str = sc.nextLine();
			String[] strr = str.split(" ");
			int n = Integer.valueOf(strr[0]);
			int[] heightArr = new int[n];
			for (int i = 0; i < n; i++) {
				heightArr[i] = sc.nextInt();
			}

		}
	}

}
