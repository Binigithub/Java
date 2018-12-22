//Write a method called printNumberInWord
//
//This method should have one parameter called number which a whole number(type int)
//
//The method needs to print "ZERO" if the number parameter is passed with the value of 0
//The method needs to print "ONE" if the number parameter is passed with the value of 0
//The method needs to print "TWO" if the number parameter is passed with the value of 0
//
//... and so on up to and including "NINE" if the number parameter is passed with the value of 9
//
//If the number parameter has any other value than 0 to 9, then the method should print "OTHER"

public class SwitchCase12 {

	public static void main(String[] args) {
		printNumberInWord(0);
		printNumberInWord(9);
		printNumberInWord(10);

	}
	public static void printNumberInWord(int number) {
		switch(number) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
	}

}
