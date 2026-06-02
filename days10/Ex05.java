package days10;


/**
 * @author 양인석
 * @date 2026. 5. 22. 오전 9:02:38
 * @subject 검색(Search)
 * @content 항목의 집합 중에 특정 항목을 찾아내는것.
 * 			1) 순차검색(Seaquence Search)
 *  		2) 이진 검색 (Binary Search)
 *  
 * 
 */

public class Ex05 {

	public static void main(String[] args) {

		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };

		//Arrays.binarySearch(m,9);

		int n = 111; //찾을 정수


		int index = binarySearch(m,n);
		System.out.println(index);
		//System.out.println(m.length);

	} // main

	private static int binarySearch(int[] m, int n) {
		//1. bottom/top
		//while 조건 bottom == top 마지막
		//2. middle
		//3. m[middle]==n return middle
		//4. m[middle]>n  middle-1 새로운 top
		//5. m[middle]<n  middle+1 새로운 bottom


		int bottom = 0;
		int top = m.length - 1;
		

		while (bottom <= top) {
			
			
			int middle = (bottom + top) / 2;

			// 찾은 경우
			if (m[middle] == n) {
				return middle;
			}

			// middle 값이 더 큰 경우
			else if (m[middle] > n) {
				top = middle - 1;
			}

			// middle 값이 더 작은 경우
			else {
				bottom = middle + 1;
			}
		}//while

		// 못 찾은 경우
		
		return -1;

	}


} // class
