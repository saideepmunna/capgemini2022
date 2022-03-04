public class ShaggyScooby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread("Scooby") {
			public void run() {
				System.out.println("I'm " + Thread.currentThread().getName());
			}
		};
		
		Thread t2 = new Thread("Shaggy") {
			public void run() {
				System.out.println("I'm " + Thread.currentThread().getName());
			}
		};
		
		t1.start();
		t2.start();

	}

}