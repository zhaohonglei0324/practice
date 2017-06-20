package practice;


public class BookNum {

	static int count = 0;
	public BookNum(String title){
		System.out.println("售出"+title);
		count++;
	}
	
	public static int getbookNum(){
		return count;
	}
	
		
	}