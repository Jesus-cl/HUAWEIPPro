package com.liang.huawei;

import java.util.Scanner;

/*
 * ����һ��int�����ݣ��������int���������ڴ��д洢ʱ1�ĸ�����
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
