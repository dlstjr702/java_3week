package days12;

import java.util.Arrays;

/**
 * @author 양인석
 * @date 2026. 5. 27. 오전 7:25:48
 * @subject  1.기본형 매개변수와 참조형 매개변수
 * @content  2. 기본형 리턴자료형 과 참조형 리턴자료형
				Point 클래스 사용
 */
public class Ex05_02 {


	public static void main(String[] args) {
//		int [] m = {1,2,3};
//		
//		int[] n = doubleM(m);
//		System.out.println(Arrays.toString(n));
		
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(3,4);
		
//		Point p3 = p2.plusPointpoint(p1);
//		p3.dispPoint();
		
		p2.plusPoint(p1).dispPoint();
		


	} // main





	// [기본형 리턴자료형 ] 
	public static int sum(int a , int b) {
		return a+b;
	}


	// [참조형 리턴자료형 ] 
	/*[1]
	private static int[] doubleM(int[] m) {
		int [] result = new int[m.length];
		
		
		for (int i = 0; i < m.length; i++) {
			result[i] = m[i]*2;
		}
		
		
		return result;
	}
	*/
	
	
	private static int[] doubleM(int[] m) {
		int[] result= Arrays.stream(m).map(v->v*2).toArray();
		
		return result;
	}
	
	


} // class








