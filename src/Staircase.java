//HackerRank
public class Staircase {

	public static void main(String[] args) {
		//staircase(6);
		int[] arr = {1,2,3,4,5};
		miniMaxSum(arr);
	}
	 static void staircase(int n) {
		 int d = n -2;
		 for(int i =0; i < n; i++) {	 
			 for(int x = 0; x < n; x++) {
				 if(x <= d ) {
					 System.out.print(" ");
				 }else {
					 System.out.print("#");
				 }
			 }
			 d--;
			 System.out.println();
		 }
	        

	 }
	 
	 static void miniMaxSum(int[] arr) {
		 int mx = arr[0];
         int mi = arr[0];
         int ix =0;
         int im =0;
         long tx =0;
         long tm = 0;
         for(int i = 0; i < arr.length; i++){
             if(arr[i] > mx){
                mx = arr[i];
                ix = i;
             }
             if(arr[i] < mi){
                 mi = arr[i];
                 im = i;
             }

         }
         for(int i =0; i < arr.length; i++){
             if(i == ix) {
                 continue;
             }else {
                 tm += arr[i];
             }
         }
         for(int i =0; i < arr.length; i++){
             if(i == im) {
                 continue;
             }else {
                 tx += arr[i];
             }
         }
         System.out.print( tm + " " + tx);
		 
	       
	 
	    }

}
