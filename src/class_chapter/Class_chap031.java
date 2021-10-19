package class_chapter;

public class Class_chap031 {

	public static void main(String[] args) {

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
		 char c = 'a';
		 for (int i = 0; i <26 ; i++) { // 블록[] 안의 문장을 26번을 반복한다.
			 System.out.println(c++); // 'a' 부터 26개의 문자를 출력한다.
		 }
		 System.out.println(); // 줄바꿈을 한다.
	
		 
		 c = 'A';
		 for(int i = 0; i<26 ; i++) { // 블럭[] 안의 문장을 26번을 반복한다.
			 System.out.println(c++); // 'A' 부터 26개의 문자를 출력 한다.
		 }
		 System.out.println();
		 
		 c ='0';
		 for(int i = 0; i <10 ; i++) { // 블럭 [] 안의 문장을 10번을 반복한다.
			 System.out.println(c++); // '0' 부터 10개의 문자를 반복한다.
		 }
		 System.out.println();
	}
}
