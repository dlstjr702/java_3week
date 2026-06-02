package days12;

public class Student {

	//필드
	public int no;
	public String name;
	public int kor,eng,math,tot,rank,wrank;
	public double avg;





	//메소드
	public String getInfo() {
		return String.format("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d"
				, no
				, name 
				, kor , eng , math, tot 
				, avg , rank, wrank);
	}



}//class
 