package days13;

import java.util.Arrays;

public class Quiz {


	public static void main(String [] args) {

		//  10. 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
		String n = "keNik";    //  [][][][][]
		String m = "kKnie";     //  [][][][][]
		
		
		n= n.toLowerCase();
		m= m.toLowerCase();
		
		
		char [] arr1 = n.toCharArray();
		char [] arr2 = m.toCharArray();
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		
	
		if(Arrays.equals(arr1, arr2)) {
			System.out.println(arr1);
			System.out.println(arr2);
			System.out.println("같은 문자열");			
		}else {
			System.out.println(arr1);
			System.out.println(arr2);
			System.out.println("다른문자열");			
		}
		
				
		
	}

}
