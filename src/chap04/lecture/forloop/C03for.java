package chap04.lecture.forloop;

public class C03for {
	public static void main(String[] args) {
		for(int i = 0; i <3 ; i++) {
			System.out.println(i);
		}
		int i;//for문 종료 후에도 사용하기 원할 때 for문 이전에 넣어서 사용
		for(i = 0; i<5; i++) {
			System.out.println(i);
		}
		//System.out.println(i);//oo
	}
}
//변수는 선언된 코드블럭 안에서만 코드블럭 밖에서느 사용이 안돼