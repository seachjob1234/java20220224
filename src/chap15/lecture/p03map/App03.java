package chap15.lecture.p03map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App03 {
public static void main(String[] args) {
	List<String>list = new ArrayList<>();
	list = Arrays.asList("a", "b", "c");
	
	String result = "";
	list.forEach(e -> result += e);
	
	System.out.println(result);
}
}
