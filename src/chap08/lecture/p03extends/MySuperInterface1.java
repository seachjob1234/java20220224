package chap08.lecture.p03extends;

public interface MySuperInterface1 {
	void superMethod1();
	
	default void superDefaultMetod1() {
		System.out.println("수퍼 디폴트 메소드");
	}
}
