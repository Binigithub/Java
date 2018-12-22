

public class Income {

	public static void main(String[] args) {
		double income=1350_000_000.00;
		if(income<=150_000_000.00) {
			double tax=income*.25;
			System.out.println(tax);
		}else if(income>=150_000_000.00&&income<300_000_000.00) {
			double tax1=(150_000_000.00*.25 + (income-150_000_000.00)*.3);
			System.out.println(tax1);
		}else if(income>=300_000_000.00&&income<600_000_000.00) {
			double tax2=(150_000_000*.25+150_000_000.00*.3 + (income-300_000_000.00)*.35);
			System.out.println(tax2);
		}else if(income>=600_000_000.00&&income<=1200_000_000.00) {
			double tax3=(150_000_000*.25+150_000_000.00*.3+300_000_000.00*.35 + (income-600_000_000.00)*.4);
			System.out.println(tax3);
		}else if(income>1200_000_000.00) {
			double tax4=(150_000_000*.25+150_000_000.00*.3+300_000_000.00*.35+600_000_000.00*.4 + (income-1200_000_000.00)*.5);
			System.out.println(tax4);
		}
	}

}
