package com.liang.huawei;

/*
 * ����n���ַ��������n���ַ��������ֵ������С� 
 */
import java.util.Arrays;
import java.util.Scanner;

public class No14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			/*
			 * ��Ϊint n = sc.nextInt()�����ǰѵ�һ�е�����ֵ��ȡ�ˣ��ڹܵ������У����л��з���enter����
			 * ���������nextLine���������Ƕ�ȡ��һ�еĻ��з�ǰ������ݣ�����null�����Զ�ȡ�����ݾͻ���һ�� ����������� int n
			 * = Integer.parseInt(sc.nextLine())�ķ�ʽ�Ͳ�����һ������
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
