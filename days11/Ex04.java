package days11;

import java.util.Arrays;

/**
 * @author 양인석
 * @date 2026. 5. 26. 오전 8:54:52
 * @subject 가변인자 (== 가변 길이의 매개변수) 
 * @content
 */

public class Ex04 {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		int result = calc.sum(1, 2);
		System.out.println(result);


		result = calc.sum(1, 2, 3);
		System.out.println(result);



		int [] m = {1,2,3,4,5,6,7,8,9,10};
		result = calc.sum(m);
		System.out.println(result);


	}//main



}//class





class Calculator{


	//sum()
	//	int sum (int a, int b) {
	//		return a + b;
	//	}

	//sum02
	//	int sum (int a, int b, int c) {
	//		return a + b + c;
	//	}


	//sum03
	//	int sum (int [] m) {
	//		return Arrays.stream(m).sum();
	//	}


	int sum(int...m) {
		return Arrays.stream(m).sum();
	}


	//+ - * /
	int plus() {
		return 0;
	}

}//calculator
