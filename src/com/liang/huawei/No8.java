package com.liang.huawei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * ���ݱ��¼��������������ֵ����Ա�������ͬ�ļ�¼���кϲ���������ͬ��������ֵ����������㣬�������keyֵ������������
 * ��������:�������ֵ�Եĸ�����Ȼ������ɶԵ�index��valueֵ���Կո����
�������:����ϲ���ļ�ֵ�ԣ����У�

������HashMap��containkey�÷��Լ�keySet�÷�
 */
public class No8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// set���ظ�
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
			Object[] arr = map.keySet().toArray();// set��Ԫ���ǲ����ظ���
			Arrays.sort(arr);// ��������
			for (Object key : arr) {
				System.out.println(key + " " + map.get(key));
			}
		}

	}
}