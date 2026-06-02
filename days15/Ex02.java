package days15;

import java.io.Serializable;

//import days12.Point;

/**
 * @author 양인석
 * @date 2026. 6. 1. 오전 9:01:35
 * @subject  인터페이스, 클래스 예제. 
 * @content  
 */

public class Ex02 implements Serializable{

	public static void main(String[] args) {

		

	}//main

}//class




// (군사) 사병, 탱크... 단일체
abstract class Unit{

	// 필드 : 유닛의 위치
	//	Point p;
	int x;
	int y; 
	int currentHP;// 현재 유닛의 체력




}//class



//하늘 유닛
//땅 유닛
//바다 유닛 X
class AirUnit extends Unit{

}

class GroundUnit extends Unit{

}

interface Movable{
	void move(int x, int y);
}


interface Attackable{
	void attack(Unit unit);//매개변수 다형성
}


// 인터페이스 끼리 상속이가능하고 키워드는 extends 사용한다.
// 인터페이스는 다중상속이 가능하다.
interface Fightable extends Movable, Attackable{


}


class Fighter implements Fightable{


	@Override
	public void move(int x  , int y) {
		//구현된
	}

	@Override
	public void attack(Unit unit) {
		//구현된
	}

}

class Tank extends GroundUnit implements Fightable,Repairable{

	@Override
	public void move(int x  , int y) {
		//구현된
	}

	@Override
	public void attack(Unit unit) {
		//구현된
	}

}


//기본 보병 유닛
class Marine extends Unit implements Fightable{

	@Override
	public void move(int x  , int y) {
		//구현된
	}

	@Override
	public void attack(Unit unit) {
		//구현된
	}

}


class DropShip extends AirUnit implements Fightable, Repairable{

	@Override
	public void move(int x  , int y) {
		//구현된
	}

	@Override
	public void attack(Unit unit) {
		//기관총, 미사일
	}

}



interface Repairable{
	//상수, 추상메서드 선언X
}


//SCV 수리 기능을 가진 클래스
class SCV extends GroundUnit implements Repairable{

	//수리하는 메소드 : 대상 (수송선, 탱크, 마린 X)	
	
	void repair(Repairable target) {
		if (target instanceof Tank) {
			Unit u = (Unit)target;// 다운캐스팅
			// 탱크 수리 처리
			
		} else if(target instanceof DropShip){
			DropShip ds = (DropShip)target;
		}
	}
	
	/*
	void repair(DropShip unit) {

	}

	void repair(Tank unit) {

	}

	void repair(SCV unit) {

	}
	*/


}










