package chap10.book.exercise;

public class p449 {
	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};
		int value = 0;
		for(int i= 0 ; i <= 2 ; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과했음");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			}finally {
				System.out.println(value);
			}//변수는 무조건 코드블럭 안에서만 
		}    //catch or fianl 에 써야 된다면 try block 이전에 사용.
	}
}
