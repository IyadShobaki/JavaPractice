

import java.util.ArrayList;

public class JoeJamesInsertionSort {

	public static void main(String[] args) {
		
		int[] list = {5,1,8,3,9,6};
		
		insertionSort(list);
		
		System.out.print("[ ");
		for(int i =0; i< list.length;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.print("]");
		
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(5);
		arrList.add(1);
		arrList.add(8);
		arrList.add(3);
		arrList.add(9);
		arrList.add(6);
		System.out.print("[ ");
		for(int i=0; i <arrList.size();i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.print("]");
		
		insertionSort(arrList);
		
		System.out.print("[ ");
		for(int number : arrList) {
			System.out.print(number + " ");
		}
		System.out.print("]");
	}
	public static int[] insertionSort(int[] list) {
		int i,j,key,temp;
		for(i=1; i < list.length;i++) {
			key = list[i];
			j = i-1;
			while(j >= 0 && key < list[j]) {
				temp = list[j];
				list[j] = list[j+1];
				list[j +1] = temp;
				j--;
			}
		}
		
		return list;
	}
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> list){
		int i,j,key,temp;
		for(i =1; i <list.size(); i++) {
			key = list.get(i);
			j = i -1;
			while(j>=0 && key < list.get(j)) {
				temp = list.get(j);
				list.set(j, list.get(j+1));
				list.set(j+1, temp);
				j--;
			}
		}
		return list;
	}

}
