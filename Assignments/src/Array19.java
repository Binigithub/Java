

//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//-Finally, print the minimum element in the array.

import java.util.Arrays;
import java.util.Scanner;
public class Array19 {

	public static void main(String[] args) {
		//System.out.println(Arrays.toString(readIntegers(5)));
		System.out.println(Arrays.toString(readIntegers(5))+" \n Minimum number is: " + findMin(readIntegers(5)));
		

	}
	public static int[] readIntegers(int count) {
		Scanner scan = new Scanner(System.in);
		
		int[] Array = new int[count];
		
		for(int i=0;i<Array.length;i++) {
			System.out.println("Enter number " + (i+1) );
			Array[i]=scan.nextInt();
			
			
		}
		
		return Array;
		
	}
	
	public static int findMin(int[] Array) {
		
		int Min=Array[0];
		for(int i=0;i<Array.length;i++) {
			
			
			if(Min>Array[i]) {
				Min=Array[i];
			}
		}
		return Min;
		
		
	}
	
	

}

//public static void main(String[] args) {
//
//	int[] myArray=getIntegers(5);
//
//    System.out.println("Min Value="+findMin(myArray));
//
//}
//
//public static int[] getIntegers(int arrayL){
//
//    Scanner scanner=new Scanner(System.in);
//
//    int[] myArr=new int[arrayL];
//
//    System.out.println("Please enter Array elements");
//
//    for(int i=0; i<arrayL; i++){
//
//        myArr[i]=scanner.nextInt();
//
//    }
//
//    return myArr;
//
//}
//
//public static int findMin(int[] myArray){
//
//    int min=myArray[0];
//
//    for(int i:myArray){
//
//        if(i<min){
//
//            min=i;
//
//        }
//
//    }
//
//    return min;
//
//}
//}
//
