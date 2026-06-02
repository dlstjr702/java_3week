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

public class Ex06 {

	public static void main(String[] args) {

		//변수선언부
		int [][] m = new int [5][5];


		//[1]트리만들기
		// __*
		// _***
		// *****
		treeStar(m);







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

	private static void treeStar(int[][] m) {

		for (int i = 0 ; i <= m.length; i++) {//5행

			for (int j = i; j < m.length; j++) {//5열
				System.out.print("*");
			}//for				
			System.out.println();

		}//for

	}//treeStar

	private static void magicSquare(int[][] m) {
		//1의 위치는 0행의 가운데 열이다
		//열증가 행감소
		//5의배수일 경우 행 증가
		//열을 벗어나면 가장작은 행을 벗어나면 가장 큰것


		int n = m.length;

		int row = 0;
		int col = n / 2;

		int num = 1;

		while (num <= n * n) {

			m[row][col] = num;

			// 5의 배수이면 아래로
			if (num % n == 0) {
				row = row + 1;
			}
			else {
				// 기본 이동: 위 + 오른쪽
				row = row - 1;
				col = col + 1;
			}

			// 행 벗어나면 아래로
			if (row < 0) {
				row = n - 1;
			}

			// 열 벗어나면 왼쪽으로
			if (col >= n) {
				col = 0;
			}

			num++;
		}

	}//magicSquare


	private static void fillM2(int[][] m) {

		//		[1]번풀이
		//		for (int i = 0, v= 1; i < m.length; i++) {//5행
		//			for (int j = 0; j < m.length; j++,v++) {//5열
		//				m[j][i] = v;
		//			}//for
		//
		//		}//for

		for (int i = 0; i < m.length; i++) {//5행
			for (int j = 0; j < m.length; j++) {//5열
				m[i][j] = 5 * j + i + 1;
			}//for

		}//for

	}


	private static void fillM(int[][] m) {
		for (int i = 0, v= 1; i < m.length; i++) {//5행
			for (int j = 0; j < m.length; j++,v++) {//5열
				m[i][j] = v;
			}//for

		}//for

	}


	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {//5행
			for (int j = 0; j < m.length; j++) {//5열
				System.out.printf("[%02d]",m[i][j]);
			}//for
			System.out.println();
		}//for

	}

} // class
