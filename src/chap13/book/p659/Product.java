package chap13.book.p659;

public class Product<T,U> {
	private T kind;
	private U model;
	
	public T getKind() {return this.kind;}
	public U getModel() {return this.model;}
	
	public void setKind(T kind) {
	this.kind = kind;
	}
	
	public void setModel(U model) {
		this.model = model;
	}
	
}
