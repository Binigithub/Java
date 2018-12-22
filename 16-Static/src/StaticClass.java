
public class StaticClass {

	public static void main(String[] args) {
		StaticTest static1 = new StaticTest("instance-1");
		System.out.println(static1.getName() + " is instance number " + static1.getNumInstance());

		//instance-1 is instance number 1
		StaticTest static2 = new StaticTest("instance-2");
		System.out.println(static2.getName() + " is instance number " + static2.getNumInstance());

		//instance-2 is instance number 2
		
		StaticTest static3 = new StaticTest("instance-3");
		System.out.println(static2.getName() + " is instance number " + static2.getNumInstance());
}

}


