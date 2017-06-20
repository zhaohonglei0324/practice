package practice;
import java.util.Scanner;  

//判断某年是否是闰年.&&--与，||--或     定义常量，用关键字final
public class Example3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		long year = scan.nextLong();
		if (year%4==0&&year%100!=0||year%400==0){
			System.out.println("是闰年");
		}
		else{
			System.out.println("非闰年");
		}
		
	}

}
