package practice;
import java.util.Scanner;
//判断数字奇偶性

public class Example1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//创建输入流扫描器
		System.out.println("请输入数字：");
		long number = scan.nextLong();  //获取输入的数字
		if (number%2 !=0){
			System.out.println("是奇数");
		}
		else{
			System.out.println("是偶数");
		}
		
		  
	}
	
}
