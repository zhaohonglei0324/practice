package practice;

public class String1 {
	public static void main(String[] args) {
		String a = new String("we are students");
		int b = a.indexOf("s"); //返回第一次出现S的索引，若无，返回-1
        int c = a.lastIndexOf("s");
        char d = a.charAt(1); //返回指定索引位置的字符
        String e = a.replaceAll(" ", ""); //替换
        String f = a.replace("students", "good children");

        //字符串分割，拆分后返回字符串数组
        String[] s = a.split(" ");
        for(int i = 0;i<s.length;i++){
        	System.out.println(s[i]);
        	
        }
        
        
        
        //判断字符串是否相等
        boolean m = a.equals("we are students");
        boolean n = a.equalsIgnoreCase("WE ARE STUDENTS"); //忽略大小写的情况下比较
        System.out.println(m);
        
        
		System.out.println("第一次出现s的位置是："+b);
		System.out.println("最后一次出现s的位置是："+c);
		System.out.println("索引1对应的字符是"+d);
		System.out.println("去掉空格后："+e);
		System.out.println("替换后，字符串变为:"+f);
	}

}
