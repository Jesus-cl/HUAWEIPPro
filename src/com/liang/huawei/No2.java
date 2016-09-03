package com.liang.huawei;

/*
 * д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
 */
import java.util.Scanner;

public class No2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String c = sc.next();
		int count = findFrequentStr(str, c);
		System.out.println(count);
	}

	public static int findFrequentStr(String str, String c) {
		if (str == null || c == null) {
			return 0;
		}
		// str.toLowerCase();
		// c.toLowerCase();
		char[] array = str.toCharArray();
		int len = array.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (array[i] == c.toCharArray()[0] || array[i] == c.toCharArray()[0] + 32
					|| array[i] == c.toCharArray()[0] - 32) {
				count++;
			}
		}
		return count;
	}
}
