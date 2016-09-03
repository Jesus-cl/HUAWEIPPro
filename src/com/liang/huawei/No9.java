package com.liang.huawei;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 输入例子:9876673 输出例子: 37689
 */
public class No9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String str = String.valueOf(n);
			fun(str);
		}
	}

	public static void fun(String s) {
		int len = s.length();
		char[] ch = s.toCharArray();
		// 利用Set不重复的特点 是LinkedhashSet保证顺序
		Set<String> ts = new LinkedHashSet();
		for (int i = len - 1; i >= 0; i--) {
			ts.add(ch[i] + "");
		}
		String str = "";
		for (String index : ts) {
			str += index;
		}
		System.out.println(Integer.parseInt(str));
	}
}
