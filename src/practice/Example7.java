package practice;
//循环体的过滤器
public class Example7 {
	public static void main(String[] args) {
		String[] animals = new String[]{"小猫","老鹰","孔雀","狮子","老鹰"};
//		for(int i = 0;i<animals.length;i++){
//			if (animals[i].equals("老鹰")){
//				System.out.println("发现了老鹰");
//				continue;
//			}
//			System.out.println("搜索小动物，发现了："+animals[i]);
//			
//		}
		
		//使用foreach
		int i = 0;
		for(String animal :animals){
			if (animal.equals("老鹰")){
				System.out.println("发现了老鹰");
				i++;    //i无限制增加么
				continue;
			}
			System.out.println("搜索小动物，发现了："+animal);
			
		}
		System.out.println("一共捉到了"+i+"只老鹰");
			
	}

}
