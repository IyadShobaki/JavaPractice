

public class JoeJamesSelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {7,8,5,4,9,2};
		
		
		selectionSort(arr);
		
		System.out.print("[ ");
		for(int i =0; i< arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}
	public static int[] selectionSort(int[] list) {
		int i,j,minValue,minIndex, temp=0;
		for(i=0; i<list.length; i++) {
			minValue = list[i];
			minIndex = i;
			for(j=i; j< list.length; j++) {
				if(list[j] < minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			if(minValue < list[i]) {
				temp = list[i];
				list[i]= list[minIndex];
				list[minIndex] = temp;
			}
		}
		
		return list;
	}

}
