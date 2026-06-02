package days15;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 양인석
 * @date 2026. 6. 1. 오전 9:01:35
 * @subject 
 * @content 
 */


public class Ex06_03{

	public static void main(String[] args) {

		int number = 100;
		int result = 0;

		Random rnd = new Random();
		int n = -1;

		int [] m = new int[5];


		for (int i = 0; i < 10 ; i++) {

			try {
				n = rnd.nextInt(5);   // 0<= 정수 <5  rnd.nextInt(4)+1;
				result = number / n ;
				m[i] = result;
				System.out.println(result );

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("> 배열 m의 다 채워졌다.");
				//break;
				
				m = Arrays.copyOf(m, m.length + 5);

			} catch (ArithmeticException e) {
				
				System.out.println(e.toString());
				i--;
				
				
			} catch (Exception e) {//다중 catch문 / Exception구문은 최하단에 
			
				
			}




		} // for



	}//main

}//class













