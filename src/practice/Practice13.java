package practice;

public class Practice13 {
	public static void main(String[] args) {
		// 구구단 출력 (예는 2단이라고 가정)
				// < 2단 >
				// 2 * 1 = 2
				// 2 * 2 = 4
				// 2 * 3 = 6
				// ...
				// 2 * 9 = 18
				int dan = 3;
				
				System.out.println("< " + dan + "단 >");
				for(int i = 1; i <= 9; i++) {
					System.out.println(dan + " * " + i + " = " + (dan*i));
				}
				
				/*
				 * 1 ~ 100 까지
				 * 짝수의합(even), 홀수의합(odd) 각각 누적 한 후 출력
				 * 출력: 1 ~ 100 까지 짝수의 합: XX
				 *      1 ~ 100 까지 홀수의 합: XX
				 * */
				
				int even = 0;	// 짝수 누적합
				int odd = 0;	// 홀수 누적합
				for(int i = 1; i <= 100; i++) {
					if(i%2 == 0)	even += i;
					else			odd += i;
				}
				System.out.println("1 ~ 100 까지 짝수의 합: " + even);
				System.out.println("1 ~ 100 까지 홀수의 합: " + odd);
				
				/*
				 * 두 정수 a ~ b 까지 3의 배수의 합
				 * 출력: X ~ X 까지 3의 배수의 합: XX
				 * */
				int a = 10;
				int b = 20;
				int sum = 0;
				for(int i = a; i <= b; i++) {
					if(i % 3 == 0)	sum += i;
				}
				System.out.println(a + " ~ " + b + " 까지 3의 배수의 합: " + sum);
				
				/*
				 * 7의 갯수를 카운트 해보자!
				 * int n = 247427723
				 * 출력: 7의 갯수: 3
				 * 
				 * */
//				int n = 247427723;
//				int count = 0;
//				while(n > 0) {
//					if(n % 10 == 7)	count++;
//					n /= 10;
//				}
//				System.out.println(count);
				
				// for문 굳이...
				int count = 0;
				for(int n = 2472578; n > 0; n /= 10) {
					if(n % 10 == 7)	count++;
				}
				System.out.println(count);
	}
}
