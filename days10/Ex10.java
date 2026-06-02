package days10;


import java.util.Date;
import java.util.Scanner;

import com.util.Graphic2D;



/**
 * @author 양인석
 * @date 2026. 5. 22. 오전 9:02:38
 * @subject 달력만들기
 * @content 
 *  
 */

public class Ex10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int year, month;


		System.out.printf("> 년도, 월 입력 : ");// 2026 5
		year = scanner.nextInt();
		month = scanner.nextInt();// String regex = "^([1-9]||1[0-2])$

		creatCalendar(year,month);


	} // main


	//달력함수
	private static void creatCalendar(int year, int month) {
		//[1] 년도, 월의 1일 무슨요일? 금
		int dayOfWeek = getDayOfWeek(year,month,1);


		//[2] 년도, 월이 몇일 까지 있는지 ? 31
		int lastDayOfMonth = getLastDayOfMonth(year,month); 

		//[3] 달력 출력
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month );
		Graphic2D.drawLine(60, '-');
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c",week.charAt(i));
		} //for

		System.out.println();
		Graphic2D.drawLine(60, '-');
		
		// 1위치를 잡기 위해 \t 해당 요일
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		} //for
		
		for (int i = 1; i < lastDayOfMonth; i++) {
			  System.out.printf("\t%s",isToday(year,month,i) ? "("+i+")" : i+"");

			    // 토요일이면 줄바꿈
			    if ((dayOfWeek + i) % 7 == 0) {
			        System.out.println();
			   }
		} //for
	
		
		System.out.println();
		Graphic2D.drawLine(60, '-');			


	}//creatCalendar



	//오늘날짜 표시
	private static boolean isToday(int year, int month, int date) {
		Date d = new Date();// 현재 시스템의 날짜+시간 객체
		
		
//		d.after(d);
//		d.before(d);
//		d.equals(d);
		
		int currentYear = d.getYear()+1900;
		int currentMonth = d.getMonth()+1;
		int currentDate = d.getDate();
		
		
		if (currentYear == year && currentMonth == month && currentDate ==date) {
			return true;
		}
		
		
		return false;
	}


	//[2] 풀이
	//1. 요일 반환 메서드 선언
	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year-1900, month-1, date);
		//		d.getYear();
		int dayOfWeek = d.getDay();//0(일)1(월)2(화)3(수)4(목)5(금)6(토)
		//		System.out.println("일월화수목금토".charAt(dayOfWeek));


		return dayOfWeek;
	}

	//2. 마지막 날짜 반환 메서드 선언
	private static int getLastDayOfMonth(int year, int month) {
		int lastDayOfMonth=0;
		Date d = new Date(year-1900, month-1, 1);

		//1) 한달 더하기 2026.6.1
		d.setMonth(d.getMonth()+1);
		//		System.out.println(d.toLocaleString());


		//2) 하루를 빼기 2026.6.1
		d.setDate(d.getDate()-1);
		System.out.println(d.toLocaleString());


		//3) 날짜 (일) 얻어오기


		return lastDayOfMonth = d.getDate();

	}//getLastDayOfMonth

	//1. 요일 반환 메서드 선언
	//2. 마지막 날짜 반환 메서드 선언
	/* [1] 풀이
	//1. 요일 반환 메서드 선언
	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year-1900, month-1, date);
		//		d.getYear();
		int dayOfWeek = d.getDay();//0(일)1(월)2(화)3(수)4(목)5(금)6(토)
		//		System.out.println("일월화수목금토".charAt(dayOfWeek));


		return dayOfWeek;
	}

	private static int getLastDayOfMonth(int year, int month) {

		int lastDayOfMonth = switch (month) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		//		default -> 28;
		default ->{
			boolean isLeapYear =
					(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			//yield 키워드 JDK14 부터 값을 반환할때 사용하는 예약어
			//{} 블럭 안에 코딩을 한 후 값을 반환할 때 ..
			yield isLeapYear ? 29 : 28;
		  }
		};//swith

		System.out.println(lastDayOfMonth);

		return lastDayOfMonth;


	}//getLastDayOfMonth
	 */







} // class 
