package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App02 {
	public static void main(String[] args) {
		//lotto : 1~45 임의의 값 6개 
		//1~45 임의의값 6개를 중복없이 출력 코드 작성
		/*int lotto[] = new int[6];
		System.out.println("로또 선택 숫자");
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto[i] = num;
			for(int j = 0; j <i; j++) {
				if(lotto[i]== lotto[j]) {
					i--;
					break;
				}
			}
			System.out.println(lotto[i] + " ");
		}*/
	// Lotto : 1~45의 임의의 값 6개
		
		// 1~45의 임의의 값 6개를 중복없이 출력 코드 작성
		Set<Integer> set = new HashSet<>();
		
		while (set.size() < 6) {
//			int num = (int) (Math.random() * 45) + 1;
//			System.out.println(num);
			
			set.add((int) (Math.random() * 45) + 1);
		}
		
		System.out.println(set.size()); // 6 or not
		
		System.out.println(set);
	}
}
