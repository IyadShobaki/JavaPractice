import java.util.List;

public class BonAppetit {

	public static void main(String[] args) {

		//bonAppetit(bill, k, b);

	}
	 public static void bonAppetit(List<Integer> bill, int k, int b) {  
	        int count = 0;
	        for(int i =0; i < bill.size(); i++){
	            if(i == k){
	                continue;
	            }else{
	                count += bill.get(i);
	            }
	        }
	        int total = b -(count/2);
	        if(total ==0 ){
	            System.out.println("Bon Appetit");
	        }else{
	            System.out.println(total);
	        }


	    }
}
