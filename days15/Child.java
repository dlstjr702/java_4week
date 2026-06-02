package days15;

import days16.Parent;

//days16.Parent 같은 패키지 내부
public class Child extends Parent{

	void modiferAccessTEst() {
		
		this.pub = 1;
		this.pro = 1; // 패키지내부(default) X  + 상속

		
	}//modiferAccessTEst
	
}
