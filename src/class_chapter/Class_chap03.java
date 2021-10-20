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
		
		
		
		
	}
	
}
