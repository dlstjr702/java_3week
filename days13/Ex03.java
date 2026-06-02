package days13;


/**
 * @author 양인석
 * @date 2026. 5. 28. 오전 9:01:34
 * @subject  정적 멤버 = 정적 필드 + 정적 메소드
 * @content            static   static
 *       static {//블럭  }
 *       
 *       
 *       
 *       저축클래스 선언
 */

public class Ex03 {

	public static void main(String[] args) {

		/*
	      Ex03 obj = new Ex03();
	      obj.disp();
		 */

		// Ex03.disp();

		disp();

		Math.max(2,3);
		System.out.println();      

//		Random rnd = new Random();
//		Scanner scanner = new Scanner(System.in);

	} // main

	public static void disp() {
		System.out.println("> disp() 호출됨.");
	}

}//class



