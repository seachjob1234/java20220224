package chap04.book;

public class P134 {
	public static void main(String[] args) {
	boolean more = true;	
	while(more) {	
		int num1=(int)(Math.random()*6) +1;
		int num2=(int)(Math.random()*6) +1;
		
		System.out.println("(" + num1 + ", " + num2 + ")");
		if((num1 + num2) == 5) {
			more =false;
		}
	}
	}
}
