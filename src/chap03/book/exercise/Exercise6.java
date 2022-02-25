package chap03.book.exercise;

public class Exercise6 {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println(result1); //7
		
		int result2 = v1 * v2;
		System.out.println(result2); // 10
		
		int result3 = v1 - v2;
		System.out.println(result3); //5 
		
		int result4 = v1 / v2;
		System.out.println(result4); //2
		
		int result5 = v1 % v2;
	    System.out.println(result5); //1
	    
	    double result6 = (double) v1 / v2; //2.5
	    System.out.println(result6); // 2.5	
	    
	    char c1 = 'A' + 1;
	    char c2 = 'A';
	    //char c3 = c2 + 1; //컴파일 에러
	    System.out.println("c1:" + c1);
	    System.out.println("c2:" + c2);
//	    System.out.println("c3:" + c3);
	    
	    int x = 1000000;
	    int y = 1000000;
	  //  int z = x * y;//
	 // 인트가 저장할 수 있는 값을 넘어버려 overflow가 됨.
	 // 올바른 값을 구하기 위해서는 하나라도 long 타입으로 바꿔야함.
	 long z = x * (long) y;   
	    System.out.println(z); 

	    String str1 = "JDK" +6.0;
	    String str2 = str1 + "특징";
	    System.out.println(str2);
	    
	    String str3 = "JDK" + 3 + 3.0;
	    String str4 = 3 + 3.0 + "JDK";
	    System.out.println(str3);
	    System.out.println(str4);
	    
	   
	}
}
