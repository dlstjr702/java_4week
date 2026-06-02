package days16;



/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject 
 * @content  문자열을 다루는 클래스
 * 	1. String 클래스        *****
 *  - 변경 불가능한 클래스이다. (기억)
 *  -
 	2. StringBuffer 클래스
	3. StringBuilder 클래스
   	4. StringTokenizer 클래스  
    5. StringJoiner 클래스  
 */

public class Ex01_02 {
	public static void main(String [] args) {


		//String url = "https://www.naver.com";
		String url = "http://www.naver.com";

		String prefix = "https://";

		System.out.println(url.startsWith(prefix));//~~~으로 시작하는지 확인


		
		String suffix = ".com";
		System.out.println(url.endsWith(suffix));//~~~으로 끝나는지 확인


	}//main
}//class
