package practice;

public class Practice9 {
	public static void main(String[] args) {
		/*
		 * if문
		 * 정수형 변수 num에 대한 절대값 계산하여 출력
		 * => ex) num이 5일때 -> "변수 num = 5"
		 *    ex) num이 -10일때 -> "변수 num = 10"
		 * */
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if(num < 0) {
//			num = -num;
//			num = num * -1;
//			num *= -1;
//		}
//		num = num < 0 ? -num : num;
//		System.out.println("변수 num = " + num);
		
		System.out.println("=============================");
		
		/*
		 * 문자 ch가 대문자일 때, 소문자로 변환하여 출력
		 * 소문자일때는 그대로 소문자를 출력
		 * char는 정수형 대문자 + 32 -> 소문자
		 * */
		char ch1 = 'Z';
//		System.out.println((char)(ch + 32));
		
		// 복합 대입연산자는 "자동 형변환이 일어나지 않는다"
		if('A' <= ch1 && ch1 <= 'Z') {
//			ch = (char)(ch + 32);
			ch1 += 32;
		}
		System.out.println(ch1);
		
		/*
		 * 정수형 변수 num에 대한 양수, 음수 판별 (0은 양수로 간주)
		 * 양수라면 "X : 양수!" 라고 출력
		 * 음수라면 "X : 음수!" 라고 출력
		 * */
		
		// if ~ else 버전
//		int num = -10;
//		String result = "";
//		if(num >= 0) {	// 양수
//			result = num + " : 양수!";
//		} else {	// 음수
//			result = num + " : 음수!";
//		}
//		System.out.println(result);
		
		// 삼항연산자
		int num = -10;
		String result = num + " : ";
		result += (num >= 0) ? "양수!" : "음수!";
		System.out.println(result);
		
		/*
		 * 문자 ch가 대문자 -> 소문자로 변환
		 * 			소문자 -> 대문자로 변환
		 * "ch = X" 라고 출력
		 * */
		char ch2 = 'T';
		// 대문자
		boolean 대문자 = 'A' <= ch2 && ch2 <= 'Z';
//		if(대문자)	ch += 32;
//		else		ch -= 32;
		
		// 삼항연산자
//		ch = ('A' <= ch && ch <= 'Z') ? (char)(ch+32) : (char)(ch-32);
		ch2 += 대문자 ? 32 : -32;
		
		System.out.println("ch2 = " + ch2);
		
	}
}
