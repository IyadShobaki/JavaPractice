//HackerRank
public class BinaryNumbers {

	public static void main(String[] args) {
	 System.out.println(consecutiveOnes(439));
	 
	// System.out.println(1%2);
	}
	public static int consecutiveOnes(int n) {
		
		boolean con = false;
		int count =0;
		int total =0;
		while(n > 0) {
			
			if(n%2 == 0) {
				con = false;
				count =0;
			}else {
				con = true;
				count++;
			}
			if(count > total) {
				total =count;
			}
			System.out.print((n%2) + " ");
			n /= 2;
		}
		
		System.out.println();
		
		return total;
	}
}
