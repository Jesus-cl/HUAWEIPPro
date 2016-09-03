package com.liang.huawei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * 输入描述:先输入键值对的个数，然后输入成对的index和value值，以空格隔开
输出描述:输出合并后的键值对（多行）
 */
public class No8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// set不重复
			HashMap<Integer, Integer> map = new HashMap<>();
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int key = sc.nextInt();
				int value = sc.nextInt();
				if (map.containsKey(key)) {
					map.put(key, value + map.get(key));
				} else {
					map.put(key, value);
				}
			}
			Object[] arr = map.keySet().toArray();
			Arrays.sort(arr);
			for (Object key : arr) {
				System.out.println(key + " " + map.get(key));
			}
		}

	}
}