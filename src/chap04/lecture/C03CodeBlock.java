package chap04.lecture;

public class C03CodeBlock {
	public static void main(String[] args) {
		
		if(true) 
			System.out.println("hello");
		//코드블럭 안에 있는 스테이트먼트가 하나일 경우 중괄호 생략 가능
		//다른 스테이트먼트 적으면 그건 실행 안됨
		//될 수 있다면 코드블럭 적어라. 보기 햇갈린다.
		
		for(int i =0; i<3 ; i++)
			System.out.println(i);//가능 for문도.
		
		if(( i % 2 ) != 0) continue;
	}
}
