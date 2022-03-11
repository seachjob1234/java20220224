package chap06.book.exercise.p16;

public class PrinterExample {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10); //f3하면 필드에 식나옴.
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	
	}
}
