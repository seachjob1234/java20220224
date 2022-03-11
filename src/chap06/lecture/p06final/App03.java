package chap06.lecture.p06final;

public class App03 {
	static int i = 3;
	static final int j = 5;
	static final int k;
	final static int l;
	static final double pi = 3.14;//주로 파이값을 쓸 때 final 변수를 사용함 final은 한 번 준 값 고정.
	//static final 변수작성은 항상 대문자.
	static final int STUDENT_MEMBER = 30;//단어 사이는 _로 구분
	
	static {
		k = 99;
		l = 33;
	}
		public static void main(String[] args) {
			i = 4;
//			j = 6; //xxxx
//			k = 100;// xxx
		}
		
}
