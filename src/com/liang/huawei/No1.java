package com.liang.huawei;

import java.util.Scanner;

/*
 * 题目描述:	计算字符串最后一个单词的长度，单词以空格隔开。
输入描述:		一行字符串，非空，长度小于5000。
输出描述: 	整数N，最后一个单词的长度。
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
