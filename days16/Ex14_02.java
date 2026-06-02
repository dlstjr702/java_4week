package days16;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject   
 * @content 
 */

public class Ex14_02 {
	public static void main(String[] args) {

		//1. 
		LocalDate d = LocalDate.now();
		System.out.println(d.toString());
		System.out.println(d);
		
		
		//년
		System.out.println(d.get(ChronoField.YEAR));
		//System.out.println(d.getYear());
		//월
		System.out.println(d.get(ChronoField.MONTH_OF_YEAR));
		//System.out.println(d.getMonthValue());		
		//일		
		System.out.println(d.get(ChronoField.DAY_OF_MONTH));
		//System.out.println(d.getDayOfMonth());	
		
		
		//요일 : 월(1) 화(2) ... 일(7)
		System.out.println(d.get(ChronoField.DAY_OF_WEEK));
		System.out.println(d.getDayOfWeek());

		
		
		//윤년체크 메소드
		System.out.println(d.isLeapYear());
		
	} // main

}//class

