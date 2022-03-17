package chap08.book.p384;

public class MySqlDao implements DataAccessObject {
	 
	@Override
	public void select() {
		System.out.println("마이스퀴다오에서 선택");
		
	}
	@Override
	public void insert() {
		System.out.println("마이스퀴다오에서 설치");
		
	}
	@Override
	public void update() {
		System.out.println("마이스퀴다오를 수정");
	}
	@Override
	public void delete() {
		System.out.println("마이스퀴다오를 삭제");
		
	}
}
