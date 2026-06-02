package days16;

import java.util.Arrays;

//import java.util.Arrays;

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
   	4. StringTokenizer 클래스   == String.split();
    5. StringJoiner 클래스    == String.join();
 */

public class Ex01 {
	public static void main(String [] args) {

		
		
		
		String a = "abc";
		String b = "AbC";
		
		
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));//대소문자 구분없이 비교하는 메소드
		
		
		//String s = "  public statIc void main(String [] args) {";
		//String [] sArr =s.trim().split("\\s");
		//System.out.println(Arrays.toString(sArr));
		//System.out.println("<b>"+String.join("</b><b>",sArr)+"</b>");
		
		
		
		
		
		
		

		//검색어 : keyword, searchWord
		//String keyword = "main";
		//s.contains(keyword);
		//찾는 문자열의 위치값 확인
		
		
		

		/*
		int index = -1;

		//if ((index = s.indexOf(keyword)) != -1) {
		if ((index = s.lastIndexOf(keyword)) != -1) {
			System.out.println("찾는 문자열이"+index+ "위치에 있다");

			//main -> 메인 수정
			System.out.println(s.substring(0,index)+"메인"+s.substring(index+keyword.length()));//방법1
			System.out.println( s.replace("main", "메인"));//방법2



			System.out.println( s.replaceAll("Ic|ic", "아이시"));//방법3
			System.out.println( s.replaceAll("(i|I)c", "아이시"));//방법3
			System.out.println( s.replaceAll("[iI]c", "아이시"));//방법3
			System.out.println( s.replaceAll("(?i)ic", "아이시"));//방법3
			System.out.println( s.replaceFirst("(?i)ic", "아이시"));//방법3




		} else {
			System.out.println("찾는 문자열이 없다");
		}

		 */


		//유무확인
		/*
		if (s.contains(keyword)) {
			System.out.println("찾는 문자열이 있다");

		} else {
			System.out.println("찾는 문자열이 없다");

		}
		 */

		//앞뒤에 공백제거
		//s= s.trim();
		//System.out.println("["+s+"]");


		//한문자씩
		//char [] cArr = s.toCharArray();
		//String t = String .valueOf(cArr);

		//		String name = new String("홍길동");
		//		String name = "홍길동";
		/*
		 int length =  s.length();
		 System.out.println("1. 문자열 길이"+ length);


		 char third = s.charAt(2);
		 System.out.println("2. 세번째 한 문자 :"+third);


		String su = s.toUpperCase();
		System.out.println(su);
		String sl = s.toLowerCase();
		System.out.println(sl);


		String regex = "[\\s()]";
		String [] sArr = s.split(regex, 3);
		System.out.println(Arrays.toString(sArr));
		 */


	}//main
}//class
