package chap15.book.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer > map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 92);
		map.put("white", 86);
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		//모두탐색
		//entryset
		for(Map.Entry<String, Integer>entry:map.entrySet()) {
			System.out.println(entry);
			
		//2.keyset
			Set<String>keySet = map.keySet();
			for(String key : keySet) {
				System.out.println(key + "=" + map.get(key));
				
			}
			//3.foreaeh
			map.forEach((k, v) -> System.out.println(k + "=" + v));
		
			//확인문제9
			keySet = map.keySet();
			for(String key : keySet) {
				Integer value = map.get(key);
				if(value > maxScore) {
					name = key;
					maxScore = value;
				}
				totalScore += value;
			}
			System.out.println("평균 점수:" + (totalScore/(double)map.size()));
			System.out.println("최고 점수 :"+ maxScore);
			System.out.println("최고 아이디 : " + name);
		}
		
		
		
	}
}
