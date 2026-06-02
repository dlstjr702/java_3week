package days10;

import java.util.Arrays;

/**
 * @author 양인석
 * @date 2026. 5. 22. 오전 9:02:38
 * @subject 
 * @content 
 *  
 */

public class Ex09 {

	public static void main(String[] args) {

		int [] m = { 1,2,3,4,5,6,7,8 };
		int [][] n = new int[2][4];
		
		
		for (int i = 0; i < m.length; i++) {
			n[i/n[0].length][i%n[0].length] = m[i];
		}
		
		System.out.println(Arrays.toString(n[0]));
		System.out.println(Arrays.toString(n[1]));
		
	} // main

} // class
