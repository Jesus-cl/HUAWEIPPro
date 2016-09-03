package com.liang.Arrary;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 44, 32, 54, 23, 61 };
		int len = arr.length;
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < len; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("最大数：" + max);
		System.out.println("最小数：" + min);
		//System.out.println(Integer.toBinaryString(7));
	}

}
