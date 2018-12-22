
public class Task1 {

	public static void main(String[] args) {
		double marks=-1;
		if(marks>0&&marks<60) {
			System.out.println("Fail");
		}else if(marks>=60&&marks<90) {
			System.out.println("Pass");
		}else if(marks>=90&&marks<=100) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("Wrong number");
		}

	}

}
