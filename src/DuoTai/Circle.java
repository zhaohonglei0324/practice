package DuoTai;

public class Circle extends Shape{
	private double r;
	
	public Circle(double r){
		this.r=r;
		
	}
	
	public double getArea(){
		return 3.14*r*r;
		
	}

}
