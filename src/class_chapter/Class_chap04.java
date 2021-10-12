package class_chapter;
import java.util.*;

public class Class_chap04 {

	public static void main(String[] args) {
//		//예제 4-1 ch4/FlowEx1
//		int x = 0;
//		System.out.printf("x=%d 일때 , 참인 것은 %n", x);
//		
//		if(x==0) System.out.println("x==0");
//		if(x!=0) System.out.println("x!=0");
//		if(!(x==0)) System.out.println("!(x==0)");
//		if(!(x!=0)) System.out.println("!(x!=0)");
//	
//		x = 1;
//		System.out.printf("x=%d 일때 , 참인 것은 %n", x);
//	
//		if(x==0) System.out.println("x==0");
//		if(x!=0) System.out.println("x!=0");
//		if(!(x==0)) System.out.println("!(x==0)");
//		if(!(x!=0)) System.out.println("!(x!=0)");
//	
//		x=0 일때 , 참인 것은 
//		x==0
//		!(x!=0)
//		x=1 일때 , 참인 것은 
//		x!=0
//		!(x==0)

//		//예제 4-2 ch4/FlowEx2
//		int input;
//		
//		System.out.print("숫자를 입력하세요.>");
//			
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
//		input = Integer.parseInt(tmp); // 입력 받은 문자열 (tmp) 을 숫자로 변환
//		
//		if(input==0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//		}
//		
//		if(input!=0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//			System.out.printf("입력하신 숫자는 %d 입니다." ,input);
//		}
		//예제 4-3 ch4/FlowEx3
		
//		//예제 4-3 ch4/FlowEx3
//		
//		System.out.print("숫자를 하나 입력하세요.>");
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt(); // 화면을 통해 입력 받은 숫자를 input에 저장
//		
//		if(input==0){
//			System.out.println("입력하신 숫자는 0입니다");
//		}else { // input != 0 인 경우
//			System.out.println("입력하신 숫자는 0이 아닙니다");
//		}
//		
//		숫자를 하나 입력하세요.>5
//		입력하신 숫자는 0이 아닙니다

//		//예제 4-4 ch4/FlowEx4
//		int score = 0; // 점수를 저장하기 휘한 변수
//		char grade =' ';  // 학점을 저장하기 위한 변수 . 공백으로 초기화
//		
//		System.out.print("점수를 입력하세요.>");
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt(); // 화면을 통해 입력 받은 숫자를 score에 저장
//		
//		if(score >= 90) {
//			grade = 'A';
//		}else if (score >=80) {
//			grade = 'B';
//		}else if (score >=70) {
//			grade = 'C';
//		}else {
//			grade = 'D';
//		}
//		System.out.println("당신의 학점은 " + grade + "입니다.");
//		
//	
//		점수를 입력하세요.>70
//		당신의 학점은 C입니다.
//	
		//예제 4-5 ch4/FlowEx5
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력 하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d 입니다.%n" , score);
		
		if(score >= 90) {
			grade = 'A';
			
			if( score >= 98) { // 90점 이상 중에서도 98점 이상은 A+
				opt = '+';
			}else if ( score < 94) { // 90 점 이상 94 점 미만은 A-
				opt = '-';
			}
		}else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			}else if (score < 84) {
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade ,opt);
	
		점수를 입력 하세요.>98
		당신의 점수는 98 입니다.
		당신의 학점은 A+입니다.
	
	
	
	
	
	
	
	
	}

}
