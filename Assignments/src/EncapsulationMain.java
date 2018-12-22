
public class EncapsulationMain {

	public static void main(String[] args) {

		

		EncapsulationAss22 printer=new EncapsulationAss22(50,true);

	    System.out.println("initial page count="+printer.getNumberOfPagesPrinter());

	    int pagesPrinted=printer.printPages(10);

	    System.out.println("Pages Printed "+pagesPrinted+" new total print count ="+printer.getNumberOfPagesPrinter());



	    System.out.println("New toner level= "+printer.addToner(25));



	    System.out.println("Printed "+printer.printPages(120)+" pages");

	    System.out.println("Total printed so far "+printer.getNumberOfPagesPrinter()+" pages");



	}

}
