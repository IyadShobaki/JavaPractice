
public class BirthdayCakeCandles {

	public static void main(String[] args) {
		int[] ar = {4,3,2,4};
		System.out.println(birthdayCakeCandles(ar));

	}
	  static int birthdayCakeCandles(int[] ar) {
          int tallest = ar[0];
          int count = 0;
          for(int i =0; i < ar.length; i++){
              if(ar[i] > tallest){
                  tallest = ar[i];
              }
          }
          for(int i =0; i < ar.length; i++){
              if(tallest == ar[i]){
                  count++;
              }
          }
          return count;
  }
}
