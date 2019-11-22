

import java.util.Scanner;
import java.lang.Math;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		int num;
		
		System.out.println("Please enetr a number:");
		num = myScanner.nextInt();
		
		System.out.printf("%d",isPrime(num));
		

	}
	static int isPrime(int num) {
		
		//int check =1;
		double sqrtNum = Math.sqrt(num);
		if(num%2==0 && num >2) {
			//check = 2;
			return 2;
			//return check;
		}
		for (int i=3; i < sqrtNum +1; i++) {
			if(num%i == 0) {
				//check = 2;
				//return check;
				return i;
			}
			i++;
		}
		return 1;
		//return check;
	}

}
