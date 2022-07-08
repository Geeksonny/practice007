package practice;

public class Practice15 {
	public static void main(String[] args) {
		/*
		 * 별찍기
		 * 
		 * 		*		i=1 일때 j = 1 ~ 1 (j:별갯수)
		 * 		**		i=2 일때 j = 1 ~ 2 (j:별갯수)
		 * 		***		i=3 일때 j = 1 ~ 3 (j:별갯수)
		 * 		****	i=4 일때 j = 1 ~ 4 (j:별갯수)
		 * 		*****	i=5 일때 j = 1 ~ 5 (j:별갯수)
		 * 
		 * */
		
		for(int i = 1; i <= 5; i++) {	// 줄바꿈
			
			for(int j = 1; j <= i; j++) {	// 별찍기
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 		*****	i=5 일때 j = 1~5 까지
		 * 		****	i=4 일때 j = 1~4 까지
		 * 		***		i=3 일때 j = 1~3 까지
		 * 		**		i=2 일때 j = 1~2 까지
		 * 		*		i=1 일때 j = 1~1 까지
		 * */
		System.out.println("========================");
		for(int i = 5; i >= 1; i--) {	// 줄바꿈
			
			for(int j = 1; j <= i; j++) {	// 별찍기
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		/*
		 * 중첩 while문을 사용하여 구구단 2단 ~ 9단 출력
		 * 
		 * < 2단 >
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * ...
		 * 2 * 9 = 18
		 * 
		 * < 3단 >
		 * 3 * 1 = 3
		 * 3 * 2 = 6
		 * ...
		 * 3 * 3 = 9
		 * 
		 * < 4단 >
		 * ...
		 * < 9단 >
		 * ...
		 * 9 * 9 = 81
		 * 
		 * */
		int dan = 2;
		while(dan <= 9) {	// 2단 ~ 9단
			System.out.println("< " + dan + "단 >");
			
			int i = 1;
			while(i <= 9) {	// 1 ~ 9 곱할것
				int result = dan * i;
				System.out.println(dan + " * " + i + " = " + result);
				i++;
			}
			
			System.out.println();
			dan++;
		}
		
		
		
		
	}
}
