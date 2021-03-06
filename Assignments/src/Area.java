//Write a method named area with one double parameter named radius.
//The method needs to return a double value that represents the area of a circle
//If the parameter radius is negative then return -1.0 to represent an invalid value.
//Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
//The method needs to return an area of a rectangle.
//If either or both parameters is/are negative return -1.0 to indicate an invalid value.
//
//Sample of outputs:
//area(5.0); = > 78,53975
//area(-1); = > -1
//area(5.0,4.0); = > 20.0
//area(-1.0,4.0); = > -1
//
//Tips :
//
//Formula for calculating a circle area is radius * radius * PI. For PI use 3.14159
//Formula for calculating a rectangle area is x * y

public class Area {

	public static void main(String[] args) {
		
		System.out.println(area(-5));
		System.out.println(area(4));
		System.out.println(area(-2,3));
		System.out.println(area(2,-3));
		System.out.println(area(5,5));
	}
	public static double area(double radius) {
		if(radius<0) {
			return -1;
		}else {
		double area =radius*radius*3.14159;
		return area;
		}
	}
	public static double area(double x, double y) {
		if(x<0||y<0) {
			return -1;
		}else {
			double area = 	x*y;
			return area;
					}
	}
	

}
