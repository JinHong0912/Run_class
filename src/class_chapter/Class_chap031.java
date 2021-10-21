package class_chapter;

public class Class_chap031 {

	private static Object toBinaryString(int x) {
	// TODO Auto-generated method stub
	String zero = "0000000000000000000000000000000";
	String tmp = zero + Integer.toBinaryString(x);
	return tmp.substring(tmp.length()-32);
	

	}
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
//		boolean b = true;
//		char ch = 'C';
//		
//		System.out.printf("b=%b%n", b);
//		System.out.printf("!b=%b%n", !b);
//		System.out.printf("!!b=%b%n", !!b);
//		System.out.printf("!!!b=%b%n", !!!b);
//		System.out.println();
//
//		
//		System.out.printf("ch=%c%n", ch);
//		System.out.printf("ch < 'a' || ch > 'z' =%b%n", ch < 'a' || ch > 'z');
//		System.out.printf("!('a' <= ch && ch <= 'z' ) =%b%n", !('a' <= ch && ch <= 'z' ));
//		System.out.printf(" 'a' <= ch && ch  <= 'z' =%b%n", 'a' <= ch && ch  <= 'z' );
	
		//예제 3-28 ch3/OperatorEx28 : 비트 연산자	& | ^ ~ << >>
//		int x = 0xAB , y = 0xF;
//		
//		System.out.printf("x = %#X /t/t%s%n", x , toBinaryString(x));
//		System.out.printf("y = %#X /t/t%s%n", y , toBinaryString(y));
//
//		System.out.printf("%#X | %#X = %#X /t%s%n",  x, y,x | y,  toBinaryString(x | y));
//		System.out.printf("%#X & %#X = %#X /t%s%n",  x, y,x & y,  toBinaryString(x & y));
//		System.out.printf("%#X ^ %#X = %#X /t%s%n",  x, y,x ^ y,  toBinaryString(x ^ y));
//		System.out.printf("%#X ^ %#X ^ %#X %s%n",  x, y,x ^ y ^ y ,  toBinaryString(x ^ y ^ y));
		
		//예제 3-29 ch3/OperatorEx29	: 비트 연산자
//		byte p = 10;
//		byte n = -10;
//		
//		System.out.printf(" p = %d   \t%s%n",  p, toBinaryString(p));
//		System.out.printf("~p = %d   \t%s%n", ~p, toBinaryString(~p));
//		System.out.printf("~p+1 = %d \t%s%n", ~p+1, toBinaryString(~p+1));
//		System.out.printf("~~p = %d  \t%s%n", ~~p, toBinaryString(~~p));
//
//		System.out.println();
//		
//		System.out.printf(" n =%d%n" , n );
//		System.out.printf("~(n-1)=%d%n" , ~(n-1) );
	
		//예제 3-30 ch3/OperatorEx30 : 쉬프트 연산자 << >>
//		int dec = 8;
//		System.out.printf("%d >> %d = %4d /t%s%n", dec ,0, dec >> 0, toBinaryString(dec >> 0));
//		System.out.printf("%d >> %d = %4d /t%s%n", dec ,1, dec >> 1, toBinaryString(dec >> 1));
//		System.out.printf("%d >> %d = %4d /t%s%n", dec ,2, dec >> 2, toBinaryString(dec >> 2));
//		
//		System.out.printf("%d << %d = %4d /t%s%n", dec ,0, dec << 0, toBinaryString(dec << 0));
//		System.out.printf("%d << %d = %4d /t%s%n", dec ,1, dec << 1, toBinaryString(dec << 1));
//		System.out.printf("%d << %d = %4d /t%s%n", dec ,2, dec << 2, toBinaryString(dec << 2));
//		System.out.println();
//		
//		dec = -8;
//		System.out.printf("%d >> %d = %4d /t%s%n", dec ,0, dec >> 0, toBinaryString(dec >> 0));
//		System.out.printf("%d >> %d = %4d /t%s%n", dec ,1, dec >> 1, toBinaryString(dec >> 1));
//		System.out.printf("%d >> %d = %4d /t%s%n", dec ,2, dec >> 2, toBinaryString(dec >> 2));
//		
//		System.out.printf("%d << %d = %4d /t%s%n", dec ,0, dec << 0, toBinaryString(dec << 0));
//		System.out.printf("%d << %d = %4d /t%s%n", dec ,1, dec << 1, toBinaryString(dec << 1));
//		System.out.printf("%d << %d = %4d /t%s%n", dec ,2, dec << 2, toBinaryString(dec << 2));
//		System.out.println();		
//	
//		dec = 8;
//		System.out.printf("%d >> %2d = %4d /t%s%n", dec ,0, dec >> 0, toBinaryString(dec >> 0));
//		System.out.printf("%d >> %2d = %4d /t%s%n", dec ,32, dec >> 32, toBinaryString(dec >> 32));
//		System.out.println();
//		
//		8 >> 0 =    8 /t00000000000000000000000000001000
//		8 >> 1 =    4 /t00000000000000000000000000000100
//		8 >> 2 =    2 /t00000000000000000000000000000010
//		8 << 0 =    8 /t00000000000000000000000000001000
//		8 << 1 =   16 /t00000000000000000000000000010000
//		8 << 2 =   32 /t00000000000000000000000000100000
//
//		-8 >> 0 =   -8 /t11111111111111111111111111111000
//		-8 >> 1 =   -4 /t11111111111111111111111111111100
//		-8 >> 2 =   -2 /t11111111111111111111111111111110
//		-8 << 0 =   -8 /t11111111111111111111111111111000
//		-8 << 1 =  -16 /t11111111111111111111111111110000
//		-8 << 2 =  -32 /t11111111111111111111111111100000
//
//		8 >>  0 =    8 /t00000000000000000000000000001000
//		8 >> 32 =    8 /t00000000000000000000000000001000
//

		//예제 3-31 ch3/OperatorEx31
//		int dec = 1234;
//		int hex = 0xABCD;
//		int mask = 0xF;
//		
//		System.out.printf("hex =%X%n", hex);
//		System.out.printf("%X%n", hex & mask);
//		
//		hex = hex >> 4;
//		System.out.printf("%X%n", hex & mask);
//		
//		hex = hex >> 4;
//		System.out.printf("%X%n", hex & mask);
//		
//		hex = hex >> 4;
//		System.out.printf("%X%n", hex & mask);
//		
		
//		hex =ABCD
//				D
//				C
//				B
//				A

		//예제 3-32 ch3/OperatorEx32	: 조건 연산자 ?:
		int x ,y, z;
		int absX, absY, absZ;
		char signX,signY,signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x; // x의값이 음수이면, 양수를 만든다.
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-'); // 조건 연산자를 중첩
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); // 조건 연산자를 중첩
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); // 조건 연산자를 중첩
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
		
//		x=+10
//		y=-5
//		z= 0
				
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

//	private static Object toBinaryString(int x) {
//		// TODO Auto-generated method stub
//		String zero = "0000000000000000000000000000000";
//		String tmp = zero + Integer.toBinaryString(x);
//		return tmp.substring(tmp.length()-32);
//		
//	
//	}
}
