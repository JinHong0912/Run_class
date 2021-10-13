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
//		int score = 0;
//		char grade = ' ', opt = '0';
//		
//		System.out.print("점수를 입력 하세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		System.out.printf("당신의 점수는 %d 입니다.%n" , score);
//		
//		if(score >= 90) {
//			grade = 'A';
//			
//			if( score >= 98) { // 90점 이상 중에서도 98점 이상은 A+
//				opt = '+';
//			}else if ( score < 94) { // 90 점 이상 94 점 미만은 A-
//				opt = '-';
//			}
//		}else if (score >= 80) {
//			grade = 'B';
//			if (score >= 88) {
//				opt = '+';
//			}else if (score < 84) {
//				opt = '-';
//			}
//		}else {
//			grade = 'C';
//		}
//		System.out.printf("당신의 학점은 %c%c입니다.%n", grade ,opt);
//	
//		점수를 입력 하세요.>98
//		당신의 점수는 98 입니다.
//		당신의 학점은 A+입니다.
	
//		//예제 4-6 ch4/FlowEx6
//		System.out.println("현재 월을 입력 하세요 . >");
//	
//		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt(); // 화면ㅇ을 통해 입력 받은 숫자를 month에 저장 
//		
//		switch(month){
//			case 3:
//			case 4:
//			case 5:
//				System.out.println("현재의계절은 봄입니다.");
//				break;
//			case 6: case 7: case 8:
//				System.out.println("현재의 계절은 여름입니다.");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("현재의 계절은 가을입니다.");
//				break;
//			default:
//			//case 12: case 1: case 2:
//				System.out.println("현재의 계절은 겨울입니다.");
//		
//		}
			
//		//예제 4-7 ch4/FlowEx7	
//		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력 하세요. >");
//		
//		Scanner scanner = new Scanner(System.in);
//		int user = scanner.nextInt(); // 화면을 통해 입력 받은 숫자를 user에 저장
//		int com = (int)(Math.random() * 3 ) + 1; // 1,2,3, 중 하나가 com 에 저장 됨
//		
//		System.out.println("당신은" + user + "입니다.");
//		System.out.println("컴퓨터는" + com + "입니다.");
//	
//		switch(user-com){
//		case 2: case -1:
//			System.out.println("당신은 졌습니다.");
//			break;
//		case 1: case -2:
//			System.out.println("당신은 이겼습니다.");
//			break;
//		case 0:
//			System.out.println("비겼습니다.");
//			//break; // 마지막 문장이므로 break 를 사용할 필요가 없다.
//		}
	
	
		//예제 4-8 ch4/FlowEx8
		System.out.println("당신의 주민번호를 입력 하세요 . (011231-1111222)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7); // 입력받은 번호의 8번쨰 문자를 gender에 저장
		
		switch(gender) {
		
		case '1': case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2': case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록 번호 입니다.");
		
		}
		
//		//예제 4-9 ch4/FlowEx9
//		char grade = ' ';
//		System.out.println("당신의 점수를 입력하세요. (1~100) > ");
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		int score = scanner.nextInt();
//		
//		switch(score) {
//			case 100: case 99: case 98: case 97: case 96:
//			case 95: case 94: case 93: case 92: case 91: case 90:
//			grade = 'A';
//			break;
//		case 89: case 88: case 87: case 86: case 85:
//		case 84: case 83: case 82: case 81: case 80:
//			grade = 'B';
//			break;
//		case 79: case 78: case 77: case 76: case 75:
//		case 74: case 73: case 72: case 71: case 70:
//			grade = 'C';
//			break;
//		default:
//			grade = 'F';
//		}
//		System.out.println("당신의 학점은 " + grade + "입니다.");
//	
	
		//switch 중첩 예제 4-10  ch4/FlowEx10
		System.out.println("당신의 주민번호를 입력하세요 > .(011231-1111222) > ");
	
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7);
		
		switch(gender){
		case '1': case '3':
			switch(gender) {
			case '1':
				System.out.println("당신은 2000년 이전에 출생한 남자 입니다.");
				break;
			case '3':
				System.out.println("당신은 2000년 이후에 출생한 남자 입니다.");
				break;
			}
			break; // 뺴지 않도록 주의
		case '2': case '4':
			switch(gender) {
			case '2':
				System.out.println("당신은 2000년 이전에 출생한 여자 입니다.");
				break;
			case '4':
				System.out.println("당신은 2000년 이후에 출생한 여자 입니다.");
				break;
			}
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호 입니다.");
			
		}
	
	
	
	
	
	
	
	
	}

}
