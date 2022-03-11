package chap06.book.exercise.p17;

public class PrinterExample {
	public static void main(String[] args) {
		Printer p1 = new Printer();
		Printer.println(10); //ctrl 1 로 만들어줌
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}
}
