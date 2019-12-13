
public class TimeConversion24Hours {

	public static void main(String[] args) {
		
		String string = "07:34:00PM";
		System.out.println(timeConversion(string));

	}
	public static String timeConversion(String s) {
		String[] str  = s.split(":");
		int hour = Integer.parseInt(str[0]);
		
		String min = str[1];
		String secPeriod = str[2];
		String sec= str[2].substring(0,secPeriod.length() -2);
		String period = str[2].substring(secPeriod.length()-2,secPeriod.length());
		
		String convertedTime = "";
		
		if((0 <= hour && hour <12) && (period.equalsIgnoreCase("AM"))) {
			convertedTime = String.format("%02d", hour) + ":" + min + ":" + sec;
		}else if ((0 <= hour && hour <12) && (period.equalsIgnoreCase("PM"))) {
			convertedTime = (12 + hour) +  ":" + min + ":" + sec;
		}else if ((hour == 12) && (period.equalsIgnoreCase("AM"))) {
			convertedTime = "00" + ":" + min + ":" + sec;
		}else if ((hour == 12) && (period.equalsIgnoreCase("PM"))) {
			convertedTime = hour + ":" + min + ":" + sec;
		}
		return convertedTime;
		
		
    }
}
