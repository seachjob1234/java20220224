package chap05.lecture.string;
//git.io/vx86v
public class C06ReqEx {
	public static void main(String[] args) {
		//regular expression
		//정규식(정규표현식)
		//문자열의 패턴을 표현한 문자
		
		
		//한문자
		System.out.println("a".matches("a"));
		System.out.println("b".matches("a"));
		System.out.println("aa".matches("a"));
		System.out.println("abc".matches("a"));
		
		//여러 문자 중 하나
		System.out.println("a".matches("[abc]"));//a|b|c
		System.out.println("b".matches("[abc]"));//a|b|c
		System.out.println("c".matches("[abc]"));//a|b|c
		System.out.println("abc".matches("[abc][abc][abc]"));
		System.out.println("bbb".matches("[abc][abc][abc]"));
		
		
	}
}
