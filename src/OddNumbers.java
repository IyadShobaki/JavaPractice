
import java.awt.List;
import java.util.ArrayList;

public class OddNumbers {

	public static void main(String[] args) {
		
		System.out.println(oddNumbers(3, 11));

	}
	public static ArrayList<Integer> oddNumbers(int l, int r) {
		ArrayList<Integer> list = new ArrayList<>();

		for(int i = l; i <=r; i++) {
			if(i%2 != 0) {
				list.add(i);
				//System.out.print(i + " ");
			}
			
		}
		return list;
		
	}
}
