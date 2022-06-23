package operator;

public class Practice3 {
	public static void main(String[] args) {
		/*
		 * 대입 연산자 (=)
		 * - 우변의 데이터를 좌변의 변수에 대입(저장, 할당)
		 *   => 연산의 방향이 좌 <- 우 로 진행됨
		 *   ex) x = y = 3;		y에 3을 대입하고, x에 y를 대입
		 * 
		 * 확장 대입연산자 (= 복합 대입연산자) (+=, -=, *=, /=, %=)
		 * - 대입연산자와 산술연산자가 조합된 연산자
		 * - 좌변과 우변의 데이터끼리 산술연산을 먼저 수행한 후, 결과값을 좌변에 대입
		 * 	 ex) a = a + 1;
		 * 		 a += 1;
		 * */
		
		int a = 10, b = 0;
		
		b += a;	// b = b + a;
		System.out.println(b);
		System.out.println("====================");
		// b + a의 결과를 다시 변수 b에 저장 => b에 a값을 "누적" 하는 것과 동일
		b += a;
		System.out.println(b);
		
		b -= a;
		System.out.println(b);
		
		b *= a;
		System.out.println(b);
		
		b /= a;
		System.out.println(b);
		
		b %= a;
		System.out.println(b);
		
		/*
		 * 비교연산자(= 관계연산자) (>, >=, <=, <, ==, !=)
		 * - 두 피연산자 간의 대소관계 등을 비교하여 true 또는 false 값을 반환
		 * */
		int c = 10, d = 5;
		System.out.println("a > b 인가? " + (c > d));
		System.out.println("a < b 인가? " + (c < d));
		System.out.println("a >= b 인가? " + (c >= d));
		System.out.println("a <= b 인가? " + (c <= d));
		System.out.println("a == b 인가? " + (c == d));
		System.out.println("a != b 인가? " + (c != d));
		
		System.out.println("================");
		// char 타입을 비교연산자에 사용시 정수(유니코드)값을 비교
		System.out.println('A' > 'B');
		System.out.println('A' == 65);
//		System.out.println("A" > "B"); // 문자열은 비교할수 없음
		
		System.out.println(3 == 3.0);
		System.out.println("===============");
		
		System.out.println(0.1 == 0.1f);	// 근사치 표현에 의해 서로 다른값으로 취급됨!
		System.out.println((float)0.1 == 0.1f);
		
	}
}
