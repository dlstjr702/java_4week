package days16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject 
 * @content   
 */

public class Ex01_03 {
	public static void main(String [] args) {

		//.현재 디렉토리
		//..상위 디렉토리

		String fileName = ".\\src\\days16\\학생명단.txt";
		String saveFileName = ".\\src\\days16\\학생명단.html";
		//학생명단.txt 읽어서 학생이름만 출력
		try (
				FileReader in = new FileReader(fileName);
				BufferedReader br = new BufferedReader(in);
				FileWriter out = new FileWriter(saveFileName);
				){
			String name = null;
			
			System.out.println("<ol>");
			out.write("<ol>");
			while((name =br.readLine()) != null) {
				System.out.printf("<li>%s</li>\n",name);
				out.write("<li>"+name+"</li>");
			}
			
			System.out.println("</ol>");
			out.write("</ol>");
			
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		System.out.println("END");


	}//main
}//class
