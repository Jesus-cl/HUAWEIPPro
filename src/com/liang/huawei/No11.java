package com.liang.huawei;

import java.util.Scanner;

/*
 * 描述：
输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
输入描述:
输入一个int整数

输出描述:
将这个整数以字符串的形式逆序输出
 */
public class No11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n <= 0) {
				System.exit(1);
			}
			String str = String.valueOf(n);
			char[] ch = str.toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				System.out.print(ch[i]);
			}
		}
	}

}
