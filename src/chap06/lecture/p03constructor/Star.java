package chap06.lecture.p03constructor;

public class Star {
	String stars;
	
	Star(int number){
		/*
		String init = "";
		
		for(int i = 0; i < number; i++) {
			init +="*";
		}
		this.stars = init;
		*/
		this("*", number); // 아래의 식을 호출
	}
	Star(String shape, int number){
		String init = "";
		for(int i =0; i < number; i++) {
			init += shape;
		}
		this.stars = init;
	}
}
