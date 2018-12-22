package day_1_datatypes;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
//		switch(10) {
//		case 5:
//			System.out.println("This is 5");
//			break;
//		case 6:
//			System.out.println("This is 6");
//			break;
//			
//		default :
//			System.out.println("This is 0");
//			break;
//			
//		}
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your number 1-12 ");
		int num=scan.nextInt();
		System.out.println(num);
		
		if(num>=1&&num<=12) {
			switch(num) {
			case 1:
				System.out.println("Jan");
				break;
			case 2:
				System.out.println("Feb");
				break;
			case 3:
				System.out.println("Mar");
				break;
			case 4:
				System.out.println("Apr");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("Jun");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("Aug");
				break;
			case 9:
				System.out.println("Sep");
				break;
			case 10:
				System.out.println("Oct");
				break;
			case 11:
				System.out.println("Nov");
				break;
			case 12:
				System.out.println("Dec");
				break;
			}
			
				
		}else {
			System.out.println("Invalid number");
		}
	}

}
