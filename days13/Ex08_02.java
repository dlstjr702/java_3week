package days13;

import java.util.Date;

/**
 * @author 양인석
 * @date 2026. 5. 28. 오전 9:01:34
 * @subject 
 * @content
 *   
 */

public class Ex08_02 {

	public static void main(String[] args) {

	
		
		MyDate d = new MyDate();
		System.out.println(d.toLocaleString());
		
		
		d.printDate();

	} // main

}//class



class MyDate extends Date{
	//필드
	//생성자
	//메서드
	
	
	public void printDate() {
		System.out.println(this);// MyDate를가리키는 this
	}
	
	
}
