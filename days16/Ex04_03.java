package days16;


import static java.lang.Math.*;

import java.time.LocalTime;
import java.time.temporal.ChronoField;


/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  Math 클래스 
 * @content   
 * 
 */

public class Ex04_03 {
	public static void main(String[] args) {
		//시간 정보를 출력
		LocalTime t = LocalTime.now();
		//LocalTime t = LocalTime.of(h, m, s);
		
		
		
		//16:45:51.398318100
		System.out.println(t);
		
		
		//시간
        System.out.println(t.get(ChronoField.HOUR_OF_DAY));
        System.out.println(t.getHour());
		//분
        System.out.println(t.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(t.getMinute());
		//초
        System.out.println(t.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println(t.getSecond());
		//밀리초
        System.out.println(t.get(ChronoField.MILLI_OF_SECOND));
        
		//나노초
        System.out.println(t.get(ChronoField.NANO_OF_SECOND));
        System.out.println(t.getNano());
		
		 
		
	} // main

}//class
