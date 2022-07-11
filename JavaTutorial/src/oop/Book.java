package oop;

public class Book {
	public String name, author, publisher;
	private int numberOfPage;
	
	
	Book(String name, String author, String publisher, int numberOfPage){
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		
		
		if(numberOfPage < 1) {
			this.numberOfPage = 10;
		}else {
			this.numberOfPage = numberOfPage;
		}
	}
	
	public void numberOfPage() {
		System.out.println(numberOfPage);
	}
}
