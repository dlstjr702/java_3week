package days11;

/**
 * @author 양인석
 * @date 2026. 5. 26. 오전 8:54:52
 * @subject 
 * @content
 */

public class Ex02 {

	public static void main(String[] args) {
		
		int i = 0 ; //변수, 지역변수
		int [] m = new int[3];  //변수, 지역변수 , 참조변수, 배열명
		
		//변수 선언 형식
		//객체 : 클래스를 자료형으로 선언된 참조변수
		//클래스 : 객체의 설계도
		//인스턴스: 생선된 객체
		
		Car myCar ; //변수, 지역변수, 참조변수, 객체명
		myCar = new Car();
		
		//[dispCarInfo()]코드
		
		//필드, 메서드를 사용하려면 : 객체명.필드명 또는 객체명.메소드명()
		myCar.name = "k9";
		myCar.speed = 200;
		System.out.println(myCar.name);
		
		
		
		myCar.dispCarInfo();
		
		
		
		
		
		
		
		
	}//main

}//class
