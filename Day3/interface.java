interface Car{
	void speed();
	void brake();
	void Lights();
}

class LuxuryCar implements Car{
	
	@Override
	public void speed() {
		System.out.println("300 km/hr");
	}
	
	@Override
	public void brake() {
		System.out.println("disk  brake");
	}
	
	@Override
	public void Lights() {
		System.out.println("high visioned lights");
	}
}

class CheapCar implements Car{
	
	@Override
	public void speed() {
		System.out.println("100 km/hr");
	}
	
	@Override
	public void brake() {
		System.out.println("disk not  brake");
	}
	
	@Override
	public void Lights() {
		System.out.println("low visioned lights");
	}
}


public class Interface {
	public static void main(String args[]) {
		LuxuryCar a = new LuxuryCar();
		a.brake();
		CheapCar b = new CheapCar();
		b.brake();	
	}	
}