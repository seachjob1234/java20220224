package chap04.lecture.forloop;

public class C04for {
	public static void main(String[] args) {
		 for(int i =0;i < 5;i++) {
			 System.out.println(i);
		 }
		 System.out.println(("1부터 5까지 출력"));
		 
		for (int i = 1; i <= 5; i++) {
			System.out.println(i); //o
		}
		 
		 System.out.println("0~10까지 짝수만");
		 for (int i = 0; i <= 10; i+=2) {
				System.out.println(i);
			
		}
		 
		 System.out.println("1부터 9까지 홀수만 ");
		 
		 for (int i = 1; i <=9;i += 2) {
				System.out.println(i);
			
		}
		 
		 System.out.println("5부터 1까지 출력");//54321
		 
		 for(int i = 5;i>=1;i--) {
			 System.out.println(i);//o
		 }
		 
		 System.out.println("4부터 ~0까지 짝수만 출력");
		 
		 for(int i = 4; i >= 0;i--) {	 
			 System.out.println(i);	 
		 }
		 
		 System.out.println("10부터 0까지 짝수만 출력");
		 
		 for(int i = 10; i>=1; i--) {
			 if( i % 2 == 0) {
			 System.out.println(i);
			 }
		 }
		 System.out.println("9~1까지 홀수만 출력");
		 for(int i = 9;i >=1;i--) {
			 if(i % 2 == 1) {
				 System.out.println(i);
			 }
		 }
		 
	}
}
