abstract class ABC{
	
	// constructor
	ABC(){
		
	}
	
	//non abstract method
	void show() {
		
	}
	
	abstract void show1();
	
	//static method
	static void show3() {
		
	}
}

//this is my concrete class
class xyz extends ABC{
	@Override // not mandatory
	void show1() {
		System.out.println("This show1 is a version of xyz class not abc class");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		ABC a = new xyz();
		a.show1();
	}

}