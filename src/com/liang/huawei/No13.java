package com.liang.huawei;

import java.util.Scanner;

public class No13 {

	/*
	 * ������ת
	 * ��һ��Ӣ������Ե���Ϊ��λ�����ŷš�
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			System.out.print(reserve(str));
		}
	}

	public static String reserve(String str) {
		String[] strs = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = strs.length - 1; i >= 0; i--) {
			sb.append(strs[i] + " ");
		}

		return sb.toString().trim();
	}
}
