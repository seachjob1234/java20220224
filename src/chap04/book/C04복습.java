package chap04.book;

public class C04복습 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수:"+score);
		
		String grade;
		
		if(score>90) {
			if(score>=95) {
				grade = "a++";
			}else {
				grade ="a";
			}
		}else {
			if(score>=85) {
				grade = "b+";
			}else {
				grade = "b";
			}
		}
		System.out.println("학점:" + grade);
	}
}
