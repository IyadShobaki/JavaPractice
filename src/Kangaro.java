
import java.util.ArrayList;
import java.util.List;

public class Kangaro {

	public static void main(String[] args) {
		//System.out.println(kangaroo(0, 3, 4, 2));
//		List<Integer> aList = new ArrayList<Integer>();
//		aList.add(2);
//		aList.add(4);
//		
//		List<Integer> bList = new ArrayList<Integer>();
//		bList.add(16);
//		bList.add(32);
//		bList.add(96);
//		
//		System.out.println(getTotalX(aList, bList));
//		
//		System.out.println();
//		List<Integer> cList = new ArrayList<Integer>();
//		cList.add(2);
//		cList.add(6);
//		
//		List<Integer> dList = new ArrayList<Integer>();
//		dList.add(24);
//		dList.add(36);
//		
//		System.out.println(getTotalX(cList, dList));
//		
//		
//		System.out.println();
//		List<Integer> fList = new ArrayList<Integer>();
//		fList.add(3);
//		fList.add(4);
//		
//		List<Integer> gList = new ArrayList<Integer>();
//		gList.add(24);
//		gList.add(48);
//		
//		System.out.println(getTotalX(fList, gList));
		
		System.out.println();
		List<Integer> hList = new ArrayList<Integer>();
		hList.add(2);
		hList.add(3);
		hList.add(6);
		
		List<Integer> jList = new ArrayList<Integer>();
		jList.add(42);
		jList.add(84);
		
		System.out.println(getTotalX(hList, jList));
	}
	
//	public static int getTotalX(List<Integer> a, List<Integer> b) {
//		int ax = a.get(0);
//		for(int i =1; i < a.size(); i++) {
//			ax = lcm(ax, a.get(i));
//		}
//		int bx = b.get(0);
//		for(int i =1; i < b.size(); i++ ) {
//			bx = gcd(bx, b.get(i));
//		}
//		
//		List<Integer> l = new ArrayList<>();
//		int temp = ax;
//		while(temp <= bx) {
//			l.add(temp);
//			temp += ax;
//		}
//		int counter = 0;
//		for(int f : l ) {
//			
//			boolean mul = true;
//			for(int g : b) {
//				if(g % f !=0) {
//					mul = false;
//					break;
//				}
//			}
//			if(mul) counter++;
//		}
//		return counter;
//	}
//	public static int gcd(int x, int y) {
//		if(y ==0)
//			return x;
//		return gcd(y, x % y);
//	}
//	public static int lcm(int x, int y) {
//		return (x * y) / gcd(x, y);
//	}
	
	public static int  getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here

            int count = 0;
            List<Integer> numbers = new ArrayList<>();
            
            
			for(int i =a.get(a.size()-1); i <= b.get(0); i++) {	
			
				if(b.get(0) % i == 0) {
					System.out.print(i + " ");
					numbers.add(i);	
					count++;
				}	
				
			}
			//int[] arr = new int[count];
			List<Integer> num = new ArrayList<>();
			System.out.println();
			for(int j =0; j < numbers.size(); j++) {
				for(int s = 0; s< a.size(); s++) {
					if(numbers.get(j) % a.get(s)  ==0) {
						System.out.print(numbers.get(j) + "%" +  a.get(s) + " ");
					}else {
						//arr[j] = j;
						if(num.contains(j)) {
							
						}else {
							num.add(j);
						}
						
						System.out.print(j + " ");
//						for(int i =0 ; i < arr.length; i++) {
//							if(arr[i] == j ) {
//								
//							}else {
//								arr[i] = j;
//								break;
//							}
//					}	
						//System.out.print(j);
					}
					
				}
				System.out.println();
			}
			System.out.println();
			for(int j =0; j < b.size(); j++) {
				for(int s = 0; s< numbers.size(); s++) {
					if(b.get(j) % numbers.get(s)  ==0) {
						System.out.print(b.get(j) + "%" + numbers.get(s) + " ");
					}else {
//						if(arr[s] == s) {
//							
//						}else {
//							arr[s] =s;
//						}
						
						if(num.contains(s)) {
							
						}else {
							num.add(s);
						}
//						for(int i =0 ; i < arr.length; i++) {
//							if(arr[i] == s ) {
//								
//							}else {
//								arr[i] = s;
//								break;
//							}
//								
//						}
						System.out.print(s);
					}
					
				}
				System.out.println();
			}
			System.out.println();
//			for(int i =0; i < arr.length; i++) {
//				if(arr[i] != 0) {
//					count--;
//				}
//			}
		
			for(int i =0; i < num.size(); i++) {
				System.out.print(num.get(i) + " ");
			}
			for(int i =0; i < num.size(); i++) {
				count--;
			}
			System.out.println();
			
			return count;
			
	    }
	
	
	 static String kangaroo(int x1, int v1, int x2, int v2) {

	        for(int i =0; i <= 10000; i++){
	            if((x1 + v1) == (x2 + v2))
	                return "YES";
	            else{
	                 x1 += v1;
	                 x2 += v2;
	            }
	               
	        }
	        return "NO";
	    }
}
