package jicheng;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Test {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("java");
		e.setSalary(10000);
		
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(date)); //df.format(date)返回值类型为String
		
		e.setBirthday(new Date());
		
		System.out.println("员工："+e.getName()+"工资为"+e.getSalary()+"生日为"+e.getBirthday());
		
		Manager m = new Manager();
		m.setName("小李");
		m.setSalary(20000);
		m.setBouns(5000);
		
		System.out.println("经理:"+m.getName()+"工资为"+m.getSalary()+"奖金为"+m.getBouns());
		
		
	}

}
