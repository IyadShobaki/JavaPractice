

public class InsertionSortAlgorithm {

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
		
		insertionSort(arr);
		
		System.out.printf("%s", "[");
		for (int i= 0; i < arr.length; i++) {
			if (i == arr.length-1)
				System.out.printf("%d",  arr[i] );
			else
				System.out.printf("%d%s",  arr[i] , "," );
		}
		System.out.printf("%s%n", "]");
	}
	static void insertionSort(int[] arr) {
		int i, value,index;
		for (i =1; i < arr.length; i++) {
			value = arr[i];
			index = i;
			while (index > 0 && arr[index-1] > value) {
				arr[index] = arr[index-1];
				index = index-1;
			}
			arr[index] = value;
		}
	}

}
