package com.liang.huawei;

/*
 * ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ�
 * �����ü����������N��1��1000֮������������N��1000��������
 * �����ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ��
 * ��ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ
 * ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 * 
 * ���û�������
 */
import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int[] c = Quchong(a);
			for (int i = 0; i < 1000; i++) {
				if (c[i] == 1) {
					System.out.println(i);
				}
			}
		}
	}

	public static int[] Quchong(int[] a) {
		int[] b = new int[1000];
		for (int i = 0; i < 1000; i++) {
			b[i] = 0;
		}
		for (int i = 0; i < a.length; i++) {
			b[a[i]] = 1;
		}
		return b;
	}
}
