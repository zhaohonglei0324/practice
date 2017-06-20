package practice;
//自定义图书类。需求：创建book类；成员变量：作者、书名、价格；提供构造方法和成员方法来修改成员变量

public class Book {
	private String author;
	private String bookName;
	private String price;
	
	public Book(String author,String bookName,String price){
		this.author = author;
		this.bookName = bookName;
		this.price = price;
			
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
