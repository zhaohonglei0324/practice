package practice;
import java.util.Scanner;
//温度转换工具（摄氏转华氏）

//public class Converter {
//	public void converterTo(double a){    
//		double b = a*1.8+32;
//		System.out.println(b);
//	}
	
	public class Converter {
		public double converterTo(double a){    //double修饰了这个函数，所以这个函数必须得有返回值!!!要想用system.out,返回值用void
			double b = a*1.8+32;
			return b;
		}
	
	public static void main(String[] args) {
		System.out.println("请输入温度值：");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble(); //获取输入的温度值
	
		Converter converter = new Converter();
		double b = converter.converterTo(a); //调方法
		System.out.println(b);
	
		
	}
	

}
