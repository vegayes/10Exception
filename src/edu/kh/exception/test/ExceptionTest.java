package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		while(true) {
			
			System.out.print("정수 입력 (0. 종료) : ");
			int input = sc.nextInt();
			
			if( input == 0) {
				break;
			}	
			
			/*
				정수 입력 (0. 종료) : 안녕
				Exception in thread "main" java.util.InputMismatchException
				
				넣은 값의 타입이 맞지 않은 경우 발생! (== 런타임 에러)
			 */
			
			// int a = 99.9;  // 컴파일 에러 => 개발자가 코드 잘못쓴거! 
			// 					자료형이 맞지않아 연산을 못해서 "컴파일 에러"가 발생( 코드 틀림 ) 
			// -> 코드로 수정가능
			// 1) 정수형으로 값 바꾸기 2) 정수형으로 형변환
				
//		}
	
		
		
		// 런타임 에러 예제
		// 런타임 에러 : 프로그램 수행 중 발생하는 에러 
		//               주로 if문으로 처리가 가능하다.
		
		int[] arr = new int[3]; // 길이 3: 인덱스 0,1,2
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 40;
//		java.lang.ArrayIndexOutOfBoundsException:  배열범위 초과 예외
		
		if( 3 >= arr.length ) { // 배열 인덱스 범위 초과시
			
			System.out.println("배열 범위를 초과했습니다.");
			
		}else {
			arr[3] = 40;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
