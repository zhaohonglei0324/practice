package practice;
import java.util.Random;

public class BookNumTest {
	public static void main(String[] args) {
		//创建一个书名数组
		String[] titles = {"数学","英语","语文"};
		new BookNum(titles[new Random().nextInt(3)]);
		System.out.println(BookNum.getbookNum());
	}

}
