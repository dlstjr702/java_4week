package days15;


/**
 * @author 양인석
 * @date 2026. 6. 1. 오전 9:01:35
 * @subject  has-a 관계 Car, Engine
 * @content     - 결합력이 높은 코딩 좋은 코딩이 아니다.
 * 				- 생성자를 통해서 DI(의존성 주입)
 *  			- setter를통한 DI 
 */


public class Ex03{

	public static void main(String[] args) {

		// 2026 상반기
		Car k1 = new Car(new H_Engine());//DI

		// 2026 상반기
		Car k2 = new Car(new K_Engine());

		//k1의 엔진고장
		k1.setEngine(new K_Engine());//setter DI
		
		//2036 식 
		
		
		

	}//main

}//class







