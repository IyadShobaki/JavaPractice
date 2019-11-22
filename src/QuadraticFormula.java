

import java.util.Scanner;


public class QuadraticFormula {
	//f(x) = ax^2 + bx + c
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("The quadratic formula finds the root(s)\n" +
							"where f(x) = 0 for the function f(x) = ax^2 + bx + c\n");
		System.out.print("a: ");
		a = sc.nextDouble();
		System.out.print("b: ");
		b = sc.nextDouble();
		System.out.print("c: ");
		c = sc.nextDouble();
		
		//calculate the discriminant, b^2 - 4ac
		
		double discrim;
		discrim = b*b - 4*a*c;
		double root1, root2;
		double imag;
		if(discrim > 0) { //two real roots
			root1 = (-b +  Math.sqrt(discrim)) / (2*a);
			root2 = (-b -  Math.sqrt(discrim)) / (2*a);
			
			System.out.println("Two real roots: " + root1 + " and " + root2);
			
		}else if(discrim < 0) { //two imaginary roots
			imag = Math.sqrt(-discrim) / (2*a);
			System.out.println("Two imaginary roots: "+ (-b/(2*a)) + " +/- i" + imag);
		}else {
			root1 = -b/(2*a);
			System.out.println("One real root: " + root1);
		}
	}

}
