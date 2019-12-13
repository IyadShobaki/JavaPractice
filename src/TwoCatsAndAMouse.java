
public class TwoCatsAndAMouse {

	public static void main(String[] args) {
		System.out.println(catAndMouse(1, 2, 3));
		System.out.println(catAndMouse(1, 3, 2));

	}
	public static String catAndMouse(int x, int y, int z) {
		
		int aCount =0;
		int bCount =0;
		
		while(y!=z) {
			aCount++;
			if(y>z)
				y--;
			else
				y++;
		}
		while(x!=z) {
			bCount++;
			if(x>z)
				x--;
			else
				x++;
		}
		
		if(aCount - bCount == 0)
			return "Mouse C";
		else if(aCount - bCount > 0)
			return "Cat A";
		return "Cat B";
    }
}
