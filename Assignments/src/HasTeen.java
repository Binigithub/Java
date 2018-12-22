//We will say that a number is "teen" if it is in the range 13-19(inclusive)
//
//Write a method hasTeen with 3 parameters of type int.
//
//The method should return boolean and it needs to return true if one of parameters is in range 13(inclusive) - 19(inclusive). Otherwise return false.
//
//Sample Output:
//
//hasTeen(9,99,19); = > true
//hasTeen(23,15,42); = > true
//hasTeen(22,23,34); = > false

public class HasTeen {

	public static void main(String[] args) {
		
		System.out.println(hasTeen(9,99,19));
		System.out.println(hasTeen(23,15,42));
		System.out.println(hasTeen(23,23,34));
		System.out.println(hasTeen(-9,-20,21));
	}
	public static boolean hasTeen(int x, int y, int z) {
		if(x>=13&&x<=19||y>=13&&y<=19||z>=13&&z<=19) {
			return true;
		}else {
			return false;
		}
	}

}
