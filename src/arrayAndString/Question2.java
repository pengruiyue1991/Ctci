package arrayAndString;

/*
* @author joypeng 
* 
* 1.2 Reverse String
* 
* Ask: char[] ?
* Design algorithm: Two pointer start from beginning and end from ending, do reverse between start and end one by one
* Pseudo code: 
* 			   for(start = 0; start < len/2; start++){
*                  end = len - start;
*                  reverse end and start char
*              }
* 
*/

public class Question2 {

	public static void reverse(char[] str) {
		
        if(str.length > 1) {
        	
        	int len = str.length;
        	for(int start = 0; start < len/2 ; start++ ) {
        		int end = len - start - 1; // -1 is very important!!!
        		
        		// swap start and end
        		char temp = str[start];
        		str[start] = str[end];
        		str[end] = temp;
        	}
        }
       
    }
	
}
