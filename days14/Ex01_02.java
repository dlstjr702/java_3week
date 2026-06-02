package days14;

import java.util.Arrays;

/**
 * @author 양인석
 * @date 2026. 5. 29. 오전 9:06:49
 * @subject 
 * @content
 */

public class Ex01_02 {

	public static void main(String[] args) {
		//시간복작보(처리능력)
		String  n = "publicStaticVoidMainStringArgs";

		
		//countArr[0]='A'
		//countArr[25]='Z'
		int [] countArr = new int[26];
		char [] nArr = n.toUpperCase().toCharArray();
		for (int i = 0; i < nArr.length; i++) {
			int index = nArr[i]-65;
			countArr[index]++;
		}
		
		System.out.println(Arrays.toString(countArr));
		
		
	} //main



	public static void stringToArray(String str, int[] arr) {
		char x;
		for(int i=0;i<str.length();i++) {
			x = str.charAt(i);
			int a = 'Z'-Character.toUpperCase(x);
			arr[a]++;
		}      
	}

	public static boolean isEqualArray(int[] arrA, int[] arrB) {
		for(int i=0;i<arrA.length;i++) {
			if(arrA[i] != arrB[i]) return false;
		}
		return true;
	}

}//class
