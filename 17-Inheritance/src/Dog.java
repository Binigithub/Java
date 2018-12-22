
public class Dog extends Animal {

	private int eyes;
	private int tail;
	private int legs;
	private int teeth;
	private String coat;
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int tail, int legs, int teeth,
			String coat) {
		super(name, brain, body, size, weight);
		this.eyes = eyes;
		this.tail = tail;
		this.legs = legs;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew() {
		System.out.println("Dog.chew() Called");
	}
	public void walk() {
		System.out.println("Dog.walk() Called");
	}
	@Override
	public void eat() {
		System.out.println("Dog.eat() Called");
		super.eat();
		super.move(50);
		chew();
	}
	
	public void run() {
		System.out.println("Dog.run() Called");
	}
}