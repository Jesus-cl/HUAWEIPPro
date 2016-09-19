package com.liang.huawei;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class demo {
	public static boolean isPrime(int start, int number) {
		if (number < 2) {
			return false;
		}
		start++;
		if (start > number / 2) {
			return true;
		}
		if (number % start == 0) {
			return false;
		}
		return isPrime(start, number);
	}

	private static void what(int number) {
		// int code = -1;
		int count = 0;
		int count1=0;
		//Set<Object> set = new LinkedHashSet<>();
		for (int i = 2; i < number; i++) {
			for (int j = 2; j < number; j++) {
				if (isPrime(1, i) && isPrime(1, j) && i + j == number) {
					//set.add(i);
					if(i==j)
					 count++;
					else
						count1++;
				}
			}
		}

		System.out.println(count+(count1/2));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();

			what(n);

		}
	}
}