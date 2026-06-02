package days16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  
 * @content   [정규표현식 ([REG]ular  [EX]pression)]  regex
 * 			  - 문자열 속에 원하는 패턴(pattern)과 일치하는 문자열을 찾기위해서 사용하는 식
 *            - 미리  정의된 기호와 식.   \\s    [A-Z]   *  +  ? 등등
 *            - 자바 java.util.regex패키지
 *            					- Pattern 클래스 - 정규식을 정의
 *            					- Matcher 클래스 - 데이터와 정규식(Pattern객체)을 비교
 *            
 */

public class Ex09 {
	public static void main(String[] args) {


		String[] data = { "bat", "baby", "bonus", "cA", "ca"
				, "co", "c.", "c0", "car", "combat", "count", "date",
				"disc", "fx" , "c"};


		//String regex = "c[a-z]*";
		//String regex = "c[a-z]";
		//String regex = "c[a-zA-Z0-9]";
		//String regex = "c\\w";  //   \w ==[a-zA-Z0-9]



		// String regex = ".*";     // 
		//String regex = "c.";
		// String regex = "c\\.";
		// String regex = "c[0-9]";
		// String regex = "c.*t";
		// String regex = "[b|c]";
		// String regex = "[bc]";
		// String regex = "[b-c].*";
		// String regex = "[^bc].*";
		// String regex = ".*a.*";
		// String regex = "[^bcd].*";

		// String regex = "[a-zA-Z].*";
		// String regex = "[ae-zA-Z].*";
		//String regex = "[a-zA-Z&&[^b-d]].*"; //교집합 겹치는것 제외 출력


		//String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z\\d!@#$%^&*_]{8,15}";




		//Pattern pattern = Pattern.compile(regex);

//		for (int i = 0; i < data.length; i++) {
//
//			Matcher matcher =  pattern.matcher(data[i]);
//
//			if(matcher.matches()) {
//
//				System.out.println(data[i]);
//
//			}
//
//		}//for
//



		/* 
		for (int i = 0; i < data.length; i++) {
			if ( data[i].matches(regex)) {   
				System.out.println(data[i]);
			}//if
		}//for
		 */

	} // main

}//class

