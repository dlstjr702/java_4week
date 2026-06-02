package days15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 양인석
 * @date 2026. 6. 1. 오전 9:01:35
 * @subject 익명클래스 예제
 * @content 
 */


public class Ex05{

	public static void main(String[] args) {

		String [] s = { "kbs", "sbs", "mbc", "jtbc" };

		System.out.println(Arrays.toString(s));

		// 정렬후 출력


		//오름차순
		//Arrays.sort(s);

		//내림차순
		//Arrays.sort(s, 비교자객체);
		//		Arrays.sort(s,new StringComparator());


		/*
		Arrays.sort(s,new Comparator<String>() {

			@Override
			public int compare(String o1,String o2) {
				return o1.compareTo(o2)*-1;
			}

		});
		 */


		//Arrays.sort(s,(o1,o2) -> o1.compareTo(o2)*-1 );
		
		
		Arrays.sort(s,Collections.reverseOrder());//내림차순하는 명령어





		System.out.println(Arrays.toString(s));




	}//main

}//class




//문자열을 비교하는 비교자(comparator) : 클래스 선언
//class StringComparator implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		String s1 = (String)o1;
//		String s2 = (String)o2;
//		
//		return s1.compareTo(s2)* -1; // s1 s2 음수   s2 s1양수  s1 == s2 0
//	}
//	
//}









