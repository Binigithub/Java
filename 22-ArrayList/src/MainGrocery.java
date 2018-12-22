import java.util.Scanner;

public class MainGrocery {
		
	private static Scanner scanner=new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args) {
		
		boolean quit=false;
		int choice=0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:

				System.out.println("What do you want to add?");

				String item = scanner.nextLine();

				groceryList.addGroceryItem(item);

				break;

			case 3:

				System.out.println("Enter the index number of the item you want to modify");

				int position = scanner.nextInt();

				scanner.nextLine();

				System.out.println(" Enter your new item ");

				String newItem = scanner.nextLine();

				groceryList.modifyGroceryItem(position, newItem);

				break;

			case 4:

				System.out.println("Enter the index number you want to remove");

				int position1 = scanner.nextInt();

				groceryList.removeGroceryItem(position1);

				break;

			case 5: 

				System.out.println("What item do you want to find?");

				groceryList.findItem(scanner.nextLine());

				scanner.nextLine();

				break;

			case 6:

				quit=true;

				break;

			}
}

}

	private static void printInstructions() {

		System.out.println("To print list - press 1, To add item - press 2, To modify item- press 3, To remove item - press 4, To search for the item - press 5, To quit -press 6");

		}

}