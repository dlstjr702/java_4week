package days15;

import java.util.Random;

/**
 * @author 양인석
 * @date 2026. 6. 1. 오전 9:01:35
 * @subject 
 * @content 
 */


public class Ex06_02{

	public static void main(String[] args) {

		int number = 100;
		int result = 0;

		Random rnd = new Random();
		int n = -1;
		for (int i = 0; i < 10 ; i++) {
			n = rnd.nextInt(5);   // 0<= 정수 <5  rnd.nextInt(4)+1;
			
			
			if(n== 0) {
				i--;
				continue;
			}
			
			
			result = number / n ;

			System.out.println(result );
		} // for



	}//main

}//class













