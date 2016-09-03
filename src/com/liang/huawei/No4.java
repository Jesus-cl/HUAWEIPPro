package com.liang.huawei;

import java.util.Scanner;

/*
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。

输入描述:连续输入字符串(输入2次,每个字符串长度小于100)
输出描述:输出到长度为8的新字符串数组

输入例子:
abc
123456789

输出例子:
abc00000
12345678
90000000
 */
public class No4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] str = new String[2];
			for (int i = 0; i < 2; i++) {
				str[i] = sc.nextLine();
			}
			Fun(str);
		}
	}

	public static void Fun(String[] str) {
		for (int i = 0; i < str.length; i++) {
			StringBuffer sb = new StringBuffer(str[i]);
			if(str[i].length()>100||str[i]==null){
				System.exit(1);
			}
			else if ((str[i].length() % 8) > 0) {
				int n = 8 - (str[i].length()) % 8;
				for (int j = 0; j < n; j++) {
					sb.append("0");
				}
			}
				int no = str[i].length() / 8+1;
				for (int k = 0; k < no; k++) {
					if(k*8+8<=sb.length()){
					System.out.println(sb.substring(8 * (k), 8 * (k + 1)));
					}
				}
			
		}
	}
	
	
}

   
