package chap06.book.s060602;

public class FieldInitValueExample {
	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField :" + fiv.byteField);
		System.out.println("short shortField :"  + fiv.shortField);
		System.out.println("int intField :" + fiv.intField);
		System.out.println("long longField :" + fiv.longField);
		System.out.println("boolean booleanField :" + fiv.booleanField);
		System.out.println("char charField :" + fiv.charField);
		System.out.println("float floatField :" + fiv.floatField);
		System.out.println("double doubleField :" + fiv.doubleField);
		System.out.println("int[] arrField :" + fiv.arrField);
		System.out.println("String StringField :" + fiv.referenceField);
	}
}
