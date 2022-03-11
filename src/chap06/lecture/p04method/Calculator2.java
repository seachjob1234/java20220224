package chap06.lecture.p04method;

public class Calculator2 {

	/*int sum(int n1, int n2, int n3, int n4){
		return n1 + n2 + n3 + n4;
	}*/
	//varargs가변길이 매개변수.
	int sum(int...nums) {
		System.out.println("nums의 길이:" + nums.length);
		
		int sum = 0;
		
		for(int num : nums) {
			sum += num;
		}
		return sum;
	}
	
	//가변길이 매게변수는 항상 마지막에 작성
	int verSum(String name, int...nums) {
		return 0;
	}
	
	public void concat(String...strs) {
		for (String str : strs) {
			System.out.println(str);
		}
		System.out.println();
		
	}
	
}
