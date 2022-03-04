class shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}

class circle extends shape{
	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
	@Override
	void erase() {
		System.out.println("Erasing Circle");
	}
}

class triangle extends shape{
	@Override
	void draw() {
		System.out.println("Drawing Triangle");
	}
	@Override
	void erase() {
		System.out.println("Erasing Triangle");
	}
}

class square extends shape{
	@Override
	void draw() {
		System.out.println("Drawing Square");
	}
	@Override
	void erase() {
		System.out.println("Erasing Square");
	}
}

public class HOA2 {
	public static void main(String args[]) {
		shape c=new circle();
		shape t=new triangle();
		shape s=new square();
		c.draw();
		c.erase();
		t.draw();
		s.erase();
		s.draw();
		t.erase();
	}
}