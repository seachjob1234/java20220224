package chap06.book.exercise.p19;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(1000);
		System.out.println("현재 잔고 : " + account.getBalance());
		account.setBalance(1000);
		
		account.setBalance(1000);
		
		account.setBalance(1000);
	}
}
