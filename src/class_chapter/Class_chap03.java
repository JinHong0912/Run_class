package class_chapter;

public class Class_chap03 {

	public static void main(String[] args) {
//		//예제 3-1 ch3/OperatorEx1
//		int i = 5;
//		i++; // i=i+1; 과 같은 의미이다. ++i;로 바꿔써도 결과는 같다.
//		System.out.println(i);
//		
//		i=5;
//		++i;
//		System.out.println(i);

//		//예제 3-2 ch3/OperatorEx2
//		int i = 5, j = 0;
//		
//		j = i++;
//		System.out.println("j=i++; 실행 후 , i="+i+", j="+j);
//		
//		i=5;  // 결과를 비교하기 위해 , i와 j의 값을 다시 5와 0으로 변경
//		j=0;
//	
//		j= ++i;
//		System.out.println("j=i++; 실행 후 , i="+i+", j="+j);
//		

		
//		//예제 3-3 ch3/OperatorEx3
//		int i = 5, j = 5;
//		
//		System.out.println(i++);
//		System.out.println(++j);
//		System.out.println("i = "+ i +", j=" + j);
//		
		//부호 연산자 
		//예제 3-4 ch3/OperatorEx4
		int i = -10;
		i = +i;
		
		System.out.println(i);
		
		i = -10;
		i= -i;
		System.out.println(i);
		
		// 산술 연산자
		//예제 3-5 ch3/OperatorEx5
//		
//		int a = 10;
//		int b = 4;
//		
//		System.out.printf("%d + %d = %d%n", a , b, a + b );
//		System.out.printf("%d - %d = %d%n", a , b, a - b );
//		System.out.printf("%d * %d = %d%n", a , b, a * b );
//		System.out.printf("%d / %d = %d%n", a , b, a / b );
//		System.out.printf("%d / %f = %f%n", a , (float) b, a / (float)b );
		
//		// 산술 연산자
//		//예제 3-6 ch3/OperatorEx6
//		byte a = 10;
//		byte b = 20;
//		//byte c = a + b;
//		
//		byte c = (byte) (a + b);
//		System.out.println(c);
//		
		// 산술 연산자
		//예제 3-7 ch3/OperatorEx7
//		byte a = 10;
//		byte b = 30;
//		
//		byte c = (byte) (a * b);
//		System.out.println(c);
		
		// 산술 연산자
		//예제 3-8 ch3/OperatorEx8
//		int a = 1_000_000;
//		int b = 2_000_000;
//		
//		long c = a * b;
//		System.out.println(c);
		
//		-1454759936
		
//		//예제 3-9 ch3/OperatorEx9
//		long a = 1_000_000 * 1_000_000;
//		long b = 1_000_000 * 1_000_000L;
//		
//		
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		
//		a=-727379968
//		b=1000000000000
		
		//예제 3-10 ch3/OperatorEx10
//		int a = 1000000;
//		
//		int result1 = a * a / a ;
//		int result2 = a /a * a;
//		
//		
//		System.out.printf("%d * %d / %d = %d%n", a , a, a , result1 ); 
//		System.out.printf("%d/ %d * %d = %d%n", a , a, a , result2 );                  
//		
//		1000000 * 1000000 / 1000000 = -727
//		1000000/ 1000000 * 1000000 = 1000000
		
		//예제 3-11 ch3/OperatorEx11
//		char a = 'a';
//		char d = 'd';
//		char zero = '0';
//		char two = '2';
//		
//		System.out.printf("'%c' - '%c' = %d%n", d , a, d - a ); 
//		System.out.printf("'%c' - '%c' = %d%n", two , zero, two - zero ); 
//		System.out.printf("'%c' = %d%n", a, (int)a ); 
//		System.out.printf("'%c' = %d%n", d, (int)d ); 
//		System.out.printf("'%c' = %d%n", zero, (int)zero ); 
//		System.out.printf("'%c' = %d%n", two, (int)two ); 
//		
//		'd' - 'a' = 3
//		'2' - '0' = 2
//		'a' = 97
//		'd' = 100
//		'0' = 48
//		'2' = 50
//				
		
		//예제 3-12 ch3/OperatorEx12
//		char c1 = 'a'; //c1에는 문자  'a' 의 코드값인 97이 저장 된다.
//		char c2 = c1 ; //c1에 저장되어 있는 값이 c2에 저장된다.
//		char c3 = ' '; //c3를 공백으로 초기화 한다.
//		
//		int i = c1 + 1; // 'a' + 1 -> 97 +1 -> 98
//		
//		c3 = (char)(c1 + 1);
//		c2++;
//		c2++;
//		
//		System.out.println("i=" + i);
//		System.out.println("c2=" + c2);
//		System.out.println("c3=" + c3);
//		
		
//		i=98
//		c2=c
//		c3=b
		
		//예제 3-13 ch3/OperatorEx13
//		 char c1 = 'a';
//		// char c2 = c1 + 1; // 수식에 변수가 들어 가 있는 경우에는 컴파일러가 미리 계산을 할 수 없기 떄문에 형변환은 해 줘야 한다 (char)
//		 char c2 = 'a'+1; // 이 부분은 리터럴 간의 연산이기 때문에 실행 과정 동안 변하는 값이 아니기 떄문에 컴파일ㄹ시에 컴파일러가 계산한다.
//		 
		 //System.out.println(c2); // 가독성을 높이는데 장점이 있다.
	
		//예제 3-14 ch3/OperatorEx14
//		 char c = 'a';
//		 for (int i = 0; i <26 ; i++) { // 블록[] 안의 문장을 26번을 반복한다.
//			 System.out.println(c++); // 'a' 부터 26개의 문자를 출력한다.
//		 }
//		 System.out.println(); // 줄바꿈을 한다.
//	
//		 
//		 c = 'A';
//		 for(int i = 0; i<26 ; i++) { // 블럭[] 안의 문장을 26번을 반복한다.
//			 System.out.println(c++); // 'A' 부터 26개의 문자를 출력 한다.
//		 }
//		 System.out.println();
//		 
//		 c ='0';
//		 for(int i = 0; i <10 ; i++) { // 블럭 [] 안의 문장을 10번을 반복한다.
//			 System.out.println(c++); // '0' 부터 10개의 문자를 반복한다.
//		 }
//		 System.out.println();
		
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

		
		
	}
	
}
