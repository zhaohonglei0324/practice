package Car;

public class Student1 extends Student{
	
	public Student1(String name,int age){
		super(name,age);
		
	}
	
	public void hobby(){
		
		super.school="北京";
		System.out.println(name+school+"的爱好是弹琴");
		
	}
	
	public static void main(String[] args) {
		
		Student1 xiaozhao = new Student1("赵红蕾",20);
		xiaozhao.hobby();

		
	
	}
}
