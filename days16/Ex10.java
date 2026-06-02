package days16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  날짜 + 시간을 다루는 클래스
 * @content  jdk1.0 : Data
 * 			 jdk1.1 : Calendar
 * 			 jdk1.8 : java.time 패키지 안에 다양한 하위 패키지와 클래스 추가
 */

public class Ex10 {
	public static void main(String[] args) {


		Date d = new Date();

//		System.out.println(d.toLocaleString());
//		System.out.println(d.getYear()+1900);
//		System.out.println(d.getMonth()+1);
//		System.out.println(d.getDate());
//		System.out.println(d.getHours());
//		System.out.println(d.getMinutes());
//		System.out.println(d.getSeconds());



		//1780379289537
//		System.out.println(d.getTime());   //long 1970.1.1 0:0:0 ~ms
//		System.out.println( "일월화수목금토".charAt( d.getDay() ));



		//개강일로부터 오늘날짜까지 몇일이 지났는지
		//26.5.11 
		//26.6.2
		
		Date startDate = new Date(2026-1900,5-1,11);
		System.out.println(startDate.toLocaleString());
		
		Date today = new Date();
		System.out.println(today.toLocaleString());
		
		long diff = today.getTime() - startDate.getTime();
		
		System.out.println(diff + "ms");
		System.out.println(diff/1000 + "s");
		System.out.println(diff/1000/60 + "m");
		System.out.println(diff/1000/60/60 + "h");
		System.out.println(diff/(1000*60*60*24) + "day");
		
		
		
		//[생각] startDate ~today 요일 : 토,일
		//휴일 등록한 날짜 배열
		Date [] holidays = {
				new Date(2026-1900,5-1,25),
				new Date(2026-1900,6-1,3),
				
		};
		
		

		


	} // main

}//class

