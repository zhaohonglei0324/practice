package DuoTai;

public class Test {
	public static void main(String[] args) {
		Circle c = new Circle(1);
		
		System.out.println("圆形的名称是："+c.getName());
		System.out.println("圆的面积为："+c.getArea());
		
		Rectangle r = new Rectangle(2.0,4.0);
		System.out.println("矩形的名称是："+r.getName());
		System.out.println("矩形的面积为："+r.getArea());
		
	}
	

}
