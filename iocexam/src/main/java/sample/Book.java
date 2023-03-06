package sample;

public class Book {
	private String title;
	private int price;
	
	public Book() {
		System.out.println("Book 생성!!");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
