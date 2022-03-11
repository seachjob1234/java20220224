package chap06.lecture.p04method;

public class Calculator {
	//메소드 return
	//메소드명 앞에 return 값의 타입 명시해야됨
	//return값이 없다면 void로 명시함.
	//return하는 값과 type일치
	//자동 형변환 됨 but 작은거에서 큰거는 안돼
	
	int plus(int a, int b){
		int result = a + b;
		return result;
	}
	//return : 1. 메소드 종료
	//		   2. 오른쪽에 있는 값 반환
	void powerOn() {
		
	}
}
