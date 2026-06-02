package days11;

/**
 * @author 양인석
 * @date 2026. 5. 26. 오전 8:54:52
 * @subject 클래스의 복사(copy) 
 * @content 클래스의 복제(clone) - 얉은 복제/깊은 복제 
 * 						차이점 
 */

public class Ex07 {
	
	
	public static void main(String[] args) {
		
		
		
		
		//Tv객체 선언 및 생성하고
		//개체명.필드명
		//객체명.메소드명()
		Tv t1 = new Tv();
		t1.power();// false -> true
		System.out.println(t1.channel);
		t1.channelUp();
		t1.channelUp();
		t1.channelUp();
		System.out.println(t1.channel);
		t1.power();//true -> fasle
		
		
		System.out.println("END");
		
	}//main
	

}//class




