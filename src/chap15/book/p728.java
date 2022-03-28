package chap15.book;

import java.util.*;

public class p728 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("java");
		list.add("jdbc");
		list.add("servlet/jsp");
		list.add("database");
		list.add("iBarls");

		int size = list.size();
		System.out.println("총 객체수 :" + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("2:" + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		list.remove(2);
		list.remove(2);
		list.remove("iBTIS");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

	}
}
