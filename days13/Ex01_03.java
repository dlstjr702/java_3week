package days13;



/**
 * @author 양인석
 * @date 2026. 5. 28. 오전 9:01:34
 * @subject 
 * @content
 * 3) 단독 (홀로) 사용될 때의 this의 용도
 *      - 리턴값:   return this; 
 */

public class Ex01_03 {

	public static void main(String[] args) {


		Point p1 = new Point(1,2);
		Point p2 = new Point(10,20);
		p1.dispPoint();
		p2.dispPoint();
		
//		p1.plusPoint(p2);
//		p1.dispPoint();
		
		
		p1.plusPoint(p2).dispPoint();
		

	}//main 

}//class



class Point{
	private int x;
	private int y;


	public Point(int x, int y) {
		//		super();
		this.x = x;
		this.y = y;
		System.out.println("> Point 생성자 2호출됨.");
	}



	//디폴트 생성자
	public Point() {
		System.out.println("> Point 디폴트생성자 호출됨.");
	}




	//매개변수 생성자 2개
	// getter, setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}



	//메소드  : 두 좌표를 더하는 메소드
	public Point plusPoint(Point p) {
		this.x  += p.x;
		this.y  += p.y;
		return this;
	}


	//메소드  : 좌표를 출력하는 메소드
	public void dispPoint() {
		System.out.printf("> x= %d , y= %d\n",this.x, this.y);
	}







}



