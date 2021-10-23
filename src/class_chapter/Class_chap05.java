package class_chapter;

import java.util.Arrays;

public class Class_chap05 {

	public static void main(String[] args) {
		
	//배열 array 예제 5-01  ch5/ArratEX1
//		int[] score = new int[5];
//		int k = 1;
//		
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70; //score[2] = 70
//		score[3] = 80;
//		score[4] = 90;
//	
//		int tmp = score[k+2] + score[4]; //int tmp = score[3] + score[4]
//		
//		//for문으로 배열의 모든 요소를 출력한다.
//		for( int i = 0; i < 5; i++ ) {
//			System.out.printf("score[%d]:%d%n" ,i , score[i]);
//		}
//		System.out.printf("tmp:%d%n", tmp);
//		System.out.printf("score[%d]:%d%n", 7 , score[7]);// index의 범위를 벗어난 값
	
//		score[0]:50
//		score[1]:60
//		score[2]:70
//		score[3]:80
//		score[4]:90
//		tmp:170

		
		//예제 5-02  ch5/ArratEX2
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
//	//	int[] iArr3 = new int[] {100,95,80,70,60};
//		int[] iArr3 = {100,95,80,70,60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for( int i =0; i <iArr1.length ; i++) {
//			iArr1[i] = i + 1 ; // 1~10의 숫자를 순서대로 배열에 넣는다.
//		}
//		
//		for(int i = 0 ;i < iArr2.length ; i++) {
//			iArr2[i] = (int) (Math.random()*10) + 1; // 1~10 의 값을 배열에 저장
//		}
//
//		// 배열에 저장된 값들을 출력한다.
//		for(int i = 0 ; i < iArr1.length; i++) {
//			System.out.print(iArr1[i]+",");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString((iArr2)));
//		System.out.println(Arrays.toString((iArr3)));
//		System.out.println(Arrays.toString((chArr)));
//		System.out.println(iArr3);
//		System.out.println(chArr);

		//예제 5-03  ch5/ArratEX3 : 배열의 복사
		int[] arr = new int[5];
		
		// 배열 arr 에  1 ~ 5를 저장한다.
		for(int i = 0; i < arr.length ; i++)
			arr[i] = i +1;
		System.out.println("[ 변경전 ]");
		System.out.println("arr.length:"+arr.length);
	
		for(int i = 0 ; i < arr.length ; i++ ) 
			System.out.println("arr["+i+"]:" + arr[i]);
		
		int[] tmp = new int[arr.length*2];
		
		
		// 배열 arr에 저장된 갑ㅂㅅ들을 배열 tmp에 복사한다.
		for(int i = 0 ; i < arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp; // tmp에 저장된 값을 arr에 저장한다.
		
		System.out.println("[ 변경후 ]");
		System.out.println("arr.length:"+arr.length);
		for(int i = 0; i <arr.length ; i++)
			System.out.println("arr["+i + "]:" +arr[i]);
		
		
		
		
		
		
		//예제 5-04  ch5/ArratEX4
		
		//예제 5-05  ch5/ArratEX5
		
		//예제 5-06  ch5/ArratEX6
		
		//예제 5-07  ch5/ArratEX7
		
		//예제 5-08  ch5/ArratEX8
		
		//예제 5-09  ch5/ArratEX9
		
		//예제 5-10  ch5/ArratEX10
	
		
	
	
	
	
	
	}
}
