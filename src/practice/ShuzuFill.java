package practice;
import java.util.Arrays;

//.fill
public class ShuzuFill {
	public static void main(String[] args) {
		int[] a = new int[]{1,2,6,7,8};
//		Arrays.fill(a, 8);
		Arrays.fill(a, 1, 2, 100); //对指定范围进行填充
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
	}
	

}
