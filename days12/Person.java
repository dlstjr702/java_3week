package days12;

import javax.management.RuntimeErrorException;

public class Person {

	//필드
	private String name;
	private int age;
	private boolean gender;

	//setter
	public void setAge(int a) {
		if (a>= 0 && a<= 120) {
			age = a;			
		}else {
			//강제로 에러 메시지를 발생시키자
			throw new RuntimeException("[오류] 나이는 0~120 된다..");
		}//if,els
	}


	//getter
//	public int getAge(int a) {
//		return age;
//	}

	//생성자
	public Person() {


	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public Person(String n , int a, boolean g) {

		name = n;
		age = a;
		gender= g;

	}


	//메소드
	public void dispPerson() {
		System.out.printf("> 이름:%s , 나이: %d살 , 성별 :%s \n",name , age , gender?"남자":"여자");
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	



}//class
