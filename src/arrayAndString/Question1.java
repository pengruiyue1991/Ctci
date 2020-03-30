package arrayAndString;

/*
 * @author joypeng 
 * 
 * 1.1 Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * 
 * hint: ASCII has 128 unique characters
 * 
 * Using boolean[128] as a checker for each characters 
 * Space O(n)
 * Time  O(n)
 * 
 * 
 */

public class Question1 {
	
	
	/*
	 *  Check if a string has all unique char
	 *  @param String 
	 *  @return Boolean 
	 */
	public static boolean allUnique(String str) {
		
		// corner cases
		if(str.equals(null) || str.length() == 0) return false;
		if(str.length() == 1) return true;
		
		// !!! corner case larger than 128
		if(str.length() > 128) return false;
		
		// initial 
		boolean[] checker = new boolean[128];
		
		// go through all char in str
		for(int i = 0; i < str.length(); i++) {
			
			int index = str.charAt(i);
			
			// if the char is already in checker return false
			if(checker[index]) {
				return false;
			}
			
			// set the char in checker is true
			checker[index] = true;
		}

		return true;
	}

}
