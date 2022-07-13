package practice;

public class Practice17 {
	public static void main(String[] args) {
		/*
		 * 중첩 while문
		 * - while문 내에 또 다른 while문을 기술하여 반복 문장을 여러번 반복하는 문
		 * 
		 * < 기본 문법 >
		 * 초기식1;
		 * while( 조건식1 ){
		 * 		실행문1;
		 * 
		 * 		초기식2;
		 * 		while( 조건식2 ){
		 * 			실행문2;
		 * 			증감식2;
		 * 		}
		 * 
		 * 		증감식1;
		 * }
		 * 
		 * */
		
		int i = 1;
		
		while(i < 60) {
			
			System.out.println("i = " + i);
			
			int j = 1;
			while(j < 60) {
				System.out.println("--------------- j = " + j);
				j++;
			}
			
			i++;
		}
		
		
		/*
		 * 중첩 for문
		 * - for문 내에 또 다른 for문을 기술하여 반복 문장을 여러번 반복하는 문
		 * - 기존 반복문을 바깥쪽 for문 이라고 가정했을 때
		 *   해당 반복문 내에서 다시 반복을 수행하는 for문을 안쪽 for문 이라고 함
		 *   => 안쪽 for문 반복횟수 = 안쪽 for문 반복횟수 * 바깥쪽 for문 반복횟수
		 *   
		 * < 기본 문법 >
		 * 
		 * for(초기식1; 조건식1; 증감식1){
		 * 
		 * 		for(초기식2; 조건식2; 증감식2){
		 * 
		 * 		}
		 * 
		 * }
		 * 
		 * */
		
		// 중첩 for문을 활용한 시계 구현
		// => 0분 ~ 59분 까지 1씩 증가할 동안 각 분마다 0초~59초 까지 1씩 증가
		/*
		 * 0분0초
		 * 0분1초
		 * 0분2초
		 * ...
		 * 0분59초
		 * 1분0초
		 * 1분1초
		 * 1분2초
		 * ...
		 * 59분58초
		 * 59분59초
		 * 
		 * */
		
//		for(int min = 0; min <= 59; min++) {	// 0~59분
//			
//			for(int sec = 0; sec <= 59; sec++) {	// 0~59초
//				System.out.println(min + "분" + sec + "초");
//			}
//			
//		}
		
		// 시(0~23) 분(0~59) 초(0~59)
		for(int hour = 0; hour <= 23; hour++) {	// 0~23시
			
			for(int min = 0; min <= 59; min++) {	// 0~59분
				
				for(int sec = 0; sec <= 59; sec++) {	// 0~59초
					System.out.println(hour + "시" + min + "분" + sec + "초");
				}
				
			}
			
		}
		
		
	}
}
