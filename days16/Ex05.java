package days16;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  
 * @content   
 * 
 */

public class Ex05 {
	public static void main(String [] args) {


		//[Wrapper 클래스 ]
		// 기본형을 사용하기 쉽도록 기능을 구현한 클래스
		// [ 오토 박싱 / 오토 언박싱 ]  용어 이해.


		int i = 100;
		Integer j = i; //오토박싱 :  기본형 -> 래퍼클래스 객체 변화

		int k = j;     // 오토언박싱 : 래퍼클래스 개체가 자동으로 기본형으로 변환되는것

		disp(10);
		
		
		
		
		System.out.printf("%s %d %.2f %c %b \n","이름", 20,3.14,'A',true);
		
		

	}//main


	static void disp(Object obj) {//10(int) -> Integer -> Object (최상위 클래스가 오브젝트라서)
		System.out.println(obj);
	}


}//class
