package edu.kh.exception.run;

import edu.kh.exception.model.service.ExceptionService;

public class ExceptionRun {

	
	public static void main(String[] args) {
		
		ExceptionService service = new ExceptionService();
		
//		service.ex1(); //  java.lang.ArithmeticException: / by zero 산술적 예외 
					   // 0으로 나눌 수 없음. (예외처리 해야함!) 
		
//		service.ex2(); // java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "str" is null
					   // 참조하지 않는 참조변수를 이용해서 코드 수행 시 발생 
		
		service.ex3();
		
	}
	
	
	
	
	
	
}
