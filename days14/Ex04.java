package days14;


/**
 * @author 양인석
 * @date 2026. 5. 29. 오전 9:06:49
 * @subject 
 * @content
 * 
 */

public class Ex04 {

	//필드
	// - 필드중에서도 인스턴스 변수
	// - 클래스(static) 변수  
	public static final double PI;

	static {
		PI = 3.141592;
	}
	
	//	{ 초기화블록
	//	 PI = 3.141592;	
	//	}
	
	
	public static void test(final int n) {
		
	}


	public static void main(String[] args) {

		/*
		 * [ final 키워드 설명 ]
		 * 1. final + 변수 앞에 : 상수
		 *      - 지역변수
		 *      - 인스턴스 변수
		 *      - 클래스 변수 
		 *      
		 *      
		 *2. final + 클래스 앞에
		 * 
		 * */

		//		final double PI = 3.141592;

		//		PI = 3.14


	} //main

}//class



//final class Parent{
class Parent{
	public void test1() {
		System.out.println(">P.test1()....");
	}
	
	
	public final void test2() {//자식이 재저의 할 수 없느 최종메소드
		System.out.println(">P.test2()....");
	}
	
	
}


class Child extends Parent{
	
	@Override
	public void test1() {
		System.out.println(">C.test1()....");
	}
	
	/*
	@Override
	//void test2 
	public void test2() {
		System.out.println(">C.test2()....");
	}
	
	*/
}




