

public class LeapYear {

	public static void main(String[] args) {
		
		int year = 1800;
		boolean leap = false;
		
		int modby4 = year % 4;
		int modby100 = year % 100;
		int modby400 = year % 400;
		System.out.println("year % 4 = " + modby4);
		System.out.println("year % 100 = " + modby100);
		System.out.println("year % 400 = " + modby400);
		
		if(year % 4 ==0) {
			if(year % 100 ==0) {
				if(year % 400 ==0) {
					leap =true;
				}else {
					leap = false;
				}
			}else {
				leap = true;
			}
			
		}else {
			leap = false;
		}

		if(leap)
			System.out.println(year + " is a leap year.");
		else {
			System.out.println(year + " is not a leap year.");
		}
	}

}
