package practice;
//求一维数组中最小值
public class Shuzu3 {
	public static void main(String[] args) {
		int[] list = new int[]{8,5,4,1,9};
		int min = list[0]; //先定义一个最小值
		for(int i=0;i<list.length;i++){
			if(min > list[i]){
				min = list[i]; //只要有比那个值小的，就将它赋值给min
			}
		}
		System.out.println(min);
	}

}
