package practice;

public class practice4 {
	public static void main(String[] args) {
		/*
		 * 상수(Constant)
		 * - 변수의 반대 개념으로 항상 고정된 데이터(변하지 않는 데이터)
		 * - 실제 사용하는 데이터(상수)를 리터럴(Literal)이라고도 한다.
		 * 	 ex) 정수형 리터럴 1, 실수형 리터럴 3.14 등
		 * 
		 * */
		
		// syso Ctrl + Space => 자동완성
		System.out.println(1);		// 정수형(기본형 = int형) 리터럴
		System.out.println(3.14);	// 실수형(기본형 = double형) 리터럴
		
		System.out.println('A');	// 문자형 리터럴(작은따움표로 둘러싼 1개의 문자)
//		System.out.println('AB');	// 오류! 문자형은 1개의 문자만 입력할 수 있다!
		
		System.out.println("true");
		System.out.println(true);	// 논리형(boolean형) 리터럴(true 또는 false)
//		System.out.println(TRUE);	// 오류! 예약어(키워드) true는 무조건 소문자로 써야함!
		
		System.out.println(100l);	// 정수형(long형) 리터럴(접미사 l,L(구분하기 위함) 붙는다)
		System.out.println(1.5f); 	// 실수형(float형) 리터럴(접미사 f 또는 F 붙는다)
		System.out.println("Hello, World!"); // 문자열형 리터럴(큰 따움표로 둘러싼 문자들)
		
		
		/*
		 * 변수(Variable)
		 * - 자바에서 사용되는 데이터를 저장하는 메모리 공간
		 * - 한 번에 하나의 데이터만 저장 가능
		 * 	 => 언제든 다른 데이터로 대체될 수 있다.(변할 수 있다)
		 * - 변수를 사용하기 위해선 변수 선언이 먼저 진행되어야 함
		 * - 변수에 데이터를 저장하는 것을 변수 "초기화" 라고 함
		 * 
		 * < 변수 선언 기본 문법 >
		 * 데이터타입 변수명;
		 * => 데이터타입 : 기본형 또는 참조형 타입명 명시
		 * => 변수명 : 식별자 작성 규칙에 따른 변수명 지정
		 * 
		 * < 변수 초기화 기본 문법 >
		 * 변수명 = 데이터(또는 변수명);
		 * => 우변의 데이터를 좌변의 변수에 저장(대입, 할당, 초기화)
		 * */
		
		// 식별자 작성 규칙
		// 1. 숫자는 첫번째로 오면 안됨
//		int a;
//		int 1;
//		int 1a;
//		int a1;
		
		// 2. 특수문자 ($, _) 사용가능, 나머지는 불가능
//		int #a;
//		int ^a;
//		int !a;
//		int %a;
//		int $a;
//		int _a;
		
		// 3. 예약어를 쓰면 안됨
//		int int;
//		int float;
//		int double;
		
		// ============================================
//		int a;
//		int b;
//		a = 1;
//		System.out.println(a+1);
//		System.out.println(b);	// 오류! 초기화를 하지않아 사용할 수 없음!
//		a = 2;
//		System.out.println(a+1);
		
		// 선언과 초기화를 동시에
//		int a = 10;
//		int b = 20;
		
		// 동시에 여러개 변수를 선언
//		int a, b;
//		a = 10;
//		b = 20;
		
		// 동시에 여러개 변수를 선언과 동시에 초기화
		int a = 10, b = 20;
		
//		a = b;
//		System.out.println(a);
//		System.out.println(b);
//		
//		b = a;
//		System.out.println(a);
//		System.out.println(b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		
	}
}
