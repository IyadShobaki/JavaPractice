

public class TwoDArray {

	public static void main(String[] args) {
//		int[][] arr = {{1, 1, 1, 0 ,0, 0},
//						{0, 1 ,0, 0 ,0, 0},
//						{1 ,1, 1, 0 ,0,0},
//						{0, 0, 2, 4, 4 ,0},
//						{0 ,0 ,0 ,2 ,0 ,0},
//						{0 ,0, 1 ,2 ,4 ,0}};
//		System.out.println(maxSum(arr));
		int[][] arr = {{0, -4, -6, 0, -7, -6},
				{-1 ,-2, -6, -8, -3, -1},
				{-8, -4, -2, -8, -8, -6},
				{-3, -1 ,-2, -5, -7, -4},
				{-3, -5, -3, -6, -6, -6},
				{-3, -6, 0 ,-8, -6, -7}};
		System.out.println(maxSum(arr));
		
		
		
		
		
		
	}
	 public static int maxSum(int[][] arr){
		 
		 int[][] newArray = new int[3][3];
		 int sum =0;  
		 int total = Integer.MIN_VALUE;
		 int d= 0;
		 while( d < 4) {
			 int f =0;
			 while(f < 4) {
				 for(int i = 0; i < 3; i++){
					 for(int j = 0; j < 3; j++){  
						 newArray[i][j] = arr[i+d][j+f];      
					 }
				 }
				 for(int i = 0; i < 3; i++){
					 for(int j = 0; j < 3; j++){
						 if(i == 1 && j == 0 || i == 1 && j == 2) {
							 System.out.print("  ");
							 continue;
						 }
						 System.out.print(newArray[i][j] + " ");
						 sum += newArray[i][j];
					 }
					 
					 System.out.println();
				 }
				if(sum > total) {
					total = sum;
				}
					
				 sum = 0;
				 f++;
				 System.out.println();
			 }
			 d++;
		 }

		 System.out.println();
		 


		 return total;
	}
}
