package practice;
//使用for循环输出九九乘法表
public class Example5 {
	public static void main(String[] args) {
		int a;
		int b;
		for(a=1;a<=9;a++){
			for(b=1;b<=a;b++){
				System.out.println(a+"*"+b+"="+a*b+"\t");
			}
			
			System.out.println();
		}
	}

}
