package example;

//在类中实现接口，必须一致
public class Cire implements ICalculate{
//	面积
	public float getArea(float r) {
		float area = PI*r*r;
		return area;
	}
	
//	周长
	public float getZhouchang(float d) {
		float zhouchang = PI*2*d;
		return zhouchang;
		
	}
	

}
