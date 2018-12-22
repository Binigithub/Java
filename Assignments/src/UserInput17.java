

//Read the numbers from console entered by the user and print the minimum and maximum number the user has entered.
//Before the user enters the number, print the message "Enter number"
//If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//Use an endless while loop
import java.util.Scanner;
public class UserInput17 {

	public static void main(String[] args) {
		
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your number or enter 00 to quit: ");
		int input= scan.nextInt();
		int min=input;
		int max=0;
		
		while(input!=00) {
			System.out.println("Enter your number or enter 00 to quit: ");
			input= scan.nextInt();
			if(input!=00) {
				if(input>max) {
				max=input;
				
				
		}
				else if(input>min) {
				min=input;
			}
		
		}
		}
		System.out.println("Largest: "+max);
		System.out.println("Smallest: "+ min);
		
    
		}

	}


//or 
//import java.util.Scanner;
//
//
//
//public class UserInput17 {
//
//
//
//	public static void main(String[] args) {
//
//		Scanner scan = new Scanner(System.in);
//		int invalid = 100;
//
//		int min=Integer.MAX_VALUE;
//
//		int max=0;
//		boolean bool =true;
//		while(bool) {
//			System.out.println("Enter number");
//
//			int number = scan.nextInt();
//			if(number==invalid) {
//
//				bool=false;
//			} 
//
//			if (number>max) {
//
//				max = number;
//
//			} else if (number<min) {
//
//				min=number;
//
//			}
//
//			}
//
//		System.out.println("minimum number is "+ min + " and maximum number is " + max);
//
//	}	
//
//	}
//
//	



public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
  int min = Integer.MAX_VALUE;
  int max = Integer.MIN_VALUE;

while(true) {
	  System.out.println("Enter number: ");

    boolean isAnInt = scanner.hasNextInt();
    if(isAnInt) {
    	int number = scanner.nextInt();
      if(number>max) {

        max = number;
        if(number<min) {

        min = number;

      }

      }else {

      break;

    }

    }

  System.out.println("min = " + min +", max  = " + max);

  scanner.close();

}
}



































