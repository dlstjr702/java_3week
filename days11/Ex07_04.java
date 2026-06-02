package days11;

import java.awt.Point;

/**
 * @author 양인석
 * @date 2026. 5. 26. 오전 8:54:52
 * @subject 클래스의 복제(clone)- 얉은 복제/깊은 복제 
 * @content   
 */

public class Ex07_04 {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.x = 1;
		p1.y = 2;
		
		//[1][2]     p1[0x100번지]
		//0x100번지
		
		Point p2 = new Point();
		p2.x = p1.x;
		p2.y = p1.y;
		
	}//main

}//class


