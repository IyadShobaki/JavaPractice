import java.util.ArrayList;
import java.util.List;



//HackerRank
public class BirthdayChocolate {

	public static void main(String[] args) {
		List<Integer> sIntegers = new ArrayList<>();
		sIntegers.add(1);
		sIntegers.add(2);
		sIntegers.add(1);
		sIntegers.add(3);
		sIntegers.add(2);
		
		System.out.println(birthday(sIntegers, 3, 2));
		
//		List<Integer> aIntegers = new ArrayList<>();
//		aIntegers.add(1);
//		aIntegers.add(1);
//		aIntegers.add(1);
//		aIntegers.add(1);
//		aIntegers.add(1);
//		
//		System.out.println(birthday(aIntegers, 3, 2));
	}
	
	static int birthday(List<Integer> s, int d, int m) {
		
		int result = 0;
		for(int i =0; i < s.size(); i++) {
			int c =0;
			for(int j =0; j<m; j++) {
				if(i+j < s.size())
					c += s.get(i+j);
			}
			
			if(c == d) {
				result++;
			}
		}
		
		return result;
		
//		int count = 0;
//      int sum = 0;
//
//      if(m <= s.size()) 
//          for(int i = 0; i < m; i++)
//              sum += s.get(i);
//      if(sum == d) count++;
//    
//      for(int i = 0; i < s.size()-m; i++)
//      {
//          sum = sum - s.get(i) + s.get(i+m);
//          if(sum == d) count++;
//      }
//      return count;
		
      
      
      
		
//		 int count =0;
//       
//       for(int i =1; i < m; i++) {
//           int sum= 0;
//           if((sum += s.get(i)) == d) {
//               count++;
//           }
//       }
//       for(int i = m; i < s.size(); i++) {
//           int sum= 0;
//           if((sum += s.get(i)) == d) {
//               count++;
//           }
//       }

//		  int count =0;
//		  
//		  for(int i =1; i < m; i++) {
//			  if((s.get(i) + s.get(i-1)) == d) {
//				  count++;
//			  }
//		  }
//		  for(int i = m; i < s.size(); i++) {
//			  if((s.get(i) + s.get(i-1)) == d) {
//				  count++;
//			  }
//		  }
//      int sum = 0;
//      int counter = 0;
//      for(int i =0; i < s.size(); i++) {
//      	sum+= s.get(i);
//      	counter++;
//      	
//      	if(counter == m) {
//      		if(sum == d) {
//      			count++;
//      			counter = 1;
//      			sum = s.get(i);
//      		}else {
//      			counter = 1;
//      			sum = s.get(i);
//				}
//      		
//      	}
//      }

    
    //  return count;
    }
}
