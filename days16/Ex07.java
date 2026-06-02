package days16;

import java.io.FileReader;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  
 * @content   
      // 알파벳 대소문자를 구분하지 않고 A(20), B(11)~ Z(3)
      // 갯수를 파악해서 #으로 막대그래프를 그리기.
      // A(20) : ####################
      // B(11) : ###########
      // :
      // Z(3)  : ###    
 */

public class Ex07 {
	public static void main(String[] args) {
		String fileName = ".\\src\\days16\\Ex01.java";

		// [0]=='A'
		// [1]=='B'
		//  :
		// [25]=='Z' 갯수 저장
		int [] counts = new int[26];

		try (
				FileReader reader = new FileReader(fileName);   
				){
			int code = -1;
			char one ;
			while (   (code = reader.read()) != -1 ) {
				//	            System.out.println( Integer.toBinaryString(code) );
				one = (char) Character.toUpperCase(code);

				if ( Character.isUpperCase(one) ) {  // 대문자 이니?  65~92
					//System.out.println( one );

					counts[one - 'A']++;

				} // 

			} // while

			// 막대그래프 출력
			for (int i = 0, count = 0; i < counts.length; i++) {
				count = counts[i];
				System.out.printf("%c(%d):\t %s\n", i+'A', count,"#".repeat(count));
			} // for

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

}//class
