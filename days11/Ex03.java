package days11;

/**
 * @author 양인석
 * @date 2026. 5. 26. 오전 8:54:52
 * @subject 
 * @content
 */

public class Ex03 {

	public static void main(String[] args) {
		
		
 		Car myCar =null; //변수, 지역변수, 참조변수, 객체명
		myCar = new Car();
//		myCar.name = "k9";
		
		
		testInstance(myCar);
		
	
		
		
	}//main

	private static void testInstance(Car myCar) {
		myCar.name="K3";
		myCar.dispCarInfo();
		
	}

}//class
