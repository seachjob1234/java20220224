package chap13.lecture.p01generic;

public class App03 {
	public static void main(String[] args) {
		Container3<String> con1 = new Container3<String>();
		con1.setContent("java");
		//con1.setContent(1);//xxx
		String str1 =con1.getContent();//cast필요없음
		Container3<Integer> con2 = new Container3<Integer>();
		con2.setContent(333);
		int i1 = con2.getContent();
	}
	
	
}
//삼각괄호 type parameter
//명명관습 대문자 한글
//인스턴스 만들때 type parameter에 작성한 타입으로 클래스 내부의 타입이 결정
//type parameter가 있는 타입 : generic type
class Container3<T>{//type parameter 대소문자 상관없지만 대문자로.
	private T content;
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}
}
