package chap5.lecture.rettype;

public class C05ReferenceType {
	public static void main(String[] args) {
		int i1 = 3;
		method1(i1);
		System.out.println("main");
		System.out.println(i1);

		int[] arr1 = new int[] { 3, 2, 1 }; //1
		method2(arr1);
		System.out.println("main");//5
		System.out.println(arr1[0]);//6
	}

	public static void method2(int[] arr) {
		arr[0] = 30;//2
		System.out.println("method2");//3
		System.out.println(arr[0]);//4
//배열은 가리키고 있는것을 바꿔줌.
	}

	public static void method1(int i) {
		i = 5;
		System.out.println("method1");
		System.out.println(i);

	}

}
