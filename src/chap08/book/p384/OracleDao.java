package chap08.book.p384;

public class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("오라클데이터베이스에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("오라클데이터베이스에서 삽입");
	}
	@Override
	public void update() {
		System.out.println("오라클데이서베이스를 수정");
	}
	@Override
	public void delete() {
		System.out.println("오라클 베이스를 삭제");
	}
}
