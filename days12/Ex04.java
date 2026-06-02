package days12;

/**
 * @author 양인석
 * @date 2026. 5. 27. 오전 7:25:48
 * @subject  [생성자 (constructor)]
 * @content  위치를 나타낼 때 x좌표, y좌표가 필요하다.
 *           -> 위치를 나타내는 속성 + 메소드를 구현한 클래스 선언 : Point
 *            1) 일종의 메소드이다.
 *            2) 리턴자료형 X, 생성자명 == 클래스명
 *            3) 매개변수가 없는 생성자 : 디폴트(Default) 생성자
 *            4) 생성자는 인위적으로 호출 할수없다.? 언제? 객체 생성할때 자동으로 호출퇸다.
 *            								new Point();
 *            5) 생성자 역할: 필드를 초기화
 *            6) 생성자 오버로딩 가능.
 *            7) 생성자 상속되지 않는다.
 *            8) 생성자가 하나도 존재하지 않을경우
 *                디폴트 생성자는 컴파일러가 컴파일할 때 추가.
 */
public class Ex04 {

	//[접근지정자] [기타제어자] 자료형 필드명 [=초기값];
	public int age =20;
	
	
	
	public static void main(String[] args) {
		//1. Point 객체 선언 : p1
		Point p1 = new Point();
		
		
		/*
		* call stack     heap
		* [0x100번지]    [0][0][dp()0x200번지]
		* [객체주소참조]    [x][y]
		* p1            0x100번지
		* 객체 			인스턴스
		* 
		* 
		* 
		* method area
		* [Point.disPoint() 0x200번지]
		*/
		
		
//		p1.x = 1;
//		p1.y =2;
		p1.dispPoint();
		
		
		//Point p2 선언하고 초기화
		Point p2 = new Point(3,4);
//		p2.x = 3;
//		p2.y =4;
		
		
		//객체명.메소드
//		p2.dispPoint();
		
		
		
		//생성자 1 선언 X
//		p3.dispPoint(100);

	} // main


} // class








