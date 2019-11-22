

//import java.math.BigInteger;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		//Using for loop
		
		int num = 10;
		long factorial =1;
		
		for (int i =1; i <= num; ++i) {
			factorial *=i;
		}
		
		System.out.printf("Factorial of %d = %d",  num, factorial);

	}
	//We've used long instead of int to store large 
	//results of factorial. However, it's still not
	//big enough to store the value of bigger numbers (say 100).
	//For results that cannot be stored
	//in a long variable, we use BigInteger
	//variable declared in java.math library.
	
//	int num1 =30;
//	BigInteger factorialBigInteger
}
