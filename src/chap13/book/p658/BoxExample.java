package chap13.book.p658;

public class BoxExample {
	public static void main(String[] args) {
		Box<String>box1 = new Box<>();
		box1.set("hello");
		String str = box1.get();
		Box<Integer> box2 = new Box<>();
		box2.set(6);
		int valus = box2.get();
	}
}
