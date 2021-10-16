package class_chapter;

public class Class_chap05 {

	public static void main(String[] args) {
		
	//배열 array 예제 5-01  ch5/ArratEX1
		int[] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70; //score[2] = 70
		score[3] = 80;
		score[4] = 90;
	
		int tmp = score[k+2] + score[4]; //int tmp = score[3] + score[4]
		
		//for문으로 배열의 모든 요소를 출력한다.
		for( int i = 0; i < 5; i++ ) {
			System.out.printf("score[%d]:%d%n" ,i , score[i]);
		}
		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n", 7 , score[7]);// index의 범위를 벗어난 값
	
//		score[0]:50
//		score[1]:60
//		score[2]:70
//		score[3]:80
//		score[4]:90
//		tmp:170

	
	
	
	
	
	
	
	
	}
}
