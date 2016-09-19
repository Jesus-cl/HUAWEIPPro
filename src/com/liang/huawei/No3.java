package com.liang.huawei;

/*
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，
 * 他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于
 * 其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着
 * 不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去
 * 找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 * 
 * 利用基数排序
 */
import java.util.Scanner;
import java.util.TreeSet;

public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		// while (sc.hasNext()) {
		// int n = sc.nextInt();
		// int[] a = new int[n];
		// for (int i = 0; i < n; i++) {
		// a[i] = sc.nextInt();
		// }
		// int[] c = Quchong(a);
		// for (int i = 0; i <=1000; i++) {
		// if (c[i] == 1) {
		// System.out.println(i);
		// }
		// }
		// }
		// }
		//
		// public static int[] Quchong(int[] a) {
		// int[] b = new int[1001];
		// for (int i = 0; i <= 1000; i++) {
		// b[i] = 0;
		// }
		// for (int i = 0; i < a.length; i++) {
		// b[a[i]] = 1;
		// }
		// return b;

		// 方法2
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			TreeSet<Integer> set = new TreeSet<>();
			for (int i = 0; i < n; i++) {
				set.add(sc.nextInt());
			}
			for (Integer in : set) {
				System.out.println(in);
			}
		}

	}
}
