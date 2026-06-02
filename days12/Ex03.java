package days12;

/**
 * @author 양인석
 * @date 2026. 5. 27. 오전 7:25:48
 * @subject  
 * @content    
 *                    
 *                    
 */
public class Ex03 {

	//(2) 멤버변수, 필드
	int age;   //인스턴스 변수
	static int kor;// 클래스(static)변수
	
	{
		//초기화 블럭 - 지역변수
		int age;
	}
	
	public static void main(String[] args) {
		/*
		 * [자바 변수 종류 : 선언 위치에 따른 종류]
		 * 
		 * 1. (1) 지역변수 - 메소드 안, 초기화 블럭 안, 생성자 안 - 생성시기 : 변수 선언문이 실행될때
		 * 2. 인스턴스 변수 - 클래스안                                : 인스턴스가 생성될 때
		 * 3. 클래스 변수 - 클래스안								  : 클래스가 메모리에 올라갈 때
		 * 
		 * */
	
		//(1)
		int age;
		
		
		
		
		/*
		 * [메모리구조]
		 *  응용프로그램을 실행 -> JRE(JVM) -> OS 응용프로그램이 실행하는데 필요한 메모리를 할당.
		 *  JVM의 용도에 따라 나누어서 관리. 
		 * 1. Method Area
		 *    - 프로그램 실행시 클래스 파일 (.Class)로 부터 읽어들인 클래스에 대한 정보를 저장
		 *    - 클래스(static) 변수
		 *    
		 * 2. Call Stack   호출스택 영역
		 *    - 메소드가 호출할 때 메서드에서 사용할 저장 공간.
		 *    - 지역변수
		 *    
		 * 3. Heap         힙 영역
		 *    - new 연산자에 의해서 .. 저장공간
		 *    - new int[3]    배열생성
		 *    - new Student() 객체 생성
		 *      - 인스턴스 변수
		 * */
		
		
	} // main


} // class








