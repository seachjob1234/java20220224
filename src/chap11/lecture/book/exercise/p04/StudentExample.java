package chap11.lecture.book.exercise.p04;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		//Student 키로 초엊ㅁ을 저자하는 hashmap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student,String>();
		
		//new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");
		
		//new Student("1")을 점수로 불러옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점 :" +score);
		
	}
}
