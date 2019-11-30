import java.util.ArrayList;
import java.util.List;


//HackerRank

public class GradingStudents {

	public static void main(String[] args) {
		
		List<Integer> sList = new ArrayList<>();
		sList.add(73);
		sList.add(67);
		sList.add(38);
		sList.add(33);
		for(int i =0; i < sList.size(); i++) {
			System.out.print(sList.get(i) + " ");
		}
		System.out.println();
		System.out.println(gradingStudents(sList));
		


	}
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
			List<Integer> listNew = new ArrayList<Integer>();
	        for(int i =0; i < grades.size(); i++){
	            if(grades.get(i) < 38) {
	            	listNew.add(grades.get(i));
	                continue;
	            }else if(grades.get(i) % 5 == 3){
	                listNew.add(grades.get(i) + 2);
	            }else if(grades.get(i) % 5 == 4){
	            	listNew.add(grades.get(i) + 1);
	            }else {
					listNew.add(grades.get(i));
				}
	        }
	        return listNew;
	    }
}
