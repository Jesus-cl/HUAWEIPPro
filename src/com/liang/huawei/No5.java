package com.liang.huawei;

/*
 * д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����������ͬʱ���� ��
 */
import java.util.Scanner;

public class No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc1.nextLine().substring(2);
			System.out.println(Integer.parseInt(str, 16));
		}
		sc.close();
		sc1.close();
	}

}
