package days16;

import java.io.FileReader;

public class test {

	public static void main(String[] args) {


		String fileName = ".\\src\\days16\\Ex01.java";


		int [] counts = new int[26];

		try (
				FileReader reader = new FileReader(fileName);   
				){
			int code = -1;
			char one ;
			while (   (code = reader.read()) != -1 ) {
				//	            System.out.println( Integer.toBinaryString(code) );
				one = (char) Character.toUpperCase(code);

				if ( Character.isUpperCase(one) ) {  // 대문자 이니?  65~92
					//System.out.println( one );

					counts[one - 'A']++;

				} // 
				
				if ( Character.isLowerCase(one) ) {  // 대문자 이니?  65~92
					//System.out.println( one );

					counts[one - 'A']++;

				} // 

			} // while

			// 막대그래프 출력
			for (int i = 0, count = 0; i < counts.length; i++) {
				count = counts[i];
				System.out.printf("%c(%d):\t %s\n", i+'A', count,"#".repeat(count));
			} // for

		} catch (Exception e) {
			e.printStackTrace();
		}




	}

}
