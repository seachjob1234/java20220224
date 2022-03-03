package chap04.lecture.whileloop;

public class C01While {
	public static void main(String[] args) {
		System.out.println("stmt 1");
		
		boolean condition = true;
		
		int i = 0;
		while(i<3){
			System.out.println("stmt 2");
			System.out.println("stmt 3");
			
			i++;
		}
		System.out.println("stmt 4");
	}//while은 조건문 안걸면 무한 루프
}
