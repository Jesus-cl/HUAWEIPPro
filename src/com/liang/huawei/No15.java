package com.liang.huawei;

import java.util.Scanner;

/*
 * 输入一个int型数据，计算出该int型数据在内存中存储时1的个数。
 */
public class No15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int count = 0;
			String str = Integer.toBinaryString(n);
			char[] ch = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '1')
					count++;
			}
			System.out.println(count);
		}
	}

}
