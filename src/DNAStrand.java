

public class DNAStrand {

	public static void main(String[] args) {
		
		//String str = "AGTcGaCt";
		String str = "GTCAG";
		str = str.toUpperCase();
		
		//char[] strChar = str.toCharArray(); 
		
//		for(int i =0; i <strChar.length; i++) {
//			System.out.println(strChar[i]);
//		}
		System.out.println(str);
		System.out.println(reverseString(str));
		
		System.out.println(reverseStringBuilder(str));
		
		// different way
		StringBuilder sBuilder = new StringBuilder(str);
		System.out.println(sBuilder.reverse().toString());
	}
	static String reverseString(String str) {
		String reverseString = "";
		if(null == str)
			return null;	
		for (int i = str.length()-1; i >=0; i--)
			reverseString = reverseString + str.charAt(i);
		
		//adjust the right string
		
		
	
		
		return reverseString;
	}
	
	// different method
	static String reverseStringBuilder(String str) {
		StringBuilder reverseStringBuilder = new StringBuilder();
		if(null == str)
			return null;	
		for (int i = str.length()-1; i >=0; i--)
			reverseStringBuilder.append(str.charAt(i));
		
		return reverseStringBuilder.toString();
	}

}
