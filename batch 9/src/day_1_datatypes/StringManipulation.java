package day_1_datatypes;

public class StringManipulation {

	public static void main(String[] args) {
		String name ="James";
		
		//Length of the string 
		//String.length()=>method returns integers 
		//that is length of the given string
//		System.out.println(name.length());
//		int size = name.length();
//		
		//charAt-->takes integers that is index and returns char that is character at given index.
//		char c =name.charAt(0);
//		System.out.println(c);
		
		//indexOf
//		int ii=name.indexOf("m");
//		System.out.println(ii);
		//substring -->two options
		String school ="Cybertek";
		System.out.println(school.substring(0,5));
		System.out.println(school.substring(5));
		
		System.out.println(school.indexOf("e",4));
		System.out.println(school.isEmpty());
		System.out.println(school.trim());
		System.out.println(school.replace("e",""));
	}

}
