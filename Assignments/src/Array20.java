import java.util.Arrays;

public class Array20 {

	public static void main(String[] args) {

        int[] myArr = { 1, 2, 3,4,5, 6,7,8,9,10};

        System.out.print("Original Array "+ Arrays.toString(myArr)+"\n");

        reverse(myArr);

        System.out.println("Reversed Array "+ Arrays.toString(myArr));

    }

    public static int[] reverse(int[] myArray){

        int lastIndex=myArray.length-1;

        for(int i=0; i<myArray.length/2; i++){
        	
        	int temp=myArray[i];

            myArray[i]=myArray[lastIndex-i];

            myArray[lastIndex-i]=temp;

        }

        return myArray;

    }
	   

}
