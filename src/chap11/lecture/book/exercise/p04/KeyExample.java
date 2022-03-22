package chap11.lecture.book.exercise.p04;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key객체를 식별키로 사용해서 String값을 저장하는 HashMap객체 생성
		HashMap<Key,String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)"을 홍길동으로 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)"을 홍길동으로 읽어옴
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
	}
}
