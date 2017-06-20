package practice;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("小花","英语","45元");
		book.setPrice("200");
		System.out.println("作者："+book.getAuthor());
		System.out.println("书名："+book.getBookName());
		System.out.println("价格："+book.getPrice());
		
	}

}
