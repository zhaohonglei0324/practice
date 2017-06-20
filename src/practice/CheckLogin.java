package practice;
import java.util.Scanner;

//验证登录信息的合法性==流程控制  zhaohonglei/111111
//总结来说：
//1）对于==，如果作用于基本数据类型的变量，则直接比较其存储的 “值”是否相等；
//　　如果作用于引用类型的变量，则比较的是所指向的对象的地址
//2）对于equals方法，注意：equals方法不能作用于基本数据类型的变量
//　　如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；
//　　诸如String、Date等类对equals方法进行了重写的话，比较的是所指向的对象的内容

public class CheckLogin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String name = scan.nextLine();
		System.out.println("请输入密码:");
		String password = scan.nextLine();
		if (!name.equals("zhaohonglei")){
			System.out.println("用户名错误");
			
		}
		else if (!password.equals("111111")){
			System.out.println("密码错误");
		}
		else {
			System.out.println("登录成功");
		}
	}

}
