package chap11.lecture.p01object;

public class App02 {
	public static void main(String[] args) {
		Book b1 = new Book("java", 20000);
		
		System.out.println("title :" + b1.getTitle() );
		System.out.println("price :" + b1.getPrice());
		
		Book b2 = new Book("spring", 30000);
		System.out.println(b2.toString());
	}
	
	class Book{
		private String title;
		private int price;
		
		//toString() : 객체의 정보를 문자열로 리턴하는 메소드
		@override
		public String toString() {
			String desc = "title :" + title + " , " + " price : " + price;
			return desc;
		}
		
		
		public Book(String title, int price) {
			super();
			this.title = title;
			this.price = price;
		}
		/**
		 * @return the title
		 */
		public String getTitle() {
			return title;
		}
		/**
		 * @param title the title to set
		 */
		public void setTitle(String title) {
			this.title = title;
		}
		/**
		 * @return the price
		 */
		public int getPrice() {
			return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(int price) {
			this.price = price;
		}
		
		
		
	}
}
