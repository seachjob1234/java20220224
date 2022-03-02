package chap04.lecture.forloop;

public class C06Array {
	public static void main(String[] args) {
		//배열(array)
		//여러값을 가진 데이터 자료구조(data structure)
		//특징:순서(index)가 있음
		//
		
		int i1 =3; //하나의 변수에 하나의 값 대입 
		
		int[] arr1 = {10, 20, 30};//arr1은 int 배열 타입. arr1에 여러개의 int 대입
		
		System.out.println(arr1[0]);//첫번째 값은 0번
		System.out.println(arr1[1]);//두번째 값은 1번
		System.out.println(arr1[2]);//세번째 값은 2번
		
		arr1[0] =100;
		arr1[2] =200;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		//배열의 길이(값 가지고 있는 수)
		System.out.println(arr1.length);
	}
}
