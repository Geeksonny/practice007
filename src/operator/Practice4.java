package operator;

public class Practice4 {
	public static void main(String[] args) {
		/*
		 * 삼항 연산자 (조건연산자)
		 * - 연산에 참여하는 항이 3개인 연산자
		 * - 특정 조건에 따라 다른 값을 실행하는 연산자
		 * 	 => if ~ else 문과 동일한 기능을 수행
		 * - 2가지 경우의 수 (true 또는 false)에 대한 결과를 수행
		 * 
		 * < 기본 문법 >
		 * 연산식 ? 값1 : 값2
		 * => 연산식에는 결과값이 boolean 타입 (true 또는 false)인 식만 올 수 있다.
		 * => 연산식 판별 결과가 true일 경우 값1 부분을 실행, false일 경우 값2부분을 실행
		 * 
		 * */
		
		int a = 10;
		String result = (a%2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		a = 11;
		result = (a%2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		
		// -------------------------------------------
		a = 70;
		int b = 90;
		
		// a와 b를 비교하여 최대값 출력
		int max = (a > b) ? a : b;
		System.out.println(max);
		
		// a와 b를 비교하여 최소값 출력
		int min = (a > b) ? b : a;
		System.out.println(min);
		
		// 반올림
				// ex) 95.3 => 95 
				//	   95.8 => 96
				
				double d = 45.7;
				System.out.println((d*10%10) >= 5 ? (int)d+1 : (int)d); // 95
		
	}
}
