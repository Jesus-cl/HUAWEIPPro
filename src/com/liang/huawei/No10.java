package com.liang.huawei;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
输入例子:abc  输出例子: 3
 */
public class No10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<String> s = new HashSet<>();
		while (sc.hasNext()) {
			String line = sc.nextLine();
			char[] ch = line.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] <= 127 && ch[i] >= 0) {
					s.add(String.valueOf(ch[i]));
				}
			}
			System.out.println(s.size());
			s.clear();
		}
	}

}
