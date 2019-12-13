//HackerRank

import java.util.Arrays;

public class EloctronicsShop {

	public static void main(String[] args) {
		int[] keyboards = {3,1};
		int[] drives = {5,2,8};
		System.out.println(getMoneySpent(keyboards, drives, 10)); //9
		
		int[] keyboards1 = {4};
		int[] drives1 = {5};
		System.out.println(getMoneySpent(keyboards1, drives1, 5)); //-1

		int[] keyboards2 = {40,50,60};
		int[] drives2 = {5,8,12};
		System.out.println(getMoneySpent(keyboards2, drives2, 60)); //58
	}
	
	public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		
		//Arrays.sort(keyboards);
		//Arrays.sort(drives);
		int amount =0;
		int total = 0;
		for(int i =0; i < keyboards.length; i++) {
			for(int d = 0; d <drives.length; d++) {
				if(keyboards[i] + drives[d] <= b)
					amount = keyboards[i] + drives[d];
				if(amount > total) {
					total = amount;
				}
				
			}
		}

		if(total > 0) {
			return total;
		}
		return -1;
		
	}
}
	
	
//	while((keyboards[i] + drives[x] <= b) && (x < drives.length-1)) {
//	
//	x++;
//}

//for(int i =drives.length-1; i >= 0; i--) {
//for(int x = keyboards.length-1; i >=0; i--) {
//	if(( drives[i] + keyboards[x] ) <= b ) {
//		secAmount = drives[i] + keyboards[x];
//	}
//}
//}

//if(secAmount > firAmount) {
//return secAmount;
//}else if (firAmount > secAmount) {
//return firAmount;
//}
//for(int x = drives.length-1; i >=0; i--) {
//	if((keyboards[i] + drives[x]) <= b ) {
//		firAmount = keyboards[i] + drives[x];
//		if(firAmount > secAmount) {
//			secAmount = firAmount;
//		}
//	}
//}