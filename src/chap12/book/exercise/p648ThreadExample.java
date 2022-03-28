package chap12.book.exercise;

public class p648ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();

		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
	}
}

class MovieThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
class MusicRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}