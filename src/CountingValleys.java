//HackerRank 
public class CountingValleys {

	public static void main(String[] args) {
		
		System.out.println(countingValleys(8, "UDDDUDUU"));   // 1
		
		System.out.println(countingValleys(12, "DDUUDDUDUUUD")); //2
		System.out.println(countingValleys(8, "DDUUUUDD")); //0
		System.out.println(countingValleys(100, "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD")); //2
	
	}
	 public static int countingValleys(int n, String s) {
	    
		int count =0;
		int val =0;
		boolean down = false;
		boolean up = false;
		for(int i =0; i < n; i++) {
			if(s.charAt(i) == 'U') {
				val++;
			}
			if(s.charAt(i) == 'D') {
				val--;
			}
			if(val <0) {
				down = true;
			}
			if(val == -1 && down && !up) {
				up = true;
				count++;
			}
			if(val >= 0 ) {
				up = false;
			}
			
			
		}
		
		 return count;
	 }
}
