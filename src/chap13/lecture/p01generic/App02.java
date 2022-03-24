package chap13.lecture.p01generic;

public class App02 {
	public static void main(String[] args) {
		Container2 con2 = new Container2();
		con2.setContent("java");
		String str =(String) con2.getContent();//위험!!
	
	
		Container2 con1 = new Container2();
		con2.setContent(1);//autoboxing(int -> Integer)
	//	Integer i1 = con1.getContent();//xx
		Object o1 = con1.getContent();
		Integer i1 = (Integer) con1.getContent();//위험
		
		
	}
}
class Container2 {
	private Object content;
	
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
}
