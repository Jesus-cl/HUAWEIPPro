package com.liang.huawei;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * ����һ��int�����������մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�������
 * ��������:9876673 �������: 37689
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
		// ����Set���ظ����ص� ��LinkedhashSet��֤˳��
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
