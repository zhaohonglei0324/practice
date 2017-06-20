package practice;
//求一维数组，各元素的和
public class Shuzu2 {
	public static void main(String[] args) {
		int[] list = new int[]{1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for (int i = 0;i<list.length;i++){
			sum = sum + list[i];
		}
		System.out.println("和是："+sum);
		
	}

}
