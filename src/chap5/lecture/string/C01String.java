package chap5.lecture.string;

public class C01String {
	public static void main(String[] args) {
		String s1 =new String("java");//참조변수
		String s2 =new String("java");//참조변수
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));//내용물 비교
		
		String s3 = "java";
		String s4 = "java"; //리터럴한 값으로 썼을 때 리터럴 한 값이 있다면 그 값으로 씀.
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 == s4);//참조값 비교
	}
}
