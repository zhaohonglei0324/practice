package DuoTai;

//本范例定义一个超类来实现输出名字的方法，并使用抽象方法来计算面积
public abstract class Shape {
	public String getName(){
		return this.getClass().getSimpleName();	
	}
	
	public abstract double getArea();
	
	
}
