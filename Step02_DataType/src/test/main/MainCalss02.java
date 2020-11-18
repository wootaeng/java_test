package test.main;

public class MainCalss02 {

	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		//int type 변수 선안과 동시에 값 대입하기
		int num1=10;
		//int type 변서 선언만 하고 (지역변수는 선언만 하면 만들어지지않는다.)
		int num2;
		//값은 나중에 대입하기 (값이 대입되는 시점에 변수가 만들어 진다.)
		num2=20;
		
			
		/*
		 * 정수의 표현 가능한 범위순서
		 * byte < short < int < long
		 */
		int myInt=100;
		byte myByte=100;
		// int type 변수에 있는 값을 int type 변수에 대입
		int a=myInt;
		// byte type 변수에 있는 값을 int type 변수에 대입
		int b=myByte;
		//int type 변수에 있는 값을 byte type 변수에 대입 (문법오류)
		//byte c=myInt; 변수 선언이 안된다.
		/*
		 * 표현 가능한 범위가 더 넓은 변수에 담기 내용을 대입하려면
		 * 프로그래머가 대입을 해도 문제가 없다는것을 확인하고
		 * 명시적으로 casting 하면 대입이 가능하다
		 * ( myInt 안에 숫자는 byte  범위를 절대 넘어가지않아! )
		 */
		byte c=(byte)myInt; //강제 casting 을 하면 대입가능 (casting type) original type
		myInt=200;
		byte d=(byte)myInt;
		
	}

}
