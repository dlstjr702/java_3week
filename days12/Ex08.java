package days12;

/**
 * @author 양인석
 * @date 2026. 5. 27. 오전 7:25:48
 * @subject  [this 키워드 설명]
 * @content  

 */
public class Ex08 {


	public static void main(String[] args) {
		/*
		 * 1. this 정의
		 * 	   - 현재 객체 자기 자신을 가리키는 참조변수 
		 * 
		 * int i = 10; //참조변수
		 * int[] m = 10; //변수, 지역변수, 참조변수,배열
		 * Person p = 10; //변수, 지역변수, 참조변수,객체
		 * 
		 * 2.
		 * 
		 * 
		 * */
		
		Employee emp1 = new Employee();
		emp1.dispName();
		
		
		Employee emp2 = new Employee();
//		emp2.name= "홍길동";
		emp2.setName("홍길동");
		emp2.dispName();

	} // main


} // class


// 사원 클래스
class Employee{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void dispName() {
		System.out.println(this.name);
	}
	
	
	
	
}








