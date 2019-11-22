//The HCF(High common factor)
//or GCD(Greatest common divisor)
//of two integers is the largest integer 
//that can exactly divide both numbers (without a remainder).



public class FindGCD {

	public static void main(String[] args) {
		int n1 = 81, n2 = 153, gcd = 1;
		
		for (int i=1; i<=n1 && i <= n2; ++i) {
			//Checks if i is factor of both integers
			if(n1 % i ==0 && n2 %i==0)
				gcd  = i;
		}
		
		System.out.printf("G.C.D of %d and %d is %d", n1,n2,gcd);
		
		
		System.out.println();
		
		//Using while loop
		
		while(n1 != n2) {
			if (n1 > n2)
				n1 -=n2;
			else 
				n2 -= n1;
		}
		System.out.println("G.C.D = " + n1);
		
		
		
		//GCD for both positive and negative numbers
		
		int n3 = 81, n4 = -153;
		//Always set to positive
		n3 = (n3 > 0) ? n3 : -n3;
		n4 = (n4 > 0) ? n4 : -n4;
		
		while(n3 != n4) {
			if(n3 > n4)
				n3 -= n4;
			else 
				n4 -= n3;
		}
		
		System.out.println("G.C.D = " + n3);
	}

}
