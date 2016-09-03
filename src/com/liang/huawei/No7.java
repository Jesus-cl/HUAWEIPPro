package com.liang.huawei;

import java.util.Scanner;

/*
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
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
