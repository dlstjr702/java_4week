package days16;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  Calendar 추상클래스
 * @content  
 * 			 
 */

public class Ex10_02 {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		//Calendar c = new GregorianCalendar();
	
		System.out.println(c.get(1));// 2026
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(c.get(Calendar.HOUR));            //3시
		System.out.println(c.get(Calendar.HOUR_OF_DAY));     //15시
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.MILLISECOND));

		
		//일(1)  월(2) ~ 토 (7)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		
		//c 객체의 그 달의 마지막 날짜가 몇일 까지?
		
		int lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		
		
		
		
	} // main

}//class

