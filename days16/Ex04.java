package days16;


import static java.lang.Math.*;


/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  Math 클래스 
 * @content   
 * 
 */

public class Ex04 {
	public static void main(String [] args) {


		System.out.println(PI);
		System.out.println(E);

		System.out.println(random());

		System.out.println(max(1,3));
		System.out.println(min(1,3));

		System.out.println(abs(-3));//절대값


		//자주써서 기억애햐할것
		// 소수점 1 자리에서 절삭,절상 ,반올림된다
		/*
		System.out.println(ceil(45.179));//올림 절상 46.0
 		System.out.println(ceil(45.979));//올림 절상 46.0
		
		
		System.out.println(round(45.179));//반올림 45 long
		System.out.println(round(45.979));//반올림 45
		
		System.out.println(floor(45.179));//절삭, 내림 45.0 long
		System.out.println(floor(45.979));//절삭, 내림 45.0 
		*/
		
		
		//double d = 3.141592;
		// [문제] 소수점 3자리에서 반올림한 결과 출력 : 3.14
		double d = 3.141592;
		 
		System.out.println(round(d * 100)/100D);





	}//main

}//class
