package com.liang.huawei;

/*
 * ×Ö·û´®·´×ª
 */
import java.util.Scanner;

public class No12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			char[] ch = str.toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				System.out.print(ch[i]);
			}
		}
	}

}
