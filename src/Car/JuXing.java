package Car;

public class JuXing {
	private double chang;
	private double kuan;
	
	public JuXing(double chang,double kuan){
		this.chang=chang;
		this.kuan=kuan;
	}
	
	public double getArea(){
		double area = chang*kuan;
		return area;
	}
	
	public static void main(String[] args) {
		JuXing a = new JuXing(4.0,2.0);
		System.out.println("面积为："+a.getArea());
		
	}

	
	
}
