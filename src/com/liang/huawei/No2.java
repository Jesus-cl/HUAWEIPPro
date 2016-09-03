package com.liang.huawei;

/*
 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */
import java.util.Scanner;

public class No2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String c = sc.next();
		int count = findFrequentStr(str, c);
		System.out.println(count);
	}

	public static int findFrequentStr(String str, String c) {
		if (str == null || c == null) {
			return 0;
		}
		// str.toLowerCase();
		// c.toLowerCase();
		char[] array = str.toCharArray();
		int len = array.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (array[i] == c.toCharArray()[0] || array[i] == c.toCharArray()[0] + 32
					|| array[i] == c.toCharArray()[0] - 32) {
				count++;
			}
		}
		return count;
	}
}
