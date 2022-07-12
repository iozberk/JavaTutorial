package oop;

public class Main {

	public static void main(String[] args) {
		// Encapsulation - Inheritence - Polymorphhism - Abstraction
		Book book1 = new Book("The Ring Sets Out ", "J. R. R. Tolkien", "Allen & Unwin",479);
		book1.getnumberOfPage();
		System.out.println(book1.getnumberOfPage());
		book1.setnumberOfPage(579);
		System.out.println(book1.getnumberOfPage());
	}
	
	

}
