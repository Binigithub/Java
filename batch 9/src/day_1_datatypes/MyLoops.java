package day_1_datatypes;

import java.util.Scanner;

public class MyLoops {

	public static void main(String[] args) {
//		String str= "Universe";
//		String res="";
//		for(int i=str.length()-1;i>=0;i--) {
//			res+=str.charAt(i);
//			
//		}
//		System.out.println(res);
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your number 1-10");
		int num=scan.nextInt();
		
//		for(int i=1;i<=num;i++) {
//			Scanner scann= new Scanner(System.in);
//			System.out.println("Enter your number"+i);
//			int num1=scan.nextInt();
//			if(num1%2==0) {
//				System.out.println("Even");
//			}else {
//				System.out.println("Odd");
//				//break;
//			}
//		}
		
		int k=1;
		while(true) {
			
			System.out.println("Enter your number"+k);
			int n=scan.nextInt();
					if(n%2!=0) {
						break;
					}
					k++;
		}
		System.out.println("END");
	}

}
