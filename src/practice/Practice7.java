package practice;

public class Practice7 {
	public static void main(String[] args) {
		/*
		 * 삼항 연산자의 중첩 사용
		 * - 경우의 수가 3가지 이상일 때 사용
		 * - 삼항연산자 내에서 true 또는 false일때 실행할 부분에
		 *   또 다른 삼항연산자를 사용하여 그 다음 조건을 판별하는 방법
		 *   
		 * < 기본 문법 >   
		 * 조건식1 ? 값1 : 조건식2 ? 값2 : 값3
		 * 
		 * ex) 홀수, 짝수, 0의 3가지 경우의 수 판별
		 * */
		int num = 3;
		
		String result = num == 0   ? "0"   : 
						num%2 == 0 ? "짝수" : "홀수";
		
		System.out.println(result);
		
		/*
		 * 조건문
		 * - 특정 조건에 따라 문장의 실행여부를 결정하는 문
		 * 
		 * if문
		 * - 조건식에 따라 특정 문장 실행여부를 결정하는 기본적인 조건문
		 * - 조건식 판별 결과가 true 이면 블록{} 문 내의 문장들을 실행하고
		 *   조건식 판별 결과가 false이면 블록문을 생략함
		 *   
		 * < 기본 문법 >
		 * 문장1; 
		 * if(조건식){
		 * 		문장2;
		 * }
		 * 문장3;
		 * 
		 * 조건식 판별 결과가 true 일때 : 문장1 -> 문장2 -> 문장3
		 * 조건식 판별 결과가 false일때 : 문장1 -> 문장3
		 * 
		 * */
		
		num = 7;
		// 정수형 변수 num의 값이 5보다 크면 "num은 5보다 크다!" 라고 출력
		if(num >= 5) {
			System.out.println("num은 5보다 크다!");
		}
		System.out.println("num: " + num);
		
	}
}
