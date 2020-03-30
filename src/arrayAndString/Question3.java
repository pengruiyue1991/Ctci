package arrayAndString;

/*
* @author joypeng 
* 
* 1.3 Given two String (str and str1), write a method to decide if one string is a permutation of the oter string
* 
* ASk ASCII? "abc" "cba" are permutation?
* Design using int[128] to store the number of each unique char in the str
* 		 go through the int[128] delete 1 of the number of each unique char in the str1
* 	     when meet 0 in a char, return false immediately 
*        otherwise return true
*        Space O(1) Time O(n)
* 
*/

public class Question3 {
	
	public static boolean isPermutation(String str, String str1) {
		if(str.equals(null) || str1.equals(null) || str.length() != str1.length()) return false;
		
		int len = str.length();
		int[] checker = new int[128];
		
		// count number of each char in str
		for(int i = 0 ; i < len ; i++) {
			int ind = str.charAt(i);
			checker[ind]++;
		}
		
		// check each char in str1
		for(int i = 0; i < len; i++) {
			int ind = str1.charAt(i);
			if(checker[ind] == 0) return false;
			checker[ind]--;
		}
		
		return true;
	}

}
