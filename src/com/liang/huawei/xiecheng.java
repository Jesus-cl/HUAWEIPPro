package com.liang.huawei;

import java.util.LinkedList;
import java.util.List;

public class xiecheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 3, 5, 7, 9, 10, 11, 14, 15, 16, 19, 20, 22, 24, 35, 67, 78, 89, 90, 112, 334, 556, 778, 1123 };
		int[] B = { 1, 4, 5, 7, 8, 9, 10, 13, 15, 20, 22, 24, 35, 67, 78, 89, 90, 112, 334, 556, 778 };
		int[] C = { 1, 3, 6, 7, 8, 15, 20, 22, 24, 35, 67, 78, 89, 90, 112, 334, 556, 778 };
		int[] D = { 2, 3, 6, 7, 9, 10, 15, 20, 22, 24, 35, 67, 78, 89, 90, 112, 334, 556, 778 };
		long start = System.nanoTime();
		int[] E = findSame(A, B);
		int[] F = findSame(C, D);
		int[] result = findSame(E, F);
		long end = System.nanoTime();
		System.out.println("共用时：" + (end - start) + "纳秒" + "\n" + "数组ABCD的共同数：");
		for (int i : result) {
			System.out.print(i + ",");
		}
	}

	public static int[] findSame(int[] a, int[] b) {
		if (a == null || a.length == 0 || b.length == 0 || b == null) {
			return null;
		}
		int i = 0, j = 0;
		List<Integer> list = new LinkedList<>();
		while (i < a.length && j < b.length) {
			if (a[i] > b[j]) {
				j++;
			} else if (a[i] < b[j])
				i++;
			else {
				list.add(a[i]);
				i++;
				j++;
			}
		}
		int[] c = new int[list.size()];
		for (int k = 0; k < list.size(); k++) {
			c[k] = list.get(k);
		}
		return c;
	}
}
