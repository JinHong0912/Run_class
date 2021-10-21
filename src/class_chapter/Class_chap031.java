package class_chapter;

import java.util.Scanner;

public class Class_chap031 {

	public static void main(String[] args) {

		//예제 3-24 ch3/OperatorEx24	 : 논리 연산 || (OR) &&(AND)
//		int x = 0 ;
//		char ch = ' ';
//		
//		x = 15;
//		System.out.printf("x=%2d, 10 < x && x < 20 = %b%n" , x, 10 < x && x < 20);
//
//		x = 6;
//		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 =%b%n " , x, x%2==0 || x%3==0 && x%6!=0);
//		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b%n " , x, (x%2==0 || x%3==0) && x%6!=0);
//		
//		ch ='1';
//		System.out.printf("ch='%c', '0' <= ch && ch <= '9' = %b%n" , ch , 10 < x && x < 20);
//	
//		ch ='a';
//		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' = %b%n" , ch , 'a' <= ch && ch <= 'z');
//
//		ch ='A';
//		System.out.printf("ch='%c', 'A' <= ch && ch <= 'z' = %b%n" , ch , 'A' <= ch && ch <= 'z');
//		
//		ch ='q';
//		System.out.printf("ch='%c', ch=='q' || ch == 'Q' = %b%n" , ch , ch=='q' || ch == 'Q');
//		
		
		//예제 3-25 ch3/OperatorEx25	
//		Scanner scanner = new Scanner(System.in);
//		char ch = ' ';
//		
//		System.out.printf("문자를 하나 입력하세요.>");
//		
//		String input = scanner.nextLine();
//		ch = input.charAt(0);
//		
//		if('0' <= ch  && ch <= '9') {
//			System.out.printf("입력하신 문자는 숫자 입니다. %n");
//		}
//		
//		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
//			System.out.printf("입력하신 문자는 영문자 입니다. %n");
//		}
//		
		//OR 연산의 경우 참일 확률이 높은 것을 왼쪽에 놓아야 더 빠른 연산 결과를 얻을 수 있다.
//		
//		
		
		//예제 3-26 ch3/OperatorEx26	
//		int a = 5;
//		int b = 0;
//		
//		System.out.printf("a=%d, b=%d%n" , a , b);
//		System.out.printf("a!=0 || ++b!=0 = %b%n" , a != 0 || ++b != 0 );
//		System.out.printf("a=%d, b=%d%n" , a , b);
//		System.out.printf("a==0 && ++b != 0  = %b%n" , a==0 && ++b != 0);
//		System.out.printf("a=%d, b=%d%n" , a , b);
		
		//예제 3-27 ch3/OperatorEx27	: 논리 부정 연산자 !
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();

		
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z' =%b%n", ch < 'a' || ch > 'z');
		System.out.printf("!('a' <= ch && ch <= 'z' ) =%b%n", !('a' <= ch && ch <= 'z' ));
		System.out.printf(" 'a' <= ch && ch  <= 'z' =%b%n", 'a' <= ch && ch  <= 'z' );
	
		//예제 3-28 ch3/OperatorEx28 : 비트 연산자	
		
		//예제 3-29 ch3/OperatorEx29	
		
		//예제 3-30 ch3/OperatorEx30	
		
		//예제 3-31 ch3/OperatorEx31	
		
		//예제 3-32 ch3/OperatorEx32	
		
		//예제 3-33 ch3/OperatorEx33	
		
		//예제 3-34 ch3/OperatorEx34	
		
		//예제 3-35 ch3/OperatorEx35	
	
		
	
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
