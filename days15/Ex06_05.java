package days15;


/**
 * @author 양인석
 * @date 2026. 6. 1. 오전 9:01:35
 * @subject 
 * @content 
 */


public class Ex06_05{

	public static void main(String[] args) {

		// [ try ~ catch 블럭 실행 과정 이해. ]
		System.out.println("1 - DB Open..");
		try {
			System.out.println("2");
			System.out.println( 100 / 0 );  // 예외 발생...
			System.out.println("3");
		} catch (ArithmeticException e) {
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("5");
		} finally { // 이 블럭은 try {} 블럭에서 예외가 발생 유무에 상관없이
			// 실행할 코딩을 하는 블럭이다.
			System.out.println("6 - DB Close...");
		}
		System.out.println("7");
		System.out.println("end");

	}//main

}//class













