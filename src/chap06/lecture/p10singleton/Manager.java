package chap06.lecture.p10singleton;

public class Manager {
	private static Manager manager;
	private Manager() {
		
	}
	public static Manager getInstance() {
		if(manager == null) {
			manager = new manager();
		}
		return manager;
	}
}
