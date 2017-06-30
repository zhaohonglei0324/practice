package DuoTai2;

public class Customer {
	public static void main(String[] args) {
//		CarFactory c = new CarFactory();
//		Car bmw = c.getCar("BMW");
		
		Car bmw = CarFactory.getCar("BMW");
		System.out.println(bmw.getInfo());
		Car benz = CarFactory.getCar("Benz");
		System.out.println(benz.getInfo());
		
	}

}
