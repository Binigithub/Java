//We have a dog that likes to bark. We need to wake up if the dog is barking at night.
//
//Write a method bark that has 2 parameters.
//
//First parameter should be of type boolean and be named barking it represents if our dog is currently barking.
//Second parameter represents the hour of the day and is of type int with the name hourOfDay and has valid range of 0-23.
//
//We have to wake up if the dog is barking before 08:00 am or after 22:00 hours so in that case return true.
//In all other cases return false. If the hourOfDay parameter is less than 0 or greater than 23 return false.

public class DogBarking {

	public static void main(String[] args) {
		System.out.println(isDogBarking(true,1));
		System.out.println(isDogBarking(true,7));
		System.out.println(isDogBarking(true,8));
		System.out.println(isDogBarking(true,24));
		System.out.println(isDogBarking(true,-1));
		System.out.println(isDogBarking(false,1));

	}
	public static boolean isDogBarking(boolean barking, int hourOfDay) {
		if(barking==true&&hourOfDay<8&&hourOfDay>=0) {
			return true;
		}else {
			return false;
		}
	}

}
