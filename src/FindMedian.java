import java.util.Arrays;

public class FindMedian {

	public static void main(String[] args) {
		int[] ar = {0 ,1 ,2, 4, 6, 5, 3};

		System.out.println(findMedian(ar));

	}
	public static int findMedian(int[] arr) {
        Arrays.sort(arr);
        int median = arr[arr.length/2];
        return median;

    }

}
