package days14;



/**
 * @author 양인석
 * @date 2026. 5. 29. 오전 9:06:49
 * @subject  추상화
 * @content  - 추상 메소드, 추상 클래스
 *           - 공통적인 부분(멤버)만을 미리 선언한 클래스
 *           
 */

public class Ex06 {



	public static void main(String[] args) {

		//Cannot instantiate the type Employee 객체를 생성할수 없는 추상클래스라오류
		//Employee emp1 = new Employee("오수빈","서울 강남구","010-1234-1234","2026-10-25");
		//emp1.dispEmpInfo();


		Employee emp1 = new Regular("이시연","서울 강남구","010-1234-1234","2026-10-25",5000);
		emp1.getPay();


	} //main 




}//class

