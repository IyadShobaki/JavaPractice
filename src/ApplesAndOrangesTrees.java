
public class ApplesAndOrangesTrees {

	public static void main(String[] args) {
		int[] app = {-2,4,2,5,6,1,0};
		int[] or = {5,-6,-2,-4,-3,3,10,0};
		countApplesAndOranges(7, 11, 5, 15, app,or);

	}
	  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		   int apple = 0;
	        int orange = 0;
	        for(int i =0; i < apples.length; i++){
	            if(apples[i] + a >= s && apples[i] + a <= t){
	                apple++;
	                continue;
	            }
	               
	        }
	         for(int i =0; i < oranges.length; i++){
	            if(oranges[i] + b <= t && oranges[i] + b >= s){
	                orange++;
	                continue;
	              
	               
	            }
	               
	        }

	        System.out.println(apple);
	        System.out.println(orange);

	    }

}
