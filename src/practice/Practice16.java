package practice;

public class Practice16 {
	public static void main(String[] args) {
		/*
		 * for문을 사용하여 구구단 2~9단 까지 모두 출력
		 * 
		 * < 2단 >
		 * 2 * 1 = 2
		 * ...
		 * 2 * 9 = 18
		 * 
		 * < 3단 >
		 * ...
		 * 
		 * < 9단 >
		 * ...
		 * 9 * 9 = 81
		 * 
		 * */
		
		for(int dan = 2; dan <= 9; dan++) {	// 2 ~ 9단
			
			System.out.println("< " + dan + "단 >");
			
			for(int i = 1; i <= 9; i++) { // 1 ~ 9 곱해짐
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
			
			System.out.println();
			
		}
		
		/*
		 * 정수 n을 입력받아 n층의 별 계단을 출력
		 * n = 5 인 경우
		 * 		**		i=0일때	공백=0, **
		 * 		 **		i=1일때  공백=1, **
		 * 		  **	i=2일때  공백=2, **
		 * 		   **	i=3일때  공백=3, **
		 * 		    **	i=4일때  공백=4, **
		 * */
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int n=5;
//		for(int i = 0; i < n; i++) {	// 줄바꿈
//			for(int j=0; j < i; j++) {	// 공백(space) 찍기
//				System.out.print(" ");
//			}
//			System.out.println("**");
//		}
		
		/*
		 * 		    *	i=1, 공백=4, 별=1
		 * 		   **	i=2, 공백=3, 별=2
		 * 		  ***	i=3, 공백=2, 별=3
		 * 		 ****	i=4, 공백=1, 별=4
		 * 		*****	i=5, 공백=0, 별=5
		 * */
		
//		int line = 55;
//		int star = 1;
//		int space = line - star;
//		
//		for(int i = 1; i <= line; i++) {	// 줄바꿈
//			
//			for(int j = 1; j <= space; j++) {	// 공백
//				System.out.print(" ");
//			}
//			
//			for(int j = 1; j <= star; j++) {	// 별찍기
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			star++;
//			space--;
//		}
		
		/*
		 * 		*****
		 * 		 ****
		 * 		  ***
		 * 		   **
		 * 			*
		 * */
		
		int line = 10;
		int star = line;
		int space = 0;
		
		for(int i = 0; i < line; i++) {	 // 줄바꿈
			
			// 공백찍기
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			// 별찍기
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			space++;
			star--;
		}
		
		
		
	}
}
