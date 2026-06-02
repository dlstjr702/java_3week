package days13;

public class BoardDAO {



	// Double-Checked Locking   이중동기화 처리 /이중잠금확인
	private static volatile BoardDAO boardDAO = null;


	private BoardDAO() {

	}

	//synchronized << 동기화 때문에 사용
	public static BoardDAO getInstance() {
		if (boardDAO == null) {
			synchronized (BoardDAO.class) {
				boardDAO = new BoardDAO();
			}
		}
		return boardDAO;
	}




	//CRUD  
	public void create() {
		System.out.println("게시글 작성 ...");
	}

	public void read() {
		System.out.println("게시글 보기 ...");
	}

	public void update() {
		System.out.println("게시글 수정 ...");
	}

	public void delet() {
		System.out.println("게시글 삭제 ...");
	}

}
