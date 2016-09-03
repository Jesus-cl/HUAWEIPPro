package com.liang.Link;

import java.time.Period;

public class MyLink {
	Node head = null;

	/*
	 * ֻ������β���Ԫ��
	 */
	public void addNode(Object obj) {
		Node newNode = new Node(obj);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;// ���node����β
	}

	/*
	 * ������λ�ò���ڵ�
	 */
	public void addAnyNode(int index, Object obj) {
		Node newNode = new Node(obj);
		Node prenNode = head;
		Node currentNode = head;
		int pos = 0;
		while (index != pos) {
			prenNode = currentNode;
			currentNode = currentNode.next;
			pos++;
		}
		newNode.next = currentNode;
		prenNode.next = newNode;
	}

	/**
	 * @return��������ĳ���
	 */
	public int length() {
		int length = 0;
		Node temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}

	/*
	 * ɾ��ָ��λ�õ�Ԫ�� ɾ���ɹ�����true�����򷵻�false
	 */
	public Boolean deleteNode(int index) {
		if (index < 0 || index > length()) {
			return false;
		}
		if (index == 1) {
			head = head.next;
			return true;
		}
		int i = 1;
		Node preNode = head;
		Node currentNode = preNode.next;
		while (currentNode != null) {
			if (i == index) {
				preNode.next = currentNode.next;
				return true;
			}
			preNode = currentNode;
			currentNode = currentNode.next;
			i++;
		}
		return true;
	}

	/**
	 * ����������ݴ�С��������
	 */
	public void sort() {
		Node nextNode = null;
		Node currentNode = head;
		Object temp;
		while (currentNode.next != null) {
			nextNode = currentNode.next;
			while (nextNode != null) {
				if (Integer.parseInt(String.valueOf(currentNode.data)) > Integer
						.parseInt(String.valueOf(nextNode.data))) {
					temp = nextNode.data;
					nextNode.data = currentNode.data;
					currentNode.data = temp;

				}
				nextNode = nextNode.next;
			}
			currentNode = currentNode.next;
		}
	}

	/**
	 * ��ӡ����
	 */
	public void printLink() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLink mylink = new MyLink();
		mylink.addNode(2);
		mylink.addNode(3);
		mylink.addNode(1);
		mylink.addAnyNode(2, 20);
		mylink.printLink();
		System.out.println("������Ϊ��" + mylink.length());
		mylink.sort();
		mylink.printLink();
	}

}
