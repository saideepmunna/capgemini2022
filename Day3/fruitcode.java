import java.util.Scanner;
class fruit{
	String name,taste,size;
	void eat() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter name of fruit");
		name= r.next();
		System.out.println("Enter taste of fruit");
		taste= r.next();
		System.out.println("The "+name+" is "+taste);
	}
}

class apple extends fruit{
	@Override
	void eat() {
		System.out.println("The Apple is Sweet");
	}
}

class orange extends fruit{
	@Override
	void eat() {
		System.out.println("The Orange is Sour");
	}
}

public class HOA1 {
	public static void main(String args[]) {
		fruit a = new apple();
		fruit o = new orange();
		fruit r = new fruit();
		a.eat();
		o.eat();
		r.eat();
	}

}