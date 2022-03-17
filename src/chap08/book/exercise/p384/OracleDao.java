package chap08.book.exercise.p384;

public class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("오라클db에서 검색");
		
	}
	@Override
	public void insert() {
		System.out.println("오라클db에서 삽입");
		
	}
	@Override
	public void update() {
	System.out.println("오라클 db에서 수정");
		
	}
	@Override
	public void delete() {
		System.out.println("오라클 db에서 삭제");
	}
		
}
