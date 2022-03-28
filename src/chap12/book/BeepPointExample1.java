package chap12.book;

import java.awt.*;

public class BeepPointExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ; i <5 ; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
		for(int i = 0 ; i <5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
