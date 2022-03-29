package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		//set : 순서 없고, 중복 x
		//rngus zmffotm :HashSet
		
		Set<String> set = new HashSet<>();
		
		//add element; 추가
		set.add("jimin");
		set.add("suga");
		set.add("jin");
		set.add("rm");
		
		//size 크기
		System.out.println(set.size());
		
		set.add("rm");//중복 허용 x 
		System.out.println(set.size());
		
		//탐색
		//항상for
		for(String item : set) {
			//순서 보장이 안돼.
			System.out.println(item);
		}
		
		//Iterator
		Iterator<String>iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//remove
		set.remove("rm");
		System.out.println(set.size());
		set.remove("winter");
		System.out.println(set.size());
		
		//element 있는지 없는지
		System.out.println(set.contains("rm"));//false
		System.out.println(set.contains("jin"));//true
	}
}
