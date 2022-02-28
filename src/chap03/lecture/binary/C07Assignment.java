package chap03.lecture.binary;

public class C07Assignment {
	public static void main(String[] args) {
		//대입연산자(할당연산자,assignment)
		//=,+=,-=,*=,/=,%=
		
		int i = 100; // 100을 i에 대입
		
		i += 3; //i가 원래 가진 값에 3을 더해서 대입
		          // i = i+3 과 같음
	   System.out.println(i);
		i -= 9; // i가 원래 가진 값에 9를 빼서 대입
                //i = i -9와 같읍
		System.out.println(i);
		i *= 2; //i가 원래 가진 값에 2곱해서 대입
			    //i = i *2 와 같음
		System.out.println(i);
		i /= 3; //i가 원래 가진 값에 3나눈 몫을 대입
			//i = i/3과같음
		System.out.println(i);
		i %=3;	//i가 원래 가진 앖에 3으로 나눈 나머지를 대입
		//i = i%3;
		System.out.println(i);
		int j, k, l;
		j = k = l = i;
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}
