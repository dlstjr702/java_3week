package days10;

import java.util.Arrays;

/**
 * @author 양인석
 * @date 2026. 5. 22. 오전 9:02:38
 * @subject 
 * @content 
 *  
 */

public class Ex09_02 {

	public static void main(String[] args) {

		int [][]m = {
				{1,2,3,4},
				{5,6,7,8}
		};
		int [] n = new int[8];
		
		//2차원  -> 1차원 배열 이동
		
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[i*4+j] = m[i][j];
			}
		}
		
		
		
		System.out.println(Arrays.toString(n));
		
		
		
		
	} // main

} // class
