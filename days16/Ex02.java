package days16;


/**
 * @author 양인석
 * @date 2026. 6. 2. 오전 9:00:24
 * @subject 
 * @content 
 * 2. StringBuffer 클래스   - 멀티 스레드에 안전하다( == 동기화처리가안전하다)
 * 3. StringBuilder 클래스  - 
 */

public class Ex02 {
	public static void main(String [] args) {
		// String: 수정, 삭제, 삽입  X
		//      String s = "TODO Auto-generated method stub";
		//      int index = s.indexOf("generated");
		//      
		//      System.out.println( s.substring(0, index + "generated".length()) + " 삽입" + s.substring(index + "generated".length()) );


//		testStringBuilderAppend();
		
		
		
		StringBuilder sb = new StringBuilder("public static void main(String [] args) {");
		sb.append("끝에 문자열 연결");
		sb.delete(1, 5);
		sb.replace(0, 2, "바꿈");
		sb.insert(2, "삽입");
		sb.reverse();
		System.out.println(sb.toString());
		System.out.println("END");

	}//main

	/*
	public static void testStringAppend() {

		//>> 처리 시간 :  276853613100ns
		long start = System.nanoTime();

		String s = "a";
		for (int i = 0; i < 2000000; i++) {
			s += "a";
		}

		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  " + (end-start)+"ns");
	}//testStringAppend
	 */

	public static void testStringBuilderAppend() {

		//>> >> 처리 시간 :  7413200ns
		long start = System.nanoTime();
		StringBuilder sb = new StringBuilder("a");
		for (int i = 0; i < 2000000; i++) {
			sb.append("a");
		}

		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  " + (end-start)+"ns");
	}//testStringAppend



}//class
