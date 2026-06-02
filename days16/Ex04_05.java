package days16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  now(), of() 
 * @content  with(), plusXXX()
 * 			 minus(),minusXXX()
 * 
 */

public class Ex04_05 {
	public static void main(String [] args) {

		
		
		//[2]
		LocalTime t = LocalTime.now();
		System.out.println(t); // 17:24:14.793426700
		// 초단위 밑으로는 절삭...
		
		t = t.truncatedTo(ChronoUnit.SECONDS);
		System.out.println(t); //17:25:59
		
		
		t = t.truncatedTo(ChronoUnit.MINUTES);
		System.out.println(t); //17:26
		
		
		
		
		
		
		/* [1]
		LocalDate now = LocalDate.now();
		//이번 달 마지막 날짜가 몇일까지 있는지 ?
		
		System.out.println(now);//2026-06-02
		now = now.withDayOfMonth(1);
		System.out.println(now);//2026-06-01
		now = now.plusMonths(1);
		System.out.println(now);//2026-07-01
		now = now.minusDays(1);
		System.out.println(now);//2026-06-30

		
		System.out.println(now.getDayOfMonth());//30
		 */


	}//main

}//class
