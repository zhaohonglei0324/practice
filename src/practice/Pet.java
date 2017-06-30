package practice;

public class Pet {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Pet a = new Pet();
		a.setName("小黑");
		System.out.println("我的名字叫："+a.getName());
		
		
	}	
	

}
