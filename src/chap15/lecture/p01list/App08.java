package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App08 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 99; i>=0; i--) {
			list.add(i);
		}
		System.out.println(list);
		//각 element를 2배값으로 변경
		List<Integer> list1 = new ArrayList<>();
		for(int i = 0; i.size() ;i++) {
			list.add(list1*2);
		}
		System.out.println(list1);
	}
}
