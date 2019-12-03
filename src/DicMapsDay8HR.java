import java.util.*;
//HackerRank, Day 8 of code challenge

public class DicMapsDay8HR {

	public static void main(String[] args) {
		Map<String, Integer> phoneBook = new HashMap<>();
		  Scanner in = new Scanner(System.in);
		  System.out.println("How many records would you like to add:");
	        int n = in.nextInt();
	        for(int i = 0; i < n; i++){
	        	System.out.println("Enter name:");
	            String name = in.next();
	            System.out.println("Enter phone number:");
	            int phone = in.nextInt();
	            // Write code here
	            phoneBook.put(name,phone);
	        }
	        System.out.println("Search for a phone number by name or 'q' to exsit");
	        while(in.hasNext()){
	        	
	            String s = in.next();
	            // Write code here
	            char exit = Character.toLowerCase(s.charAt(0));
	            
	            if(exit == 'q') {
	            	System.out.println("Thank you");
	            	break;
	            }else {
	            	if(phoneBook.containsKey(s)) {
	         
	            		System.out.println(s + "=" + phoneBook.get(s));
	            		System.out.println("Search again or 'q' to exit");
	            	}	            	
	            	else {
	            		System.out.println("Not found");
	            		System.out.println("Try again or 'q' to exit:");
					}
	            }
	        }
	        in.close();

	}

}
