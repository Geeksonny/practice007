package practice;

public class practice6 {
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		
		char ch2 = 65;	// 아스키코드 65 = A
		System.out.println(ch2);
		
		char ch3 = '\u0041';	// 유니코드 'A'
		System.out.println(ch3);
		
		char ch4 = '\uAC00';	// 유니코드 '가'
		System.out.println(ch4);
		
		char ch5 = '\'';
		System.out.println(ch5);
		
		/*
		 * String 타입
		 * - 문자열을 표현하기 위한 데이터 타입
		 * - 기본형이 아닌 참조형 (Reference type)
		 * - 1개 이상의 문자열을 큰 따움표("")로 묶어서 표현
		 * - 아무것도 포함하지 않는 문자열("")을 널스트링(null String)이라고 한다.
		 * - 덧셈 연산자(+)를 사용해서 문자열간이 결합이 가능
		 * */
		
		String s1 = "String 타입은	char 타입과 다르다!";
		System.out.println(s1);
		
		String s2 = "";	// null String
		System.out.println(s2);
		
		String s3 = "안녕하세요. \n 제 이름은 \t '차동원'입니다.";
		System.out.println(s3);
		
		// 덧셈 연산자(+)를 사용해서 문자열 결합이 가능
		// => 어떤 데이터(X)와 문자열을 결합하면 결합된 결과가 새로운 문자열로 생성됨
		//	  ex) X + "문자열" => "X문자열"
		//		  "문자열" + X => "문자열X"
		System.out.println("1" + "2");
		System.out.println("1강의실" + "차동원");
		System.out.println(1 + "문자열");		// 정확히는 정수1 -> 문자열로 변환된 후 결합된것!
		System.out.println(1 + 2 + "문자열");
		int a = 1 + 2;
		System.out.println("문자열" + a);
		
		/*
		 * < print(), println(), printf() >
		 * 1. print() 와 println() 은 출력 후 줄바꿈 여부의 차이
		 * => print() 메서드는 아무 데이터도 없으면 출력 불가능
		 * 
		 * 2. printf()
		 * 		- 출력할 형식을 미리 지정하여 원하는 형태로 데이터 출력
		 * 		  (printf() 메서드의 'f' 는 format의 약자)
		 * 		- 출력할 형식을 "" 큰따움표 안에 형식 지정문자를 사용하여 형식을 지정한 뒤
		 * 		  큰 따움표("") 우측에 콤마(,)를 붙이고 실제 데이터를 지정
		 * */
//		System.out.print();
//		System.out.println();
		
		System.out.printf("%d \n", 12345);
		
		String ss1 = "java";
		String ss2 = "프로그래밍";
		System.out.printf("%s %s", ss1, ss2);
		System.out.println();
		System.out.println(ss1 + " " + ss2);
		
		String name = "차동원";
		int age = 40;
		
		// 안녕하세요 제 이름은 OOO 입니다.
		// 제 나이는 OO세 입니다.
		// 위와 같이 출력이 되도록 printf, println를 사용하여 출력!
		
		// printf version
		System.out.printf("안녕하세요 제 이름은 %s 입니다.\n제 나이는 %d세 입니다.", name, age);
		System.out.println();
		// println version
		System.out.println("안녕하세요 제 이름은 " + name + " 입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
		
		System.out.println("제 나이는 " + age + "세 입니다.");
		
	}
}
