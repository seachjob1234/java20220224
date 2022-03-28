package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App09 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		// 홀수 element 삭제
		/*int i = 0;
		while (i < list.size()) {
			Integer elem = list.get(i);
			if (elem % 2 == 1) {
				list.remove(i);
			}
			i++;
		}*/
	//	list.removeIf(n -> (n % 2 == 1));
		//Iterator 사용
		
	
		System.out.println(list.toString());// [0,2,4,6,8]
	}
}
