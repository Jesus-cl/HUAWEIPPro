package com.liang.huawei;

import java.util.Scanner;

/*
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 */
public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法1：
//		Scanner sc = new Scanner(System.in);
//		while (sc.hasNext()) {
//			long n = sc.nextLong();
//			System.out.print(getResult(n));
//		}
//	}
//
//	public static String getResult(long n) {
//		StringBuffer sb = new StringBuffer();
//		if (n <= 1) {
//			System.exit(1);
//		}
//		while (n != 1) {
//			for (int i = 2; i <= n; i++) {
//				if (n % i == 0) {
//					sb.append(i + " ");
//					n = n / i;
//					break;
//				}
//			}
//		}
//
//		return sb.toString();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
		long l=sc.nextLong();
		while(l!=1){
			for(int i=2;i<=l;i++){
				if(l%i==0){
					System.out.print(i+" ");
					l/=i;
					break;
				}
			}
		}
	}
	}
}
