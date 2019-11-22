

import java.util.Scanner;

public class FindNumberInArray {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		int arr[] = {2,4,66,44,32,23,78,9};
		int num;
		
		System.out.println("Please enetr a number:");
		num = myScanner.nextInt();
		
		System.out.printf("%s", findNumber(arr, num));
		

	}
	
	static String findNumber(int a[], int k) {
		for (int i =0; i < a.length; i++) {
			if(a[i] == k)
				return "YES";
		}
		return "NO";
	}
}
