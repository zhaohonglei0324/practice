package practice;
import java.util.Date;

public class StringFormat {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);  //输出：Wed Jun 21 14:29:24 CST 2017
		System.out.println(String.format("%tF", date)+" "+String.format("%tT", date));//输出：2017-06-21 14:29:24
		
	}
	

}
