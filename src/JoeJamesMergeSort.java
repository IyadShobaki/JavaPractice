

public class JoeJamesMergeSort { //https://www.youtube.com/watch?v=iMT7gTPpaqw&list=PLj8W7XIvO93qVnnXxyeWmCSvMFqRBP4Jw&index=4
	
//https://www.youtube.com/watch?v=yv6svAfoYik
	public static void main(String[] args) {
		
		int[] array = {17,87, 6,22,41,3,13,54};
		
		System.out.println("Initial Array: ");
		printArray(array);
		
		array = mergeSort(array);
		
		System.out.println("Sorted Array: ");
		printArray(array);
		


	}
	
	private static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static int[] mergeSort(int[] array) {
		if(array.length <= 1) {
			return array;
		}
		int midpoint = array.length /2;
		int[] left = new int[midpoint];
		int[] right;
		
		if(array.length % 2 ==0) {
			right = new int[midpoint];
		}else {
			right = new int[midpoint +1];
		}
		for(int i=0; i <midpoint; i++) {
			left[i] = array[i];
			
		}
		for(int j=0; j < right.length; j++) {
			right[j] = array[midpoint+j];
		}
		
		int[] result = new int[array.length];
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		result = merge(left, right);
		
		return result;
	}
	
	private static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer =0;
		
		while(leftPointer < left.length || rightPointer < right.length) {
			
			if(leftPointer < left.length && rightPointer < right.length) {
				if(left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				}else {
					result[resultPointer++] = right[rightPointer++];
				}
			}else if(leftPointer < left.length){
				result[resultPointer++] = left[leftPointer++];
				
			}else if(rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer++];
				
			}
		}
		return result;
	}
	//The following code is from Joe James and its not complete 
//	public void mergeSort(int[] list, int lowIndex, int highIndex) {
//		if(lowIndex == highIndex)
//			return;
//		else {
//			int midIndex = (lowIndex + highIndex) /2;
//			mergeSort(list, lowIndex, midIndex);
//			mergeSort(list, midIndex + 1, highIndex);
//			//mergeSort(list, lowIndex,midIndex+1, highIndex);
//		}
		
	

}
