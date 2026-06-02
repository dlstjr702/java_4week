package days16;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  
 * @content   
 * 
 */

public class Ex06 {
	public static void main(String [] args) {

		//java.util 패키지 안에는 자주 사용되는 유요한 클래스들 있는 패키지이다.
		//Arrays 클래스
		//-Arrays.toString(배열)
		//-Arrays.binarySearch(nul,0)
		//-Arrays.sort(nul)
		//-Arrays.fill(nul,false)
		
		
		
		//Random 클래스
		Random rnd  = new Random();
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextInt());      //  -21 ~ 21 정수
		System.out.println(rnd.nextDouble());   //
		System.out.println(rnd.nextInt(1,10));  //1 <= 정수 <10
		
		
		
		

	}//main

}//class
