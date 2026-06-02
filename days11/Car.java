package days11;


//신형 자동차 클래스 선언
public class Car {
	
	//멤버 == 클래스 (객체)의 구성 요소
	// -멤버변수(필드, field) , 속성(특징)
	String name;	//차이름
	int speed; 		//속도
	int wheelCount; //바퀴수
	
	// -멤버함수(메서드,method), 동작(기능,일)
	public void dispCarInfo() {
		System.out.printf("> 차이름: %s, 속도: %d \n",name, speed);
	}

	
	
	
	
}// class
