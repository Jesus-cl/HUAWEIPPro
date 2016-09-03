package com.liang.huawei;

import java.util.Scanner;

/*
 * ��������˳ʱ����� eg:  1 2 3 
 *                      8 9 4 
 *                      7 6 5
 * 
 * @author chenliang
 *
 */
public class JuZheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int[][] m = new int[n][n];
			fun(n, m);
			print(n, m);
		}
	}

	public static void print(int n, int[][] m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", m[i][j]);
			}
			System.out.println();
		}
	}

	public static void fun(int n, int[][] m) {
		int k = 1;
		for (int i = 0; i <= n / 2; i++) {
			for (int j = i; j < n - i; j++) {
				m[i][j] = k++; // �����������
			}
			for (int j = i + 1; j < n - i; j++) {
				m[j][n - i - 1] = k++; // ���ϵ��µ���
			}
			for (int j = n - i - 2; j >= i; j--) {
				m[n - i - 1][j] = k++; // �������������
			}
			for (int j = n - i - 2; j > i; j--) {
				m[j][i] = k++; // �������ϵ�����
			}
		}
	}
}
