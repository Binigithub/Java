package com.cybertek.package1;



//import com.cybertek.package2.*; 		// 1st way

//import com.cybertek.package2.Class2; 	// 2nd way



public class Class1 {



	public static void main(String[] args) {

	

	 /*   3 ways to access package from outside the package

			1- import package.*;

			2- import package.className;

			3- fully qualified name

	 */	

		//Class2 cl = new Class2();

		//Class3 cl1 = new Class3();

		

		com.cybertek.package2.Class2 cl = new com.cybertek.package2.Class2(); //3rd way		

	}

}