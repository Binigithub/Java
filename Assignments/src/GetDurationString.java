//Create a method called getDurationString with two parameters, first parameter is minutes and second parameter is seconds.
//
//You should validate that if the first parameter minutes is >=0.
//
//You should validate that second parameter seconds is >=0 and <=59
//
//Return "Invalid Value" in the method if either of the above is not true.
//
//If the parameters are valid then calculate how many hours minutes and seconds comprise the minutes and seconds passed to this method 
//and return that value as string in format "XXh XXm XXs" where XX represents a number of hours minutes and seconds.
//
//Create a second method of the same name but with only one parameter seconds.
//
//Validate that it is >=0, and return "Invalid Value" if it is not true.
//
//If it is valid, then calculate how many minutes are in the seconds then call the other overloaded method passing 
//the correct minutes and seconds calculated so that it can calculate correctly.
//
//Call both methods to print values in main method
//
//Tips:
//Use int or long for your number data types
//1 minute = 60 seconds and 1 hour = 60 minutes = 3600 seconds.

//public class GetDurationString {
//
//	public static void main(String[] args) {
//		System.out.println(getDurationString(120,58));
//		System.out.println(getDurationString(-2));
//
//	}
//	public static String getDurationString(int minutes, int seconds) {
//		if(minutes<0||seconds<0||seconds>59) {
//			return "Invalid Value";
//		}else {
//			  int H=minutes/60;
//			  int M=seconds/60+minutes;
//			  int S=seconds%60;
//			  	return "H M S";
//			
//		}
//	}
//		public static String getDurationString(int seconds) {
//			
//			if(seconds<0) {
//				return "Invalid Value";
//		}else {
//			int S=seconds;
//			return  "S";
//		}
//			
//		
//	}
//}

public class GetDurationString{

	public static void main(String[] args) {

		getDuration(630);

	}

	public static String getDurationString(int minutes, int seconds) {

		if (minutes<0) {

			return "Invalid data";

		}

		if (seconds<0 || seconds >59) {

			return "Invalid data";

		}

		int hours = minutes/60;

		int remainingMins = minutes%60;

		System.out.println("hours: " + hours);

		System.out.println("Minutes: "+ remainingMins);

		System.out.println("Seconds "+ seconds);

		return "";

	}

	public static void getDuration(int seconds) {

		if (seconds<0) {

			System.out.println("Invalid data");

		} else {

			int minutes = seconds/60;

			int remaining = seconds%60;

			int hours = minutes/60;

			int remainMins = minutes%60;

			System.out.println("Hours " + hours);

			System.out.println("Minutes "+ minutes);

			System.out.println("Seconds "+ remaining);

			

		}

	}

}


