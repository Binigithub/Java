
public class Main {



	public static void main(String[] args) {

		

		//charAt(index) -> returns char value for the particular index

		String str = "JavaScript";

		System.out.println(str.charAt(3)); 	//a

		

		//length -> returns string length

		System.out.println(str.length());	//10

		

		//substring(int beginIndex) -> returns substring for given begin index

		//substring(int beginIndex, int endIndex) -> returns substring for given begin and end index

		System.out.println(str.substring(5)); 	//cript 

		System.out.println(str.substring(5, 7));//cr

		

		//contains() -> returns true / false after matching the sequence of char value

		System.out.println(str.contains("va2")); //false

		

		//equals(Object another) -> checks the equality of string with the given object

		System.out.println(str.equals("Java")); //false

		

		//isEmpty() -> check if tring is empty

		System.out.println(str.isEmpty());	//false

		

		//concat(string str) -> concatenates the specified string

		System.out.println(str.concat("batch9")); //JavaScriptbatch9

		

		//replace(char old, char new) -> replace all occurrences of the specified char value 

		System.out.println(str.replace("Script", "")); //Java

		

		//equalsIgnoreCase(string another) -> compares another string. It does not check case

		System.out.println(str.equalsIgnoreCase("javascript"));  //true

		

		//split(String delimeter) -> returns a split matching delimiter

		String str2 ="JavaScript is the best batch ever";

		String[] myArray = str2.split(" ");

		for(String word:myArray) {

			System.out.println(word);

		}

		

		//indexOf(int ch) -> returns the specified char value index

		System.out.println(str.indexOf("v")); //2

		

		//indexOf(String substring, int fromIndex) -> returns specified substring index starting with given index

		System.out.println(str.indexOf("a", 4)); //-1

		//toLowerCase() -> returns a string in lowercase

		//toUpperCase() -> returns a string in uppercase

		System.out.println(str.toLowerCase());  //javascript

		System.out.println(str.toUpperCase());  //JAVASCRIPT

		

		//trim() -> removes beginning and ending spaces of this string

		String str3 = "JavaScript     ";

		System.out.println(str3.trim());  //Javascript

		

	}



}