package days12;

/**
 * @author 양인석
 * @date 2026. 5. 27. 오전 7:25:48
 * @subject  getter, setter 설명
 * @content  Person 클래스

 */
public class Ex07 {


	public static void main(String[] args) {

		Person p1 = new Person();
		//The field Person.name is not visible << 접근지정자때문에 허용이 안돼서
		//p1.name = "홍길동";
		//p1.age = 20;

		p1.setAge(20);

		//System.out.println(p1.getAge());
		//p1.dispPerson();


	} // main


} // class








