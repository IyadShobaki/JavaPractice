

public class JoeJamesBubbleSort {

	public static void main(String[] args) {
		int[] list = {5,8,1,6,9,2};
		
		bubbleSort(list);
		
		System.out.print("[ ");
		for(int i =0; i< list.length;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.print("]");
		
		

	}
	public static int[] bubbleSort(int[] list) {
		int i,j,temp=0;
		for(i=0;i<list.length -1; i++) {
			for(j=0;j < list.length-1-i; j++) {
				if(list[j] > list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		
		return list;
	}

}
