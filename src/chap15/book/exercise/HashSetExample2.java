package chap15.book.exercise;



import java.util.*;

import chap15.book.Member;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member>set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
		
	}
}
