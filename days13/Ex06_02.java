package days13;



/**
 * @author 양인석
 * @date 2026. 5. 28. 오전 9:01:34
 * @subject 
 * @content
 *   
 */

public class Ex06_02 {

	public static void main(String[] args) {

		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document();
		//The constructor Document(String) is undefined
		Document doc4 = new Document("자바문서.txt");
		Document doc5 = new Document();

	} // main

}//class



// 문서
class Document{
	
	String fileName;
	static int count = 1;
	
	
	
	Document() {
		//this()명시적으로 생성자를 호출하는동안에는 this,super를 참조할수없다.
		this(String.format("Noname%d.txt", count++));
		//String fileName = String.format("Noname%d.txt", this.count);
	}



	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n",this.fileName);
	}
	
}


