package com.liang.huawei;

/*
 * 给定n个字符串，请对n个字符串按照字典序排列。 
 */
import java.util.Arrays;
import java.util.Scanner;

public class No14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			/*
			 * 因为int n = sc.nextInt()仅仅是把第一行的整数值读取了，在管道缓存中，还有换行符（enter），
			 * 当在下面的nextLine（）首先是读取第一行的换行符前面的数据，就是null，所以读取的数据就会少一行 所以这里采用 int n
			 * = Integer.parseInt(sc.nextLine())的方式就不会少一行数据
			 * 
			 */
			int n = Integer.parseInt(sc.nextLine());
			String[] str = new String[n];
			for (int i = 0; i < n; i++) {
				str[i] = sc.nextLine();
			}
			Arrays.sort(str);
			for (int i = 0; i < n; i++) {
				System.out.println(str[i]);
			}
		}
	}

}
