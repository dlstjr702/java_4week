package days16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject 날짜를 형식화하는 클래스 : SimpleDateFormat  
 * @content format()
 * 			parse() 
 */

public class Ex13 {
	public static void main(String[] args) {
		
		
		//[2]
		Calendar c = Calendar.getInstance();
		String pattern = "yyyy/MM/dd a hh:mm:ss.SSS E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strDate = sdf.format(c.getTime());
		System.out.println(strDate);
		
		
		
		/*[1]
		Date d = new Date();
		
		System.out.println(d.toLocaleString());
		System.out.println(d.toGMTString());
		
		// 출력형식)  2025/02/28 04:48:00 금요일
		String pattern = "yyyy/MM/dd a hh:mm:ss.SSS E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strDate = sdf.format(d);
		System.out.println(strDate);
		*/

	} // main

}//class

