package days15;

public interface Engine {



	//추상 메서드
	public abstract void moreFuel(int fuel) ;

	void lessFuel(int fuel) ;

	void stop() ;


	//2036 터보기능 
	default void turbo() {
		System.out.println("성능향상된 기본 터보 기능 구현..");//오버라이딩 됨
	};

	//새로운 기능 추가 
	static void test() {
		System.out.println("10년 지난 후에 새로운 기능의 메소드를 추가...");
	}


}
