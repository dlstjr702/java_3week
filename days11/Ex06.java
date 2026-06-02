package days11;

/**
 * @author 양인석
 * @date 2026. 5. 26. 오전 8:54:52
 * @subject 가변인자 (== 가변 길이의 매개변수) 
 * @content
 */

public class Ex06 {

	//중첩 (inner) 클래스 선언할 때 : protected, private 접근지정자 사용가능
	protected class InnerEx06{
		
	}
	
	
	
	public static void main(String[] args) {
		
		/*
		 * 1. 클래스 앞에 사용하는 접근지정자
		 * 	1) public     활성화
		 * 	  - 패키지 내/외부에서 사용(참조, 상속) 가능
		 * 
		 * 	3) (default)  활성화
		 *  	-같은 패키지 내부에서만 사용(참조, 상속) 가능.
		 */ 
		
		Sample s  = new Sample();
		
		
		
		 /* 
		 * 중첩(내부 inner)클래스를 선언할때만 사용할수있다.
		 *  2) protected  비활성화 
		 * 	4) private    비활성화
		 * 
		 * 
		 * 2. 멤버(필드, 메서드) 앞에 사용하는 접근지정자
		 * 	1)public      : 패키지 내/외부 어디서나 접근(참조) 가능하다.
		 * 	2)protected   : default + 상속
		 * 	3)(default)  : 패키지 내부에서만 접근 가능하다.
		 * 	4)private	  : 같은 클래스 내에서만 접근 가능
		 * 
		 * */
		
		
		//public or default : Time 객체를 생성해서 t1이라고 하자...  Ex06 같은 패키지 내부
		Time t1 = new Time();
		// 객체명.필드, 객체명.메서드()사용...
		
		
		
		//싱글톤
		
		
	}//main
	

}//class




