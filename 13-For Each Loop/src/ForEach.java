
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mark= {125,132,95,116,110};
		
		int highest_mark=maximum(mark);
		System.out.println(highest_mark);
	}
	public static int maximum(int[] array) {
		int max=array[0];
		for(int num:array) {
			if(num>max) {
				max=num;
				
			}
			
		}
		return max;
	}
}
