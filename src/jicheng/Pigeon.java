package jicheng;

//继承的实现
//继承中的重写
//使用super关键字===》说明调的是父类的变量或方法
//super关键字两个用途：1）调用父类的构造方法；2）操作被隐藏的成员变量和被重写的成员方法
public class Pigeon extends Bird{
	
	public static void main(String[] args) {
		Pigeon p = new Pigeon();
		System.out.println(p.color);
		
	}
	

}
