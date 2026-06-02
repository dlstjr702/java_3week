package days11;

import java.util.Scanner;

/**
 * @author 양인석
 * @date 2026. 5. 26. 오전 8:54:52
 * @subject 한반에 30명 학생의 이름, 국영수총점평균 구하기 
 * @content  ex05 학생클래스
 */

public class Ex09 {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Student[] students = new Student[30];

		int index = 0;
		char con;

		do {

			students[index] = new Student();

			System.out.print("이름 국어 영어 수학 입력 : ");

			students[index].name = scanner.next();
			students[index].kor = scanner.nextInt();
			students[index].eng = scanner.nextInt();
			students[index].math = scanner.nextInt();

			// 학생 객체가 자기 계산
			students[index].calc();

			index++;

			System.out.print("계속 입력 ? ");
			con = scanner.next().charAt(0);

		} while (Character.toUpperCase(con) == 'Y');



		// 출력
		for (int i = 0; i < index; i++) {

			students[i].disp();
		}

		scanner.close();



	} // main


}//class




