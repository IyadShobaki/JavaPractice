import java.security.SecureRandom;
import java.util.Arrays;

public class MagicSquare {
	private static SecureRandom random = new SecureRandom();
	public static void main(String[] args) {
		int[][] s = new int[3][3];
		
		for(int i =0; i < s.length; i++) {
			for(int j =0; j < s.length; j++) {
				s[i][j] = random.nextInt(9)+1;
			}
		}
		for(int i =0; i < s.length; i++) {
			for(int j =0; j < s.length; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
	}
//	 public static int formingMagicSquare(int[][] s) {
//		 
//		 
//
//	 }

}
