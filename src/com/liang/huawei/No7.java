package com.liang.huawei;

import java.util.Scanner;

/*
 * д��һ�����򣬽���һ����������ֵ���������ֵ�Ľ�������ֵ�����С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ����
 */
public class No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextFloat()) {
			float f = sc.nextFloat();
			System.out.println((int) (f + 0.5));
		}
	}

}
