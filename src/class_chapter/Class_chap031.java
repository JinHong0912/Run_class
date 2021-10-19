package class_chapter;

public class Class_chap031 {

	public static void main(String[] args) {
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
		char c1 = 'a'; //c1에는 문자  'a' 의 코드값인 97이 저장 된다.
		char c2 = c1 ; //c1에 저장되어 있는 값이 c2에 저장된다.
		char c3 = ' '; //c3를 공백으로 초기화 한다.
		
		int i = c1 + 1; // 'a' + 1 -> 97 +1 -> 98
		
		c3 = (char)(c1 + 1);
		c2++;
		c2++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		
		
//		i=98
//		c2=c
//		c3=b

	}
}
