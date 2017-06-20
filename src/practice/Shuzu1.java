package practice;
//while循环遍历数组
public class Shuzu1 {
	public static void main(String[] args) {
		String[] a = new String[]{"a","b","c","d","e"};   //声明数组第一种方式====一维数组初始化
		String[] b = new String[10];  //第二种：先设长度再赋值
		b[0] = "m";
		b[1] = "n";
		int[] c = {7,10,1};  //第三种=====一维数组初始化
		System.out.println(c[0]);
		
		
//		int i = 0;
//		while(i<a.length){
//			System.out.println(a[i]);
//			i++;
//			
//		}
		
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
				
		}
	}	

}
