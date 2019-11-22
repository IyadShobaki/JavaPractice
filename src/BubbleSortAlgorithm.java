

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		int arr[] = {2,4,1,9,5};
		System.out.printf("%s", "[");
		for (int i= 0; i < arr.length; i++) {
			if (i == arr.length-1)
				System.out.printf("%d",  arr[i] );
			else
				System.out.printf("%d%s",  arr[i] , "," );
		}
		System.out.printf("%s%n", "]");
		
		
		bubbleSort(arr);
		
		System.out.printf("%s", "[");
		for (int i= 0; i < arr.length; i++) {
			if (i == arr.length-1)
				System.out.printf("%d",  arr[i] );
			else
				System.out.printf("%d%s",  arr[i] , "," );
		}
		System.out.printf("%s%n", "]");
	
	}
	public static void bubbleSort(int[] arr) {
		boolean sorted = false;
		int temp;
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;
				}
			}
		}
	}

}
