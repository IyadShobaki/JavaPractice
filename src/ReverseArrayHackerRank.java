



public class ReverseArrayHackerRank {

	public static void main(String[] args) {
		
		int n = 4;
		int[] arr = {1,4,3,2};
		for (int i = 0; i < n; i++) {
			int index = n - i - 1;
			System.out.print(arr[index] + " ");
		}

	}

}
