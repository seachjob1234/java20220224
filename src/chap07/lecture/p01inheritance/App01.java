package chap07.lecture.p01inheritance;

public class App01 {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.cpu = "팬티엄";
		com1.ram = "32g";
		com1.ssd = "1tb";
		com1.executeGame();
		
		QuantumComputer com2 = new QuantumComputer();
		com2.cpu = "양자cpu";
		com2.ram = "itn";
		com2.ssd = "32tn";
		com2.executeGame();
		com2.executeQuantum();
		System.out.println();
	}
}
