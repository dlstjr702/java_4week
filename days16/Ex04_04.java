package days16;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject  Math 클래스 
 * @content   
 * 
 */

public class Ex04_04 {
	public static void main(String [] args) {

		LocalDate [] ldArr = {
				LocalDate.of(2000, 12, 13),
				LocalDate.of(2003, 5, 13),
				LocalDate.of(1998, 6, 3)
		};


		LocalDate today = LocalDate.now();


		//생일이 지났는지 유무 체크해서 출력...
		//today.isAfter(today);
		//today.isBefore(today);
		//today.isEqual(today);


		for (int i = 0; i < ldArr.length; i++) {
			LocalDate ld = ldArr[i]; //2000,12,13
			//ld.withYear(today.getYear());//2026
			ld = ld.with(ChronoField.YEAR,today.getYear());

			System.out.println(ld);
			System.out.println(today.isAfter(today));
			System.out.println(today.isBefore(today));
			System.out.println(today.isEqual(today));
			System.out.println("-".repeat(50));


		}//for
		
		//today.getMonthValue() > ld.getMonthValue()
		//|| (today.getMonthValue() == ld.getMonthValue()
		//&& today.getDayOfMonth() > ld.getDayOfMonth()









	}//main

}//class
