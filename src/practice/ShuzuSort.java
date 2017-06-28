package practice;
import java.util.Arrays;  // .sort .fill

public class ShuzuSort {
	public static void main(String[] args) {
		int[] a = new int[]{5,1,3,6};
		Arrays.sort(a);
//		Arrays.copyOf(original, newLength);
//		Arrays.copyOfRange(original, from, to);
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
