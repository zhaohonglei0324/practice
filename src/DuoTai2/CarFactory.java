package DuoTai2;

public class CarFactory {
	public static Car getCar(String name){
		if(name.equalsIgnoreCase("BMW")){
			return new BMW();
		}
		else if(name.equalsIgnoreCase("Benz")){
			
			return new Benz();
		}
		
		else {
			return null;
		}
			
	}

}
