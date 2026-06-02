package days14;

/**
 * @author 양인석
 * @date 2026. 5. 29. 오전 9:06:49
 * @subject 
 * @content  
 */

public class Ex10 {


	public static void main(String[] args) {

		// JDBCDriver  인터페이스
		//MySQlDriver  클래스
		//OracleDriver 클래스
		//MSSQLDriver 클래스
		
		JDBCDriver con = new MySQLDriver();
		con.open();
		
		
		
		con.select();
		con.insert();
		con.update();
		con.delete();
		
		
		
		con.close();
			

	} //main 


}//class


