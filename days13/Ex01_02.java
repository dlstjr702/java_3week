package days13;



/**
 * @author 양인석
 * @date 2026. 5. 28. 오전 9:01:34
 * @subject 
 * @content
 * 3) 단독 (홀로) 사용될 때의 this의 용도
 *      - 리턴값:   return this; 
 */

public class Ex01_02 {

	public static void main(String[] args) {

		Calc myCalc = new Calc();
		myCalc.btnExec.btnExec_click();

	}//main 

}//class



// 계산기 클래스 선언
class Calc{

	//	Button [] btnArr = new Button[24];
	Button btnExec = null;


	public Calc() {
		init();
	}


	//생성자에서 필드를 초기화하는 메소드
	private void init() {
		this.btnExec = new Button("[=]",this);
	}




	//계산기 화면에 출력을 담당하는 메소드
	public void  execDisp(String result) {
		System.out.printf("[화면결과 출력 ] %s \n",result);
	}

}



// 버튼
class Button {
	String text; //
	Calc calc;

	//디폴트 생성자
	public Button() {}
	public Button(String text) {
		this.text = text ;// this1의 용도
	}


	public Button(String text, Calc calc) {
		this(text);  // this의 2 용도
		this.calc =calc;
	}




	//버튼을 클릭할때 동작을 처리하는 메소드(== 동작)
	public void btnExec_click() {
		String result = "3+5=8";

		//Calc 객체 얻어오는 방법
		this.calc.execDisp(result);
	}

}
