package com.liang.huawei;

import java.util.Scanner;

/*
 * ������
����һ��������������������ַ�������ʽ�������
���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001
��������:
����һ��int����

�������:
������������ַ�������ʽ�������
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
