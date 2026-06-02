package days11;

/**
 * @author 양인석
 * @date 2026. 5. 26. 오전 8:54:52
 * @subject 가변인자 (== 가변 길이의 매개변수) 
 * @content
 */

public class Ex05 {

	public static void main(String[] args) {
		
		
		if (args.length != 3) {
			System.out.println("3명의 이름을 입력하세요.");
			return ;
		}


		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d]=%s \n",i , args[i]);
		}
		
		System.out.println("END");
		
		
	}//main
	

}//class




