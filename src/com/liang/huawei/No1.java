package com.liang.huawei;

import java.util.Scanner;

/*
 * ��Ŀ����:	�����ַ������һ�����ʵĳ��ȣ������Կո������
��������:		һ���ַ������ǿգ�����С��5000��
�������: 	����N�����һ�����ʵĳ��ȡ�
 */
public class No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arrstr = str.split(" ");
		if(arrstr.length>500){
			System.out.println("The string too long!");
			System.exit(1);
		}
		System.out.println(arrstr[arrstr.length-1].length());
	}

}
