package practice;

public class Practice8 {
	public static void main(String[] args) {
		/*
		 * if ~ else 문
		 * 
		 * < 기본 문법 >
		 * 문장1;
		 * 
		 * if(조건식) {
		 * 
		 * 		문장2;
		 * 
		 * } else {
		 * 
		 * 		문장3;
		 * 
		 * }
		 * 
		 * 문장4;
		 * 
		 * => 조건식 판별결과가 true 일때: 문장1 -> 문장2 -> 문장4;
		 * 	  조건식 판별결과가 false일때: 문장1 -> 문장3 -> 문장4;
		 * 		(주의!! 문장2와 문장3은 절대 동시에 실행될 수 없다!)
		 * */
		int num = 10;
		
		// 정수형 변수 num이 10보다 크거나 같으면 "너무 크다" 라고 출력
		// 아니면 "적당함" 출력
		if(num >= 10) {
			System.out.println("너무 크다");
		} else {
			System.out.println("적당함");
		}
		
		
		/*
		 * if ~ else if ~ else 문
		 * 
		 * < 기본 문법 >
		 * if(조건식1){
		 * 
		 * } else if(조건식2){
		 * 
		 * } else if(조건식3){
		 * 
		 * } else {	// 생략가능
		 * 
		 * }
		 * */
		
		// 정수 num이 5보다 크다 or 5보다 작다 5와 같다 판별
		num = 5;
//		if(num > 5) { 
//			System.out.println("num이 5보다 크다!");
//		} else if(num < 5) {
//			System.out.println("num이 5보다 작다!");
//		} else {
//			System.out.println("num이 5와 같다");
//		}
		
		// -----------------------------
		
		if(num > 10) {
			System.out.println("num이 10보다 크다");
		} else if(num > 20) {
			System.out.println("num이 20보다 크다");
		} else if(num > 30) {
			System.out.println("num이 30보다 크다");
		} else {
			System.out.println("num이 10보다 작다");
		}
		
		
		
		
		
	}
}
