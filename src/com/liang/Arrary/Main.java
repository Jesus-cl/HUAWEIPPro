package com.liang.Arrary;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * ����һ�����0С��1000���������Ҿ�����ͬ�����Ÿ�������������ܱ���Щ����������Ԫ����������ЩԪ�ء�

���������ʽҪ��
����Ҫ��ͬ�������������Ҫ������˳��������ʱ��˳�������

����
���룺2,4,6,8,10,12,3,9 
�����4,6,8,10,12,9
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String line = sc.nextLine();
			String[] str = line.split(",");
			int n = str.length;
			int[] b = new int[n];
			// b={0};
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (Integer.parseInt(str[j]) % Integer.parseInt(str[i]) == 0) {
						b[j] = 1;
					}
				}
			}
			Set<String> set = new LinkedHashSet<>();
			for (int i = 0; i < n; i++) {
				if (b[i] == 1) {
					set.add(str[i]);
				}
			}
			int k = 0;
			for (String s : set) {
				System.out.print(s);
				k++;
				if (k != set.size()) {
					System.out.print(",");
				}
			}
		}

	}

}
