

//1. Create a program using arrays that sorts a list of integers in descending order. Descending order is highest value to lowest.

//    In other words if the array had the values in int 106,26,81,5,15 your program should ultimately have an array with
// 106,81,26,15,5 in it.
//2. Set up the program so that the numbers to sort are read in from the keyword.
//3. Implement the following methods - getIntegers, printArray, and sortIntegers.
//    getIntegers returns an array of entered integers from keyword.
//    printArray prints out the contents of the array and sortIntegers should sort the array and return a new array containing the sorted numbers
//4. You will have to figure out how to copy the array elements from passed array into a new array and sort them and return the new sorted array.
import java.util.Scanner;
import java.util.Arrays;


public class Array18 {


private static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    int[] Array = getIntegers(5);

    String str = Arrays.toString(descendingSort(Array));
    System.out.println(str);
}

public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " integer values. \r");
    int[] values = new int[number];

    for (int i = 0; i < values.length; i++) {
        values[i] = scanner.nextInt();
    }

    return values;
}

public static int[] descendingSort(int[] argArray0) {
    for (int i = 0; i < argArray0.length; i++) {
        Arrays.sort(argArray0);
         
    }
    return argArray0;
}

}
