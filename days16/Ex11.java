package days16;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  날짜 + 시간을 다루는 클래스
 * @content  jdk1.0 : Data
 * 			 jdk1.1 : Calendar
 * 			 jdk1.8 : java.time 패키지 안에 다양한 하위 패키지와 클래스 추가
 */

public class Ex11 {
	public static void main(String[] args) {


		//1. Calendar -> Date 변환
		Calendar c = Calendar.getInstance();
		Date d =c.getTime();//Date 리턴자료형
		
		
		//2. Date  ->  Calendar변화
		c.setTime(d);
		
		

	} // main

}//class

