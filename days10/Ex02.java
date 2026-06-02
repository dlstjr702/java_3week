package days10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 양인석
 * @date 2026. 5. 22. 오전 9:02:38
 * @subject 버블정렬
 * @content 1) 정렬(Sort)
 */
public class Ex02 {

	public static void main(String[] args) {
		int[] m = new Random().ints(1,100).limit(5).toArray();

		System.out.println(m.length);
		System.out.println(Arrays.toString(m));


		int index = m.length;//5

		if (index>=m.length) {
			int [] temp = new int[m.length+3];
			//[배열 m -> temp 배열에 복사]
//			for (int i = 0; i < m.length; i++) {
//				temp[i]=m[i];
//			}//for
			System.arraycopy(m, 0, temp, 0, m.length);
//			Arrays.copyOf(null, index);
			m =temp;
			//	    	  m = new int[m.length+3];
		}//if
		m[index]= 100;

		System.out.println(Arrays.toString(m)); 


	} // main



} // class
