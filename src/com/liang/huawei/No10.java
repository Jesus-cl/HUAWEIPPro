package com.liang.huawei;

import java.util.HashSet;
import java.util.Scanner;

/*
 * ��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����ڷ�Χ�ڵĲ���ͳ�ơ�
��������:abc  �������: 3
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
