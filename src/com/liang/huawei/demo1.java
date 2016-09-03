package com.liang.huawei;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

	public static void test() {
		HashMap<Person, String> hm = new HashMap<>();
		Person p1 = new Person("11", "xx");
		Person p2 = new Person("11", "xx");

		hm.put(p1, "ss");
		hm.put(p2, "ss");

		Iterator it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry ent = (Entry) it.next();

			Person key = (Person) ent.getKey();
			String value = (String) ent.getValue();

			System.out.println(key + "  " + value);

		}
	}

}

class Person {
	String id;
	String name;

	public Person(String id, String name) {
		// super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
