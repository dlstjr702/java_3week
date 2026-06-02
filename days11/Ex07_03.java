package days11;

/**
 * @author 양인석
 * @date 2026. 5. 26. 오전 8:54:52
 * @subject 클래스의 복사(copy) 
 * @content 클래스의 복제(clone) - 얉은 복제/깊은 복제 
 * 						차이점 
 */

public class Ex07_03 {

	
	
	public static void main(String[] args) {

		Point p1 = new Point();

		System.out.printf("> x=%d, y=%d\n", p1.x, p1.y);

		// Call By Reference : 매개변수가 배열, 클래스 객체
		swapXY( p1 );

		System.out.printf("> x=%d, y=%d\n", p1.x, p1.y);
	}//main

	
	
	// Call By Value
	private static void swapXY( Point p) { // Point p = p1 클래스 복사
		System.out.printf(">>> x=%d, y=%d\n", p.x, p.y);
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		System.out.printf(">>> x=%d, y=%d\n",  p.x, p.y);
	}//swapXY
	
	

}//class




class Point{

	int x = 10;
	int y = 20;
	public void printPoint() {
		// TODO Auto-generated method stub
		
	}

}//point




