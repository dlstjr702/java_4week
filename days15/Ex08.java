package days15;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 양인석
 * @date 2026. 6. 1. 오전 9:01:35
 *  * @subject 예외처리하는 두 번째 방법:     throws 문 사용
 * @content try~cathch문             throw 강제로 예외를 발생시키는 문 
 */


public class Ex08{

	public static void main(String[] args) {






	} // main





	private static int getScore() throws IOException {

		Scanner scanner = new Scanner(System.in);
		int score = 0;      
		System.out.print("> 점수 입력 ? ");
		String input = scanner.next();      
		String regex = "^(\\d|[1-9]\\d|100)$"; // 0<= <=100      
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
		} else {
			// 강제로 예외 발생시키겠다. 
			throw new IOException("> 점수 범위 0<= <=100   !!!");         
		}

		return score;
	}



}//class
















