package chap02.lecture;

public class C10TypeConversion {
	public static void main(String[] args) {
		float f1 = 9000.1234F;
		double d1 = 12000000000.1234;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2;
		double d2;
		
		f2 = f1;
		d2 = f1;
		
		System.out.println(f2);
		System.out.println(d2);
		
		//f2 =d1;//not ok
		f2 = (float) d1; // type casting
		d2 = d1;
		System.out.println(f2);
		System.out.println(d2);
		
			//작은 거에서 큰거로 바꾸는건 가능 그러나 반대는 변환을해야.
		
	}
}
