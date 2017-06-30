package DuoTai;


public class Rectangle extends Shape {
	private double c;
	private double k;

	public Rectangle(double c,double k){
		this.c = c;
		this.k =k;
	}
	
	public double getArea(){
		return c*k;
		
	}

}
