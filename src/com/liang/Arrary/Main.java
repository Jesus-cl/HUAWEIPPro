package com.liang.Arrary;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 输入一组大于0小于1000的整数，且均不相同，逗号隔开，输出其中能被这些整数中其他元素整除的那些元素。

输入输出格式要求
输入要求同上述描述，输出要求整数顺序按照输入时的顺序输出。

样例
输入：2,4,6,8,10,12,3,9 
输出：4,6,8,10,12,9
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
