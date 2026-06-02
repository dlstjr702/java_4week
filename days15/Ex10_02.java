package days15;


/**
 * @author 양인석
 * @date 2026. 6. 1. 오전 9:01:35
 * @subject 
 * @content 
 */


public class Ex10_02{

	public static void main(String[] args) {



		Point p1 = new Point(1,2);

		//복제
		//Unhandled exception type CloneNotSupportedException
		Point p1Clone;
		
		try {
			p1Clone = (Point) p1.clone();
			System.out.println(p1Clone);
			
		} catch (Exception e) {
		
			System.out.println(e.toString());
		}
		
		System.out.println("END");

	} // main



}//class




class Point extends Object implements Cloneable {// 안에 아무것도 없는코드는 복제할수있는 여부를 확인하려고함

	int x;
	int y;

	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}



	@Override
	public boolean equals(Object obj) {  

		if (obj != null && obj instanceof Point) {
			Point p = (Point)obj;
			return this.x == p.x && this.y == p.y;
		} // if

		return false;
	}



	@Override
	public String toString() {
		return String.format("(x=%d,y=%d)", this.x, this.y);
	}




	@Override
	protected Object clone() throws CloneNotSupportedException {


		//		return super.clone();

		Object obj= null;
		obj = super.clone();
		return obj;
		
	}





}










