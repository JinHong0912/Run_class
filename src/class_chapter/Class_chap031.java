package class_chapter;

public class Class_chap031 {

	public static void main(String[] args) {
		//예제 3-15 ch3/OperatorEx15
//		char lowerCase = 'a';
//		char upperCase = (char) (lowerCase - 32);
//		System.out.println(upperCase);
//		
		//예제 3-16 ch3/OperatorEx16
//		float pi = 3.141592f;
//		float shortPi = ( int) (pi *1000) /1000f ;
//		System.out.println(shortPi);
		
		//예제 3-17 ch3/OperatorEx17	
//		double pi = 3.141592;
//		double shortPi = (int) (pi * 1000 + 0.5) / 1000.0;
//		System.out.println(shortPi);
//		
		//예제 3-18 ch3/OperatorEx18
//		double pi = 3.141592;
//		double shortPi = Math.round(pi * 1000) /1000.0; // round 메소드는 매개변수로 받은 값을 소수점 첫쨰자리에서 반올림을 하고 그 결과를 정수로 돌려 주는 메소드이다.
//		System.out.println(shortPi);
		
		//예제 3-19 ch3/OperatorEx19 : 나머지 연산자 %
//		int x = 10;
//		int y = 8;
//		 
//		System.out.printf("%d를 %d로 나누면 , %n" , x ,y);
//		System.out.printf("몫은 %d이고 ,나머지는 %d 입니다" , x / y ,x % y);

		//예제 3-20 ch3/OperatorEx20
//		System.out.println(-10%8);
//		System.out.println(10%-8);
//		System.out.println(-10%-8);
		
		//예제 3-21 ch3/OperatorEx21 : 비교 연산자 < > <= >=
//		System.out.printf("10 == 10.0f   \t %b%n", 10==10.0f );
//		System.out.printf("'0' == 0      \t %b%n", '0'== 0 );
//		System.out.printf("'A' == 65	 \t %b%n", 'A'== 65 );
//		System.out.printf("'A' > 'B'     \t %b%n", 'A' > 'B' );
//		System.out.printf("'A'+ 1 != 'B' \t %b%n", 'A'+ 1 != 'B' );
//		
//		10 == 10.0f   	 true
//		'0' == 0      	 false
//		'A' == 65	  	 true
//		'A' > 'B'    	 false
//		'A'+ 1 != 'B' 	 false

		//예제 3-22 ch3/OperatorEx22	
//		float f = 0.1f;
//		double d = 0.1;
//		double d2 = (double)f;
//
//		System.out.printf("10.0 == 10.0f    %b%n", 10.0==10.0f );
//		System.out.printf("0.1 == 0.1f       %b%n", 0.1== 0.1f );
//		System.out.printf("f = %19.17f%n", f );
//		System.out.printf("d = %19.17f%n", d );
//		System.out.printf("d2 = %19.17f%n", d2);
//
//		System.out.printf("d == f %b%n", d==f );
//		System.out.printf("d == d2 %b%n", d==d2 );
//		System.out.printf("d == f %b%n", d2==f );
//		System.out.printf("(float) d == f %b%n", (float)d==f );
		
		
 		//예제 3-23 ch3/OperatorEx23 : 문자열 비교	
//		String str1 = "abc";
//		String str2 = new String("abc");
//		
//		System.out.printf("\"abc\"==\"abc\" ? %b%n" , "abc"=="abc");
//		System.out.printf(" str1==\"abc\" ? %b%n" , str1=="abc");
//		System.out.printf(" str2==\"abc\" ? %b%n" , str2=="abc");
//		System.out.printf("str1.equals(\"abc\") ? %b%n" , str1.equals("abc"));
//		System.out.printf("str2.equals(\"abc\") ? %b%n" , str2.equals("abc"));
//		System.out.printf("str2.equals(\"ABC\") ? %b%n" , str2.equals("ABC"));
//		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n" , str2.equalsIgnoreCase("ABC"));

		//예제 3-24 ch3/OperatorEx24	 : 논리 연산 || (OR) &&(AND)
		int x = 0 ;
		char ch = ' ';
		
		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 = %b%n" , x, 10 < x && x < 20);

		x = 6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 =%b%n " , x, x%2==0 || x%3==0 && x%6!=0);
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b%n " , x, (x%2==0 || x%3==0) && x%6!=0);
		
		ch ='1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' = %b%n" , ch , 10 < x && x < 20);
	
		ch ='a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' = %b%n" , ch , 'a' <= ch && ch <= 'z');

		ch ='A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'z' = %b%n" , ch , 'A' <= ch && ch <= 'z');
		
		ch ='q';
		System.out.printf("ch='%c', ch=='q' || ch == 'Q' = %b%n" , ch , ch=='q' || ch == 'Q');
		
		
		//예제 3-25 ch3/OperatorEx25	
		
		//예제 3-26 ch3/OperatorEx26	
		
		//예제 3-27 ch3/OperatorEx27	
		
		//예제 3-28 ch3/OperatorEx28	
		
		//예제 3-29 ch3/OperatorEx29	
		
		//예제 3-30 ch3/OperatorEx30	
		
		//예제 3-31 ch3/OperatorEx31	
		
		//예제 3-32 ch3/OperatorEx32	
		
		//예제 3-33 ch3/OperatorEx33	
		
		//예제 3-34 ch3/OperatorEx34	
		
		//예제 3-35 ch3/OperatorEx35	
	
		
	
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
