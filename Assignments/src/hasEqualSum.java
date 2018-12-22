//Write a method hasEqualSum with 3 parameters of type int
//
//The method should return boolean and it needs to return true if sum of first and second parameter is equal to third parameter. Otherwise return false.
//
//Sample Outputs:
//
//hasEqualSum(1,1,1); = > false
//hasEqualSum(1,1,2); = > true
//hasEqualSum(1,-1,0); = > true

public class hasEqualSum {

	public static void main(String[] args) {
		System.out.println(hasEqualSum(1,1,1));
		System.out.println(hasEqualSum(1,1,2));
		System.out.println(hasEqualSum(1,-1,0));
		System.out.println(hasEqualSum(0,0,0));
	}
	


public static boolean hasEqualSum(int x, int y, int z) {
	if(x+y==z) {
		return true;
	}else {
		return false;
	}
}
}