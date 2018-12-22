package Review;

public class evenNumbers {

	public static void main(String[] args) {
		int startNum=10;
		int finishNum=100;
		int counter=0;
		while(startNum<=finishNum) {
			if(!isEven(startNum)) {
			startNum++;
			continue;
		}
			System.out.println("Even number "+ startNum);
			startNum++;
			counter++;
			
			if(counter>=5) {
				break;
			}
		}

	}
	public static boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
