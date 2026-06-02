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

public class Ex06_tch {

	public static void main(String[] args) throws InterruptedException {

		//변수선언부
		int [][] m = new int [5][5];


		//[1]트리만들기
		// __*
		// _***
		// *****




		//[2]마름모 만들기
		// __*
		// _***
		// *****
		// _***
		// __*




		//		fillM(m);
		//		dispM(m);
		//		fillM2(m);


		magicSquare(m); //홀수 마방진

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%3d]", m[i][j]);
			}
			System.out.println();
		}


	} // main

	private static void magicSquare(int[][] m) throws InterruptedException {

		int v = 1;      
		int row = 0, col = m[0].length/2; // 행, 열
		m[row][col] = v;

		while (v < m.length * m[0].length) {

			if ( v % 5 == 0 ) {
				row++;
			} else {
				col++; row--;
				if (row == -1)  row = m.length-1;
				if (col == m[0].length) col = 0; 
			}

			dispM(m);
			Thread.sleep(1000);
		

			m[row][col] = ++v;

		} // while


	}



	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {//5행
			for (int j = 0; j < m.length; j++) {//5열
				System.out.printf("[%02d]",m[i][j]);
			}//for
			System.out.println();
		}//for
		System.out.println();
	}


} // class
