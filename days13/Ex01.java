package days13;

import days12.Point;

/**
 * @author 양인석
 * @date 2026. 5. 28. 오전 9:01:34
 * @subject 
 * @content
 */

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * 1. this 키워드
		 *    - 현재 객체의 자기 자신을 가리키는 참조변수
		 *    - 스택      힙
		 *  [0x100번지]   [x][y]    [0x100번지]
		 *      p		0x100번지     this
		 *      객체      인스턴스
		 *      참조변수
		 *      
		 *      
		 * 2. this의 3가지 용도
		 * 		1) 멤버를 가리킬 때의 this의 용도
		 * 		2) 생성자에서 또 다른 생성자를 호출 할 때의 this 용도
		 * 		3) 단독 (홀로) 사용될 때의 this 용도
		 *         - 매개변수로 사용될때  disPoint(this)   Ex01_02.java
		 *         - 리턴값   return this   Ex01_03.java
		 * 
		 * 
		 * */
	
		
		Point p = new Point(10);
		p.dispPoint();
		
	}//main 
	
}
