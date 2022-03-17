package chap08.book.exercise.p384;

public class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("마이스퀴다오에서검색");
		
	}
	@Override
	public void insert() {
		System.out.println("마이스퀴다오에서삽입");
		
	}
	@Override
	public void update() {
		System.out.println("마이스퀴다오에서수정");
	}
	@Override
	public void delete() {
		System.out.println("마이스퀴다오에서삭제");
		
	}
}
